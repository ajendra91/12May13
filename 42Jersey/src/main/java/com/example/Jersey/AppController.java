package com.example.Jersey;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@Path("/kala")
public class AppController {

    public List<Kala> lst=new ArrayList<Kala>(Arrays.asList(
            new Kala(1,"java","10"),new Kala(2,"php","10"),new Kala(3,"dot","10")
    ));

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response getAll(){
        return Response.ok(lst).build();
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response getId(@PathVariable int id){
        return Response.ok(lst.get(id)).build();
    }

}
