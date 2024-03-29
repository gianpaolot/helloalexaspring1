package org.springframework.boot.alexa.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

@Component
public class StopIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.StopIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		return input.getResponseBuilder().withSpeech("Goodbye").withSimpleCard("HelloWorld", "Goodbye").build();
	}
}
