package com.juaracoding.utils;

public enum TestCases {

    T3("Verifikator melakukan edit pada data cashback");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
