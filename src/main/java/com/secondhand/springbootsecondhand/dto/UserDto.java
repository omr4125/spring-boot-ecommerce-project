package com.secondhand.springbootsecondhand.dto;


import java.util.List;

public class UserDto {

    private String email;
    private String firstName;
    private String lastName;
    private boolean isActive;

    private List<UserAddressDto> userAddressDtoList;

    public UserDto() {}

    public UserDto(String email, String firstName, String lastName, boolean isActive) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
    }

    public UserDto(String email, String firstName, String lastName, boolean isActive, List<UserAddressDto> userAddressDtoList) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.userAddressDtoList = userAddressDtoList;
    }
    //for testing --> TestSupport class
    public UserDto(String mail, String firstName, String lastName) {
        this.email = mail;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<UserAddressDto> getUserAddressDtoList() {
        return userAddressDtoList;
    }

    public void setUserAddressDtoList(List<UserAddressDto> userAddressDtoList) {
        this.userAddressDtoList = userAddressDtoList;
    }
}
