package creational.builder;

public class UserBuilder {

    private int id;
    private String username;
    private int age;
    private String city;

    public UserBuilder id(int id) {
        this.id = id;
        return this;
    }

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder city(String city) {
        this.city = city;
        return this;
    }

    public User build() {
        return new User(id, username, age, city);
    }
}
