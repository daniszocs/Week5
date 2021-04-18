package org.example;


public class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String nume, int varsta){
        name = nume;
        age = varsta;
    }

    public int compareTo(Person o) {
        return 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
