# API-BACKEND SPRING BOOT.

Aplicacíon desarrollada en Spring Boot version 3.5.4. y H2 como motor de base de datos, esta apliación permite consultar los operadores y crear recargas para diferentes operadores de Telefonía.
Acontinuacion se muestra la documentacion de la API haciendo uso de la libreria OpenAPI . <img width="1330" height="673" alt="image" src="https://github.com/user-attachments/assets/e1a350c1-3d54-4dc4-a46a-b39dd8bb95c9" />

<img width="1315" height="669" alt="image" src="https://github.com/user-attachments/assets/270850c2-5371-4b79-9d84-5b3c6e6cfd7b" />

<img width="1302" height="657" alt="image" src="https://github.com/user-attachments/assets/32fb2f9a-2d90-49a2-8dd8-ee4382b53455" />

<img width="1297" height="651" alt="image" src="https://github.com/user-attachments/assets/4f01f0f6-9a09-47e7-9eff-56e89d2484c5" />

<img width="1284" height="550" alt="image" src="https://github.com/user-attachments/assets/2c853967-e991-48b7-8a34-a90d4a0f8715" />









## INICIAR SERVICIO EN AMBIENTE DE DESARROLLO.

Clonar repositorio y para iniciar el proyecto abrir con el IDE Intellij IDEA de preferencia, luego compilar proyecto en iniciar clase principal:

```bash
git clone https://github.com/Alegria2016/API-DATACENTER.git
clase principal: 
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



## Diagrama Relacional (Modelo de Datos)

<img width="756" height="4851" alt="deepseek_mermaid_20250821_c6ca44 (1)" src="https://github.com/user-attachments/assets/d3050578-5f28-47e3-912d-21774a79ed63" />


## Diagrama de Clases

<img width="756" height="4851" alt="deepseek_mermaid_20250821_c6ca44" src="https://github.com/user-attachments/assets/2c6eb133-df39-46e2-b69e-856a5719c605" />



## Diagrama de Casos de Uso

<img width="5457" height="834" alt="deepseek_mermaid_20250821_715c4a" src="https://github.com/user-attachments/assets/4f2cc1a5-53e8-46f7-8adf-ac8dbc888e25" />


## Diagrama de Secuencia (Venta de Recarga)

<img width="689" height="3888" alt="deepseek_mermaid_20250821_860649" src="https://github.com/user-attachments/assets/79e713a7-f7f1-4b5e-a83a-a87d81fd355a" />




