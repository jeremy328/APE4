public class Main1 {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 8, 9, 7),
            new Estudiante("Luis", 6, 5, 7),
            new Estudiante("Maria", 4, 3, 5),
            new Estudiante("Pedro", 9, 8, 10),
            new Estudiante("Sofia", 6, 6, 6)
        };

        int aprobados = 0;

        for (Estudiante e : estudiantes) {
            System.out.printf("%s : %.2f - ",
                    e.nombre, e.promedio);

            if (e.promedio >= 7) {
                System.out.println("Aprobado");
                aprobados++;
            } else if (e.promedio >= 5) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }
        }

        System.out.println("Total de aprobados: " + aprobados);
    }
}