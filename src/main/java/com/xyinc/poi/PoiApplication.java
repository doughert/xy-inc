package com.xyinc.poi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan( basePackages = { "com.xyinc.poi" } )
public class PoiApplication {

    public static void main( String[] args ) {

        SpringApplication.run( PoiApplication.class, args );
    }
}
