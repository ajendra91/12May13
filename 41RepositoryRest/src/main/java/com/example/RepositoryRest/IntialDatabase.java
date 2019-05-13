package com.example.RepositoryRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class IntialDatabase implements CommandLineRunner {

    @Autowired
    public Demodao dd;

    @Override
    public void run(String... args) throws Exception {
        Java demo1=new Java(1,"java","10");
        dd.save(demo1);
        Java demo2=new Java(2,"java","10");
        dd.save(demo2);
        Java demo3=new Java(3,"java","10");
        dd.save(demo3);

    }
}
