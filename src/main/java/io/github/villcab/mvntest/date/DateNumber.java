package io.github.villcab.mvntest.date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.ZonedDateTime;
import java.util.Date;

public class DateNumber {

    private static final Logger log = LogManager.getLogger(DateNumber.class);

    public static void main(String[] args) {
//        System.out.println("Date-getTime: " + new Date().getTime());
//        System.out.println("ZonedDateTime-toEpochSecond: " + ZonedDateTime.now().toEpochSecond());
//        System.out.println("ZonedDateTime-toEpochSecond: " + RandomStringUtils.randomNumeric(7));

        log.info("Inicio de log4j2");
        for (int i = 0; i < 15; i++) {
            log.debug("Create dates: {}, position: {}", RandomStringUtils.randomNumeric(7), i);
        }
    }
}
