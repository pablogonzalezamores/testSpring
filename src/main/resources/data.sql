CREATE TABLE IF NOT EXISTS usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL
);

INSERT INTO usuarios (nombre, email) VALUES ('Juan Diego Perez', 'juan.perez@example.com');
INSERT INTO usuarios (nombre, email) VALUES ('Maria Lopez', 'maria.lopez@example.com');