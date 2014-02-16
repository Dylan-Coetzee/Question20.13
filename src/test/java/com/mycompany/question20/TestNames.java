/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.question20;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;

/**
 *
 * @author dylan
 */
public class TestNames {
    
    public TestNames() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //Scanner input = new Scanner(System.in);
    
    @Test 
    public void hello() {
        String[] names = {"Dylan","Doctor","Xavier", "Kurvin","Dylan","JayCee","Cannon","Shotgun","Xavier","Doctor","Emily","Nicole"};
        List<String> list = Arrays.asList(names);
        
        System.out.printf("List: %s\n", list);
        
        printNonDuplicates(list);
        
        String name = "Nicole";
        assertEquals(names, names);
        Collections.sort(list);
        printSeatchResults(list, name);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
     private static void printNonDuplicates(Collection<String> values){

        Set<String> set = new HashSet<String>(values);

        System.out.print("\nNonduplicates are: ");
        
        for(String value : set)
            System.out.printf("%s, ", value);

        System.out.println();
    }
     
    private static void printSeatchResults(List<String> list, String key){

        int result = 0;

        System.out.printf("\nSearching for: %s\n", key);

        result = Collections.binarySearch(list, key);

        if(result >= 0)
            System.out.printf("Found at index %d\n", result);
        else
            System.out.printf("Not Found (%d)\n", result);
    }
}
