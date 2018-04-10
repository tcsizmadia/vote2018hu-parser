package org.csizmadia.vote2018hu.shell;

import org.csizmadia.vote2018hu.data.Organization;
import org.csizmadia.vote2018hu.data.OrganizationRepository;
import org.csizmadia.vote2018hu.data.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DbCommands {

    private OrganizationRepository organizationRepository;
    private PartyRepository partyRepository;

    @Autowired
    public DbCommands(OrganizationRepository organizationRepository, PartyRepository partyRepository) {
        this.organizationRepository = organizationRepository;
        this.partyRepository = partyRepository;
    }

    @ShellMethod(value = "Lists all the organizations of the election")
    public Iterable<Organization> listOrgs() {
        return organizationRepository.findAll();
    }
}