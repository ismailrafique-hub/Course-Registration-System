/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author admin
 */
public class APortal {
    Course []c;
    private int total;

    public APortal(int total) {
        this.total = total;
        this.c = new Course[total] ;
    }
    void addCourse(Course b){
        if(total>0){
        c[total]=b;
        total--;
        }
        else{
            System.out.println("No more Space for Cources");
          }
    }
    
    
}
