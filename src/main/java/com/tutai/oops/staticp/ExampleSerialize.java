package com.tutai.oops.staticp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable{
   private static String name;
   public Student(){
	   }
   public Student(String name){
      this.name = name;
   }
   public static String getName() {
      return name;
   }
   public static void setAge(String name) {
      Student.name = name;
   }
}
public class ExampleSerialize{
   public static void main(String args[]) throws Exception{
      Student std1 = new Student("Krishna");
      FileOutputStream fos = new FileOutputStream("student.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(std1);

      Student stdT = new Student();
      FileInputStream fis = new FileInputStream("student.ser");
      ObjectInputStream ois = new ObjectInputStream(fis);
      Student std2 = (Student) ois.readObject();
      System.out.println(std2.getName());
      System.out.println(stdT.getName());
   }
}
