package edabatch;

public class Contact {

    private String fullName, email;

    private boolean validEmail;

    private long id;

    public Contact(String full_name, String email, long id) {
        this.fullName = full_name;
        this.email = email;
        this.id = id;
    }

    public Contact(boolean validEmail, String full_name, String email, long id) {
        this.fullName = full_name;
        this.validEmail = validEmail;
        this.email = email;
        this.id = id;
    }

    public Contact() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Contact{" + "fullName='" + fullName + '\'' + ", email='" + email
                + '\'' + ", validEmail=" + validEmail + ", id=" + id + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValidEmail() {
        return validEmail;
    }

    public boolean getValidEmail() {
        return validEmail;
    }

    public void setValidEmail(boolean validEmail) {
        this.validEmail = validEmail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
