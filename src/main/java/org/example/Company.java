package org.example;

import java.util.Arrays;

public class Company {
   private int id;
   private String name;
   private double giro;
   private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        if(giro < 0) {
            throw new IllegalArgumentException("Giro değeri negatif olamaz.");
        }
        this.giro = giro;
        this.developerNames = developerNames;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        if(index < 0 || index > developerNames.length) {
            System.out.println("Geçersiz indeks: " + index);
            return;
        }

        if(developerNames[index] == null){
            developerNames[index] = name;
            System.out.println("İşçi eklendi: " + name + " " + index);
        } else {
            System.out.println("İndeks dolu. " + developerNames[index] );
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}

