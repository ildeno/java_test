/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.test;

/**
 *
 * @author denis
 */
public class Person {
    private static boolean checker(String val){
        return val != null && !val.equals("");
    }
    private static boolean checker(int a){
        return a > 0;
    }
    private final String name;
    private final String surname;
    private final int age;
    public Person(String n, String s, int a) throws Exception{
        if(!checker(n) || !checker(s) || !checker(a)){
            throw new Exception("Can't create a new Person: check the constructor's params");
        }
        this.name = n;
        this.surname = s;
        this.age = a;
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.surname + " " + this.age + " years old";
    }
}