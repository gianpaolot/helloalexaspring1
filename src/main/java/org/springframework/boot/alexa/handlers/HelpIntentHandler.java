package org.springframework.boot.alexa.handlers;

import static com.amazon.ask.request.Predicates.intentName;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
@Component
public class HelpIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.HelpIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "You can say hello to me!";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("HelloWorld", speechText)
				.withReprompt(speechText).build();
	}
}
