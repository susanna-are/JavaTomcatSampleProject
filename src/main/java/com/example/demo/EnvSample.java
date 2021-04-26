package com.example.demo;

import java.util.Map;
import java.util.Properties;

public class EnvSample {

    public static void main(String args[]){

        System.out.println("Environment Variables");
        Map<String, String> enviorntmentVars  = System.getenv();
        String test = enviorntmentVars.get("JAVA_HOME");
        String test1 = enviorntmentVars.get("MAVEN_HOME");
        System.out.println(test);
        System.out.println(test1);
        //enviorntmentVars.entrySet().forEach(System.out::println);

    }

}