package com.kasundev.quickstart.services.impl;

import com.kasundev.quickstart.services.BluePrinter;
import com.kasundev.quickstart.services.ColourPrinter;
import com.kasundev.quickstart.services.GreenPrinter;
import com.kasundev.quickstart.services.RedPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(BluePrinter bluePrinter , RedPrinter redPrinter , GreenPrinter greenPrinter){
        this.bluePrinter = bluePrinter;
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
    }
    @Override
    public String print() {
        return redPrinter.print();
    }
}
