package behavioral.templatemethod;

public class MinecraftLoader extends BaseGameLoader {

    @Override
    byte[] loadLocalData() {
        System.out.println("Loading local data Minecraft...");
        // Some Minecraft code
        return new byte[0];
    }

    @Override
    void createObjects(byte[] datos) {
        System.out.println("Creating objects Minecraft");
        // Some Minecraft code
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files Minecraft");
        // Some Minecraft code
    }

    @Override
    void initializeProfiles() {
        System.out.println("Initializing profiles Minecraft");
        // Some Minecraft code
    }
}
