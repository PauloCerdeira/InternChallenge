package com.challenge.intern_challenge;

import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class application {

    @GetMapping(value = "/")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "Mundo") String name) {
        return String.format("Olá %s!", name);
    }

    @GetMapping(value = "/createNewFile")
    public String createNewFile() {
        try {
            String url = "jdbc:h2:mem:memDb";
            Connection conn = DriverManager.getConnection(url, "sa", "");
            java.sql.Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT traders.code AS tradercode, traders.name AS traderName, trades.order_id AS OrderID, orders.ticker, SUM(trades.quantity) AS QTY, ROUND(AVG(trades.price),6) AS AVGprice FROM trades LEFT JOIN orders ON orders.id = trades.order_id LEFT JOIN traders ON orders.trader_code=traders.code GROUP BY trades.order_id");

            File file = new File("C:\\temp\\file.csv");
            PrintWriter pw = new PrintWriter(file);
            StringBuilder sb = new StringBuilder();
            
            sb.append("TraderCode; TraderName; OrderID; Ticker; Qty; AVGPrice;\n");
            while (rs.next()) {
                sb.append(rs.getString("tradercode") + ';');
                sb.append(rs.getString("tradername") + ';');
                sb.append(rs.getString("orderid") + ';');
                sb.append(rs.getString("ticker") + ';');
                sb.append(rs.getString("qty") + ';');
                sb.append(rs.getString("avgprice") + ';');
                sb.append("\n");
                // System.out.println("tradercode = " + rs.getString("tradercode"));
                // System.out.println("tradername = " + rs.getString("tradername"));
                // System.out.println("orderid = " + rs.getString("orderid"));
                // System.out.println("ticker = " + rs.getString("ticker"));
                // System.out.println("qty = " + rs.getString("qty"));
                // System.out.println("avgprice = " + rs.getString("avgprice"));
            }
            rs.close();

            pw.write((sb.toString()));
            pw.close();

            System.out.println("File created at " + file.getPath());
            return file.getPath();
        } catch (Exception error) {
            System.out.println(error);
            return "Unexpected Error. Try again later.";
        }

    }

    @GetMapping(value = "/financialByTrader")
    public JSONArray financialByTrader() {
        JSONArray array = new JSONArray();    
        try {
            String url = "jdbc:h2:mem:memDb";
            Connection conn = DriverManager.getConnection(url, "sa", "");
            java.sql.Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("SELECT traders.code AS TRADERCODE, ROUND(Sum(trades.price * trades.quantity),6) AS TOTAL FROM trades LEFT JOIN orders ON trades.order_id = orders.id LEFT JOIN traders ON orders.trader_code=traders.code group by traders.code");
            
            while (rs.next()) {   
                JSONObject obj = new JSONObject();
                // System.out.println("tradercode = " + rs.getString("tradercode"));
                // System.out.println("total = " + rs.getString("total"));
                obj.put("tradercode", rs.getString("tradercode"));
                obj.put("total", rs.getString("total"));
                array.add(obj);
            }
            rs.close();  
        } catch (Exception error) {
            System.out.println(error);
        }
        return array;
    }

}
