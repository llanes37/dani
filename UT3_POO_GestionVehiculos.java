import java.util.ArrayList;
import java.util.List;

/**
 * ! Ejemplo de Herencia y Polimorfismo en Java
 * ? En este ejercicio crearemos una clase base "Vehiculo" y dos clases derivadas: "Coche" y "Moto".
 * ? Usaremos herencia para compartir características comunes y polimorfismo para personalizar comportamientos.
 *
 * * Autor: Joaquín
 * * Fecha: 24/01/2025
 */

// ******************************************************************
// 🔹 CLASE BASE: Vehiculo (Superclase)
// ******************************************************************
class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;
    

    // * Constructor de la clase Vehiculo
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // * Método que será sobrescrito en las clases hijas
    public void mostrarInfo() {
        System.out.println("🚗 Vehículo: " + marca + " | Velocidad Máxima: " + velocidadMaxima + " km/h");
    }
}

// ******************************************************************
// 🔹 CLASE HIJA: Coche (Hereda de Vehiculo)
// ******************************************************************
class Coche extends Vehiculo {
    private int numeroPuertas;

    // * Constructor de Coche (Llama al constructor de la superclase)
    public Coche(String marca, int velocidadMaxima, int numeroPuertas) {
        super(marca, velocidadMaxima); // Llamamos al constructor de Vehiculo
        this.numeroPuertas = numeroPuertas;
    }

    // * Sobreescribimos el método mostrarInfo para adaptarlo a Coche
    @Override
    public void mostrarInfo() {
        System.out.println("🚘 Coche: " + marca + " | Velocidad Máxima: " + velocidadMaxima + " km/h | Puertas: " + numeroPuertas);
    }
}

// ******************************************************************
// 🔹 CLASE HIJA: Moto (Hereda de Vehiculo)
// ******************************************************************
class Moto extends Vehiculo {
    private boolean tieneBaul;

    // * Constructor de Moto
    public Moto(String marca, int velocidadMaxima, boolean tieneBaul) {
        super(marca, velocidadMaxima); // Llamamos al constructor de Vehiculo
        this.tieneBaul = tieneBaul;
    }

    // * Sobreescribimos el método mostrarInfo para adaptarlo a Moto
    @Override
    public void mostrarInfo() {
        System.out.println("🏍️ Moto: " + marca + " | Velocidad Máxima: " + velocidadMaxima + " km/h | ¿Baúl?: " + (tieneBaul ? "Sí" : "No"));
    }
}

// ******************************************************************
// 🔹 CLASE PRINCIPAL: Main
// ******************************************************************
public class UT3_POO_GestionVehiculos {
    public static void main(String[] args) {
        // * Creamos una lista de vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();
            
        // * Añadimos distintos tipos de vehículos a la lista
        vehiculos.add(new Coche("Toyota", 180, 4));
        vehiculos.add(new Moto("Yamaha", 120, true));
        vehiculos.add(new Coche("BMW", 250, 2));
        vehiculos.add(new Moto("Harley-Davidson", 150, false));

        // * Recorremos la lista usando polimorfismo (cada objeto usa su propio método mostrarInfo)
        System.out.println("\n--- Lista de Vehículos ---");
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo(); // * Llamada polimórfica
        }
    }
}
