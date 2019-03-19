package com.sewichi.dev;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorldHandler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String s, Context context) {
        return String.format("Hello, %s!", s);
    }
}
