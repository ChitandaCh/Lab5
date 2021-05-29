package com.company.Models;

import com.company.Printer;
import com.company.Validator;

import java.time.LocalDateTime;
import java.util.Date;

public class Worker implements Comparable<Worker> {
    private Integer Id;
    private String name;
    private Coordinates coordinates;
    private double salary;
    private Date startDate;
    private Position position;
    private Status status;
    private Organization organization;
    private LocalDateTime creationDate;

    public Worker() {
        setId(ArrayWorker.ids);
        ArrayWorker.ids++;
        creationDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Worker{").append("Id=").append(Id).append(", name='").append(name).append("', coordinates=").append(coordinates.toString()).append(", creationDate=").append(creationDate).append(", salary=").append(salary).append(", startDate=").append(startDate).append(", position=").append(position).append(", status=").append(status).append(", organization=").append(organization.toString()).append('}').toString();
    }

    public Worker(Integer id, String name, Coordinates coordinates, double salary, Date startDate, Position position, Status status, Organization organization) {
        Id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = LocalDateTime.now();
        this.salary = salary;
        this.startDate = startDate;
        this.position = position;
        this.status = status;
        this.organization = organization;
    }

    public Worker(String name) {
        setName(name);
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (Validator.validName(name)) {
            Printer.getInstance().writeLine(" Строка не может быть пустой или null, заменено на Worker по умолчанию ");
            this.name = "Worker";
        }
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        if (Validator.validCoord(coordinates)) {
            Printer.getInstance().writeLine("Ошибка, присваиваем x и y значения по умолчанию");
            coordinates = new Coordinates((float) -683, (long) 0);
        }
        this.coordinates = coordinates;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        if (Validator.validEnum(position)) {
            Printer.getInstance().writeLine("Ошибка, position заменена на COOK");
            position = Position.COOK;
        }
        this.position = position;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        if (Validator.validEnum(status)) {
            Printer.getInstance().writeLine("Ошибка, status заменена на FIELD");
            status = Status.FIELD;
        }
        this.status = status;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public int compareTo(Worker o) {
        return name.compareTo(o.name);
    }

}



