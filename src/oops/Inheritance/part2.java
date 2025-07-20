package oops.Inheritance;
//inheritance
class GrandParent{
    private String Name;
    private int age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Parent extends GrandParent{

}

class Child extends Parent{

}
public class part2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.setAge(12);
        c.setName("Billi");

        System.out.println(c.getAge());
        System.out.println(c.getName());

        Parent p = new Parent();
        p.setAge(28);
        p.setName("Ankit kumar Malik");

        System.out.println(p.getAge());
        System.out.println(p.getName());

    }
}
