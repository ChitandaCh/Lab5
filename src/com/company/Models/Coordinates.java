package com.company.Models;

import com.company.Printer;
import com.company.Validator;

public class Coordinates{
    private Float x;
    private Long y;

    public Coordinates(Float x, Long y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        if (Validator.validFloat(x)) {
            Printer.getInstance().writeLine("Ошибка, x заменена на 0");
            x=(float)0;
        }
        this.x = x;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Coordinates{").append("x=").append(x).append(", y=").append(y).append('}').toString();
    }

    public Long getY() {
        return y;
    }

    public void setY(Long y) {
        if (Validator.validLong(y)) {
            Printer.getInstance().writeLine("Ошибка, y заменена на 0");
            y=(long)0;
        }
        this.y = y;
    }

    public Coordinates() {
        setY(0l);
        setX(-683f);
    }


}
