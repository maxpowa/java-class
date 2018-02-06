package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(args.toString());
        System.out.println(args[1]);

        // immutable - read only
        // mutable - read/write

        ArrayList newArray = new ArrayList<String>();
        newArray.add(0, "hello");
        newArray.add(1, "world");

        System.out.println(newArray.toString());
        System.out.println(newArray.get(1));

        int myNumber = 1;
        Integer myNumber1 = 1;
        // (2^32)-1
        short myShort = 22;
        long myLong = 333;

        double myDouble = 7.33;
        Double myDouble1 = 8.11;
        // floats must have an 'f' appended to the end of the number, otherwise it will
        // be considered a double
        float myFloat = 33.22f;
        Float myFloat1 = 33.11f;
        // Float.MIN_VALUE;
        char myChar = 'y';
        Character myCHar1 = 'b';
        boolean myBool = true;

        byte myByte = 127;

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBool);
        System.out.println(myByte);

         /* docs */
        // docs
        /**
         * The code below throws an exception!
         */

        try {
            Integer val = Integer.parseInt("abc", 10);
            Integer.parseInt("abc");
        } catch (Exception ex) {
            System.out.println("Exception caught");
        }

        System.out.println(anotherMethod(10, "peas in a pod"));
        System.out.println(10 + " " + "peas in a pod");

        Person.latinName(); // "human bean"
        // Person.age(); // error no instance
        Person bob = new Person("Bobby", 15);
        bob.age(); // 15
        bob.setAge(16); //works because same file but wont otherwise
        System.out.println(bob.givenName); // "Bobby"

        System.out.println(String.format("%d", 10));

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("What is your name? ");
//        String name = input.next();
//
//        System.out.println("Hello " + name);
//
//        System.out.print("How old are you? ");
//        Integer age = input.nextInt();
//
//        Person me = new Person(name, age);
//        System.out.println(me);

        try {
            FileStuff fs = new FileStuff("tree.txt");
            fs.writeTree();
        } catch (IOException ex) {
            System.out.println("oh no");
        }
    }

    /**
     * AnotherMethod - Does a thing
     * <p>
     * string abc : value of abc
     */
    public static String anotherMethod(Integer firstParameter, String secondParameter) {
        return firstParameter.toString() + " " + secondParameter;
    }
}

class Person {
    public String givenName;
    Integer age;

    public Person(String givenName, Integer age) {
        this.age = age;
        this.givenName = givenName;
    }

    public static String latinName() {
        return "human bean";
    }

    public Integer age() {
        return this.age;
    }

    protected void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        //return "age: " + this.age + " name: " + this.givenName;
        return String.format("age: %d name: %s", this.age, this.givenName);
    }
}
