/*
 * Liskov Substitution (Sustitución de Liskov)
 * 
 * Una clase debería ser sustituible por su clase padre. La clase heredada debe 
 * complementar, no reemplazar, el comportamiento de la clase base.
 */

// MAL
Car[] cars = {  
    new Ferrari(),
    new Mazda(),
    new Tesla(),
    new Mercedes()
};

public static void printCatSeats(Car[] cars) {  
    for (Car car : cars) {
        if(car instanceof Ferrari)
            System.out.println(numSeatsFerrari(car));
        if(car instanceof Mazda)
            System.out.println(numSeatsMazda(car));
        if(car instanceof Tesla)
            System.out.println(numSeatsTesla(car));
    }
}

printCatSeats(cars);

// BIEN
abstract class Car {

    // ...
    abstract int numSeats();
}

class Ferrari extends Car {

    // ...
    @Override
    int numSeats() {
        return 2;
    }
}

class Tesla extends Car {

    // ...
    @Override
    int numSeats() {
        return 5;
    }
}

class Mercedes extends Car {

    // ...
    @Override
    int numSeats() {
        return 3;
    }
}

public static void printCatSeats(Car[] cars){  
    for (Car car : cars) {
        System.out.println(car.numSeats());
    }
}

printCarSeats({new Tesla(), new Ferrari(), new Mercedes()});

