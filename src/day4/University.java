package day4;

public class University {

    public static void main(String[] args) {
        Student student = new Student();
        Student student1=new Student();

        //student
        student.setName("John");
        student.setAge(26);
        student.setSex("Male");
        student.setAddress("1216 avengers ave");
        student.setFaculty("masters");
        student.setStudentClass(2);
        student.setRollNumber(12);

    //output
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSex());
        System.out.println(student.getAddress());
        System.out.println(student.getFaculty());
        System.out.println(student.getStudentClass());
        System.out.println(student.getRollNumber());


        //student1

        student1.setName("Sharon");
        student1.setAge(25);
        student1.setSex("Female");
        student1.setAddress("55 wavers way");
        student1.setFaculty("bachelors");
        student1.setStudentClass(2);
        student1.setRollNumber(18);


        //output
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getSex());
        System.out.println(student1.getAddress());
        System.out.println(student1.getFaculty());
        System.out.println(student1.getStudentClass());
        System.out.println(student1.getRollNumber());



        Teacher teacher = new Teacher();

        teacher.setName("Nikki");
        teacher.setAge(45);
        teacher.setSex("Female");
        teacher.setAddress("2200 spiders ave");
        teacher.setSalary(20000);
        teacher.setSubject("maths");
        teacher.setYearsOfExperience(12);


        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSex());
        System.out.println(teacher.getAddress());
        System.out.println(teacher.getSalary());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getYearsOfExperience());


    }


}

