package com.oocl.dojo;

class SmartYear {
    private int year;

    SmartYear(int year) {
        this.year = year;
    }

    boolean isLeapYear() {
        boolean isLeapYear = (year%4 == 0);
        if(year%100==0)
            isLeapYear = (year%400==0);

        return isLeapYear;
    }
}
