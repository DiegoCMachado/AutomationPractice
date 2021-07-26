package Utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerGenerator {

    private static Faker faker = new Faker(new Locale("fr-FR"));

    public static String getEmail(){
        return faker.internet().emailAddress();
    }

    public static String getFirstName(){
        return faker.name().firstName();
    }

    public static String getLastName(){
        return faker.name().lastName();
    }

    public static String getpassword(){
        return faker.internet().password();
    }

    public static String getaddress(){
        return faker.address().buildingNumber();
    }

    public static String getCity(){
        return faker.address().cityName();
    }

    public static String getPostalCode(){
        return faker.address().zipCode();
    }

    public static String phone(){
        return faker.phoneNumber().cellPhone();
    }
}
