package com.le.hellospring.openai;

import com.theokanning.openai.completion.CompletionChoice;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import java.util.function.Consumer;


@PropertySource("classpath:application.properties")
class OpenAIConfig {
    @Value("${openai.api-key}")
    private String apiKey;

    @PostConstruct
    public void init() {
        OpenAiService service = new OpenAiService(apiKey);
        CompletionRequest completionRequest = CompletionRequest.builder()
                .prompt("Generate 10 quiz questions with abcd answers and the correct answer")
                .model("gpt-3.5-turbo-0301")
                .temperature(0.5)
                .echo(true)
                .build();
        service.createCompletion(completionRequest).getChoices().forEach(OpenAIConfig::addToList);
    }

    private static void addToList(CompletionChoice completionChoice) {
        var res = completionChoice.toString();
    }


}
