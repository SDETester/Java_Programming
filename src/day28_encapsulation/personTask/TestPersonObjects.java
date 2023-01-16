package day28_encapsulation.personTask;

    public class TestPersonObjects {

        public static void main(String[] args) {

            Person person1 = new Person("Mohammad");

            Person person2 = new Person("Abidullah", 'M');

            Person person3 = new Person("Hasan", 30);

            Person person4 = new Person("Daniel", "English");

            Person person5 = new Person("Tatiana", 25, 'F');

            Person person6 = new Person("Lucy", 31, 'F', "English");

            person4.name = "James";

            // person1.planet = "Mars";
            //  Person.planet = "Mars";


            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
            System.out.println(person4);
            System.out.println(person5);
            System.out.println(person6);


            Person.printPlanetName();

            person1.eat("Baklava");

            person2.drink("Water");

            person5.drink("Tea");

            person6.drink("Coffee");


        }

    }

