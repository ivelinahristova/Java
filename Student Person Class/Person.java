/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpersontest;

/**
 *
 * @author Ivelina
 */
public class Person {
    private String name;
    private String gender;
    private int age;
    private String birthDate;
    
    public Person()
    {
        this("", "male", 0, "01/01/1900");
    }
    /**
     *
     * @param name
     * @param gender
     * @param age
     * @param birthDate
     */
    public Person(String name, String gender, int age, String birthDate)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birthDate = birthDate;
    }
    public Person(Person otherPerson)
    {
        this.name = otherPerson.name;
        this.gender = otherPerson.gender;
        this.age = otherPerson.age;
        this.birthDate = otherPerson.birthDate;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getGender()
    {
        return this.gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getBirthDate()
    {
        return this.birthDate;
    }
    public void setBirthDate(String birthDate)
    {
        this.birthDate = birthDate;
    }
    public String showInfo()
    {
        return String.format("Човек с име %s, години %s, пол %s и дата на раждане %s", this.name, this.age, this.gender, this.birthDate);
    }
    public int daysCountToBirthDay(int currentDay, int currentMonth, int currentYear)
    {
        int birthDay;
        birthDay = Integer.parseInt(this.birthDate.substring(0, 2));
        int birthMonth;
        birthMonth = Integer.parseInt(this.birthDate.substring(2, 2));
        
        return 0;    
    }
}
