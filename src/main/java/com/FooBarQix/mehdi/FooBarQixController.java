package com.FooBarQix.mehdi;

import com.FooBarQix.mehdi.service.FooBarQixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooBarQixController {
@Autowired
private FooBarQixService fooBarQixService;

    @GetMapping(value = "FooBarQix/{nb}")
    public String toFooBarQixConvert(@PathVariable String nb){

        return fooBarQixService.fooBarQixResult(nb);


    }
}
