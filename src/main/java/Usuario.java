import java.util.*;

public class Usuario {
    protected String nombre;
    protected String correoElectronico;
    protected String idUsuario;
    private List<RecursoDigital> prestamos = new ArrayList<>();

    public Usuario(String nombre, String correoElectronico, String idUsuario) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.idUsuario = idUsuario;
    }

    public boolean registrarse(){
        return true;
    }

    public List<RecursoDigital> consultarPrestamos(){
        return prestamos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
