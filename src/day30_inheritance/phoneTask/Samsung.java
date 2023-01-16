package day30_inheritance.phoneTask;

public class Samsung extends Phone{

    public Samsung( String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(getBrand() +" "+ getModel() +" freezes a lot");
    }


}

/*
2.2 Samsung:
					Extra methods:
						freeze()
 */
