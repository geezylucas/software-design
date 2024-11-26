package behavioral.chainofresponsability.handler;

import behavioral.chainofresponsability.Database;

public class ValidPasswordHandler extends Handler {

    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Password wrong!");
            return false;
        }
        return handleNext(username, password);
    }
}
