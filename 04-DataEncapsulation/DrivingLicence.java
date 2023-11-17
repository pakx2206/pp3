public class DrivingLicence {
    private String name;
    private String surname;
    private String address;
    private String postalCode;
    private String city;
    private int drivingLicenceNumber;
    private int yearOfIssue;
    private String drivingLicenceCategory;
    
    public String display(){
        return String.format("Name: %s\nSurname: %s\nAddress: %s\nPostal Code: %s\nCity: %s\n,Driving Licence Number: %s\nYear of issue: %s\nDriving licence category: %s \n................\n",name,surname,address,postalCode,city,drivingLicenceNumber,yearOfIssue,drivingLicenceCategory);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public int getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getDrivingLicenceCategory() {
        return drivingLicenceCategory;
    }

    public void setName(String name) {
        
        String s1 = "";
        String s2 = "";
        s1 += name.charAt(0);
        s2 = name.substring(1);
        
        this.name = String.join("",s1.toUpperCase(),s2.toLowerCase());
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDrivingLicenceNumber(int drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public void setYearOfIssue(int yearOfIssue) {
        
        if(yearOfIssue>1980 || yearOfIssue<2023){
            this.yearOfIssue = yearOfIssue;
        }
        else{
            System.out.println("WRONG DATE!");
        }
    }

    public void setDrivingLicenceCategory(String drivingLicenceCategory) {
        this.drivingLicenceCategory = drivingLicenceCategory;
    }
    
    
}
