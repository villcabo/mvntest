package io.github.villcab.mvntest.request;

public class CustomerRequest {

    private Long nit;

    private String name;

    public CustomerRequest(Long nit, String name) {
        this.nit = nit;
        this.name = name;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "nit=" + nit +
                ", name='" + name + '\'' +
                '}';
    }
}
