package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * Main class
     *
     * @param args Not used
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        if (args.length > 0) {
            System.out.println("More arguments!");
            int i = 0;
            for (final String arg : args) {
                System.out.println(i + ": " + arg);
            }
        }

        // Pretend we added a feature but forgot to change the version number
    }
}

