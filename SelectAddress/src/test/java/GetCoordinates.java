import java.util.Map;
import java.util.Scanner;

public class GetCoordinates {

    

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Pincode");
    	String pinCode=sc.nextLine();
        Map<String, Double> coords;
        coords = OpenStreetMapUtils.getInstance().getCoordinates(pinCode);
        System.out.println("latitude :" + coords.get("lat"));
        System.out.println("longitude:" + coords.get("lon"));
    }
}