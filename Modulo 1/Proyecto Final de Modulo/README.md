# Netflix Analytics Project

<div align="center">

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

</div>

> Este proyecto es el resultado de aprendizaje de la unidad 4 de la academia **DevSenior** en el curso de **Java Senior AI**, donde se hace uso de conceptos avanzados de POO, programación funcional y aplicación de tipos de colecciones (List y Map) y cómo transformar los datos.

---

## 📊 Descripción

**Netflix Analytics** es una aplicación de consola en Java que analiza datos de visualizaciones de películas y series de una plataforma de streaming. Permite obtener estadísticas sobre:

- 🎬 Películas más populares
- 👤 Tiempo de visualización por usuario
- 🎭 Distribución por género
- 📈 Análisis de tendencias

---

## 🏗️ Arquitectura

```
com.devsenior/
├── model/           # Modelos de datos (POO)
│   ├── Movie.java
│   ├── User.java
│   ├── Gender.java
│   └── Visualisation.java
├── repository/      # Capa de acceso a datos
│   └── DataRepository.java
├── service/        # Lógica de negocio (Streams API)
│   └── AnalyticsService.java
├── ui/             # Interfaz de usuario
│   └── ConsoleUI.java
└── Main.java       # Punto de entrada
```

---

## 🛠️ Tecnologías

| Tecnología | Uso |
|------------|-----|
| **Java 17+** | Lenguaje principal |
| **Maven** | Gestión de dependencias |
| **Streams API** | Programación funcional |
| **List & Map** | Colecciones avanzadas |

---

## ✨ Características Principales

- ✅ **POO Avanzada**: Encapsulamiento, herencia y modelado de entidades
- ✅ **Programación Funcional**: Uso intensivo de `Stream API`, `lambda` y method references
- ✅ **Colecciones**: Transformaciones con `List` y `Map` (groupingBy, counting, averaging)
- ✅ **Menú Interactivo**: Consola con opciones de análisis en tiempo real

---

## 📦 Instalación

```bash
# Clonar el proyecto
git clone <url-repositorio>

# Compilar
cd finalproyect
mvn clean compile

# Ejecutar
mvn exec:java -Dexec.mainClass="com.devsenior.Main"
```

---

## 📈 Funcionalidades de Análisis

| Función | Descripción |
|---------|-------------|
| `popularMovies()` | Películas más vistas ordenadas |
| `moviesByGender()` | Agrupación de películas por género |
| `timeViewedByUser()` | Minutos vistos por usuario |
| `averageTimeByGender()` | Duración promedio por género |
| `mostGenderViewed()` | Géneros más populares |
| `rankingMostViewedMovie()` | Ranking completo de películas |

---

## 📝 Licencia

MIT License - feel free to use this project for learning purposes.

---
