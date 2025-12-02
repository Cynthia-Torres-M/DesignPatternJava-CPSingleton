Aquí tienes el **README.md** en formato **Markdown**, listo para copiar y pegar en tu proyecto Maven del patrón Singleton.

---

# 🟦 Patrón de Diseño Singleton en Java

Proyecto Maven con ejemplo en consola

## 📌 Descripción

Este proyecto demuestra el uso del **patrón de diseño Singleton** en Java.
El Singleton garantiza que una clase tenga **una única instancia global**, evitando múltiples copias y proporcionando un punto de acceso único para todo el sistema.

En este ejemplo se implementa una clase llamada `ConfiguracionSistema` que representa configuraciones generales de la aplicación.

---

## 📁 Estructura del Proyecto

```
singleton-pattern/
│
├── pom.xml
└── src
    └── main
        └── java
            └── org
                └── example
                    ├── Main.java
                    └── singleton
                        └── ConfiguracionSistema.java
```

---

## 🧩 Implementación del patrón Singleton

### Puntos clave del patrón utilizados aquí:

1. **Instancia estática privada**

   ```java
   private static ConfiguracionSistema instancia;
   ```

2. **Constructor privado** para evitar nuevas instancias

   ```java
   private ConfiguracionSistema() { ... }
   ```

3. **Método público estático de acceso ("getInstancia")**

   ```java
   public static ConfiguracionSistema getInstancia() {
       if (instancia == null) {
           instancia = new ConfiguracionSistema();
       }
       return instancia;
   }
   ```

---

## 🔧 Código relevante

### Clase Singleton

```java
public class ConfiguracionSistema {

    private static ConfiguracionSistema instancia;

    private String modo;
    private String version;

    private ConfiguracionSistema() {
        this.modo = "Producción";
        this.version = "1.0";
    }

    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    // Getters y setters...
}
```

### Clase Main

```java
public class Main {
    public static void main(String[] args) {
        ConfiguracionSistema config1 = ConfiguracionSistema.getInstancia();
        System.out.println(config1);

        config1.setModo("Desarrollo");

        ConfiguracionSistema config2 = ConfiguracionSistema.getInstancia();
        System.out.println(config2);

        System.out.println("¿Es la misma instancia? " + (config1 == config2));
    }
}
```

---

## ▶️ Ejecución

1. Clona o descarga el proyecto.
2. Desde la raíz del proyecto, compila con Maven:

```
mvn clean install
```

3. Ejecuta la aplicación:

```
mvn exec:java -Dexec.mainClass="org.example.Main"
```

---

## 🖨️ Resultado esperado en consola

```
Configuración -> Modo: Producción, Versión: 1.0
Configuración -> Modo: Desarrollo, Versión: 1.0
¿Es la misma instancia? true
```

---

## 📘 ¿Cuándo usar el patrón Singleton?

Úsalo cuando necesitas:

* Configuraciones globales
* Administrar un recurso compartido
* Controlar acceso a archivos/logs
* Conexión única a una base de datos
* Servicios centralizados en una aplicación

---

## 📄 Licencia

Este proyecto es de libre uso para fines educativos.

---