package com.pojo;

public class Payroll {
    private String eid;
    private String jid;
    private  int salary;
    private Employe employe;

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Payroll() {}
    public Payroll(String eid,String jid,int salary) {
        this.eid = eid;
        this.jid = jid;
        this.salary = salary;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Payroll{" +
                "eid='" + eid + '\'' +
                ", jid='" + jid + '\'' +
                ", salary=" + salary +
                '}';
    }
}
