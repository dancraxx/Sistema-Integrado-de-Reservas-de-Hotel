# 🏨 Sistema Integrado de Reservas de Hotel

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Este es un proyecto de desarrollo continuo (estimado en ~80 horas) creado desde cero para afianzar y dominar conceptos avanzados de programación en Java. El objetivo principal no es solo que funcione, sino aplicar **buenas prácticas de Ingeniería de Software** y **Arquitectura Limpia**.

## 🎯 Objetivos de Aprendizaje
- Dominar la **Programación Orientada a Objetos (POO)**: Herencia, Polimorfismo, Interfaces y Clases Abstractas.
- Manejo avanzado de **Estructuras de Datos** (`Collections`, `HashMap`, `HashSet`).
- Control del tiempo con la API **`java.time`** (`LocalDate`, etc.).
- Gestión y manejo de **Excepciones Personalizadas**.
- Implementación de **Arquitectura por Capas** (Patrón DAO / MVC).
- **Persistencia de Datos**: Desde lectura/escritura de archivos (I/O) hasta bases de datos relacionales (SQL/JDBC).

---

## 🏗️ Arquitectura del Proyecto

El código está estructurado en un modelo de capas para separar responsabilidades y hacer el sistema escalable:

* **`model`**: Contiene las entidades base (POJOs) como `Cliente`, `Habitacion` (y sus derivadas) y `Reserva`.
* **`repository` (DAO)**: Encargada de la persistencia de datos. Contiene las interfaces y clases que guardan/recuperan información (primero en memoria, luego en archivos, finalmente en Base de Datos).
* **`service`**: Contiene la Lógica de Negocio. Aquí ocurren las validaciones, cálculos de precios y disponibilidad.
* **`ui`**: Capa de presentación (Interfaz de Usuario). Actualmente basada en consola, con vistas a migrar a JavaFX.

---

## 🗺️ Hoja de Ruta (Roadmap)

- [ ] **Fase 1: Lógica Central y POO (En progreso 🚧)**
  - [x] Estructuración del proyecto en capas.
  - [x] Diseño de clases `Habitacion` (Abstracta), `Cliente` y derivadas.
  - [ ] Implementación de la clase `Reserva` (uso de `LocalDate`).
  - [ ] Lógica de negocio en la capa `Service`.
  - [ ] Menú funcional por consola.

- [ ] **Fase 2: Persistencia en Archivos**
  - [ ] Implementación de `ClienteDAOArchivos` y `ReservaDAOArchivos`.
  - [ ] Uso de *Streams* de entrada/salida para guardar datos en `.csv` o `.txt`.

- [ ] **Fase 3: Base de Datos y Refactorización**
  - [ ] Conexión a Base de Datos Relacional (MySQL / SQLite) usando JDBC.
  - [ ] Implementación de los DAOs SQL.
  - [ ] Integración de Maven/Gradle para gestión de dependencias.

- [ ] **Fase 4: Interfaz Gráfica (Opcional)**
  - [ ] Migración de la capa `ui` a **JavaFX**.
  - [ ] Diseño de ventanas, formularios y tablas interactivas.

---

## 🚀 Cómo ejecutar el proyecto (Local)
1. Clona este repositorio: `git clone https://github.com/dancraxx/Sistema-Integrado-de-Reservas-de-Hotel.git`
2. Importa el proyecto en tu IDE favorito (Eclipse, IntelliJ, etc.).
3. Ejecuta la clase principal (por definir) ubicada en el paquete `ui`.