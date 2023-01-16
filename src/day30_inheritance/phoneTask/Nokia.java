package day30_inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia( String model, String size, String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand() +" "+ getModel()+" can be used for self defense");
    }


}

/*
2.3 Nokia:
					Extra methods:
						selfDefense()
 */

