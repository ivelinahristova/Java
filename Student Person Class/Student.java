/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentpersontest;

/**
 *
 * @author Ivelina
 */
public class Student extends Person{
    private int facultyNumber;
    private int course;
    private String specialty;
    
    public Student()
    {
        super();
        this.facultyNumber = 1111;
        this.course = 1;
        this.specialty = "";
    }
    public Student(String name, String gender, int age, String birthDate, int facultyNumber,
            int course, String specialty)
    {
        super(name,gender,age,birthDate);
        this.facultyNumber = facultyNumber;
        this.course = course;
        this.specialty = specialty;
        
    }
    public Student(Student otherStudent)
    {
        super(otherStudent);
        this.course = otherStudent.course;
        this.facultyNumber = otherStudent.facultyNumber;
        this.specialty = otherStudent.specialty;
    }
    public int getCourse()
    {
        return this.course;
    }
    public void setCourse(int course)
    {
        this.course = course;
    }
    public int getFacultyNumber()
    {
        return this.facultyNumber;
    }
    public void setFacultyNumber(int facultyNumber)
    {
        this.facultyNumber = facultyNumber;
    }
    public String getSpecialty()
    {
        return this.specialty;
    }
    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }
    @Override
    public String showInfo()
    {
        return String.format("Студент с  име %s, години %s, пол %s, "
                + "\nдата на раждане %s, факултетен номер %s, курс %s, специалност %s", this.getName(), 
                this.getAge(), this.getGender(), this.getBirthDate(), this.facultyNumber, this.course, this.specialty);
    }
}
