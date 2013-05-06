/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpersontest;

/**
 *
 * @author Ivelina
 */
public class StudentPersonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person randomPerson = new Person("Gosho", "male", 15, "05/09/1998");
        System.out.println(randomPerson.showInfo());
        Student randomStudent = new Student("Jivka", "female", 13, "01/01/2000", 4567, 2, "IT");
        System.out.println(randomStudent.showInfo());
        
    }
}
