package service;

import domain.Doctor;
import repository.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Service {
    private Repository repo;

    public Service(Repository repo) {
        this.repo = repo;
    }

    public void addDoctor(int id, String name, String specialty, double grade)
    {
        Doctor d = new Doctor(id, name, specialty, grade);
        repo.addDoctor(d);
    }

    public ArrayList<Doctor> getAll() {
        ArrayList<Doctor> doctors = repo.getAll();
        Collections.sort(doctors);
//        doctors.sort(new Comparator<Doctor>() {
//            @Override
//            public int compare(Doctor o1, Doctor o2) {
//                if (o1.getName().compareTo(o2.getName()) < 0)
//                    return -1;
//                else if (o1.getName().compareTo(o2.getName()) > 0)
//                    return 1;
//                return 0;
//            }
//        });
        return doctors;
    }
}