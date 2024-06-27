package cn.ac.big.bigd.webservice.model.gsa;

public class Submitter {
    private String city;
    private Country country; //foreign key
    private String department;
    private String email;
    private String emailSecondary;
    private String fax;
    private String firstName;
    private String lastName;
    private String middleName;
    private String organization;
    private String phone;
    private String postalCode;
    private String state;
    private String street;
    private String submitOrganizationUrl;
    private int submitterId; //primary key

    public String getCity() {
        return city;
    }
    public Country getCountry() {
        return country;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmail() {
        return email;
    }
    public String getEmailSecondary() {
        return emailSecondary;
    }
    public String getFax() {
        return fax;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public String getOrganization() {
        return organization;
    }
    public String getPhone() {
        return phone;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getState() {
        return state;
    }
    public String getStreet() {
        return street;
    }
    public String getSubmitOrganizationUrl() {
        return submitOrganizationUrl;
    }
    public int getSubmitterId() {
        return submitterId;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEmailSecondary(String emailSecondary) {
        this.emailSecondary = emailSecondary;
    }
    public void setFax(String fax) {
        this.fax = fax;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setSubmitOrganizationUrl(String submitOrganizationUrl) {
        this.submitOrganizationUrl = submitOrganizationUrl;
    }
    public void setSubmitterId(int submitterId) {
        this.submitterId = submitterId;
    }
}
