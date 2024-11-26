package behavioral.templatemethod;

public class FortniteLoader extends BaseGameLoader {

    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local data Fortnite...");
        // Some Fortnite code
        return new byte[0];
    }

    @Override
    void createObjects(byte[] datos) {
        System.out.println("Creating objects Fortnite");
        // Some Fortnite code
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files Fortnite");
        // Some Fortnite code
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing profiles Fortnite");
        // Some Fortnite code
    }
}
