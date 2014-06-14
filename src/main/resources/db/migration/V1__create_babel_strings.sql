CREATE TABLE babel_strings (
    string_id               BIGINT NOT NULL AUTO_INCREMENT,
    string_key              VARCHAR(64) NOT NULL,
    default_value           TEXT NOT NULL,
    context                 TEXT,
    create_date             DATETIME NOT NULL,
    is_active               BOOLEAN NOT NULL DEFAULT 1,
    PRIMARY KEY (string_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;