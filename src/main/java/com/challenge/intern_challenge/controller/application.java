package com.challenge.intern_challenge.controller;

import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;

import java.beans.Statement;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class application {
    
    @GetMapping(value = "/")
    public String getMethodName(@RequestParam(value = "name", defaultValue = "Mundo") String name) {

        Connection conn = null;
        try {
            String url = "jdbc:h2:mem:memDb";
            conn = DriverManager.getConnection(url, "sa", "");
            java.sql.Statement stat = conn.createStatement();
            ResultSet rs = stat.executeQuery("select * from Traders");
            while (rs.next()) {
                System.out.println("name = " + rs.getString("name"));
                System.out.println("code = " + rs.getString("code"));
            }
                rs.close();
        } catch (SQLException e) {
            throw new Error("Problem", e);
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return String.format("Olá %s!", name);
    }

    @GetMapping(value = "/createNewFile")
    public String createNewFile() {
        try {

            File file = new File("C:\\temp\\file.csv");
            PrintWriter pw = new PrintWriter(file);
            StringBuilder sb = new StringBuilder();

            sb.append("sl_no");
            sb.append(";");
            sb.append(" book name");
            sb.append(";");
            sb.append(" category");
            sb.append(";");
            sb.append("\n");
            sb.append("sl_no");
            sb.append(";");
            sb.append(" book name");
            sb.append(";");
            sb.append(" category");
            sb.append(";");

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
    public JSONObject financialByTrader() {
        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", 100);
        obj.put("balance", 1000.21);
        obj.put("is_vip", true);

        return obj;
    }

}
