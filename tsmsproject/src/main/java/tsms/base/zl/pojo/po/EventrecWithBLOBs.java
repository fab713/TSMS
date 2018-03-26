package tsms.base.zl.pojo.po;

public class EventrecWithBLOBs extends Eventrec {
    private String eventrecemaillist;

    private String senddesc;

    public String getEventrecemaillist() {
        return eventrecemaillist;
    }

    public void setEventrecemaillist(String eventrecemaillist) {
        this.eventrecemaillist = eventrecemaillist == null ? null : eventrecemaillist.trim();
    }

    public String getSenddesc() {
        return senddesc;
    }

    public void setSenddesc(String senddesc) {
        this.senddesc = senddesc == null ? null : senddesc.trim();
    }
}