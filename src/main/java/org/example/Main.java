package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
       Healthplan healthplan = new Healthplan(1, "Mehmet", Plan.BASIC);
       System.out.println(healthplan);
       Company company = new Company(2, "Workintech", 300000, new String[] {"Ahmet", "Mehmet"});
       Employee employee = new Employee(4, "Mahmut", "mahmut@gmail.com", "123456",
               new String[] {"basic"});
    }
}