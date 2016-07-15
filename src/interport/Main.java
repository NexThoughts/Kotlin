package interport;

/**
 * Created by chetan on 13/7/16.
 */
public class Main {

    public static void main(String[] args) {
        Person person=new Person(24,"chetan");
        System.out.println(person);
        System.out.println(AppKt.isAdult(person));

    }
}
