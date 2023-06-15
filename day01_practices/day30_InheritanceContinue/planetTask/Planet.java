package day30_InheritanceContinue.planetTask;

public class Planet {

    private String name;
    private double mass, radius,surfaceGravity, sufaceArea,volume;
    private int population;

    public Planet(String name, double mass, double radius, double surfaceGravity, double sufaceArea, double volume, int population) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.sufaceArea = sufaceArea;
        this.volume = volume;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public void setSurfaceGravity(double surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public double getSufaceArea() {
        return sufaceArea;
    }

    public void setSufaceArea(double sufaceArea) {
        this.sufaceArea = sufaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return  getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", sufaceArea=" + sufaceArea +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
/*
planetTask:
	1. create a class called Planet
			variables:
					name, mass, radius, surfaceGravity, surfaceArea, volume, population

			Encapsulate all the fields

			Add a constructor that can set all the fields

			methods:
				toString()

	2. create the following subclasses of Planet
			1. Earth
			2. Moon
			3. Mercury
			4. Venus

			Note: you can search them on google
 */