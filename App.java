package sdf.fortunecookies;

import java.io.File;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        String dirPath = "./data2";

        File newDirectory = new File(dirPath);

        if (newDirectory.exists()){
            System.out.println("Directory already exist");
        } else {
            newDirectory.mkdir();
        }
    }
}
