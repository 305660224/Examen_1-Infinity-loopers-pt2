/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 * 04/07/2025 ult mod: 2:21pm
 * @author Dennis Marchena
 */
public class Person {
private String Id;      
private String Name;  

//Metodos Get
public String getId() {
    return this.Id;
 }

public String getName() {
    return this.Name;
 }

//Nombres ni cedula cambian, por ello no metodos set.

//Constructor
public void Person (String Id, String Name) {
this.Id=Id;    
this.Name=Name;
 }

}
