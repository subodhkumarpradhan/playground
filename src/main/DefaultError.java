package main;

import java.util.Date;

// Default class
public class DefaultError {

    private Date date;

    private String code;
  
    private String text;

    public DefaultError() {
    }

    public DefaultError(Date date, String code, String text) {
        this.date = date;
        this.codeTYpe = codeTYpe;
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "DefaultError{" +
                "date=" + date +
                ", code=" + codeTYpe +
                ", text='" + text + '\'' +
                '}';
    }
}
