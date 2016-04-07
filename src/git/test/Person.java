/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.test;

/**
 * 
 * This seems to work well, but I need to master it because use GitHub it is
 * really important today.
 *
 * @author denis
 */
public class Person {
    
    private final String name;
    private final String surname;
    private final int age;
    public Person(String n, String s, int a) {
        this.name = n;
        this.surname = s;
        this.age = a;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.surname + " " + this.age + " years old: "
                + (isAdult()? "adult" : "not adult");
    }
    
    /**
     * It returns true if its age is bigger or equal than 18
     * @return boolean
     */
    public boolean isAdult(){
        return this.age >= 18;
    }
    
    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public int getAge(){
        return this.age;
    }
}
