DROP TABLE IF EXISTS todos;
DROP TABLE IF EXISTS authentications;
DROP TYPE IF EXISTS role;

CREATE TABLE todos
(
   id serial PRIMARY KEY,
   todo varchar (255) NOT NULL,
   detail text,
   created_at timestamp without time zone,
   updated_at timestamp without time zone
);
CREATE TYPE role AS ENUM
(
   'ADMIN',
   'USER'
);
CREATE TABLE authentications
(
   username VARCHAR (50) PRIMARY KEY,
   password VARCHAR (255) NOT NULL,
   authority role NOT NULL
);