package com.example.AjaxServer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmpController {

    public List<Emp> lst=new ArrayList<Emp>(Arrays.asList(
            new Emp(1,"java","1000"),new Emp(2,"php","1000"),new Emp(2,"dot","1000")
    ));

    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:9091")
    public ResponseEntity<Object> getAll(){
        return new ResponseEntity<Object>(lst, HttpStatus.OK);
    }

    @RequestMapping(value = "/emp2",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:9091")
    public List<Emp> getAll2(){
        return lst;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:9091")
    public String hello(){
        return "welcome to dummy text";
    }

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:9091")
    public Emp getId(@PathVariable int id){
        return lst.get(id);
    }

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    @CrossOrigin(origins = "http://localhost:9091")
    public String add(@RequestBody Emp emp){
        lst.add(emp);
        return "successfully added";
    }

}
