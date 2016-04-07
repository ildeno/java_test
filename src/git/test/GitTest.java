/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git.test;

/**
 *
 * Do I have to add something also here?
 *
 * @author denis
 */
public class GitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person p = null;

        p = new Person("Denis", "Gerolini", 34);
        message(p.toString());

        p = new Person(null, null, -2);
        message(p.toString());
    }

    /**
     * Just a printed message
     *
     * @param value
     */
    private static void message(String value) {
        System.out.println(value);
    }
}
