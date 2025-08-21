-- Limpiar tablas existentes
DROP TABLE IF EXISTS recargas;
DROP TABLE IF EXISTS operadores;
DROP TABLE IF EXISTS usuarios;

-- Crear tablas
CREATE TABLE operadores (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    comision DECIMAL(5,2) NOT NULL
);

CREATE TABLE usuarios (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    rol VARCHAR(20) NOT NULL
);

CREATE TABLE recargas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    valor DECIMAL(10,2) NOT NULL,
    fecha TIMESTAMP NOT NULL,
    numero_telefono VARCHAR(20) NOT NULL,
    estado VARCHAR(20) NOT NULL,
    usuario_id BIGINT NOT NULL,
    operador_id BIGINT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id),
    FOREIGN KEY (operador_id) REFERENCES operadores(id)
);

-- Insertar datos de prueba
INSERT INTO operadores (nombre, comision) VALUES
('Tigo', 2.50),
('Movistar', 3.00),
('Comcel', 2.00);

INSERT INTO usuarios (username, password, nombre, rol) VALUES
('admin', 'admin123', 'Administrador', 'ADMIN'),
('vendedor1', 'vend123', 'Juan Pérez', 'VENDEDOR');

INSERT INTO recargas (valor, fecha, numero_telefono, estado, usuario_id, operador_id) VALUES
(10000.00, '2024-01-15 10:30:00', '3001234567', 'EXITOSA', 2, 1),
(20000.00, '2024-01-15 11:45:00', '3109876543', 'EXITOSA', 2, 2),
(15000.00, '2024-01-16 09:15:00', '3205551234', 'EXITOSA', 2, 1);