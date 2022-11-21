package org.example.model;

import org.example.Positions;
import org.example.Program;
import org.example.Staff;

public class TopEmployees extends Staff implements Program {
    public TopEmployees(String name, int age,
                        int workExperience,
                        Positions employee) {
        super();
    }

    @Override
    public void assesToProgram() {

    }

    public static void main(String[] args) {
        TopEmployees elenaBelova = new TopEmployees("Лена Белова",
                              42, 5, Positions.MANAGER);
    }
}
