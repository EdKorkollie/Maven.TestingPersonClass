package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testDefaultConstructor(){
        //Give
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        //When
        Person person = new Person();
        //Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testConstructorWithName(){
        //Give
        String expectedName = " Joe";

        //When
        Person person = new Person(expectedName);
        //Then
        String actualName = person.getName();

        Assert.assertEquals(expectedName, actualName);

    }
    @Test
    public void testConstructorWithAge(){
        //Give

        Integer expectedAge = 10;
        //When
        Person person = new Person(expectedAge);
        //Then

        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedAge, actualAge);
    }
    @Test
    public void testConstructorWithNameAndAge(){
        //Give
        String expectedName = "John";
        Integer expectedAge = 10;
        //When
        Person person = new Person(expectedName, expectedAge);
        //Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void setName() {
        //Give
        Person person = new Person();
        String expected = "Joe";
        //When
        person.setName(expected);
        String actual = person.getName();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAge() {
        //Give
        Integer expected = 10;
        Person person = new Person();
        //When
        person.setAge(expected);
        //Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        //Give
        //When
        //Then
    }

    @Test
    public void getAge() {
        //Give
        //When
        //Then
    }
}