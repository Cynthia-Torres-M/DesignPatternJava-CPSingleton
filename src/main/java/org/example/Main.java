package org.example;

import org.example.singleton.ConfiguracionSistema;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Obtenemos la instancia (única)
        ConfiguracionSistema config1 = ConfiguracionSistema.getInstancia();
        System.out.println("Primera instancia:");
        System.out.println(config1);

        // Cambiamos un valor
        config1.setModo("Desarrollo");

        // Obtenemos otra referencia (debería ser la misma instancia)
        ConfiguracionSistema config2 = ConfiguracionSistema.getInstancia();
        System.out.println("\nSegunda instancia (debe reflejar cambios):");
        System.out.println(config2);

        // Verificamos que ambas referencias son iguales
        System.out.println("\n¿Es la misma instancia? " + (config1 == config2));


    }
}