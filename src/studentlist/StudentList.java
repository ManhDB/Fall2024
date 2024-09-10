/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author buidu
 */
public class StudentList {

    /**
     * Tuesday
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setSid(1);
        
        Student s2 = new Student();
        s2.setName("Tarun");
        s2.setSid(2);
        
        Student s3 = new Student();
        s3.setName("John");
        s3.setSid(3);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i = 0; i<list.length; i++){
            System.out.println(list[i].getName()+" "+list[i].getSid());
        }
    }
    
}
