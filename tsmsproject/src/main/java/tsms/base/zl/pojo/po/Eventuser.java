package tsms.base.zl.pojo.po;

import java.math.BigDecimal;

public class Eventuser {
    private BigDecimal eventuserid;

    private BigDecimal userid;

    private BigDecimal eventid;

    public BigDecimal getEventuserid() {
        return eventuserid;
    }

    public void setEventuserid(BigDecimal eventuserid) {
        this.eventuserid = eventuserid;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getEventid() {
        return eventid;
    }

    public void setEventid(BigDecimal eventid) {
        this.eventid = eventid;
    }
}