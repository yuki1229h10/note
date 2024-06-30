INSERT INTO publishers (name) VALUES ('A');
INSERT INTO publishers (name) VALUES ('B');

INSERT INTO books (title,author,publisher_id) VALUES ('Before','PSB',1);
INSERT INTO books (title,author,publisher_id) VALUES ('Being Boring','PSB',2);
INSERT INTO books (title,author,publisher_id) VALUES ('Go West','PSB',1);

INSERT INTO reviews (book_id,review_text) VALUES (1,'good');
INSERT INTO reviews (book_id,review_text) VALUES (2,'best');
INSERT INTO reviews (book_id,review_text) VALUES (2,'nice');
INSERT INTO reviews (book_id,review_text) VALUES (3,'great');
