/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;
import Persons.Student;

/**
 *
 * @author UTN
 */
public class Studentlist implements Student<Student>{
    private Student student[];

    public Studentlista(Student[] Student) {
        this.student = new student[100];
    }
    
    
    @Override   
  public boolean add(Student t) {
 
    if (t == null || find(t.getId()) != null) {  
        return false; 
    }
    for (int i = 0; i < student.length; i++) {
        if (student[i] == null) {
            student[i] = t; 
            return true;     
        }
    }
    return false;   
   }
    
  @Override
    public boolean remove(Student t) {       
        for (int i = 0; i < 100; i++){
        if (student[i]==t){    
        student[i]=null;
        return true;
      }
     }
    return false;
    }
   
    
    @Override
   public Student find(Object id) {
    if (id == null) { 
        return null;
    }
    
    for (Student persons : Student) {  
        if (Student != null && id.equals(Student.getId { 
            return Student;
        }
    }
    return null;  
}
    
  
    @Override
    public void showAll() {
         for (int i = 0; i <100; i++){
                System.out.println(student[i]);
            }
    }  
    
    
  
}

