public class CursoEnLinea extends RecursoDigital {
    private instructor String;
    private numLecciones integer;

    public CursoEnLinea (String instructor, int numLecciones, String autor, String titulo, int anioPublicacion, boolean disponible) {
        super(autor, titulo, anioPublicacion, disponible);
        this.instructor = instructor;
        this.numLecciones = numLecciones;
    }

    public boolean inscribirse() {
        if (this.disponible) {
            this.disponible = true;
            return true;
        } else {
            return false;
        }
    }

    public void completarLeccion(int leccion) {
        System.out.println("Lección completada");
    }
}
