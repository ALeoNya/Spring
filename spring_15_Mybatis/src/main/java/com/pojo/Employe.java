package com.pojo;

import java.util.List;

public class Employe {
    private String eid;
    private String name;
    private String password;
    private int superuser;
    private int flag;
    private List<Payroll> payrolls;

    public List<Payroll> getPayrolls() {
        return payrolls;
    }

    public void setPayrolls(List<Payroll> payrolls) {
        this.payrolls = payrolls;
    }

    public Employe() {}
    public Employe(String eid, String name, String password, int superuser, int flag) {
        this.eid = eid;
        this.name = name;
        this.password = password;
        this.superuser = superuser;
        this.flag = flag;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSuperuser() {
        return superuser;
    }

    public void setSuperuser(int superuser) {
        this.superuser = superuser;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "employe{" +
                "eid='" + eid + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", superuser=" + superuser +
                ", flag=" + flag +
                '}';
    }

}
