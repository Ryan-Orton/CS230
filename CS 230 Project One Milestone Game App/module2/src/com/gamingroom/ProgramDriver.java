package com.gamingroom;

/**
 * The main class to run the program.
 * 
 * This class initializes the GameService and demonstrates basic operations
 * like adding games and retrieving them.
 */
public class ProgramDriver {

    public static void main(String[] args) {
        // Get the singleton instance of GameService
        GameService service = GameService.getInstance();

        // Add some games
        Game game1 = service.addGame("Chess");
        Game game2 = service.addGame("Checkers");

        // Retrieve and print games by name
        System.out.println("Retrieved Game: " + service.getGame("Chess").getName());
        System.out.println("Retrieved Game: " + service.getGame("Checkers").getName());

        // Retrieve and print games by ID
        System.out.println("Retrieved Game by ID: " + service.getGame(game1.getId()).getName());
        System.out.println("Retrieved Game by ID: " + service.getGame(game2.getId()).getName());
    }
}

