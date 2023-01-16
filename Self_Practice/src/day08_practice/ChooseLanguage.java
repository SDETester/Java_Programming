package day08_practice;

public class ChooseLanguage {

        public static void main(String[] args) {

            int number =1;

            String result1 = "Invalid Number";

            if(number >= 1 && number <= 5){

                result1 = (number==1)?"Hello, thanks for your call"
                        :(number==2)?"Hola, gracias para llamar"
                        :(number==3)?"Merhaba, aradiginiz icin tesekkurler"
                        :(number==4)?"Privet, spasibo za vash zvonok"
                        :"Merci ,pour votre appel";
            }


            System.out.println(result1);

            System.out.println("---------------------------------------");

            String result2 = "Invalid Number";

            switch (number){
                case 1:
                    result2 = "Hello, thanks for your call";
                    break;

                case 2:
                    result2 = "Hola, gracias para llamar";
                    break;

                case 3:
                    result2 = "Merhaba, aradiginiz icin tesekkurler";
                    break;

                case 4:
                    result2 = "Privet, spasibo za vash zvonok";
                    break;

                case 5:
                    result2 = "Merci ,pour votre appel";

            }


        }

    }

/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:
			for 1: Hello, thanks for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel
			for any other numbers print "Invalid Number"
		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */
