CREATE TABLE FORUM_POLLS_OPTIONS(
    ID NUMBER,
    CONSTRAINT PK_FORUM_POLL_OPTION PRIMARY KEY (ID),
    ID_POST NUMBER,
    CONSTRAINT FK_FORUM_POST FOREIGN KEY (ID_POST) REFERENCES FORUM_POSTS (ID),
    TITLE VARCHAR(64),
    DATE_CREATED TIMESTAMP
);