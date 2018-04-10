package org.csizmadia.vote2018hu.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * This {@code class} represents a party.
 * 
 * @author Tamas Csizmadia 
 */
@Data
@Entity
public class Party {
    @Id
    private String id;
    private String name;

    /**
     * Instantiates a new {@link Party} with the given name.
     */
    public Party(String name) {
        this.name = name;
    }
}