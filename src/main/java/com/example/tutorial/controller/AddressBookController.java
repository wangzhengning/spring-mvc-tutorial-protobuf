package com.example.tutorial.controller;

import com.example.tutorial.dto.AddressBookProtos;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zn.wang
 * @Date: 2018/12/28 23:39:05
 * @Description:
 */
@RestController
public class AddressBookController {
    @RequestMapping("person")
    AddressBookProtos.Person person() {
        return AddressBookProtos.Person.newBuilder()
                .setId(1234)
                .setName("John Doe")
                .setEmail("jdoe@example.com")
                .addPhone(
                        AddressBookProtos.Person.PhoneNumber.newBuilder()
                                .setNumber("555-4321")
                                .setType(AddressBookProtos.Person.PhoneType.HOME))
                .build();
    }
}
