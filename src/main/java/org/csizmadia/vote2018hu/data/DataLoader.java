package org.csizmadia.vote2018hu.data;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.shell.jline.InteractiveShellApplicationRunner;
import org.springframework.stereotype.Component;

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
@Component
@Order(InteractiveShellApplicationRunner.PRECEDENCE - 100)
public class DataLoader implements ApplicationRunner {

    @Autowired
    private OrganizationRepository repository;

	@Override
	public void run(ApplicationArguments args) throws Exception {
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
	}
}