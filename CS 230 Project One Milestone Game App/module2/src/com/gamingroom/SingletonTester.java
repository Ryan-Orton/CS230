package com.gamingroom;

/**
 * The SingletonTester class to verify the Singleton pattern implementation.
 */
public class SingletonTester {

    public static void main(String[] args) {
        // Get the first instance of GameService
        GameService service1 = GameService.getInstance();

        // Get another instance of GameService
        GameService service2 = GameService.getInstance();

        // Check if both instances are the same
        if (service1 == service2) {
            System.out.println("Singleton pattern works, both references point to the same instance.");
        } else {
            System.out.println("Singleton pattern failed, references point to different instances.");
        }

        // Further testing with game addition
        service1.addGame("Soccer");
        Game retrievedGame = service2.getGame("Soccer");

        if (retrievedGame != null) {
            System.out.println("Game successfully retrieved: " + retrievedGame.getName());
        } else {
            System.out.println("Failed to retrieve the game.");
        }
    }
}

