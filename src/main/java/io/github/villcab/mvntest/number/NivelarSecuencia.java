package io.github.villcab.mvntest.number;

import io.github.villcab.mvntest.number.model.CheckInvoice1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NivelarSecuencia {

    public static void main(String[] args) {
        Long sequenceFinal = 45L;
        List<CheckInvoice1> invoicesByDosage = Arrays.asList(
//                new CheckInvoice1(1L, LocalDate.of(2020,10,2)),
                new CheckInvoice1(2L, LocalDate.of(2020, 10, 2)),
                new CheckInvoice1(3L, LocalDate.of(2020, 10, 2)),
                new CheckInvoice1(4L, LocalDate.of(2020, 10, 2)),
                new CheckInvoice1(5L, LocalDate.of(2020, 10, 2)),
//                new CheckInvoice1(6L, LocalDate.of(2020,10,2)),
                new CheckInvoice1(7L, LocalDate.of(2020, 10, 2)),
                new CheckInvoice1(8L, LocalDate.of(2020, 10, 2))
        );
        int index = 0;
        Long seq = 1L;
        List<CheckInvoice1> missingInvoices = new ArrayList<>();
        while (seq.compareTo(sequenceFinal) < 0) {
            CheckInvoice1 checkInvoice = invoicesByDosage.get(index);
            if (!seq.equals(checkInvoice.getSequence())) {
                missingInvoices.add(new CheckInvoice1(seq, checkInvoice.getInvoiceDate()));
            } else if (index < invoicesByDosage.size() - 1) {
                index++;
            }
            seq++;
        }
        missingInvoices.forEach(System.out::println);
    }
}
