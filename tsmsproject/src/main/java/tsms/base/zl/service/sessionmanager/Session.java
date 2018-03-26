/******************************************
项目名称：tsmsproject
文件：Session.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 上午10:38:32
*******************************************/
package tsms.base.zl.service.sessionmanager;

import java.io.Serializable;
import java.rmi.dgc.VMID;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author hspcadmin
 *
 */
public class Session implements Serializable {
private static final long serialVersionUID = 3803704538713953120L;

	
	//用于生成SESSIONID

	private String sessionID;
	private Hashtable sessionObjs = null;
	private long createTime;
	private long lastVisitedTime;

	//private static Logger logger = null;


	/**
	 * 生成sessionID。
	 * @roseuid 3ECAE27500C1
	 */
	public Session(){
		//产生一个唯一的SessionID
		sessionID = getNewSessionID();
		sessionObjs = new Hashtable();
		createTime = System.currentTimeMillis();
		lastVisitedTime = System.currentTimeMillis();
	}
  /**
   * 生成sessionID。
   * @roseuid 3ECAE27500C1
   */
	public Session(String exteriorSessionID){
		//产生一个唯一的SessionID
		sessionID = exteriorSessionID;
		sessionObjs = new Hashtable();
		createTime = System.currentTimeMillis();
		lastVisitedTime = System.currentTimeMillis();
	}

	/**
	 * 得到SessionID
	 * @return long
	 * @roseuid 3EC462A1015D
	 */
	public String getSessionId() {
		return sessionID;
	}

  /**
	 * 将各种信息存放到SessionObjs中，目前主要是存放用户信息即UserInfo。
	 * @param pKey   目前为sessionID
	 * @param obj
	 */
	public void addSessionObj(Object pKey, Object obj) {
		if (!sessionObjs.contains(obj))
			sessionObjs.put(pKey, obj);
	}

	/**
	 * 从SessionObjs中取得相应的对象信息
	 * @param pKey
	 * @return
	 */
	public Object getSessionObj(String pKey) {
		Object obj = null;
		for (Enumeration e = sessionObjs.keys(); e.hasMoreElements();)
			if ((e.nextElement()).equals(pKey)) {
				obj = sessionObjs.get(pKey);
				break;
			}
		return obj;
	}
     
	public void setSessionObj(Object pKey,Object obj){
		for (Enumeration e = sessionObjs.keys(); e.hasMoreElements();){
			if ((e.nextElement()).equals(pKey)) {
				sessionObjs.put(pKey, obj);
				break;
			}
		}

	}
	
	/**
	 * 从SessionObjs中删除一个对象信息
	 * @param pKey
	 */
	public void removeSessionObj(Object pKey) {
		sessionObjs.remove(pKey);
	}

	/**
	 * 得到Session的创建时间
	 * @return long
	 * @roseuid 3ED6BE0E0091
	 */
	public long getCreateTime() {
		return createTime;
	}
	
	

	/**
	 * 获得最近访问session的时间
	 * @return long
	 * @roseuid 3ED6BE2F0310
	 */
	public long getLastVisitedTime() {
		return lastVisitedTime;
	}

	/**
	 * 设置最近访问session的时间
	 * @param plastVisitedTime
	 * @roseuid 3ED6BE4C016D
	 */
	public void setLastVisitedTiem(long plastVisitedTime) {
		lastVisitedTime = plastVisitedTime;
	}

	/**
	 * 获得已经空闲的时间（以秒为单位）
	 */
	public long getIdleTime() {
		return ((System.currentTimeMillis() - lastVisitedTime) / 1000);
	}

	/**
	 * 获得新的sessionID
	 */
	public static String getNewSessionID() {
		String sessionID = (new VMID()).toString();
		return sessionID;
	}
}
