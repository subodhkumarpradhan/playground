package main;

import java.util.Date;

public class DefaultError {

    private Date date;
    private Long codeTYpe;
    private String text;

    public DefaultError() {
    }

    public DefaultError(Date date, Long codeTYpe, String text) {
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

    public Long getCodeType() {
        return codeTYpe;
    }

    public void setCodeType(Long codeTYpe) {
        this.codeTYpe = codeTYpe;
    }

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
