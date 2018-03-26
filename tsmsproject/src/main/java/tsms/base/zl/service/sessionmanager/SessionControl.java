/******************************************
项目名称：tsmsproject
文件：SessionControl.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 上午10:39:36
*******************************************/
package tsms.base.zl.service.sessionmanager;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;



/**
 * @author hspcadmin
 *
 */
public class SessionControl {
	/**
	 * session对象列表。
	 */
	private Hashtable sessionList;

	/**
	 * 最大session允许空闲时间（单位秒）
	 */
	private int maxSessionIdlePeriod;

	/**
	 * session检查线程轮循事件间隔（单位秒）
	 */
	private int sessionThreadInterval;

	/**
	 * 主要用于控制整个session对象列表的线程
	 */
	private SessionThread sessionThread;

	/**
	 * 构造函数
	 * @param idlePeriod session运讯的空闲时间，单位秒
	 */
	protected SessionControl(int maxSessionIdlePeriod, int sessionThreadInterval) throws Exception {
		if (sessionList == null) {
			sessionList = new Hashtable();
		}
		this.maxSessionIdlePeriod = maxSessionIdlePeriod;
		this.sessionThreadInterval = sessionThreadInterval;
	}

	/**
	 * 增加一个session对象，执行完成后调用StartThread，启动线程。
	 * @param pSession
	 */
	public void addSession(Object pKey, Object pSession) {
		sessionList.put(pKey, pSession);
		startThread();
	}

	/**
	 * 从sessionObjs中删除一个session对象
	 * @roseuid 3ED6B3A9023A
	 */
	public int removeSession(Object pKey) throws Exception {
		Object obj = sessionList.remove(pKey);
		if (obj == null) {
			return -1;//删除失败
		}
		return 1;//删除成功
	}

	/**
	 * 得到一个session对象
	 * @return Session
	 * @roseuid 3ED6B3B90020
	 */
	public Session getSession(String pKey) {
		return (Session) sessionList.get(pKey);
	}
/**
 * 设置pkey的Session对象
 * @param pKey
 * @param pSession
 */
	public void setSession(Object pKey,Object pSession) {
		try {
			if(removeSession(pKey)==1){
				addSession(pKey,pSession);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 获得系统中所有的SESSION对象
	 * @return
	 */
	public Vector getAllSession() {
		Enumeration enumeration = sessionList.elements();
		Vector vec = new Vector();

		//装入值
		while (enumeration.hasMoreElements()) {
			vec.add(enumeration.nextElement());
		}
		return vec;
	}

	/**
	 * 判断一下线程有没有启动，若没有则启动线程。
	 * @roseuid 3ED6BF45023D
	 */
	private void startThread() {

		//判断线程是否启动或空，若没有则启动线程
		if (sessionThread == null || sessionThread.getState() == 0) {
			sessionThread = new SessionThread(this, sessionThreadInterval);
			Thread thread = new Thread(sessionThread);
			thread.start();
		}
	}

	public int getMaxSessionIdlePeriod() {
		return maxSessionIdlePeriod;
	}

	public void setMaxSessionIdlePeriod(int maxSessionIdlePeriod) {
		this.maxSessionIdlePeriod = maxSessionIdlePeriod;
	}

	public Hashtable getSessionList() {
		return sessionList;
	}

	public void setSessionList(Hashtable sessionList) {
		this.sessionList = sessionList;
	}

	public SessionThread getSessionThread() {
		return sessionThread;
	}

	public void setSessionThread(SessionThread sessionThread) {
		this.sessionThread = sessionThread;
	}

	public int getSessionThreadInterval() {
		return sessionThreadInterval;
	}

	public void setSessionThreadInterval(int sessionThreadInterval) {
		this.sessionThreadInterval = sessionThreadInterval;
	}
}
