/******************************************
项目名称：tsmsproject
文件：UserinfoCustom.java
作者：fab
描述：TODO
创建日期：2017年6月17日 上午1:33:57
*******************************************/
package tsms.base.zl.pojo.vo;

import tsms.base.zl.pojo.po.Userinfo;

/**
 * @author fab
 *
 */
public class UserinfoCustom extends Userinfo {
	
	private Long functioninfoid;

    private Long funFunctioninfoid;

    private String functioninfoname;

    private String functioninfodesc;

    private String functioninfourl;

    private Long isdataacess;

    private Long isshortcut;

    private Long ismenuitem;

    private String otherurl;

    private Long ismakerfunc;

    private Long islogfunc;

    private Long isinputrelation;

    public Long getFunctioninfoid() {
        return functioninfoid;
    }

    public void setFunctioninfoid(Long functioninfoid) {
        this.functioninfoid = functioninfoid;
    }

    public Long getFunFunctioninfoid() {
        return funFunctioninfoid;
    }

    public void setFunFunctioninfoid(Long funFunctioninfoid) {
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

    public Long getIsdataacess() {
        return isdataacess;
    }

    public void setIsdataacess(Long isdataacess) {
        this.isdataacess = isdataacess;
    }

    public Long getIsshortcut() {
        return isshortcut;
    }

    public void setIsshortcut(Long isshortcut) {
        this.isshortcut = isshortcut;
    }

    public Long getIsmenuitem() {
        return ismenuitem;
    }

    public void setIsmenuitem(Long ismenuitem) {
        this.ismenuitem = ismenuitem;
    }

    public String getOtherurl() {
        return otherurl;
    }

    public void setOtherurl(String otherurl) {
        this.otherurl = otherurl == null ? null : otherurl.trim();
    }

    public Long getIsmakerfunc() {
        return ismakerfunc;
    }

    public void setIsmakerfunc(Long ismakerfunc) {
        this.ismakerfunc = ismakerfunc;
    }

    public Long getIslogfunc() {
        return islogfunc;
    }

    public void setIslogfunc(Long islogfunc) {
        this.islogfunc = islogfunc;
    }

    public Long getIsinputrelation() {
        return isinputrelation;
    }

    public void setIsinputrelation(Long isinputrelation) {
        this.isinputrelation = isinputrelation;
    }

}
