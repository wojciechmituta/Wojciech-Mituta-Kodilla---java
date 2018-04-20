package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

@Test
        public void testOddNumbersExterminatorEmptyList() {

            //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

            //When
        ArrayList<Integer> resultEmptyList = oddNumbersExterminator.exterminate(emptyList);

            //Then
        Assert.assertEquals(0, resultEmptyList.size());
        System.out.println("Empty List? - No problem :-)");
        }
@Test
        public void testOddNumbersExterminatorNormalList (){
            //Givem
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(3);
        normalList.add(5);
        normalList.add(4);
        normalList.add(6);
        normalList.add(3);
        normalList.add(8);

             //When
        ArrayList<Integer> resultNormalList = oddNumbersExterminator.exterminate(normalList);

             //Then
        Assert.assertEquals(3, resultNormalList.size());
        System.out.println("method .exterminate() is ok!");



    }


    }
