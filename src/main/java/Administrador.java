public class Administrador extends Usuario {

    private int nivelAcceso;

    public boolean agregarRecurso(RecursoDigital recurso){
        return true;
    }

    public boolean eliminarRecurso(String titulo){
        return true;
    }
}