package org.csizmadia.vote2018hu.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class represents a candidate entity in the database. A candidate has a name, and an
 * organization.
 * 
 * @author Tamas Csizmadia
 */
@Data
@NoArgsConstructor
@Entity
public class Candidate {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Organization organization;
}