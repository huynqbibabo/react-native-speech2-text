package com.speech2text.speech_service;

public class SpeechEvent {

    private String text;
    private boolean isFinal;

    public SpeechEvent(String text, boolean isFinal) {
        this.text = text;
        this.isFinal = isFinal;
    }

    public String getText() {
        return text;
    }

    public boolean isFinal() {
        return isFinal;
    }
}
