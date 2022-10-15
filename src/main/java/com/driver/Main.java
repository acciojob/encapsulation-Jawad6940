package com.driver;

public class Main {
//    Task 1:
//    Create a file Main.java and RWOnly.java in same package
//    Task 2:
//    create a class named RWOnly in RWOnly.java, with a private member variable name
//    Task 3:
public static void main(String[] args) {
    RWOnly obj=new RWOnly();
    obj.setName("name");

    System.out.println(obj.getName());
    //java: name has private access in com.driver.RWOnly
}
//    create main function in Main.java, and crete an obj of class RWOnly in this file
//    Task 4:
//            try, setting a value to name, by directly accessing it using obj and also try printing it
//    Error: you might seen some error, please not it down in commnets
//    Task 5:
//            try implementing getter and setters member function in class RWOnly
//Task 6:
//    Now, try setting a value to name in Main function using setter function and access it's value using getter function
}