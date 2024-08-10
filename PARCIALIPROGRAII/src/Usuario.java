public class Usuario extends Persona {
    private String id;

    public Usuario(String nombre, String id) {
        super(nombre);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre() + ", ID: " + id);
    }
}
