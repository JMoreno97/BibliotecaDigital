public class Usuario {

    private String nombre;
    private String correoElectronico;
    private String idUsuario;
    private List<Prestamo> prestamos = new ArrayList<>();

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getIdUsuario() {
        return idUsuario;
    }
  
  
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
  
      public boolean registrarse(){
        return true;
    }
  
    //TODO: Mala implementación
      public List<RecursoDigital> consultarPrestamos(){
        return prestamos;
    }

}


