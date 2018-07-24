package com.kodilla.hibernate.manytomany.dao.facade;

public class SearchException extends Exception {
    public static String ERR_EMPLOYEE_NOT_FOUND = "Not found matching employees";
    public static String ERR_COMPANY_NOT_FOUND = "Not found matching company";

    public SearchException(String message) {
        super(message);
    }
}
