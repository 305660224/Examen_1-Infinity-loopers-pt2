/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Curses;

/**
 * 04/07/2025 ult mod: 2:21pm
 * @author Dennis Marchena
 */
public class Curse {
private int Code;
private String Name;
private String Group; 

    public int getCode() {
        return Code;
    }

    public String getName() {
        return Name;
    }

    public String getGroup() {
        return Group;
    }

    public Curse(int Code, String Name, String Group) {
        this.Code = Code;
        this.Name = Name;
        this.Group = Group;
    }
}
