package com.pojo;

public class Profession {
    private String jid;
    private String jname;
    private String lname;
    private int flag;
    private Profession profession;

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public Profession() {}
    public Profession(String jid, String jname, String lname, int flag, Profession profession) {
        this.jid = jid;
        this.jname = jname;
        this.lname = lname;
        this.flag = flag;
        this.profession = profession;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getJname() {
        return jname;
    }

    public void setJname(String jname) {
        this.jname = jname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "Profession{" +
                "jid='" + jid + '\'' +
                ", jname='" + jname + '\'' +
                ", lname='" + lname + '\'' +
                ", flag=" + flag +
                ", profession=" + profession +
                '}';
    }
}
