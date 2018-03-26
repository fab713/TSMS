package tsms.base.zl.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class Logrec {
    private BigDecimal logid;

    private BigDecimal userid;

    private BigDecimal functioninfoid;

    private Date logtime;

    public BigDecimal getLogid() {
        return logid;
    }

    public void setLogid(BigDecimal logid) {
        this.logid = logid;
    }

    public BigDecimal getUserid() {
        return userid;
    }

    public void setUserid(BigDecimal userid) {
        this.userid = userid;
    }

    public BigDecimal getFunctioninfoid() {
        return functioninfoid;
    }

    public void setFunctioninfoid(BigDecimal functioninfoid) {
        this.functioninfoid = functioninfoid;
    }

    public Date getLogtime() {
        return logtime;
    }

    public void setLogtime(Date logtime) {
        this.logtime = logtime;
    }
}