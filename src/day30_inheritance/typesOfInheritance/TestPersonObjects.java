package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A01");

        President president = new President("Daniel", 'M', LocalDate.of(1980, 12, 1),LocalDate.of(2020, 1, 1));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 95000);


        System.out.println(student);
        System.out.println(teacher);
        System.out.println(president);

        student.study();
        teacher.teach();
        president.lie();

        System.out.println("---------------------------------------------------");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");

    }

}