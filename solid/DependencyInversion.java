/*
 * Dependency Inversion (Inversión de dependencias)
 * 
 * El principio de Inversión de Dependencias establece que los módulos de alto nivel, es decir, 
 * los más cercanos a las ideas humanas de lo que debe hacer el software, 
 * no deben depender de los de bajo nivel (los más cercanos a la implementación de los detalles para la computadora). 
 * Ambos deberían depender de las abstracciones del problema (interfaces). 
 * Además los detalles de implementación deben depender de las abstracciones también. 
 */

// MAL

import java.util.List;

class DatabaseService {

    public List<User> getData() {
        // ...
    }
}

class APIService {

    public List<User> getData() {
        // ...
    }
}

class DataAccess {

    private APIService databaseService;

    public DataAccess(APIService databaseService) {
        this.databaseService = databaseService;
    }

    public List<User> getData() {
        
        List<User> users = databaseService.getData();
        users.forEach(user -> user.setCreationDate(//....));
    }
}

DataAccess access = new DataAccess(new APIService());
access.getData();


// BIEN
interface Connection {

    public List<User> getData();
}

class DatabaseService implements Connection {

    @Override
    public List<User> getData() { 
        // ... 
    }
}

class APIService implements Connection {

    @Override
    public List<User> getData() { 
        // ... 
    }
}

class APIService implements Connection {

    @Override
    public List<User> getData() { 
        // ... 
    }
}

class DataAccess {

    private Connection connection;

    public DataAccess(Connection connection) {
        this.connection = connection;
    }

    public List<User> getData() {
        return connection.getData();
    }
}

DataAccess access = new DataAccess(new APIService());