/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambda.comparator;

import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Test;

/**
 *
 * @author ramudu
 */
public class PersonComparatorTest {

    final List<Person> persons = Arrays.asList(new Person("Kumar", 35), new Person("Karthik", 25), new Person("Bhanu", 35), new Person("Sandeep", 25));
    PersonComparator comparator = new PersonComparator(persons);

    @After
    public void tearDown() {
        System.out.println("---------------");

    }

    @Test
    public void testGetPersonsInAscendingOrder() {
        comparator.getPersonsInAscendingOrder()
                .forEach(System.out::println);
    }

    @Test
    public void testGetPersonsInDescendingOrder() {
        comparator.getPersonsInDescendingOrder()
                .forEach(System.out::println);
    }

    @Test
    public void testPrintYoungest() {
        comparator.printYoungest();
    }

    @Test
    public void testPrintEldest() {
        comparator.printEldest();
    }

    @Test
    public void testGetPersonsSortedByAgeAndThenByName() {
        System.out.println("ByAgeAndName");
        comparator.getPersonsSortedByAgeAndThenByName().stream().forEach(System.out::println);
    }

}
