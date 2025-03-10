public class CorreoNotificacion implements Notificable {
    private String destinatario;
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}


