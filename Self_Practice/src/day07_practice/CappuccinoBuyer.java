package day07_practice;

    public class CappuccinoBuyer {
        public static void main(String[] args) {
            String size = "grande";
            double price = 0.0;
            int calories = 0;

            if(size == "tall" || size == "grande" || size == "venti"){

                if(size == "tall"){
                    price = 3.69;
                    calories = 90;
                }else if(size == "grande"){
                    price = 3.99;
                    calories = 120;
                }else{
                    price = 4.29;
                    calories = 150;
                }

                System.out.println("Price is: $" + price+"\n"+calories + " calories");

            }else{
                System.err.println("Invalid Size: " + size);
            }


        }
    }


/*
Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
			Valid sizes are tall, grande, venti and thier price & calories are:
						tall:
								price is $3.69
								90 calories
						grande:
								price is $3.99;
								120 calories
						venti:
								price is $4.29
								150 calories
			If the size is invalid then the output shoud be "Invalid Size"
			Note: MUST use nested if
 */
