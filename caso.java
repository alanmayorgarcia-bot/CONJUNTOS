import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class caso {
    public static void main(String[] args) {
        // Diccionario (Map) de estudiantes
        Map<String, String> estudiantes = new HashMap<>();
        estudiantes.put("101", "Ana");
        estudiantes.put("102", "Luis");
        estudiantes.put("103", "Carlos");
        estudiantes.put("104", "Maria");
        estudiantes.put("105", "Pedro");

        // Estudiantes inscritos en cada curso (Conjuntos / Set)
        Set<String> programacion = new HashSet<>(Arrays.asList("101", "102", "103"));
        Set<String> redes = new HashSet<>(Arrays.asList("102", "104", "105"));

        // Operaciones de conjuntos (se crean copias para no modificar los originales)
        Set<String> union = new HashSet<>(programacion);
        union.addAll(redes);
        System.out.println("Union: " + union);

        Set<String> interseccion = new HashSet<>(programacion);
        interseccion.retainAll(redes);
        System.out.println("Interseccion: " + interseccion);

        Set<String> diferencia = new HashSet<>(programacion);
        diferencia.removeAll(redes);
        System.out.println("Diferencia: " + diferencia);

        // Bucle para buscar estudiantes varias veces
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nIngresa una matricula (o escribe 'salir' para terminar): ");
            String matricula = scanner.nextLine().trim();

            if (matricula.equalsIgnoreCase("salir")) {
                System.out.println("Programa finalizado.");
                break;
            }

            if (estudiantes.containsKey(matricula)) {
                System.out.println("Estudiante: " + estudiantes.get(matricula));
            } else {
                System.out.println("Estudiante no encontrado");
            }
        }

        scanner.close();
    }
}