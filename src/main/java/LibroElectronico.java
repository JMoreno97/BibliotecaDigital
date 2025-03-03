public class LibroElectronico extends RecursoDigital {

    private String formato;
    private double tamanoMB;

    public LibroElectronico(String formato, double tamanoMB, boolean disponible, ) {
        this.formato = formato;
        this.tamanoMB = tamanoMB;
        this.disponible = disponible;
    }
    public void descargar(){
        System.out.println("Se esta descargado el libro de electronico");
    }

    public String mostrarInformacion(){
        return "el formato del Libro Electronico es " + formato + " y pesa " + tamanoMB;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public void devolver() {

    }
}
