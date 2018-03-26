package tsms.base.zl.pojo.po;

import java.math.BigDecimal;

public class Tevent {
    private BigDecimal eventid;

    private BigDecimal eventaddr;

    private String eventname;

    private String eventtype;

    private String alarmneeded;

    private String eventdesc;

    private String emaillist;

    public BigDecimal getEventid() {
        return eventid;
    }

    public void setEventid(BigDecimal eventid) {
        this.eventid = eventid;
    }

    public BigDecimal getEventaddr() {
        return eventaddr;
    }

    public void setEventaddr(BigDecimal eventaddr) {
        this.eventaddr = eventaddr;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname == null ? null : eventname.trim();
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype == null ? null : eventtype.trim();
    }

    public String getAlarmneeded() {
        return alarmneeded;
    }

    public void setAlarmneeded(String alarmneeded) {
        this.alarmneeded = alarmneeded == null ? null : alarmneeded.trim();
    }

    public String getEventdesc() {
        return eventdesc;
    }

    public void setEventdesc(String eventdesc) {
        this.eventdesc = eventdesc == null ? null : eventdesc.trim();
    }

    public String getEmaillist() {
        return emaillist;
    }

    public void setEmaillist(String emaillist) {
        this.emaillist = emaillist == null ? null : emaillist.trim();
    }
}