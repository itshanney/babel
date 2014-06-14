CREATE TABLE languages (
    language_code           VARCHAR(16) NOT NULL,
    language_name           VARCHAR(128) NOT NULL,
    create_date             DATETIME NOT NULL,
    is_active               BOOLEAN NOT NULL DEFAULT 1,
    PRIMARY KEY (language_code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;