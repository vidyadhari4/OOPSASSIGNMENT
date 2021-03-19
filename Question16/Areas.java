import java.util.Scanner;

class Areas 
{
    public static void main(String[] args) 
    {
        int a=3,b=4,radius=5;
        Rectangle r = new Rectangle();
        r.print_area(a,b);
        Triangle t = new Triangle();
        t.print_area(a,b);
        Circle c = new Circle();
        c.print_area_c(radius);
    }

}
abstract class Shape
{
    public abstract void print_area(int a,int b);
    public abstract void print_area_c(int radius);
}

class Rectangle extends Shape
{
    @Override
    public void print_area(int a, int b) 
    {
        System.out.println(a*b);
    }
    public void print_area_c(int radius) 
    {
    }
}

class Triangle extends Shape
{
    @Override
    public void print_area(int a, int b) 
    {
        System.out.println(0.5*a*b);
    }
    public void print_area_c(int radius) 
    {
    }
}

class Circle extends Shape
{
    @Override
    public void print_area_c(int radius) 
    {
        System.out.println(3.14*radius*radius);
    }
    public void print_area(int a, int b) 
    {
    }
}