package day28_encapsulation.personTask;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHeads;

    public Person(String name) { // Allows us to create Person object just by setting the name of the person
        this.name = name;
    }

    public Person(String name, int age) { // Allows us to create Person object just by setting the name & age of the person
        this(name);
        this.age = age;
    }

    public Person(String name, String language) { // Allows us to create Person object just by setting the name & language of the person
        this(name);
        this.language = language;
    }

    public Person(String name, char gender) {  // Allows us to create Person object just by setting the name & gender of the person
        this(name);
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {  // Allows us to create Person object just by setting the name , age and gender of the person
        this(name, age);
        this.gender = gender;
    }

    public Person(String name, int age, char gender, String language) { // Allows us to create Person object just by setting the name, age, gender and language of the person
        this(name, age, gender);
        this.language = language;
    }


    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 0;
        numberOfHeads = 1;

        // name = "Josh";
    }


    public static void printPlanetName() {
        System.out.println("Planet name is: " + planet);
    }

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ", planet='" + planet + '\'' +
                '}';
    }



}

/*
1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead
			Add a constructor to initialize name
			Add a constructor to initialize name and age
			Add a constructor to initialize name and language
			Add a constructor to initialize name and gender
			Add a constructor to initialize name, age and gender
			Add a constructor to initialize name, age, gender, language
			Add a static block to initialize all the statics
			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
