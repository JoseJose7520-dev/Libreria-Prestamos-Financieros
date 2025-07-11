
package Libreria;
import java.util.Scanner;


public class MainPrestamos {

  public static void main(String[] args) {

        // Crear objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cálculos Financieros ---");

        // Pedir capital al usuario
        System.out.print("Ingrese el capital (cantidad de dinero que presta o invierte): ");
        double capital = sc.nextDouble();

        // Pedir tasa de interés anual en decimal (ejemplo: 0.12 para 12% anual)
        System.out.print("Ingrese la tasa de interés ANUAL (en decimal, ejemplo 0.12 para 12%): ");
        double tasaAnual = sc.nextDouble();

        // Convertir tasa anual a mensual usando el método de la clase PrestamosFinancieros
        double tasaMensual = PrestamosFinancieros.convertirTasaAnualAMensual(tasaAnual);
        System.out.printf("La tasa mensual equivalente es: %.6f%n", tasaMensual);

        // Pedir tiempo en años
        System.out.print("Ingrese el tiempo (en años): ");
        int tiempo = sc.nextInt();

        // Calcular tiempo en meses para el cálculo de pago mensual
        int numeroMeses = tiempo * 12;

        // Calcular interés simple
        double interesSimple = PrestamosFinancieros.calcularInteresSimple(capital, tasaAnual, tiempo);

        // Calcular interés compuesto
        double interesCompuesto = PrestamosFinancieros.calcularInteresCompuesto(capital, tasaAnual, tiempo);

        // Calcular monto final con interés simple
        double montoFinalSimple = PrestamosFinancieros.calcularMontoFinalInteresSimple(capital, tasaAnual, tiempo);

        // Calcular monto final con interés compuesto
        double montoFinalCompuesto = PrestamosFinancieros.calcularMontoFinalInteresCompuesto(capital, tasaAnual, tiempo);

        // Calcular pago mensual usando el método de la clase PrestamosFinancieros
        double pagoMensual = PrestamosFinancieros.calcularPagoMensual(capital, tasaMensual, numeroMeses);

        // Mostrar resultados finales con formato claro
        System.out.println("\n--- Resultados ---");
        System.out.printf("Interés Simple: %.2f%n", interesSimple);
        System.out.printf("Interés Compuesto: %.2f%n", interesCompuesto);
        System.out.printf("Monto Final con Interés Simple: %.2f%n", montoFinalSimple);
        System.out.printf("Monto Final con Interés Compuesto: %.2f%n", montoFinalCompuesto);
        System.out.printf("Pago mensual aproximado (cuota fija mensual): %.2f%n", pagoMensual);

        // Cerrar Scanner
        sc.close();
    }
}
