package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String heardFrom;
    private String contactVia;
    private boolean wantsUpdates;
    private boolean emailOK;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.dateOfBirth = "";
        this.heardFrom = "";
        this.contactVia = "";
        this.wantsUpdates = false;
        this.emailOK = false;
    }

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Getters + Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getHeardFrom() { return heardFrom; }
    public void setHeardFrom(String heardFrom) { this.heardFrom = heardFrom; }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }

    public boolean getWantsUpdates() { return wantsUpdates; }
    public void setWantsUpdates(boolean wantsUpdates) { this.wantsUpdates = wantsUpdates; }

    public boolean getEmailOK() { return emailOK; }
    public void setEmailOK(boolean emailOK) { this.emailOK = emailOK; }
}