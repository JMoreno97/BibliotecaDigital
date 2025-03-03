public class RevistaDigital extends RecursoDigital{
    //Atributos
    private int numeroEdicion;
    private String categoria;

    //Constructor
    public RevistaDigital(int numeroEdicion, String categoria) {
        this.numeroEdicion = numeroEdicion;
        this.categoria = categoria;
    }


    //Getters y Setters
    public int getNumeroEdicion() {return numeroEdicion;}

    public void setNumeroEdicion(int numeroEdicion) {this.numeroEdicion = numeroEdicion;}

    public String getCategoria() {return categoria;}

    public void setCategoria(String categoria) {this.categoria = categoria;}


    //Métodos
    @Override
    public boolean prestar() {return false;}

    @Override
    public void devolver() {}

    public void leerEnLinea() {}
}
