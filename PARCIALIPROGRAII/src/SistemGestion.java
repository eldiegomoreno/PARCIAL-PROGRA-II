import java.util.ArrayList;

public class SistemGestion {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Proyecto> proyectos;

    public SistemGestion() {
        usuarios = new ArrayList<>();
        proyectos = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public Usuario buscarUsuario(String id) throws UsuarioNoEncontrado {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        throw new UsuarioNoEncontrado("Usuario no encontrado: " + id);
    }

    public Proyecto buscarProyecto(String nombre) throws ProyectoNoEncontrado {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getNombre().equals(nombre)) {
                return proyecto;
            }
        }
        throw new ProyectoNoEncontrado("Proyecto no encontrado: " + nombre);
    }

    public void asignarTareaAUsuario(String idUsuario, Tarea tarea) {
        try {
            Usuario usuario = buscarUsuario(idUsuario);
            System.out.println("Tarea " + tarea.getTitulo() + " asignada a " + usuario.getNombre());
        } catch (UsuarioNoEncontrado e) {
            System.out.println(e.getMessage());
        }
    }

    public void asignarTareaAProyecto(String nombreProyecto, Tarea tarea) {
        try {
            Proyecto proyecto = buscarProyecto(nombreProyecto);
            proyecto.agregarTarea(tarea);
            System.out.println("Tarea " + tarea.getTitulo() + " agregada al proyecto " + proyecto.getNombre());
        } catch (ProyectoNoEncontrado e) {
            System.out.println(e.getMessage());
        }
    }
}
