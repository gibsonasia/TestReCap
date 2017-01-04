package com.example.asiagibson.testrecap.model;

/**
 * Created by asiagibson on 1/3/17.
 */

public class Animal {
    private String textColor;

    private String background;

    private String name;

    public String getTextColor ()
    {
        return textColor;
    }

    public void setTextColor (String textColor)
    {
        this.textColor = textColor;
    }

    public String getBackground ()
    {
        return background;
    }

    public void setBackground (String background)
    {
        this.background = background;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [textColor = "+textColor+", background = "+background+", name = "+name+"]";
    }
}
