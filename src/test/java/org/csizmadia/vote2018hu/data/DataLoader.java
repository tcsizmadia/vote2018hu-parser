package org.csizmadia.vote2018hu.data;

import java.util.Arrays;
import java.util.Collections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

/**
 * A {@link Configuration} annotated class for populate the database with
 * the initial datasets.
 * 
 * @author Tamas Csizmadia
 * 
 * @see Party
 * @see Formation
 */
@Slf4j
@Configuration
public class DataLoader {

    /**
     * This {@link CommandLineRunner} bean is responsible to populate the db
     * with runner up organizations of the election.
     */
    @Bean
    public CommandLineRunner initOrganizations(OrganizationRepository repository) {
        return args -> {
            log.info("Adding organizations to the database");

            Arrays.asList(
                "CSP", 
                "DK",
                "EGYÜTT",
                "EU.ROM",
                "FIDESZ-KDNP",
                "Független jelölt",
                "HAJRÁ MAGYARORSZÁG!",
                "JOBBIK",
                "KÖSSZ",
                "LENDÜLETTEL",
                "LMP",
                "MCP",
                "MISZEP",
                "MODERN MAGYARORSZÁG MOZGALOM (MOMA)",
                "MOMENTUM"
            ).stream().map(Organization::new).forEach(repository::save);
        };
    }
}