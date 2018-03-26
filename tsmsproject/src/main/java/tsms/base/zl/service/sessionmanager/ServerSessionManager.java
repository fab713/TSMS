/******************************************
项目名称：tsmsproject
文件：ServerSessionManager.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 上午10:41:54
*******************************************/
package tsms.base.zl.service.sessionmanager;



/**
 * @author hspcadmin
 *
 */
public class ServerSessionManager {

	private SessionControl sessionControl;

	public ServerSessionManager(){
		super();
	}

	public SessionControl getSessionControl() {
		return sessionControl;
	}

	public void setSessionControl(SessionControl sessionControl) {
		this.sessionControl = sessionControl;
	}
	
	public void setSession(String pKey,Session pSession){
		Session session = this.sessionControl.getSession(pKey);
		pSession.setLastVisitedTiem(System.currentTimeMillis());
		if(session==null) 
			this.sessionControl.addSession(pKey, pSession);
		else{
			this.sessionControl.setSession(pKey, pSession);
		}
		
	}
	
	public Session getSession(String pKey){
		Session session = this.sessionControl.getSession(pKey);
		if(session!=null)
			session.setLastVisitedTiem(System.currentTimeMillis());
		return session;
	}
	

}
