/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author admin
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Teacher t= new Teacher("Bilal Arif",30,2004);
        Course  c = new Course();
        c.setName("DataBase Systems");
        c.setCrdh(3);
        c.setT(t);
        c.setStr(4);
        Student s = new Student("Ismail",20,"A",163);
        c.addStudent(s);
        Student s1 = new Student("Arif",20,"A+",178);
        c.addStudent(s1);
        Student s2 = new Student("ali",21,"B",190);
        c.addStudent(s2);
        Student s3 = new Student("ateeq",20,"A+",148);
        c.addStudent(s3);
        c.displayTeacher();
        c.displayStudents();     
}
}
