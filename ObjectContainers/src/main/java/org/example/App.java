package org.example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        TreeSet<Person> persons = new TreeSet<Person>();
        Person person1 = new Person("Mihai", 30);
        Person person2 = new Person("Dani", 36);
        Person person3 = new Person("Alina", 35);
        Person person4 = new Person("Sanda", 65);
        Person person5 = new Person("Carol", 66);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        // Displaying the TreeSet
        System.out.println("TreeSet: " + persons);

        // Creating an iterator
        Iterator value = persons.iterator();

        // Displaying the values after iterating through the set
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
;
