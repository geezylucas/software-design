package behavioral.chainofresponsability.handler;

public class UserNotExpiredHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        // Logica de negocio para usuario expirado
        System.out.println("User not expired!");
        return handleNext(username, password);
    }
}
