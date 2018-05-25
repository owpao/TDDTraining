package com.oocl.dojo;

import org.junit.Assert;
import org.junit.Test;

public class YearTest {
    @Test
    public void test_year_2004_should_be_a_leap_year() throws Exception{
        //given
        SmartYear smartYear = new SmartYear(2004);
        //when
        boolean isLeapYear = smartYear.isLeapYear();
        //then
        Assert.assertTrue(isLeapYear);
    }

    @Test
        public void test_year_1996_should_be_a_leap_year(){
        //given
        SmartYear smartYear = new SmartYear(1996);
        //when
        boolean isLeapYear = smartYear.isLeapYear();
        //then
        Assert.assertTrue(isLeapYear);
        }

    @Test
    public void test_year_1900_should_not_be_a_leap_year(){
        //given
        SmartYear smartYear = new SmartYear(1900);
        //when
        boolean isLeapYear = smartYear.isLeapYear();
        //then
        Assert.assertFalse(isLeapYear);
    }

    @Test
    public void test_year_4000_should_be_a_leap_year(){
        //given
        SmartYear smartYear = new SmartYear(4000);
        //when
        boolean isLeapYear = smartYear.isLeapYear();
        //then
        Assert.assertTrue(isLeapYear);
    }

    @Test
    public void test_year_2000_should_be_a_leap_year(){
        //given
        SmartYear smartYear = new SmartYear(2000);
        //when
        boolean isLeapYear = smartYear.isLeapYear();
        //then
        Assert.assertTrue(isLeapYear);
    }
}
