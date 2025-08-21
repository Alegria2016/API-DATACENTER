# API SPROMG BOOT.

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
OPERADORES, RECARGAS, USUARIOS 
```

<img width="795" height="433" alt="image" src="https://github.com/user-attachments/assets/a46a7579-dc10-4e2a-8bf6-d3205dd8a25d" />


```bash
ng generate --help
```

## Building

To build the project run:

```bash
ng build
```

This will compile your project and store the build artifacts in the `dist/` directory. By default, the production build optimizes your application for performance and speed.

## Running unit tests

To execute unit tests with the [Karma](https://karma-runner.github.io) test runner, use the following command:

```bash
ng test
```

## Running end-to-end tests

For end-to-end (e2e) testing, run:

```bash
ng e2e
```

Angular CLI does not come with an end-to-end testing framework by default. You can choose one that suits your needs.

## Additional Resources

For more information on using the Angular CLI, including detailed command references, visit the [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli) page.
