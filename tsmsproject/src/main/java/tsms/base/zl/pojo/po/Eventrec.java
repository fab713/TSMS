package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class Eventrec {
    private BigDecimal eventrecid;

    private BigDecimal eventid;

    private Date eventtime;

    private Date sendtime;

    private BigDecimal sendstate;

    public BigDecimal getEventrecid() {
        return eventrecid;
    }

    public void setEventrecid(BigDecimal eventrecid) {
        this.eventrecid = eventrecid;
    }

    public BigDecimal getEventid() {
        return eventid;
    }

    public void setEventid(BigDecimal eventid) {
        this.eventid = eventid;
    }

    public Date getEventtime() {
        return eventtime;
    }

    public void setEventtime(Date eventtime) {
        this.eventtime = eventtime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public BigDecimal getSendstate() {
        return sendstate;
    }

    public void setSendstate(BigDecimal sendstate) {
        this.sendstate = sendstate;
    }
}