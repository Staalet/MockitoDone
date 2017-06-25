/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import static com.jayway.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Staal
 */
public class FetchCountInfo {
        
    /**
     * Extracts the count value for the "people", "starships" and "vehicles"
     * endpoints at:http://swapi.co/api/
     *
     * @return A Map with the endpoint name as key (for example "people"), and
     * count as value
     * @throws CommunicationException If communication fails (the server is not
     * responding)
     *
     * NOTE: The "simplicity" of this method is due to the use of parallelStream
     * + restAssured to perform the HTTP-request You do not (necessarily) need
     * to understand this code for this exercise, only it's return value, since
     * you eventually will have to provide a mock to test without the need to
     * perform real HTTP-requests
     */
    public Map<String, Integer> FetchCountInfo() throws CommunicationException {

        Map<String, String> urls = new HashMap();
        //urls.put("people", "http://swapi.co/api/people/?format=json");
        urls.put("people", "http://swapi.co/api/peopl");
        urls.put("starships", "http://swapi.co/api/starships/?format=json");
        urls.put("vehicles", "http://swapi.co/api/vehicles/?format=json");
        try {
            Map<String, Integer> results = urls.entrySet()
                    .parallelStream()
                    .collect(Collectors.toMap((entry) -> entry.getKey(), entry -> given().get(entry.getValue()).path("count")));
            return results;
        } catch (Exception e) {
            throw new CommunicationException();
        }
    }
    
}
