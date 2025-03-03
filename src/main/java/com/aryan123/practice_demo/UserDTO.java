package com.aryan123.practice_demo;

public class UserDTO {
    private String firstName;
    private String lastName;

    public UserDTO(String firstName,String lastName)
    {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }

}
