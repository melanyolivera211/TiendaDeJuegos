# 🎮 Tienda de Videojuegos - Spring Boot

Sistema de gestión de videojuegos desarrollado con Spring Boot, arquitectura MVC,y MySQL.

## 📋 Requisitos Previos

- Java 17 o superior
- Maven 3.6+
- MySQL 8.0+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## 🚀 Configuración Inicial

### 1. Crear la Base de Datos

Ejecuta el siguiente comando en MySQL:

```sql
CREATE DATABASE videojuegos_db;
```

### 2. Configurar Credenciales

Edita el archivo `src/main/resources/application.properties` y actualiza:

```properties
spring.datasource.password=TU_CONTRASEÑA
```

Reemplaza `TU_CONTRASEÑA` con tu contraseña de MySQL.

## 🏃‍♂️ Ejecutar la Aplicación

### Opción 1: Con Maven

```bash
mvn spring-boot:run
```

### Opción 2: Desde tu IDE

Ejecuta la clase principal `VideojuegosApplication.java`

## 🌐 Acceder a la Aplicación

Una vez iniciada la aplicación, abre tu navegador y visita:

```
http://localhost:8080/videojuegos
```

## 📁 Estructura del Proyecto

```
videojuegos/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tienda/videojuegos/
│   │   │       ├── VideojuegosApplication.java
│   │   │       ├── controller/
│   │   │       │   └── VideojuegoController.java
│   │   │       ├── domain/
│   │   │       │   └── Videojuego.java
│   │   │       ├── repository/
│   │   │       │   └── VideojuegoRepository.java
│   │   │       └── service/
│   │   │           └── VideojuegoService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── templates/
│   │           └── listado.html
└── pom.xml
```

## ✨ Funcionalidades

- ✅ Agregar videojuegos con formulario web
- ✅ Listar todos los videojuegos registrados
- ✅ Persistencia en base de datos MySQL
- ✅ Interfaz responsive con Thymeleaf
- ✅ Recarga automática con Spring Boot DevTools

## 🛠️ Tecnologías Utilizadas

- **Spring Boot 3.1.5**
- **Java 17**
- **Maven**
- **Spring Web**
- **Thymeleaf**
- **Spring Data JPA**
- **MySQL Driver**
- **Spring Boot DevTools**

## 📝 Modelo de Datos

### Entidad Videojuego

| Campo | Tipo | Descripción |
|-------|------|-------------|
| id | Long | Identificador único (autoincremental) |
| nombre | String | Nombre del videojuego |
| categoria | String | Categoría (Acción, RPG, etc.) |
| descripcion | String | Descripción del juego |
| precio | Double | Precio del videojuego |
| imagen | String | URL de la imagen |

## 🎯 Endpoints

| Método | Ruta | Descripción |
|--------|------|-------------|
| GET | `/videojuegos` | Muestra el listado de videojuegos |
| POST | `/videojuegos/agregar` | Agrega un nuevo videojuego |

## 👨‍💻 Autor

Proyecto desarrollado para el curso de 6to Semestre

## 📄 Licencia

Este proyecto es de código abierto y está disponible para fines educativos.
