# API SPRING BOOT.

Aplicacíon desarrollada en Spring Boot version 3.5.4. y H2 como motor de base de datos, esta apliación permite consultar los operadores y crear recargas para diferentes operadores de Telefonía.
Acontinuacion se muestra la documentacion de la API haciendo uso de la libreria OpenAPI . <img width="1344" height="672" alt="image" src="https://github.com/user-attachments/assets/3054a6b9-fe15-4c53-bf3e-cd160b3ef9ab" />




## INICIAR SERVICIO EN AMBIENTE DE DESARROLLO.

Clonar repositorio y para iniciar el proyecto abrir con el IDE Intellij IDEA de preferencia, luego compilar proyecto en iniciar clase principal:

```bash
ApiApplication
```

Una vez que el servidor esté en funcionamiento, abra su navegador y navegue a http://localhost:8080/swagger-ui/index.html#/. 

## BASE DE DATOS H2

Una vez haya iniciado la aplicacion navegue a la siguiente rura: http://localhost:8080/h2-console/login.jsp del navegador para comprobar que se haya creado la base de datos con las respectivas tablas:

```bash
OPERADORES, RECARGAS y USUARIOS 
```

<img width="795" height="433" alt="image" src="https://github.com/user-attachments/assets/a46a7579-dc10-4e2a-8bf6-d3205dd8a25d" />



## INSERTAR DATOS DE INICIO

Para relizar insercion de datos iniciales revisar archivo data.sql en la carpeta resources encontrara los inserts:

```bash
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
```



## MODELO ENTIDAD RELACION (MER)

<img width="756" height="4851" alt="deepseek_mermaid_20250821_c6ca44" src="https://github.com/user-attachments/assets/2c6eb133-df39-46e2-b69e-856a5719c605" />



## Diagrama de Casos de Uso

<img width="5457" height="834" alt="deepseek_mermaid_20250821_715c4a" src="https://github.com/user-attachments/assets/4f2cc1a5-53e8-46f7-8adf-ac8dbc888e25" />


## Diagrama de Secuencia (Venta de Recarga)

<img width="4323" height="2943" alt="deepseek_mermaid_20250821_2efa31" src="https://github.com/user-attachments/assets/19bb9c67-bfc3-44d8-87b9-8a933d22ca98" />



