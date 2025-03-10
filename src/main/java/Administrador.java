public class Administrador extends Usuario {

    private int nivelAcceso;
    private ArrayList<RecursoDigital> recursos = new ArrayList<>();

    public boolean agregarRecurso(RecursoDigital recurso) {
        return recurso != null && recursos.add(recurso);
    }

    public boolean eliminarRecurso(String titulo) {
        for (int i = 0; i < recursos.size(); i++) {
            if (recursos.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                recursos.remove(i);
                return true;
            }
        }
        return false;
    }
}