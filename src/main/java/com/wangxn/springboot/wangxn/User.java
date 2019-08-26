package com.wangxn.springboot.wangxn;

import io.swagger.annotations.ApiParam;
import lombok.*;
@Value
public class User {


    @ApiParam(name = "nae",value = "nae",defaultValue = "nae")
    private String nae;
    @ApiParam(name = "age",value = "age",defaultValue = "age")
    private String age;
    @ApiParam(name = "sex",value = "sex",defaultValue = "sex")
    private String sex;


    public static void main(String[] args) {
        String data="{\n" +
                "  \"username\": \"wangxn\",\n" +
                "  \"age\": \"18\",\n" +
                "  \"sex\": \"male\"\n" +
                "}";
//        String msg=""

    }

}
