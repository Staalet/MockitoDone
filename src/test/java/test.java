/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exercise.CommunicationException;
import exercise.Emailer;
import exercise.FetchCountInfo;
import exercise.StarWars;
import exercise.StarwarsFetcher;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.is;
import org.hamcrest.Matchers;
import static org.hamcrest.Matchers.hasEntry;
import org.hamcrest.collection.IsMapContaining;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author Staal
 */
@RunWith(MockitoJUnitRunner.class)
public class test {

    @Mock
    FetchCountInfo fci;

    @Mock
    Emailer sei;

    public test() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

//    @Test
//    public void FetchCountInfoTest() throws CommunicationException{
//        
//       StarwarsFetcher fetch = new StarwarsFetcher(fci, sei);
//       
//       Map<String, Integer> sw = new HashMap();
//                sw.put("people", 87);
//                
//        when(fci.FetchCountInfo()).thenReturn(sw);
//        
//         Map result = fetch.fetchData();
//        
//        assertThat(result, IsMapContaining.hasEntry("people", 87));
        
    }
}

