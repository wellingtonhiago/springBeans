package com.java.springBeans.exemplo2;

import java.util.List;

class Company {
    private final String name;
    private final List<String> employees;

    Company(String name, List<String> employees) {
        this.name = name;
        this.employees = employees;
    }
}