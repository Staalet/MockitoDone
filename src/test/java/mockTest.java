/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercise.CommunicationException;
import exercise.FetchCountInfo;
import exercise.StarWars;
import exercise.StarwarsFetcher;
import exercise.Emailer;
import java.util.Map;
import org.hamcrest.Matchers;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Staal
 */
//Gør det variabler public
@RunWith(MockitoJUnitRunner.class)
public class mockTest {
    
    @Mock
    FetchCountInfo fci;
    
    @Mock
    Emailer sei;
    
   
    
    public mockTest(){
        
    }
    
//    @Test
//    public void FetchCountInfoTest() throws CommunicationException{
//        
//        StarwarsFetcher fetch = new StarwarsFetcher(fci, sei);
//                
//        when(fci.FetchCountInfo()).thenReturn(new StarWars(Matchers.hasEntry("people", 87)));
//        
//         Map sw = fetch.fetchData();
//         
//        
//        
//        assertEquals("data received", "people:"+87, sw);
//        
//    }
  
    @Test(expected = CommunicationException.class)
    public void testException() throws CommunicationException{
        
        StarwarsFetcher fetch = new StarwarsFetcher(fci, sei);
        
        when(fci.FetchCountInfo()).thenThrow(CommunicationException.class);
        
        fetch.fetchData();
        
        verify(sei, times(1)).Emailer("there is a problem with the server: http://swapi.co/api/people/?format=json");
        
        assertTrue(false);
    }
            
    
//    @Test
//    public void emailSent(){
//        when(sf.fetchData()).
//    }
}
