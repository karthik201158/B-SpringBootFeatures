package com.annotations.Annotations.autowired.fields.usecase1;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class MyServiceImpl {

    @Autowired
    private ModelMapper modelMapper;

    public void convertDTO1ToDTO2(){
        MyDTO1 myDTO1 = new MyDTO1();
        myDTO1.setName("Karthik");
        MyDTO2 myDTO2 = modelMapper.map(myDTO1, MyDTO2.class);
      System.out.println(myDTO2.getName());
    }
}
