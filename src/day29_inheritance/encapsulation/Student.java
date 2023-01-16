package day29_inheritance.encapsulation;

public class Student {

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public String getName(){ // READ ONLY
        /*
        if(name == null){
            name = "Unknown";
        }
         */
        return name;
    }

    public void setName(String name){ // WRITE ONLY
        /*
        if(name.isEmpty()){
            System.err.println("Invalid student name");
           // return;
            System.exit(1);
        }
        */
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if(age < 0){
            System.err.println("Age can not be negative");
            System.exit(1);
        }

        if(age < 5 || age > 90){
            System.err.println("Invalid student age "+age);
            System.exit(1);
        }


        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if(gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';

        if(isValid) {
            this.grade = grade;
        }else{
            System.err.println("Invalid grade: "+grade);
            System.exit(1);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(){
        System.out.println(name +" is studying at "+schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }



}

/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName
            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
                        1. age can not be less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'
            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)
            Methods:
                study()
                toString()
 */

