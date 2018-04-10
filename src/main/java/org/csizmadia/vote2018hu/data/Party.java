package org.csizmadia.vote2018hu.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This {@code class} represents a party.
 * 
 * @author Tamas Csizmadia 
 */
@Data
@NoArgsConstructor
@Entity
public class Party {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    /**
     * Instantiates a new {@link Party} with the given name.
     */
    public Party(String name) {
        this.name = name;
    }
}