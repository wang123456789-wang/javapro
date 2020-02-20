package com.neuedu.poji;

public class dept {
    private Integer Cno;
    private String Cname;
    private Integer Period;
    private Integer Ceredit;

    @Override
    public String toString() {
        return "dept{" +
                "Cno=" + Cno +
                ", Cname='" + Cname + '\'' +
                ", Period=" + Period +
                ", Ceredit=" + Ceredit +
                '}';
    }

    public Integer getCno() {
        return Cno;
    }

    public void setCno(Integer cno) {
        Cno = cno;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String cname) {
        Cname = cname;
    }

    public Integer getPeriod() {
        return Period;
    }

    public void setPeriod(Integer period) {
        Period = period;
    }

    public Integer getCeredit() {
        return Ceredit;
    }

    public void setCeredit(Integer ceredit) {
        Ceredit = ceredit;
    }
}
