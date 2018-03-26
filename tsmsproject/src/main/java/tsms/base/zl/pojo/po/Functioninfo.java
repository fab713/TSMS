package tsms.base.zl.pojo.po;

import java.math.BigDecimal;

public class Functioninfo {
    private BigDecimal functioninfoid;

    private BigDecimal funFunctioninfoid;

    private String functioninfoname;

    private String functioninfodesc;

    private String functioninfourl;

    private String isdataacess;

    private String isshortcut;

    private String ismenuitem;

    private String otherurl;

    private String ismakerfunc;

    private String islogfunc;

    private String isinputrelation;

    public BigDecimal getFunctioninfoid() {
        return functioninfoid;
    }

    public void setFunctioninfoid(BigDecimal functioninfoid) {
        this.functioninfoid = functioninfoid;
    }

    public BigDecimal getFunFunctioninfoid() {
        return funFunctioninfoid;
    }

    public void setFunFunctioninfoid(BigDecimal funFunctioninfoid) {
        this.funFunctioninfoid = funFunctioninfoid;
    }

    public String getFunctioninfoname() {
        return functioninfoname;
    }

    public void setFunctioninfoname(String functioninfoname) {
        this.functioninfoname = functioninfoname == null ? null : functioninfoname.trim();
    }

    public String getFunctioninfodesc() {
        return functioninfodesc;
    }

    public void setFunctioninfodesc(String functioninfodesc) {
        this.functioninfodesc = functioninfodesc == null ? null : functioninfodesc.trim();
    }

    public String getFunctioninfourl() {
        return functioninfourl;
    }

    public void setFunctioninfourl(String functioninfourl) {
        this.functioninfourl = functioninfourl == null ? null : functioninfourl.trim();
    }

    public String getIsdataacess() {
        return isdataacess;
    }

    public void setIsdataacess(String isdataacess) {
        this.isdataacess = isdataacess == null ? null : isdataacess.trim();
    }

    public String getIsshortcut() {
        return isshortcut;
    }

    public void setIsshortcut(String isshortcut) {
        this.isshortcut = isshortcut == null ? null : isshortcut.trim();
    }

    public String getIsmenuitem() {
        return ismenuitem;
    }

    public void setIsmenuitem(String ismenuitem) {
        this.ismenuitem = ismenuitem == null ? null : ismenuitem.trim();
    }

    public String getOtherurl() {
        return otherurl;
    }

    public void setOtherurl(String otherurl) {
        this.otherurl = otherurl == null ? null : otherurl.trim();
    }

    public String getIsmakerfunc() {
        return ismakerfunc;
    }

    public void setIsmakerfunc(String ismakerfunc) {
        this.ismakerfunc = ismakerfunc == null ? null : ismakerfunc.trim();
    }

    public String getIslogfunc() {
        return islogfunc;
    }

    public void setIslogfunc(String islogfunc) {
        this.islogfunc = islogfunc == null ? null : islogfunc.trim();
    }

    public String getIsinputrelation() {
        return isinputrelation;
    }

    public void setIsinputrelation(String isinputrelation) {
        this.isinputrelation = isinputrelation == null ? null : isinputrelation.trim();
    }
}