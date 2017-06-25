package exercise;

import static com.jayway.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StarwarsFetcher {

   
     private Emailer sei;
     private FetchCountInfo fci;
   

    public StarwarsFetcher(FetchCountInfo fci, Emailer sei) {
        this.sei = sei;
        this.fci = fci;
    }
 
    /**
     * Extracts count values for the "people", "starships" and "vehicles"
     * endpoints at:http://swapi.co/api/
     *
     * @return A Map with the endpoint name as key (for example "people"), and
     * count as value
     * @throws CommunicationException If communication fails (the server is not
     * responding)
     */
    public Map<String, Integer> fetchData() throws CommunicationException {
        try {
            return fci.FetchCountInfo();
        } catch (CommunicationException e) {
            sei.Emailer("There was a problem with fetching data from: http://swapi.co/api");
            throw e; //Rethrow to signal error to the caller
        }
    }

    //DO NOT TEST THIS METHOD: It's just meant as a quick manual test, to see the code in action
    public static void main(String[] args) throws CommunicationException {
        StarwarsFetcher f = new StarwarsFetcher(new FetchCountInfo(), new Emailer());
        Map<String, Integer> data = f.fetchData();
        for (String key : data.keySet()) {
            System.out.println(key + ":" + data.get(key));
        }
//    Gson gson = new GsonBuilder().setPrettyPrinting().create();
//    System.out.println(gson.toJson(data));
    }
}
