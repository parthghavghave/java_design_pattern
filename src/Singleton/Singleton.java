package Singleton;

public class Singleton {
    private static Singleton instance; // The single instance of the class

    private int x;
    // Private constructor to prevent external instantiation
    private Singleton() { }

    // Method to provide access to the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy initialization
        }
        return instance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}



