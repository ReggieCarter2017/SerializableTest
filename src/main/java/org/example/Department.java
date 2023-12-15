package org.example;

import java.io.Serializable;
import java.util.function.Function;

public class Department implements Serializable {
    private String name;
    private String specific;
    private String area;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", specific='" + specific + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public Department(String name, String specific, String area) {
        this.name = name;
        this.specific = specific;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
