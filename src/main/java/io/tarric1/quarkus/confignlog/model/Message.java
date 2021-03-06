package io.tarric1.quarkus.confignlog.model;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = -6450653650283387735L;

    private String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}