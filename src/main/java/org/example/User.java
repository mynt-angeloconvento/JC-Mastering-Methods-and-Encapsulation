package org.example;

public class User {
    private String password;

    public User(String password) {
        this.password = password;
    }

    public void getPassword() {
        System.out.print("Current masked password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            System.out.println("Attempting to set short password '" + password + "'...");
            System.out.println("Error: Password must be at least 8 characters long.");
        } else {
            System.out.println("Attempting to set valid password '" + password + "'...");
            this.password = password;
        }
    }
}
