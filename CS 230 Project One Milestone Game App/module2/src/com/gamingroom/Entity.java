package com.gamingroom;

/**
 * The Entity class represents a base class for entities like Game, Team, and Player.
 * It holds common attributes such as id and name.
 */
public abstract class Entity {
    private long id;
    private String name;

    // Constructor to initialize the entity with an id and name
    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for the id
    public long getId() {
        return id;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Override the toString method to return the name of the entity
    @Override
    public String toString() {
        return name;
    }
}
