CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

--- CREATE SCHEMA IF NOT EXISTS nexvid_us;
--- don't need as flyway sets the schema making this reusable across schemas

CREATE TABLE account
(
    id            UUID PRIMARY KEY      DEFAULT uuid_generate_v4(),
    email         VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(60)  NOT NULL,
    created_at    TIMESTAMPTZ  NOT NULL DEFAULT now(),
    updated_at    TIMESTAMPTZ  NOT NULL DEFAULT now()
);

CREATE TABLE sub_account
(
    id            UUID                 DEFAULT uuid_generate_v4(),
    account_id    UUID        NOT NULL REFERENCES account (id) ON DELETE CASCADE,
    name          VARCHAR(50) NOT NULL,
    is_adolescent BOOLEAN     NOT NULL DEFAULT false,
    avatar_url    VARCHAR(255),
    created_at    TIMESTAMPTZ NOT NULL DEFAULT now(),
    updated_at    TIMESTAMPTZ NOT NULL DEFAULT now(),
    PRIMARY KEY (id, account_id)
);