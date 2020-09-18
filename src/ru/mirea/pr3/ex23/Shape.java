package ru.mirea.pr3.ex23;

abstract class Shape
{
    protected String color;
    protected Boolean filled;

    public Shape(String color, Boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public Shape() { }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Boolean isFilled()
    {
        return filled;
    }

    public void setFilled(Boolean isFilled)
    {
        filled = isFilled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return(getArea()+ getPerimeter()+getColor()+isFilled());
    }
}

class Circle extends Shape
{
    protected double radius;

    public Circle() { }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Circle(double radius, String color, Boolean isFilled)
    {
        this.radius = radius;
        super.color = color;
        super.filled = isFilled;
    }

    @Override
    double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString()
    {
        return(getArea()+ getPerimeter()+getColor()+isFilled());
    }
}

class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle() { }

    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean isFilled)
    {
        this.width = width;
        this.length = length;
        super.color = color;
        super.filled = isFilled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return width * length;
    }

    @Override
    double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString()
    {
        return(getArea()+ getPerimeter()+getColor()+isFilled());
    }
}

class Square extends Rectangle
{
    public Square() { }

    public Square(double side)
    {
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled)
    {
        width = side;
        length = side;

        super.color  = color;
        super.filled = filled;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    public double getSide()
    {
        return width;
    }

    @Override
    public void setLength(double length) {
        super.width = length;
        super.length = length;
    }

    @Override
    public void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    @Override
    public String toString() {
        return(getArea()+ getPerimeter()+getColor()+isFilled());
    }
}