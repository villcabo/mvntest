package io.github.villcab.mvntest.unividaclient.request;

import java.math.BigDecimal;

public class TmTransactionRequest {

    private String phoneNumber;

    private String licensePlate;

    private Integer year;

    private BigDecimal totalAmount;

    private String purchaseType;

    private String nit;

    private String nameOrSocialReason;

    private String email;

    private String coordinates;

    private String platform;

    private String version;

    private String specification;

    private Sorter city;

    private Sorter typeUse;

    private Sorter vehicleType;

    public TmTransactionRequest(String phoneNumber, String licensePlate, Integer year, BigDecimal totalAmount, String purchaseType, String nit, String nameOrSocialReason, String email, String coordinates, String platform, String version, String specification, Sorter city, Sorter typeUse, Sorter vehicleType) {
        this.phoneNumber = phoneNumber;
        this.licensePlate = licensePlate;
        this.year = year;
        this.totalAmount = totalAmount;
        this.purchaseType = purchaseType;
        this.nit = nit;
        this.nameOrSocialReason = nameOrSocialReason;
        this.email = email;
        this.coordinates = coordinates;
        this.platform = platform;
        this.version = version;
        this.specification = specification;
        this.city = city;
        this.typeUse = typeUse;
        this.vehicleType = vehicleType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNameOrSocialReason() {
        return nameOrSocialReason;
    }

    public void setNameOrSocialReason(String nameOrSocialReason) {
        this.nameOrSocialReason = nameOrSocialReason;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public Sorter getCity() {
        return city;
    }

    public void setCity(Sorter city) {
        this.city = city;
    }

    public Sorter getTypeUse() {
        return typeUse;
    }

    public void setTypeUse(Sorter typeUse) {
        this.typeUse = typeUse;
    }

    public Sorter getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Sorter vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "TmTransactionRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", year=" + year +
                ", totalAmount=" + totalAmount +
                ", purchaseType='" + purchaseType + '\'' +
                ", nit='" + nit + '\'' +
                ", nameOrSocialReason='" + nameOrSocialReason + '\'' +
                ", email='" + email + '\'' +
                ", coordinates='" + coordinates + '\'' +
                ", platform='" + platform + '\'' +
                ", version='" + version + '\'' +
                ", specification='" + specification + '\'' +
                ", city=" + city +
                ", typeUse=" + typeUse +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
