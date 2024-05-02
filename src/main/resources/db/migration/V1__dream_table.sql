CREATE TABLE dreams (
    id SERIAL PRIMARY KEY,
    created_at TIMESTAMP WITH TIME ZONE,
    date DATE,
    deleted BOOLEAN,
    description TEXT,
    draft TEXT,
    title TEXT
);
