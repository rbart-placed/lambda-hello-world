package com.sewichi.dev;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Random;

public class HelloWorldHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
		try {
			Random random = new Random();
			int randomSleepMs = random.nextInt((60000 - 5000) + 1) + 5000;
			Thread.sleep(randomSleepMs);
			return String.format("Hello, %s!", s);
		} catch (InterruptedException e) {
			return "InterruptedException " + e.getMessage();
		}
	}
}
