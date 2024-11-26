package behavioral.chainofresponsability;

import behavioral.chainofresponsability.handler.UserExistsHandler;
import behavioral.chainofresponsability.handler.UserNotExpiredHandler;
import behavioral.chainofresponsability.handler.ValidPasswordHandler;
import behavioral.chainofresponsability.handler.Handler;

public class Main {

    public static void main(String[] args) {
        // Permite adicionar, remover o reordenar handlers de forma dinamica

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);

        // Si algun handler retorna false, se rombe el chain y valida la regla
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new UserNotExpiredHandler());

        AutenticacionService service = new AutenticacionService(handler);
        if (service.logIn("admin", "admin_password")) {
            System.out.println("Log In successfully!");
        }
    }
}
