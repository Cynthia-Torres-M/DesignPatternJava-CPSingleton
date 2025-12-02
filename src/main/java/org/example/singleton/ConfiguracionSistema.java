package org.example.singleton;

public class ConfiguracionSistema {

    // 1. La única instancia estática (Singleton)
    private static ConfiguracionSistema instancia;

    private String modo;
    private String version;

    // 2. Constructor privado para evitar instancias externas
    private ConfiguracionSistema() {
        this.modo = "Producción";
        this.version = "1.0";
    }

    // 3. Método estático para obtener la única instancia
    public static ConfiguracionSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionSistema();
        }
        return instancia;
    }

    // Métodos getters y setters
    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Configuración -> Modo: " + modo + ", Versión: " + version;
    }
}
