package Implement_An_Factory_Design_Pattern_For_Shape_Drawing_Aplication;

import java.util.Scanner;

interface Shape{
    void Draw();
}

class Circle implements Shape{
    @Override
    public void Draw() {
        System.out.println("Circle drawn");
    }
}
class Square implements Shape{
    @Override
    public void Draw() {
        System.out.println("Square drawn");
    }
}

class Triangle implements Shape{
    @Override
    public void Draw() {
        System.out.println("Triangle drawn");
    }
}

interface ShapeFactory{
    Shape CreateShape();
}

class CreateCircle implements ShapeFactory{
    @Override
    public Shape CreateShape() {
        return new Circle();
    }
}

class CreateSquare implements ShapeFactory{
    @Override
    public Shape CreateShape() {
        return new Square();
    }
}

class CreateTriangle implements ShapeFactory{
    @Override
    public Shape CreateShape() {
        return new Triangle();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("The shape you want to draw: ");
        String shape_type = Input.nextLine();
        if (shape_type.equalsIgnoreCase("Circle")){

        }
    }
}
