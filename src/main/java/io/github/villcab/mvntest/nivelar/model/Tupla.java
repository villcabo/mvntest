package io.github.villcab.mvntest.nivelar.model;

public class Tupla {

    private String id;
    private Coordinate coordinate;

    public Tupla(String id, Coordinate coordinate) {
        this.id = id;
        this.coordinate = coordinate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
