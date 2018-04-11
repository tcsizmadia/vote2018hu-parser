package org.csizmadia.vote2018hu.parser;

import lombok.Builder;
import lombok.Data;

/**
 * A wrapper bean for a parsed row from the document. It holds a {@link Candidate} or a {@link Party}
 * instance and a count of received votes.
 * 
 * @author Tamas Csizmadia
 */
@Data
@Builder
public class ParsedRow<T> {
    private T entity;
    private int count;
}