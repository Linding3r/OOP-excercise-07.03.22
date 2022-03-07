package com.company;

public class TestStudent {

  public static void main(String[] args) {
    Student student1 = new Student("Thomas", 42069, 133742069, true, 12, 10, 12, 10, 7, 4, 10);
    //Student student2 = new Student("Theodor", 1337, 1234567, false, grade = {1,2,3,4,5,6,7});
    //Student student3 = new Student("Morten", 69420, 12345654, false, grade = {1,2,3,4,5,6,7});
    //System.out.println("\n" + student2.toString());
    //System.out.println("\n" + student3.toString());
    //student1.setTutor(false);
    //System.out.println(student1.toString());
    student1.setGrades(5, 12);
    System.out.println(student1.toString());

  }
}

