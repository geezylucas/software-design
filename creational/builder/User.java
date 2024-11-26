package creational.builder;

public class User {

    private int id;
    private String username;
    private int age;
    private String city;

    public User(int id, String username, int age, String city) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
