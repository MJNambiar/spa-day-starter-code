package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotEmpty(message = "Must enter a username.")
    @Size(min=5, max=15, message = "Username must have between 5 and 15 characters.")
    private String username;

    @Email(message = "Please enter email using example@example.com format.")
    private String email;

    @NotEmpty(message = "Must enter a password.")
    @Size(min=6, message = "Password must have at least 6 characters.")
    private String password;

//    @NotBlank(message="Must enter a password verification.")
    private String verify;

//    @NotNull(message="Passwords do not match.")
//    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verify = verify;
//        this.verifyPassword = verifyPassword;
    }

    private void checkPassword() {
        if(!password.equals(verify) || password.equals(null) || verify.equals(null)){
            verify = null;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        checkPassword();
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

//    public String getVerifyPassword() {
//        return verifyPassword;
//    }
//
//    public void setVerifyPassword(String verifyPassword) {
//        this.verifyPassword = verifyPassword;
//        checkPassword();
//    }
}

