package com.amazon.ata.designcomposition;

public class ReadOnlyAlexaQAClient {
    private final AlexaQAClient alexaQAClient;

    public ReadOnlyAlexaQAClient(AlexaQAClient alexaQAClient) {
        this.alexaQAClient = alexaQAClient;
    }

    // Example read methods (assuming these exist in AlexaQAClient)
    public AlexaAnswer getAnswerForQuestion(AlexaQuestion question) {
        return alexaQAClient.getAnswerForQuestion(question);
    }

    public List<AlexaQuestion> getAllQuestions() {
        return alexaQAClient.getAllQuestions();
    }

}
