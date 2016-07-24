package interportCallingKotlinFromJava;

/**
 * Created by chetan on 13/7/16.
 */
public class Person {

    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    String name;
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

}
