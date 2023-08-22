package main;

import java.util.Date;

public class DefaultError {

    private Date date;
    private Long code;
    private String text;

    public DefaultError() {
    }

    public DefaultError(Date date, Long code, String text) {
        this.date = date;
        this.code = code;
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
