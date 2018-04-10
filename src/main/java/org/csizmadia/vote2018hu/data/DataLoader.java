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
 * @see Organization
 */
@Slf4j
@Component
@Order(InteractiveShellApplicationRunner.PRECEDENCE - 100)
public class DataLoader implements ApplicationRunner {

    @Autowired
    private OrganizationRepository orgRepository;

    @Autowired
    private PartyRepository partyRepository;

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
        ).stream().map(Organization::new).forEach(orgRepository::save);

        log.info("Adding parties to the database");

        Arrays.asList(
            "CSALÁDOK PÁRTJA",
            "DEMOKRATIKUS KOALÍCIÓ",
            "EGYÜTT - A KORSZAKVÁLTÓK PÁRTJA",
            "EURÓPAI ROMA KERESZTÉNYEK JOBBLÉTÉÉRT DEMOKRATIKUS PÁRT",
            "FIDESZ - MAGYAR POLGÁRI SZÖVETSÉG-KERESZTÉNYDEMOKRATA NÉPPÁRT",
            "IRÁNYTŰ PÁRT",
            "JOBBIK MAGYARORSZÁGÉRT MOZGALOM",
            "KELL AZ ÖSSZEFOGÁS PÁRT",
            "KÖZÖS NEVEZŐ 2018",
            "LEHET MÁS A POLITIKA",
            "MAGYAR IGAZSÁG ÉS ÉLET PÁRTJA",
            "MAGYAR KÉTFARKÚ KUTYA PÁRT",
            "MAGYARORSZÁGI CIGÁNYPÁRT",
            "MAGYARORSZÁGON ÉLŐ DOLGOZÓ ÉS TANULÓ EMBEREK PÁRTJA",
            "MAGYAR MUNKÁSPÁRT",
            "MAGYAR SZOCIALISTA PÁRT-PÁRBESZÉD MAGYARORSZÁGÉRT PÁRT",
            "MOMENTUM MOZGALOM",
            "NET PÁRT",
            "ÖSSZEFOGÁS PÁRT",
            "REND ÉS ELSZÁMOLTATÁS PÁRT",
            "SPORTOS ÉS EGÉSZSÉGES MAGYARORSZÁGÉRT PÁRT",
            "SZEGÉNY EMBEREK MAGYARORSZÁGÉRT PÁRT",
            "TENNI AKARÁS MOZGALOM"
        ).stream().map(Party::new).forEach(partyRepository::save);
	}
}