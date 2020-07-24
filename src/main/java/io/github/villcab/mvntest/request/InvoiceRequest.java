package io.github.villcab.mvntest.request;

import java.math.BigDecimal;
import java.util.Set;

public class InvoiceRequest {

    private Long cycleId;

    private Long branchId;

    private Long economicActivityId;

    private Long invoiceNumber;

    private String invoiceDate;

    private BigDecimal totalAmount;

    private String note;

    private CustomerRequest customer;

    private Set<InvoiceDetailsRequest> details;

    public InvoiceRequest() {
    }

    public InvoiceRequest(Long cycleId, Long branchId, Long economicActivityId, Long invoiceNumber, String invoiceDate, BigDecimal totalAmount, String note, CustomerRequest customer, Set<InvoiceDetailsRequest> details) {
        this.cycleId = cycleId;
        this.branchId = branchId;
        this.economicActivityId = economicActivityId;
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.totalAmount = totalAmount;
        this.note = note;
        this.customer = customer;
        this.details = details;
    }

    public Long getCycleId() {
        return cycleId;
    }

    public void setCycleId(Long cycleId) {
        this.cycleId = cycleId;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Long getEconomicActivityId() {
        return economicActivityId;
    }

    public void setEconomicActivityId(Long economicActivityId) {
        this.economicActivityId = economicActivityId;
    }

    public Long getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Long invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CustomerRequest getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerRequest customer) {
        this.customer = customer;
    }

    public Set<InvoiceDetailsRequest> getDetails() {
        return details;
    }

    public void setDetails(Set<InvoiceDetailsRequest> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "InvoiceRequest{" +
                "cycleId=" + cycleId +
                ", branchId=" + branchId +
                ", economicActivityId=" + economicActivityId +
                ", invoiceNumber=" + invoiceNumber +
                ", invoiceDate='" + invoiceDate + '\'' +
                ", totalAmount=" + totalAmount +
                ", note='" + note + '\'' +
                ", customer=" + customer +
                ", details=" + details +
                '}';
    }
}
