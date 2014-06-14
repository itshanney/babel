CREATE TABLE products (
    product_code            VARCHAR(16) NOT NULL,
    product_name            VARCHAR(128) NOT NULL,
    description             VARCHAR(256),
    create_date             DATETIME NOT NULL,
    is_active               BOOLEAN NOT NULL DEFAULT 1,
    PRIMARY KEY (product_code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;