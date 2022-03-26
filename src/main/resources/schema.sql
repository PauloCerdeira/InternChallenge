DROP TABLE IF EXISTS Traders;
CREATE TABLE IF NOT EXISTS Traders(
    id int NOT NULL AUTO_INCREMENT,
    code varchar(3) NOT NULL,
    name varchar(255) NOT NULL
);

DROP TABLE IF EXISTS Orders;
CREATE TABLE IF NOT EXISTS Orders(
    id int NOT NULL AUTO_INCREMENT,
    ticker varchar(5) NOT NULL,
    trader_code varchar(3) NOT NULL
);

DROP TABLE IF EXISTS Trades;
CREATE TABLE IF NOT EXISTS Trades(
    id int NOT NULL AUTO_INCREMENT,
    time timestamp NOT NULL,
    quantity int NOT NULL,
    price DECIMAL(10,2) NOT NULL
)