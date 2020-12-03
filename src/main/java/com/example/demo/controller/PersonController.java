package com.example.demo.controller;


import com.example.demo.pojo.Person;
import com.example.demo.service.PersonService;
import org.apache.shardingsphere.api.hint.HintManager;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lihu
 * @since 2020-12-03
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource
    private PersonService personService;

    @RequestMapping("/save")
    public String save(){
        HintManager hintManager=HintManager.getInstance();
        //hintManager.addDatabaseShardingValue("person",3);
        //hintManager.addTableShardingValue("person",4);

        for (int i=0;i<10;i++){
            Person person=new Person();
            person.setId(i+90);
            person.setName("瓜田李下 "+i);
            person.setAge(i+10);

            personService.save(person);
        }

        return "success";
    }
}

