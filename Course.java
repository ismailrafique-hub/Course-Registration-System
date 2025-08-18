/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

public class Course {
    private String name;
    private int crdh;
    private int c;
    int Str;
    Student s[];
    Teacher t;

    public Course() {
        this.name = null;
        this.crdh = 0;
        this.t = null;
        this.c=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCrdh() {
        return crdh;
    }

    public void setCrdh(int crdh) {
        this.crdh = crdh;
    }
    public Teacher getT() {
        return t;
    }

    public void setT(Teacher t) {
        this.t = t;
    }
    public void setStr(int Str) {
        this.s = new Student[Str];
    }
    
    void addStudent(Student b) {
        if (c < s.length) {
            s[c] = b;
            c++;
        } else {
            System.out.println("Course is full.");
        }
    }

    void displayStudents() {
        for (int i = 0; i < Str; i++) {
            System.out.println("------------------------");        
            System.out.println(s[i].getName());
            System.out.println(s[i].getAge());
            System.out.println(s[i].getId());
            System.out.println(s[i].getGrade());
        }
    } 
     void displayTeacher() {
         System.out.println(t.getName()+" is teaching "+name);
         System.out.println("Age"+t.getAge());
         System.out.println("ID id"+t.getId());
     }
            
             
}
