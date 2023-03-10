package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size plus
     one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),1);
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * decrease list by deleting a city
     * check if it is same size
     */
    @Test
    public void delCityTest(){
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(),1);
        list.delCity(city);
        assertEquals(list.getCount(), 0);
    }

    @Test
    public void countCityTest(){
        list = MockCityList();
        assertEquals(list.getCount(), 0);
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(list.getCount(),1);
        list.delCity(city);
        assertEquals(list.getCount(), 0);

    }

}
