package com.kasundev.quickstart.services.impl;

import com.kasundev.quickstart.services.BluePrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EnglishBluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "blue";
    }
}
