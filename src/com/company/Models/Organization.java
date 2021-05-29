package com.company.Models;

import com.company.Printer;
import com.company.Validator;

public class Organization {
    private String fullName;
    private int annualTurnover;
    private int employeesCount;

    public Organization(String fullName, int annualTurnover, int employeesCount) {
        this.fullName = fullName;
        this.annualTurnover = annualTurnover;
        this.employeesCount = employeesCount;
    }

    public Organization() {
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Organization{").append("fullName='").append(fullName).append('\'').append(", annualTurnover=").append(annualTurnover).append(", employeesCount=").append(employeesCount).append('}').toString();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (Validator.validName(fullName)) {
            Printer.getInstance().writeLine("Ошибка, fullName заменено на fullName");
            fullName="fullName";
        }
        this.fullName = fullName;
    }

    public int getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(int annualTurnover) {
        if (Validator.validInt(annualTurnover)) {
            Printer.getInstance().writeLine("Ошибка, annualTurnover заменен на 0");
            annualTurnover=0;
        }
        this.annualTurnover = annualTurnover;
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public void setEmployeesCount(int employeesCount) {
        if (Validator.validInt(employeesCount)) {
            Printer.getInstance().writeLine("Ошибка, employeesCount заменен на 0");
            employeesCount=0;
        }
        this.employeesCount = employeesCount;
    }
}
