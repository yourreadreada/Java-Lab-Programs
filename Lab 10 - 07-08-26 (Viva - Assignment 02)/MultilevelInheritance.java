class Grandparent
{
    void showGrandparent()
    {
        System.out.println("Grandparent class method");
    }
}

class Parent extends Grandparent
{
    void showParent()
    {
        System.out.println("Parent class method");
    }
}

class Child extends Parent
{
    void showChild()
    {
        System.out.println("Child class method");
    }
}

class Grandchild extends Child
{
    void showGrandchild()
    {
        System.out.println("Grandchild class method");
    }
}

public class MultilevelInheritance
{
    public static void main(String args[])
    {
        Grandchild gc=new Grandchild();
        gc.showGrandparent();
        gc.showParent();
        gc.showChild();
        gc.showGrandchild();
    }
}