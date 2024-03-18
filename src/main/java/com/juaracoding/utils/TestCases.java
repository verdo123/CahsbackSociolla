package com.juaracoding.utils;

public enum TestCases {

    T1("Verifikator berhasil melakukan ekspor dara yang tervalidasi");


    private String testCaseName;

    TestCases(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
