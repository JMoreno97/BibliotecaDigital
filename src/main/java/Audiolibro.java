public class Audiolibro extends RecursoDigital {
    
    private int duracionMinutos;
    private String narrador;

    public Audiolibro(String autor, String titulo, int anioPublicacion, boolean disponible, int duracionMinutos, String narrador){
        super(autor, titulo, anioPublicacion, disponible);
        this.duracionMinutos = duracionMinutos;
        this.narrador = narrador;
    }

    public void reproducir(){
        System.out.println("Reproduciendo audiolibro: " + this.titulo);
    }

    public void pausar(){
        System.out.println("Pausando audiolibro: " + this.titulo);
    }

    @Override
    public void devolver() {
        this.disponible = true;
        
    }

    @Override
    public boolean prestar() {
        if(this.disponible){
            this.disponible = false;
            return true;
        }
        return false;
    }
    
}
