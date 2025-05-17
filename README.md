# Conversor de Monedas

Aplicación en Java que permite convertir montos desde dólares estadounidenses (USD) hacia las siguientes monedas: peso argentino (ARS), real brasileño (BRL) y peso mexicano (MXN); y viceversa. Utiliza la API Reliable Exchange Rate para obtener los valores actualizados de conversión.

## 🧰 Tecnologías Utilizadas

- Lenguaje: Java 17 (JDK 17)
- Librerías:
  - Gson 2.13.0 (para manejo de JSON)
- IDE: IntelliJ IDEA Community Edition
- Control de versiones: Git
- API de tipo de cambio: [Reliable Exchange Rate API](https://www.exchangerate-api.com/)

## 📁 Estructura del Proyecto

```
challenge-conversor-de-moneda/
│
├── src/
│   ├── Constantes.java
│   ├── ConvertirMoneda.java
│   ├── Moneda.java
│   ├── OpcionesEnum.java
│   ├── OpcionMoneda.java
│   └── Principal.java
│
├── .gitignore
├── README.md
└── External Libraries/
```

## 🚀 Instrucciones de Ejecución

1. Clona el repositorio:

```bash
git clone https://github.com/abernal90/challenge-conversor-de-moneda.git
```

2. Abre IntelliJ IDEA y selecciona la carpeta `challenge-conversor-de-moneda` como proyecto.

3. Configura el SDK del proyecto a Java 17:
   - File → Project Structure → Project → Project SDK → Selecciona JDK 17

4. Asegúrate de tener la librería Gson (gson-2.13.0.jar) agregada al proyecto:
   - File → Project Structure → Libraries → Añadir gson-2.13.0.jar

5. Ejecuta la clase Principal.java:
   - Haz clic derecho sobre la clase Principal → Run 'Principal.main()'

## 🧪 Ejemplo de Uso

```
**********************************************
Sea bienvenido/a al Conversor de Monedas:

1) Dólar =>> Peso argentino
2) Peso argentino =>> Dólar
3) Dólar =>> Real brasileño
4) Real brasileño =>> Dólar
5) Dólar =>> Peso mexicano
6) Peso mexicano =>> Dólar
7) Salir
**********************************************

1
Ingrese el valor que desea convertir
5
El valor 5 [USD] corresponde al valor final de =>> 5730.85 [ARS]
```

## ✅ Funcionalidades

- Interfaz amigable por consola
- Conversión entre múltiples divisas
- Datos en tiempo real gracias a la API externa
- Validación de entradas

## 🔗 Enlace al Repositorio

Puedes descargar o clonar este proyecto desde el siguiente enlace:

👉 https://github.com/abernal90/challenge-conversor-de-moneda

---

Desarrollado por [@abernal90](https://github.com/abernal90) en colaboración con la plataforma de formación en tecnología [Alura Latam](https://www.aluracursos.com/latam)
