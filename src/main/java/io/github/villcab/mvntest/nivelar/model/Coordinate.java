package io.github.villcab.mvntest.nivelar.model;

public class Coordinate {

    private String latitud;
    private String longitud;
    private Integer idMedioPago;

    public Coordinate(String coordinates) {
        if (coordinates == null) {
            latitud = "0";
            longitud = "0";
        } else {
            String[] split = coordinates.split("\\|");
            if (split.length > 1) {
                latitud = split[0];
                longitud = split[1];
            } else {
                latitud = "0";
                longitud = "0";
            }
        }

        idMedioPago = 23;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Integer getIdMedioPago() {
        return idMedioPago;
    }

    public void setIdMedioPago(Integer idMedioPago) {
        this.idMedioPago = idMedioPago;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "latitud='" + latitud + '\'' +
                ", longitud='" + longitud + '\'' +
                ", idMedioPago=" + idMedioPago +
                '}';
    }
}
