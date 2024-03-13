package com.juaracoding.utils;

public enum TestCases {

    T1("Verifikator berhasil melakukan verifikasi data register");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
