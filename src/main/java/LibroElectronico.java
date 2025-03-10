public class LibroElectronico extends RecursoDigital {

    private String formato;
    private double tamanoMB;

    public LibroElectronico(String formato, double tamanoMB) {
        this.formato = formato;
        this.tamanoMB = tamanoMB;
        this.disponible = true;
    }
    public void descargar(){
        System.out.println("Se esta descargado el libro de electronico");
    }

    public String mostrarInformacion(){
        return "el formato del Libro Electronico es " + formato + " y pesa " + tamanoMB;
    }

    @Override
    public boolean prestar() {
        if (disponible == true) {
            System.out.println("El libro ha sido prestado");
            disponible = false;
        } else {
            System.out.println("El libro ya ha sido prestado");
        }
        return disponible;
    }

    @Override
    public boolean devolver() {
        if (disponible == false) {
            System.out.println("El libro ha sido devuelto");
            disponible = true;
        } else {
            System.out.println("El libro ya ha sido devuelto");
        }
        return disponible;
    }
}
