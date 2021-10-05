import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJsonFiles {

    public static void main(String[] args) throws IOException, ParseException {
        FileReader reader = new FileReader
                ("/Users/mohammadmoshiurrahman/IdeaProjects/FileValidation/src/jsonfiles/sample.json");
        System.out.println("Reading file -----" + reader);

        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(reader);
        System.out.println("Java object -----" + obj);

        JSONObject sample = (JSONObject) obj;
        System.out.println("Converted into json object-----" + sample);

        String fname = (String) sample.get("firstName");
        String lname = (String) sample.get("lastName");
        System.out.println("FirstName-----" + fname);
        System.out.println("LastName-----" + lname);


        JSONArray jsonArray = (JSONArray) sample.get("address");
        System.out.println("JsonArray-----" + jsonArray);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject address = (JSONObject) jsonArray.get(i);
            System.out.println("Elements in the array -----" + address);
            String city = (String) address.get("city");
            String street = (String) address.get("street");
            String state = (String) address.get("state");

            System.out.println("Address of  " + i + " is");
            System.out.println("city  " + city);
            System.out.println("street  " + street);
            System.out.println("state  " + state);
        }
    }
}
