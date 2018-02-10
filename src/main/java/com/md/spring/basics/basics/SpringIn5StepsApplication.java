package com.md.spring.basics.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

    /*
    * solution for the given problem
    *
    * ONE THING IS TO SOLVE BY USING @PRIMARY
    *
    * 2 using BY NAME that is most demanadable
    *
    * 3 using @Qualifier class level
    *
    *
    *
    * */

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringIn5StepsApplication.class, args);

        BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
        int result = binarySearch.binarySearch(new int[]{1, 2, 2, 3}, 1);
        System.out.println(result);
    }

}
