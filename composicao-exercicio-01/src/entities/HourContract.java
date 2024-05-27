package entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private int hours;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public Double totalValue() {
        return valuePerHour * hours;
    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
