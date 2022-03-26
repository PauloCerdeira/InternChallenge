INSERT INTO Traders (code, name) VALUES ('JDO', 'John Doe');
INSERT INTO Traders (code, name) VALUES ('JSM', 'John Smith');

INSERT INTO Orders (ticker, trader_code) VALUES ('PETR4', 'JDO');
INSERT INTO Orders (ticker, trader_code) VALUES ('PETR4', 'JSM');
INSERT INTO Orders (ticker, trader_code) VALUES ('PETR4', 'JDO');
INSERT INTO Orders (ticker, trader_code) VALUES ('ITUB4', 'JSM');
INSERT INTO Orders (ticker, trader_code) VALUES ('ITUB4', 'JDO');

-- INSERT INTO Trades (code, name) VALUES ('JDO', 'John Doe');
-- INSERT INTO Trades (code, name) VALUES ('JSM', 'John Smith');

-- INSERT INTO teste (id, name) VALUES (1, 'teste'),
-- INSERT INTO Trader (name, code) VALUES ('John Doe', 'JDO'),
--     ('John Smith', 'JSM'),
--     ('Jane Jones', 'JJS')/