package org.csizmadia.vote2018hu.parser;

import java.util.List;

import org.csizmadia.vote2018hu.data.Candidate;
import org.csizmadia.vote2018hu.data.Party;

/**
 * This {@code interface} represents a parser which is capable to extract
 * valuable information from a document or webpage.
 * <p>
 * A typical document or webpage is a report of sheet counting by the 
 * National Bureau of Election (NVI).
 * 
 * @author Tamas Csizmadia
 */
public interface ResultsParser {
    /**
     * Returns the number of the atendees at this district.
     */
    int getNumAttendees();

    /**
     * Returns the number of citizens who are eligible to vote in this district.
     */
    int getNumPossibleMaxAttendees();

    /**
     * Returns the number of voting sheets <strong>without</strong> stamp /results an invalid vote/.
     */
    int getNumSheetsWithoutStamp();

    /**
     * Returns the number of voting sheets <strong>with</strong> stamp.
     */
    int getNumSheetsWithStamp();

    /**
     * Returns the number of invalid sheets.
     * 
     * @return Number of invalid sheets.
     */
    int getNumInvalidSheets();

    /**
     * Returns the number of valid sheets.
     * 
     * @return Number of valid sheets.
     */
    int getNumValidSheets();

    /**
     * Returns a collection of voting results for the parties, wrapped in a {@link ParsedRow} bean.
     * 
     * @return The collection of voting results for parties.
     */
    List<ParsedRow<Party>> getPartyResults();

    /**
     * Returns the collection of voting results for individual candidates, wrapped in a {@link ParsedRow} bean.
     * 
     * @return The collection of voting results for candidates.
     */
    List<ParsedRow<Candidate>> getCandidateResults();
}