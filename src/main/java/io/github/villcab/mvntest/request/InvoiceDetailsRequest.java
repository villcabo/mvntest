package io.github.villcab.mvntest.request;

import java.math.BigDecimal;

public class InvoiceDetailsRequest {

    private BigDecimal quantity;

    private String concept;

    private BigDecimal unitPrice;

    private BigDecimal subtotal;

    public InvoiceDetailsRequest(BigDecimal quantity, String concept, BigDecimal unitPrice, BigDecimal subtotal) {
        this.quantity = quantity;
        this.concept = concept;
        this.unitPrice = unitPrice;
        this.subtotal = subtotal;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "InvoiceDetailsRequest{" +
                "quantity=" + quantity +
                ", concept='" + concept + '\'' +
                ", unitPrice=" + unitPrice +
                ", subtotal=" + subtotal +
                '}';
    }
}
