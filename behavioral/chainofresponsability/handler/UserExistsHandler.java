package behavioral.chainofresponsability.handler;

import behavioral.chainofresponsability.Database;

public class UserExistsHandler extends Handler {

    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("Username not found!");
            return false;
        }

        return handleNext(username, password);
    }
}
