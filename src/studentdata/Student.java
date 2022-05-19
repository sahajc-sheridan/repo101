/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package studentdata;

/**
 * This class represents student 
 *
 * @author Megha Patel
 */
public class Student {

    private String studentName;
    String progName;

    public Student(){}
    public Student(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
}
