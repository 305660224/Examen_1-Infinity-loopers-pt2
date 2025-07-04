/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 * 04/07/2025 ult mod: 2:21pm
 * @author Dennis Marchena
 */
public class Teacher extends Person{
private String Deparment;      

//Metodos Get
public String getDeparment() {
    return this.Deparment;
 }

//Metodos Set
public void setCarrer(String Deparment) {
    this.Deparment=Deparment;
 }

//Constructor
public void Student (String Deparment, String Id, String Name) {
this.Deparment=Deparment;
 }

}
