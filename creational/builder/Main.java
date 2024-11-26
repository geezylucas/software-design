package creational.builder;

/*
 * Patrón creacional que permite la creación de diferentes representaciones de un objeto. 
 * Se utiliza en situaciones en las que que el objeto tiene una gran cantidad de atributos en el constructor 
 * por lo que la construcción se realiza en un conjunto de pasos. 
 * También se suele usar este patrón para construir objectos inmutables. 
 */
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