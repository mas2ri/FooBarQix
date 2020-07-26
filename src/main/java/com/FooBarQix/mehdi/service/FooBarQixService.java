package com.FooBarQix.mehdi.service;

import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Service
public class FooBarQixService {

    static final String FOO = "Foo";
    static final String BAR = "Bar";
    static final String QIX = "Qix";

    public String fooBarQixResult(String a) {
        String result =a;
        if (Integer.parseInt(a) % 3 == 0){
            result=FOO;
        }
        if (Integer.parseInt(a) % 5== 0){
            result+=BAR;
        }
        if (Integer.parseInt(a) % 7 == 0){
            result+=QIX;
        }

        for (String s : a.split("")
        ) {
            String resultContenu = verifierContenu(Integer.parseInt(s));
            result += "" + resultContenu;
        }
        Pattern p = Pattern.compile("(\\d+)(.+)") ;
        Matcher m = p.matcher(result);
        if(m.matches()) {
            String nb = m.group(1);
            System.out.println(nb);
            result = result.substring(nb.length());
        }
        if(result.equals("*")){
            result = a.replace("0","*");
        }
        return result;

    }

    String verifierContenu(int a) {
        String contenu ="";
        if (a==3)
            contenu = FOO;
        if (a==5)
            contenu =  BAR;
        if (a==7)
            contenu =  QIX;
        if (a==0)
            contenu =  "*";
        return contenu ;
    }



}
