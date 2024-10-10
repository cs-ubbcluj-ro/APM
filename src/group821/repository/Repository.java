package repository;

import domain.Doctor;
import java.util.ArrayList;

public class Repository {
    private ArrayList<Doctor> doctors = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public ArrayList<Doctor> getAll() {
        return doctors;
    }
}
