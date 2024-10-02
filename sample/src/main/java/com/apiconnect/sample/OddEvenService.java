package com.apiconnect.sample;

import org.springframework.stereotype.Service;

@Service
public class OddEvenService {
    public String checkOddEven(int num){
        if(num%2==0){
            return num+" is Even";
        }else {
            return num+" is Odd";
        }
    }
}
