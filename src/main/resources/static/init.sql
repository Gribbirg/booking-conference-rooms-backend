CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS conference_rooms
(
    id         UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name       VARCHAR NOT NULL,
    floor      INTEGER NOT NULL,
    max_people INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS conferences
(
    id                 UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
    name               VARCHAR   NOT NULL,
    author_id          VARCHAR   NOT NULL,
    start_time         TIMESTAMP NOT NULL,
    end_time           TIMESTAMP NOT NULL,
    room_id UUID REFERENCES conference_rooms (id)
);
