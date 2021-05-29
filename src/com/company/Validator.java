package com.company;

import com.company.Models.Coordinates;

public interface Validator {
    static boolean validName(String name) {
        return name == null || name.replace(" ", "").equals("");
    }

    static boolean validEnum(Enum status) {
        return status == null;
    }

    static boolean validInt(Integer intV) {
        return intV < 0;
    }

    static boolean validLong(Long coord) {
        return coord == null;
    }

    static boolean validFloat(Float coord) {
        return coord < -683;
    }

    static boolean validCoord(Coordinates coord) {
        return coord == null;
    }
}
