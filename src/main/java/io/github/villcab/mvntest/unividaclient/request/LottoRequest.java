package io.github.villcab.mvntest.unividaclient.request;

public class LottoRequest {

    private String licensePlate;

    private String rosetteNumber;

    private String fullNameOwner;

    private String ciOwner;

    private String phoneOwner;

    private String emailOwner;

    private String fileNameRosette;

    private String fileNameRuat;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getRosetteNumber() {
        return rosetteNumber;
    }

    public void setRosetteNumber(String rosetteNumber) {
        this.rosetteNumber = rosetteNumber;
    }

    public String getFullNameOwner() {
        return fullNameOwner;
    }

    public void setFullNameOwner(String fullNameOwner) {
        this.fullNameOwner = fullNameOwner;
    }

    public String getCiOwner() {
        return ciOwner;
    }

    public void setCiOwner(String ciOwner) {
        this.ciOwner = ciOwner;
    }

    public String getPhoneOwner() {
        return phoneOwner;
    }

    public void setPhoneOwner(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }

    public String getEmailOwner() {
        return emailOwner;
    }

    public void setEmailOwner(String emailOwner) {
        this.emailOwner = emailOwner;
    }

    public String getFileNameRosette() {
        return fileNameRosette;
    }

    public void setFileNameRosette(String fileNameRosette) {
        this.fileNameRosette = fileNameRosette;
    }

    public String getFileNameRuat() {
        return fileNameRuat;
    }

    public void setFileNameRuat(String fileNameRuat) {
        this.fileNameRuat = fileNameRuat;
    }

    @Override
    public String toString() {
        return "LottoRequest{" +
                "licensePlate='" + licensePlate + '\'' +
                ", rosetteNumber='" + rosetteNumber + '\'' +
                ", fullNameOwner='" + fullNameOwner + '\'' +
                ", ciOwner='" + ciOwner + '\'' +
                ", phoneOwner='" + phoneOwner + '\'' +
                ", emailOwner='" + emailOwner + '\'' +
                ", fileNameRosette='" + fileNameRosette + '\'' +
                ", fileNameRuat='" + fileNameRuat + '\'' +
                '}';
    }
}
