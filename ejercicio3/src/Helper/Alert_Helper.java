package Helper;

public class Alert_Helper {
    public void showAlert(String mensaje){
        String alerta = "===================================\n"
                        +"Notificando alerta\n"+
                        mensaje +
                        "\n===================================";

        System.err.println(alerta);
    }
}
