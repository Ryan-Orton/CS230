package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * The GameService class is a singleton that manages the game, team, and player instances.
 * It ensures that only one instance of GameService exists in memory at any given time.
 * The class also enforces unique names for games, teams, and players using the iterator pattern.
 */
public class GameService {

    // Singleton instance of GameService
    private static GameService single_instance = null;

    // Lists to hold game, team, and player instances
    private List<Game> games = new ArrayList<>();
    private List<Team> teams = new ArrayList<>();
    private List<Player> players = new ArrayList<>();

    // Static variables to hold the next identifiers for game, team, and player
    private static long nextGameId = 1;
    private static long nextTeamId = 1;
    private static long nextPlayerId = 1;

    // Private constructor to prevent instantiation from outside the class
    private GameService() {}

    // Public method to get the singleton instance of GameService
    public static GameService getInstance() {
        if (single_instance == null) {
            synchronized (GameService.class) {
                if (single_instance == null) {
                    single_instance = new GameService();
                }
            }
        }
        return single_instance;
    }

    /**
     * Adds a new game with the given name if it doesn't already exist.
     * 
     * @param name The unique name of the game to add.
     * @return The new or existing game instance.
     */
    public Game addGame(String name) {
        // Check if a game with the same name already exists
        Game game = getGame(name);
        if (game == null) {
            // Create a new game if it doesn't exist
            game = new Game(nextGameId++, name);
            games.add(game);
        }
        return game;
    }

    /**
     * Retrieves a game by its name.
     * 
     * @param name The name of the game to retrieve.
     * @return The game instance with the specified name, or null if not found.
     */
    public Game getGame(String name) {
        // Iterate over the list of games to find a game with the given name
        for (Game game : games) {
            if (game.getName().equals(name)) {
                return game;
            }
        }
        return null;
    }

    /**
     * Retrieves a game by its id.
     * 
     * @param id The unique identifier of the game to retrieve.
     * @return The game instance with the specified id, or null if not found.
     */
    public Game getGame(long id) {
        // Iterate over the list of games to find a game with the given id
        for (Game game : games) {
            if (game.getId() == id) {
                return game;
            }
        }
        return null;
    }

    /**
     * Adds a new team with the given name if it doesn't already exist.
     * 
     * @param name The unique name of the team to add.
     * @return The new or existing team instance.
     */
    public Team addTeam(String name) {
        // Check if a team with the same name already exists
        Team team = getTeam(name);
        if (team == null) {
            // Create a new team if it doesn't exist
            team = new Team(nextTeamId++, name);
            teams.add(team);
        }
        return team;
    }

    /**
     * Retrieves a team by its name.
     * 
     * @param name The name of the team to retrieve.
     * @return The team instance with the specified name, or null if not found.
     */
    public Team getTeam(String name) {
        // Iterate over the list of teams to find a team with the given name
        for (Team team : teams) {
            if (team.getName().equals(name)) {
                return team;
            }
        }
        return null;
    }

    /**
     * Retrieves a team by its id.
     * 
     * @param id The unique identifier of the team to retrieve.
     * @return The team instance with the specified id, or null if not found.
     */
    public Team getTeam(long id) {
        // Iterate over the list of teams to find a team with the given id
        for (Team team : teams) {
            if (team.getId() == id) {
                return team;
            }
        }
        return null;
    }

    /**
     * Adds a new player with the given name if it doesn't already exist.
     * 
     * @param name The unique name of the player to add.
     * @return The new or existing player instance.
     */
    public Player addPlayer(String name) {
        // Check if a player with the same name already exists
        Player player = getPlayer(name);
        if (player == null) {
            // Create a new player if it doesn't exist
            player = new Player(nextPlayerId++, name);
            players.add(player);
        }
        return player;
    }

    /**
     * Retrieves a player by its name.
     * 
     * @param name The name of the player to retrieve.
     * @return The player instance with the specified name, or null if not found.
     */
    public Player getPlayer(String name) {
        // Iterate over the list of players to find a player with the given name
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    /**
     * Retrieves a player by its id.
     * 
     * @param id The unique identifier of the player to retrieve.
     * @return The player instance with the specified id, or null if not found.
     */
    public Player getPlayer(long id) {
        // Iterate over the list of players to find a player with the given id
        for (Player player : players) {
            if (player.getId() == id) {
                return player;
            }
        }
        return null;
    }
}

