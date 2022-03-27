INSERT INTO Traders (code, name) VALUES ('JDO', 'John Doe');
INSERT INTO Traders (code, name) VALUES ('JSM', 'John Smith');

INSERT INTO Orders (ticker, trader_code) VALUES ('PETR4', 'JDO');
INSERT INTO Orders (ticker, trader_code) VALUES ('PETR4', 'JSM');
INSERT INTO Orders (ticker, trader_code) VALUES ('PETR4', 'JDO');
INSERT INTO Orders (ticker, trader_code) VALUES ('ITUB4', 'JDO');

INSERT INTO Trades (order_id, time, quantity, price) VALUES (1, CURRENT_TIMESTAMP, 1000, 25.123456);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (1, CURRENT_TIMESTAMP, 2000, 40.000000);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (1, CURRENT_TIMESTAMP, 1500, 28.105000);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (2, CURRENT_TIMESTAMP, 1000, 34.617489);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (2, CURRENT_TIMESTAMP, 1000, 25.123456);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (3, CURRENT_TIMESTAMP, 2000, 23.000000);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (4, CURRENT_TIMESTAMP, 1500, 28.105000);
INSERT INTO Trades (order_id, time, quantity, price) VALUES (4, CURRENT_TIMESTAMP, 1000, 34.617489);