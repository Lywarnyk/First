/**
 * Created by lywar on 11.04.2017.
 */
public class PersonAge {


    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age is "+person.age);
        person.adjustAge(person.age);
        System.out.println("Adjusted Age is " + person.age);

    }

    public static class Person{
         public static int age = 20;

    public  void adjustAge(int age){
           this.age = age + 20;
            System.out.println("The Age in adjustAge() is " + age );
        }
    }


}
