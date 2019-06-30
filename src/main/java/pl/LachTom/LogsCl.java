package pl.LachTom;

import java.time.LocalDate;
import java.time.LocalTime;

public class LogsCl implements Comparable<LogsCl> {

    private LocalDate date;
    private LocalTime time;
    private String typeOfError;
    private String text;

    public LogsCl(LocalDate date, LocalTime time, String typeOfError, String text) {
        this.date = date;
        this.time = time;
        this.typeOfError = typeOfError;
        this.text = text;
    }

    public LogsCl() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getTypeOfError() {
        return typeOfError;
    }

    public void setTypeOfError(String typeOfError) {
        this.typeOfError = typeOfError;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "LogsCl{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", typeOfError='" + typeOfError + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public int compareTo(LogsCl o) {
        return this.date.compareTo(o.date);
    }


}


