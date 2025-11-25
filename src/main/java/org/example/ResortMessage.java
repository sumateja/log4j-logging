package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class ResortMessage {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    @JsonProperty("messageId")
    String messageId;

    @JsonProperty("resortName")
    String resortName;

    @JsonProperty("resortTitle")
    String resortTitle;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getResortName() {
        return resortName;
    }

    public void setResortName(String resortName) {
        this.resortName = resortName;
    }

    public String getResortTitle() {
        return resortTitle;
    }

    public void setResortTitle(String resortTitle) {
        this.resortTitle = resortTitle;
    }

    @Override
    public String toString() {
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
