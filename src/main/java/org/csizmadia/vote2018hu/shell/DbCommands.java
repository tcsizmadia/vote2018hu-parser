package org.csizmadia.vote2018hu.shell;

import org.csizmadia.vote2018hu.data.Organization;
import org.csizmadia.vote2018hu.data.OrganizationRepository;
import org.csizmadia.vote2018hu.data.Party;
import org.csizmadia.vote2018hu.data.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

/**
 * A Shell Component with database-related commands.
 * 
 * @author Tamas Csizmadia
 */
@ShellComponent
public class DbCommands {

    private OrganizationRepository organizationRepository;
    private PartyRepository partyRepository;

    /**
     * Instantiates the db-related shell component with the autowired repositories.
     */
    @Autowired
    public DbCommands(OrganizationRepository organizationRepository, PartyRepository partyRepository) {
        this.organizationRepository = organizationRepository;
        this.partyRepository = partyRepository;
    }

    /**
     * This command lists all of the runner-up organizations stored in the db.
     */
    @ShellMethod(value = "Lists all the runner-up organizations of the election")
    public Iterable<Organization> listOrgs() {
        return organizationRepository.findAll();
    }

    /**
     * This command lists all of the runner-up parties stored in the db.
     */
    @ShellMethod(value = "Lists all the runner-up parties of the election")
    public Iterable<Party> listParties() {
        return partyRepository.findAll();
    }
}