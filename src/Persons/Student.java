/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 * 04/07/2025 ult mod: 2:21pm
 * @author Dennis Marchena
 */
public class Student extends Person {
private String Career;    

//Metodos Get
public String getCarrer() {
    return this.Career;
 }

//Metodos Set
public void setCarrer(String Career) {
    this.Career=Career;
 }

//Constructor
public void Student (String Career, String Id, String Name) {
this.Career=Career;
 }

}
