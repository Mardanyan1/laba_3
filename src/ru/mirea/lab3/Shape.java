package ru.mirea.lab3;

public abstract class Shape
{
    protected String color = "transparent";
    protected boolean filled;
    abstract public void Shape();
    abstract public void Shape(String color, boolean filled);
    abstract public String getColor();
    abstract public void setColor(String color);
    abstract public boolean isFilled();
    abstract public void setFilled(boolean filled);
    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}