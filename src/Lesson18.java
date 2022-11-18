public class Lesson18 {

    public static void main(String[] args) {

        Person tom = new Person("Tom", 14);
        tom.display();
        Employee sam = new Employee("Sam", 13);
        sam.display();
        System.out.println(sam.age);
    }
}
class Person {

    String name;
    public String getName(){ return name; }
    int age;
    public int getAge(){ return age; }

    public Person(String name, int age){

        this.name=name;
        this.age=age;
    }

    public void display(){

        System.out.println("Name: " + name);
    }
}
class Employee extends Person{
    public Employee(String name, int age){
        super(name, age);    // если базовый класс определяет конструктор
        //  то производный класс должен его вызвать
    }
}