CREATE TABLE dreams (
    id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    deleted BOOLEAN NOT NULL,
    description TEXT NOT NULL
);
