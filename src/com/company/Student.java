package com.company;

public class Student {

  private String name;
  private int studentnumber;
  private int telnumber;
  private boolean tutor;
  private int[] grades = new int[7];

  public Student(String name, int studentnumber, int telnumber, boolean tutor, int grade1, int grade2, int grade3, int grade4, int grade5, int grade6, int grade7) {
    this.name = name;
    this.studentnumber = studentnumber;
    this.telnumber = telnumber;
    this.tutor = tutor;
    this.grades[0] = grade1;
    this.grades[1] = grade2;
    this.grades[2] = grade3;
    this.grades[3] = grade4;
    this.grades[4] = grade5;
    this.grades[5] = grade6;
    this.grades[6] = grade7;
  }

  public void examResults(int exam, int grade){
    grades [exam] = grade;
  }
  public String getName() {
    return name;
  }

  public int[] getGrades() {
    return grades;
  }

  public void setGrades(int exam, int grade) {
    this.grades[exam] = grade;
  }

  public int getStudentnumber() {
    return studentnumber;
  }

  public int getTelnumber() {
    return telnumber;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isTutor() {
    return tutor;
  }

  public void setTutor(boolean tutor) {
    this.tutor = tutor;
  }

  public void setStudentnumber(int studentnumber) {
    this.studentnumber = studentnumber;
  }

  public void setTelnumber(int telnumber) {
    this.telnumber = telnumber;
  }

  //toString method, changes the objects into a String
  public String toString(){
    return "Student Name: " + name + "\nStudent Number: " + studentnumber
        + "\nStudent Telefon Number: " + telnumber + "\nStudent is a tutor: " + tutor +
        "\nGrades: " + "exam 1: " + grades[0] + ", exam 2: " + grades[1] + ", exam 3: " + grades[2]
        + ", exam 4: " + grades[3] + ", exam 5: " + grades[4] + ", exam 6: " + grades[5] + ", exam 7: " + grades[6];
  }
}
