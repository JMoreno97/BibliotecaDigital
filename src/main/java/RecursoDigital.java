public abstract class RecursoDigital {

    protected String autor;
    protected String titulo;
    protected int anioPublicacion;
    protected boolean disponible;

    public RecursoDigital(String autor, String titulo, int anioPublicacion, boolean disponible){
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    public abstract boolean prestar();

    public abstract void devolver();

}


