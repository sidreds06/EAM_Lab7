package com.va.week7;

public class Student {
    private String studentID;
    private String fname;
    private String lname;
    private String phone;
    private String dob;
    private Address address;

    public Student(String studentID, String fname, String lname, String phone, String dob, Address address) {
        this.studentID = studentID;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.dob = dob;
        this.address = address;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return fname + " " + lname;
    }

    public static class Address {
        private String street;
        private String no;
        private String city;

        public Address(String street, String no, String city) {
            this.street = street;
            this.no = no;
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }
}
