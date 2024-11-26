/*
 * Single Responsibility (Responsabilidad Única)
 * 
 * Cada módulo o clase debería tener una sola responsabilidad, esto también se puede interpretar
 * como “tener una y sólo una razón para cambiar”. En pocas palabras, tu componente/función/clase debería
 * hacer muy bien una sola cosa.
 */

// MAL
class User {

    private String username;

    User(String username) {
        this.username = username;
    }

    String getUsername() {
        return username;
    }

    // ???
    User saveUser(User newUser) {
        // ...
    }
}

// BIEN
class User {
    
    private String username;

    User(String username) {
        this.username = username;
    }

    String getUsername() {
        return username;
    }
}

class UserRepository {

    User saveUser(User newUser) {
        // ...
    }

    void deleteUser(User user) {
        // ...
    }
}