import java.util.ArrayList;
import java.util.Random;

public class arregloCalificaciones {
    public static void main(String[] args) {
        String[] calificaciones = new String[10];
        Random random = new Random();

        for (int i = 0; i < calificaciones.length; i++) {
            calificaciones[i] = String.valueOf(random.nextDouble() * 10);
        }
        ArrayList<Double> desaprobado = new ArrayList<>();
        ArrayList<Double> aprobado = new ArrayList<>();
        ArrayList<Double> excelente = new ArrayList<>();

        for (String calificacionStr : calificaciones) {
            double calificacion = Double.parseDouble(calificacionStr);
            if (calificacion < 4 ) {
                desaprobado.add(calificacion);
            } else if (calificacion >= 10) {
                excelente.add(calificacion);
            } else {
                aprobado.add(calificacion);
            }
        }

        double notaOriginal = calcularPromedio(calificaciones);
        double notaDesaprobado = calcularPromedio(desaprobado);
        double notaAprobado = calcularPromedio(aprobado);
        double notaExcelente = calcularPromedio(excelente);

        System.out.println("Calificaciones originales: ");
        imprimirArreglo(calificaciones);

        System.out.println("Promedio del arreglo original: " +notaOriginal);
        System.out.println("Promedio de alumnos desaprobados: " +notaDesaprobado);
        System.out.println("Promedio de alumnos aprobados: " +notaAprobado);
        System.out.println("Promedio de alumnos con notas excelentes: " +notaExcelente);
    }

    public static double calcularPromedio(String[] arreglo) {
        double suma = 0;
        for (String valor : arreglo) {
            suma += Double.parseDouble(valor);
        }
        return suma/arreglo.length;
    }

    public static double calcularPromedio(ArrayList<Double> arreglo) {
        if (arreglo.isEmpty()) return 0;
        double suma = 0;
        for (double valor : arreglo) {
            suma += valor;
        }
        return suma/arreglo.size();
    }

    public static void imprimirArreglo(String[] arreglo) {
        for (String valor : arreglo) {
            System.out.println(valor + " ");
        }
        System.out.println();
    }

}
