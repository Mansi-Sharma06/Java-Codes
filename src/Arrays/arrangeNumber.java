package Arrays;

import java.util.Scanner;

class Student{
    int roll_number;
    String name;
}
class DPS {
    public static void main (String[] args) {
        Student s=new Student();
        s.roll_number=5;
        s.name="Rohit";
        System.out.println(s.roll_number+" "+s.name);
	}
}

