package behavioral.chainofresponsability;

import behavioral.chainofresponsability.handler.Handler;

public class AutenticacionService {

    private Handler handler;

    public AutenticacionService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        return handler.handle(username, password);
    }
}
