-- query create new file
SELECT traders.code AS tradercode, traders.name AS traderName, 
    trades.order_id AS OrderID, orders.ticker,
    SUM(trades.quantity) AS QTY, ROUND(AVG(trades.price),6) AS AVGprice 
FROM trades
LEFT JOIN orders ON orders.id = trades.order_id
LEFT JOIN traders ON orders.trader_code=traders.code
GROUP BY trades.order_id

-- query financial by trader
SELECT traders.code AS TRADERCODE, ROUND(Sum(trades.price * trades.quantity),6) AS TOTAL FROM trades
LEFT JOIN orders ON trades.order_id = orders.id
LEFT JOIN traders ON orders.trader_code=traders.code
group by traders.code