package io.github.villcab.mvntest.number.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CheckInvoice1 {

    private Long sequence;

    private LocalDate invoiceDate;

    public CheckInvoice1(Long sequence, LocalDate invoiceDate) {
        this.sequence = sequence;
        this.invoiceDate = invoiceDate;
    }
}
