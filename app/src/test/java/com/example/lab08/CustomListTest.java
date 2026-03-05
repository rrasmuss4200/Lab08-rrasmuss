package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    @Test
    public void testDeleteCityException() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        assertThrows(IllegalArgumentException.class, () -> {
            list.deleteCity(city);
        });
    }

    @Test
    public void testCountCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertEquals(1, list.countCity());
        list.deleteCity(city);
        assertEquals(0, list.countCity());
    }
}
