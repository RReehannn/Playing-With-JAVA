import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CountryMap {
    public static void main(String[] args) {
        Map<String, String> CountryMap = new HashMap<>();
        CountryMap.put("India", "New Delhi");
        CountryMap.put("China", "Beijing");
        CountryMap.put("Pakistan", "Islamabad");
        CountryMap.put("SriLanka", "Colombo");
        CountryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the country name:-");
        String Country = input.next();

        if(CountryMap.containsKey(Country)){
            System.out.printf("Capital of %s is %s", Country, CountryMap.get(Country));

        } else {
            System.out.println("Sorry");
        }

    }
}
