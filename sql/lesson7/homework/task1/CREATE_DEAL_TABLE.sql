CREATE TABLE DEAL(
    CUSTOMER_ID NUMBER,
    CONSTRAINT FK_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES CUSTOMER(CUSTOMER_ID),
    AMOUNT NUMBER(*) NOT NULL,
    DATE_CREATED TIMESTAMP NOT NULL
);