package com.kasundev.quickstart;

import com.kasundev.quickstart.services.ColourPrinter;
import com.kasundev.quickstart.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class QuickstartApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public QuickstartApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}

	// 42
	public static void main(String[] args) {
		SpringApplication.run(QuickstartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(colourPrinter.print());
		log.info(colourPrinter.print());
	}
}
