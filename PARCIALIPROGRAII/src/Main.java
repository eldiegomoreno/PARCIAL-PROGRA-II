public class Main {
    public static void main(String[] args) {
        SistemGestion sistema = new SistemGestion();

        Usuario usuario1 = new Usuario("Diego Moreno", "U001");
        Usuario usuario2 = new Usuario("Arely Moreno", "U002");
        Usuario usuario3 = new Usuario("Alberto Moreno", "U003");

        sistema.registrarUsuario(usuario1);
        sistema.registrarUsuario(usuario2);
        sistema.registrarUsuario(usuario3);

        Proyecto proyecto1 = new Proyecto("Proyecto 1", "ELABORA UN ENCAPSULAMIENTO EN JAVA",
                "2024-08-01", "2024-08-31");
        Proyecto proyecto2 = new Proyecto("Proyecto 2", "ELABORA UNA GESTION DE TAREAS Y PROYECTOS",
                "2024-08-01", "2024-08-31");
        Proyecto proyecto3 = new Proyecto("Proyecto 2", "ELABORA UNA GESTION DE UN ZOLOGICO EN JAVA UTILIZA HERENCIA Y PAQUETES",
                "2024-08-01", "2024-08-31");


        sistema.registrarProyecto(proyecto1);
        sistema.registrarProyecto(proyecto2);
        sistema.registrarProyecto(proyecto3);

        Tarea tarea1 = new Tarea("Tarea 1", "Descripción de la Tarea 1",
                "2024-08-15", "Alta");

        sistema.asignarTareaAProyecto("Proyecto 1", tarea1);
        sistema.asignarTareaAUsuario("U001", tarea1);
        sistema.asignarTareaAProyecto("Proyecto 2", tarea1);
        sistema.asignarTareaAUsuario("U002", tarea1);
        sistema.asignarTareaAUsuario("Proyecto 3", tarea1);
        sistema.asignarTareaAUsuario("U003", tarea1);

        // Mostrar la información básica
        System.out.println("Usuario: " + usuario1.getNombre());
        System.out.println("Proyecto: " + proyecto1.getNombre());
        System.out.println("Tareas en el proyecto:");
        for (Tarea tarea : proyecto1.getTareas()) {
            System.out.println(" - " + tarea.getTitulo() + " (" + tarea.getEstado() + ")");
        }

        // Intentar asignar tarea a un usuario no existente
        sistema.asignarTareaAUsuario("U100", tarea1);

        // Intentar asignar tarea a un proyecto no existente
        sistema.asignarTareaAProyecto("Proyecto FINAL", tarea1);
    }
}
