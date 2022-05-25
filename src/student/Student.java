/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student;

/**
 *
 * @author user
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] studentlist= new Student[3];
        
       Student s1= new Student();
       s1.setName("john");
       s1.setAge(19);
       
       Student s2= new Student();
       s2.setName("Isha");
       s2.setAge(18);
       
       Student s3= new Student();
       s3.setName("Krupali");
       s3.setAge(19);
       studentlist[0]=s1;
       studentlist[1]=s2;
       studentlist[2]=s3;
       for(int i=0;i<studentlist.length;i++)
       {
           System.out.println(studentlist[i].getName()+""+studentlist[i].getName()+""+studentlist[i].getName());
       }
        // TODO code application logic here
    }
}
        
        
    
