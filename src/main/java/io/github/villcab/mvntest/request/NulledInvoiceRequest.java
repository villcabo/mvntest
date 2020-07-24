package io.github.villcab.mvntest.request;

public class NulledInvoiceRequest {

    private Long id;

    private String reason;

    public NulledInvoiceRequest(Long id, String reason) {
        this.id = id;
        this.reason = reason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "NulledInvoiceRequest{" +
                "id=" + id +
                ", reason='" + reason + '\'' +
                '}';
    }
}
