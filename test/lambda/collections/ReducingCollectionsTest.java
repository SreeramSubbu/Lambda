/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.collections;

import lambda.collections.ReducingCollections;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class ReducingCollectionsTest {

    ReducingCollections list;

    @Before
    public void setUp() {
        List<String> friends = Arrays.asList("Kumar", "Karthik", "Vivek", "Nishanth", "Anbu", "Sugan");
        list = new ReducingCollections(friends);
    }

    @Test
    public void testFindSum() {
        System.out.println(list.findSum());
    }

    @Test
    public void testPrintLongest() {
        list.printLongest().ifPresent(System.out::println);
    }

    @Test
    public void testPrintLongestWithDefault() {
        System.out.println(list.printLongestWithDefault());
    }

}
