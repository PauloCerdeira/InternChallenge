DROP TABLE IF EXISTS Trades;
DROP TABLE IF EXISTS Orders;
DROP TABLE IF EXISTS Traders;

CREATE TABLE IF NOT EXISTS Traders(
    id int NOT NULL AUTO_INCREMENT,
    code varchar(3) NOT NULL,
    name varchar(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Orders(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ticker varchar(5) NOT NULL,
    trader_code varchar(3), 
    FOREIGN KEY(trader_code) REFERENCES Traders(code)
);

CREATE TABLE IF NOT EXISTS Trades(
    id int NOT NULL AUTO_INCREMENT,
    order_id int,
    time timestamp NOT NULL,
    quantity int NOT NULL,
    price DECIMAL(10,6) NOT NULL,
    FOREIGN KEY(order_id) REFERENCES Orders(id)
)