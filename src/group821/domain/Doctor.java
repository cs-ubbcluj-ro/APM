package domain;

import java.util.Objects;

public class Doctor implements Identifiable, Comparable<Doctor> {
    private int id;
    private String name, speciality;
    private double grade;

    public Doctor(int id, String name, String speciality, double grade) {
        // super(id);
        this.name = name;
        this.speciality = speciality;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + speciality + " " + grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(name, doctor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speciality, grade);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Doctor o) {
        if (this.name.compareTo(o.getName()) < 0)
            return -1;
        else if (this.name.compareTo(o.getName()) > 0)
            return 1;
        return 0;
    }
}
