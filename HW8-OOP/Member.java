public class Member {
    private String name = "Serhii";
    private String surName;
    private int age;
    private String mail;
    private String pass;
    private String role;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", pass='" + pass + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
    public Member(String name, String surName, int age, String mail, String pass) {
        this.setMail(mail);
        this.setName(name);
        this.setSurName(surName);
        this.setAge(age);
        this.setPass(pass);
    }
    public Member() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
