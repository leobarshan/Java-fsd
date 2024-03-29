package assignment2;

interface InterfaceA
{
    void display();
}

interface InterfaceB 
{
    void display();
}

class MyClass implements InterfaceA, InterfaceB 
{
    public void display() 
    {
        System.out.println("Implementation of display() method in MyClass");
    }
}

public class question9
{
    public static void main(String[] args) 
    {
        MyClass obj = new MyClass();
        
        obj.display();
    }
}
