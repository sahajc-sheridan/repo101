
package studentdata;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
//        Student s1=new Student("Megha");
//        Student s2=new Student();
//        Student s3=new Student();
//        s2.setStudentName("Jack");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter student name: ");
//        s3.setStudentName(sc.nextLine());
//        
//        System.out.println("Student name:");
//        System.out.println(s1.getStudentName()+" "+s2.getStudentName()+" "+s3.getStudentName());
//    
        
        //create an array of student object and print it
        
       // int[] i=new int[2];
        Student[] studList=new Student[5];
        //studList[0].setStudentName("Jack");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<studList.length;i++)
        {
            System.out.println("Enter Student name: ");
            String name=sc.nextLine();
            
            Student s=new Student(name);
            studList[i]=s;
            
        }
        
        //print student list
        for(Student s:studList)
        {
            System.out.println(s.getStudentName());
        }
        
    }

}
