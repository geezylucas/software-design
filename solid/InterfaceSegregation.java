/*
 * Interface Segregation (Segregación de interfaces)
 * 
 * Ningún cliente debe verse obligado a depender de métodos que no utiliza. Es preferible contar 
 * con muchas interfaces con pocos métodos que tener una interface que requiera implementar 
 * métodos que no serán usados.
 */

// MAL
interface InterfaceSegregation {

    void printDocument();

    void scanDocument();

    void faxDocument();
}

class SimplePrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void scanDocument() {
        // Not implemented
    }

    public void faxDocument() {
        // Not implemented
    }
}

public static void main(String[] args) {
    SimplePrinter printer = new SimplePrinter();
    printer.printDocument();
}

// BIEN
interface Printer {

    void printDocument();
}

interface Scanner {

    void scanDocument();
}

interface Fax {

    void faxDocument();
}

class SimplePrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing document...");
    }
}

public class MultiFunctionPrinter implements Printer, Scanner, Fax {

    public void printDocument() {
        System.out.println("Printing document...");
    }

    public void scanDocument() {
        System.out.println("Scanning document...");
    }

    public void faxDocument() {
        System.out.println("Faxing document...");
    }
}

public static void main(String[] args) {
    Printer simplePrinter = new SimplePrinter();
    simplePrinter.printDocument();

    MultiFunctionPrinter mfp = new MultiFunctionPrinter();
    mfp.printDocument();
    mfp.scanDocument();
    mfp.faxDocument();
}