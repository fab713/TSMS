package tsms.base.zl.pojo.po;

import java.math.BigDecimal;

public class Role {
    private BigDecimal roleid;

    private String rolename;

    private String roledesc;

    private String ismakerrole;

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledesc() {
        return roledesc;
    }

    public void setRoledesc(String roledesc) {
        this.roledesc = roledesc == null ? null : roledesc.trim();
    }

    public String getIsmakerrole() {
        return ismakerrole;
    }

    public void setIsmakerrole(String ismakerrole) {
        this.ismakerrole = ismakerrole == null ? null : ismakerrole.trim();
    }
}