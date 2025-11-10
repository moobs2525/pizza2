import java.util.Arrays;

public class testEnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int no : numbers) {
            System.out.println("contains: " + no);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("for loop contains: " + numbers[i]);
        }
        System.out.println((Arrays.toString(numbers)));
    }

}

  /*
    Student[] students = new Student[10];
students[0] = new Student("Mike",23);
    students[1 = new Student("John",23);
    students[2] = new Student("Jane",23);

    for(Student std : students)



}
class Student
public String name;
public  int age;
public Student(String name,int age)
    */