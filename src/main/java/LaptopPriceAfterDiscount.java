import java.util.*;

public class LaptopPriceAfterDiscount {

    public static void main(String[] args) {

        String message = "A core i7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount";

        String extract = message.replaceAll("[^\\d]"," ");
        extract = extract.trim();
        extract = extract.replaceAll(" +"," "); //remove extra space

        String[] strData = extract.split(" ");

        int[] intData = new int[strData.length];

        for (int i = 0; i < strData.length; i++){
            intData[i] = Integer.parseInt(strData[i]); // Convert String Array to Integer Array
        }

        List<Integer> priceList = new ArrayList<>();

        for (int i = 0; i < intData.length; i++) {
            if(intData[i] > 9){
                priceList.add(intData[i]);
            }
        }

        int laptop_price = priceList.get(0);
        int mouse_price = priceList.get(1);
        int discount = priceList.get(2);

        int total_Price = laptop_price + mouse_price;
        int discount_Price = ((total_Price * discount)/100);
        int total_Price_After_Discount = total_Price - discount_Price;

        System.out.println("Laptop price is: " + laptop_price);
        System.out.println("Laptop price is: " + mouse_price);
        System.out.println("After " + discount + "% discount total price is: " + total_Price_After_Discount);
    }
}