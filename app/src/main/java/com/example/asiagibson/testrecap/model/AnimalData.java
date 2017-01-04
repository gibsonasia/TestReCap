package com.example.asiagibson.testrecap.model;

/**
 * Created by asiagibson on 1/3/17.
 */

public class AnimalData {

    private Animal[] animals;

    private String success;

    public Animal[] getAnimals ()
    {
        return animals;
    }

    public void setAnimals (Animal[] animals)
    {
        this.animals = animals;
    }

    public String getSuccess ()
    {
        return success;
    }

    public void setSuccess (String success)
    {
        this.success = success;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [animals = "+animals+", success = "+success+"]";
    }
}
