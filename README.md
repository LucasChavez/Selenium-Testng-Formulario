<<<<<<< HEAD
# Selenium-Testng-Formulario
Este proyecto automatiza y valida el ingreso  de los datos en  un formulario de seguro de vida utilizando **Selenium WebDriver** con **TestNG** en **Java**. Se implementa el **Page Object Model (POM)** para mejorar la mantenibilidad y reutilización del código.
=======
# Selenium TestNG - Formulario de Seguro de Vida

## Descripción

Este proyecto automatiza y valida el ingreso 
de los datos en  un formulario de seguro de vida utilizando **Selenium WebDriver** con **TestNG** en **Java**.
Se implementa el **Page Object Model (POM)** para mejorar la mantenibilidad y reutilización del código.

## Funcionalidades

- Validación de restricciones en los campos:
    - Edad (no se permiten valores fuera del rango permitido)
    - Monto de seguro (valores límites y permitidos)
    - Provincia (selección válida de opciones disponibles)
    - Número de celular (validación de formato y longitud)
 
- Reporte de resultados de pruebas
- Ejecución de pruebas con TestNG

## Tecnologías utilizadas

- **Lenguaje:** Java
- **Framework de Pruebas:** TestNG
- **Automatización Web:** Selenium WebDriver
- **Patrón de diseño:** Page Object Model (POM)

## Requisitos previos

Para ejecutar el proyecto, asegúrese de tener instalados:

- **Java 8 o superior**
- **Maven** (para la gestión de dependencias)
- **IDE** (IntelliJ IDEA, Eclipse u otro compatible con Java)
- **Google Chrome** y el correspondiente **ChromeDriver**

## Instalación y Configuración

1. Clonar el repositorio:
   ```sh
   git clone https://github.com/tuusuario/Selenium-Testng-Formulario.git
   ```
2. Ingresar al directorio del proyecto:
   ```sh
   cd Selenium-Testng-Formulario
   ```
3. Instalar dependencias con Maven:
   ```sh
   mvn clean install
   ```

## Ejecución de Pruebas

Para ejecutar las pruebas, ejecute:

```sh
mvn test
```

O desde el IDE, ejecute el archivo `testng.xml`.

## Estructura del Proyecto

```
Selenium-Testng-Formulario/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── pages/  # Clases del Page Object Model
│   │   │   ├── utils/  # Utilidades y configuraciones
│   ├── test/
│   │   ├── java/
│   │   │   ├── tests/  # Clases de pruebas con TestNG
│── pom.xml  # Archivo de configuración de Maven
│── testng.xml  # Archivo de configuración de TestNG
```

## Contacto

Si tienes alguna pregunta o sugerencia, no dudes en contactarme en [LinkedIn](https://www.linkedin.com/in/lucas-chavez-284111b5/.

>>>>>>> 4cf9cbb (Subo todo los archivos del primer proyecto)
