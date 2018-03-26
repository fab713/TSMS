package tsms.base.zl.pojo.po;

import java.math.BigDecimal;

public class Parameter {
    private BigDecimal parameterid;

    private String parametertype;

    private String parametercode;

    private String parameterdesc;

    private String parametervalue;

    private String parameterdefault;

    public BigDecimal getParameterid() {
        return parameterid;
    }

    public void setParameterid(BigDecimal parameterid) {
        this.parameterid = parameterid;
    }

    public String getParametertype() {
        return parametertype;
    }

    public void setParametertype(String parametertype) {
        this.parametertype = parametertype == null ? null : parametertype.trim();
    }

    public String getParametercode() {
        return parametercode;
    }

    public void setParametercode(String parametercode) {
        this.parametercode = parametercode == null ? null : parametercode.trim();
    }

    public String getParameterdesc() {
        return parameterdesc;
    }

    public void setParameterdesc(String parameterdesc) {
        this.parameterdesc = parameterdesc == null ? null : parameterdesc.trim();
    }

    public String getParametervalue() {
        return parametervalue;
    }

    public void setParametervalue(String parametervalue) {
        this.parametervalue = parametervalue == null ? null : parametervalue.trim();
    }

    public String getParameterdefault() {
        return parameterdefault;
    }

    public void setParameterdefault(String parameterdefault) {
        this.parameterdefault = parameterdefault == null ? null : parameterdefault.trim();
    }
}