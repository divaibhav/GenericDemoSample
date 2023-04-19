package main;

import generic.Student;

public class StudentImpl {
    public static void main(String[] args) {
        // create object of Student class
//        Student s = new Student(10,"Vaibhav");
       /* ArrayList l1 = new ArrayList();
        // raw use means that this list can add all the Objects
        l1.add(56);//autoboxing to Integer -> reference of Object
        Integer integer = 56;
        Object o1 = integer;
        l1.add("Vaibhavbnbdkhbdkhbkadsb");
        l1.add(true);
        l1.add(56.3);
        l1.add(96.5f);
        l1.add(53L);
        //are adding in the form of Instance of Object class
        //Object is parent of all the class in java
        //wrapper classes
        //autoboxing
        for (Object o : l1) {
            System.out.println(o.getClass());
        }
    */
        //xyz
        Student<Integer> student = new Student<>(12345, "Vaibhav");
        //abc -> String
        Student<String> abcStudent = new Student<>("IT12345", "Ramesh");
    }

}
