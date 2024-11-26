package creational.builder;

public class Main {

	public static void main(String[] args) {
		// Producir diferentes tipos y representaciones de un objeto utilizando el mismo
		// código de construcción
		UserBuilder userBuilder1 = new UserBuilder().age(25);
		userBuilder1 = userBuilder1.city("CDMX");

		User user1 = userBuilder1
				.username("Gerardo")
				.build();

		User user2 = new UserBuilder()
				.id(2)
				.username("Karen")
				.age(21)
				.city("CDMX")
				.build();

		System.out.println(
				"Username " + user1.getUsername() + ", Age " + user1.getAge() + ", City " + user1.getCity());
		System.out.println(
				"Username " + user2.getUsername() + ", Age " + user2.getAge() + ", City " + user2.getCity());
	}
}