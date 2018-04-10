package org.csizmadia.vote2018hu.data;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

/**
 * This class represents an organization entity. An organization is something like a party,
 * but we use this entity for the individual candidates, and a {@link Party} for the
 * party list.
 * 
 * @author Tamas Csizmadia
 */
@Data
@Entity
public class Organization
{
    @Id
    private String id;    
    private String name;

    /**
     * Instantiates a new {@link Oragnization} with the given name.
     */
    public Organization(String name) {
        this.name = name;
    }
}