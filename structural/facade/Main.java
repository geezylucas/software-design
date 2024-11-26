package structural.facade;

/*
 * Es un patrón de diseño estructural que proporciona una interfaz simplificada a una biblioteca, un framework 
 * o cualquier otro grupo complejo de clases.
 */
public class Main {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
