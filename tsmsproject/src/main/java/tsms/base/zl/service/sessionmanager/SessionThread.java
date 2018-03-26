/******************************************
项目名称：tsmsproject
文件：SessionThread.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月16日 上午10:40:29
*******************************************/
package tsms.base.zl.service.sessionmanager;

import java.util.Enumeration;
import java.util.Hashtable;




/**
 * 这是控制session对象列表的线程，主要包括察看当前线程的状态、用一指定的轮巡时间扫描
 * session对象列表中各session是否超时，并进行相应的处理。
 */
public class SessionThread implements Runnable {
	//相关属性
	private SessionControl sessionControl;	
	private int loopInterval = 12;//线程的轮巡时间	
	private short state;//线程状态标志

	/**
	 * @param loopIntvl
	 * @roseuid 3ED6C19F030B
	 */
	public SessionThread(SessionControl sessionControl, int loopIntvl) {
		this.sessionControl = sessionControl;
		loopInterval = loopIntvl;
	}

	/**
	 * 获得该线程的当前状态:
	 * 0 - 停止
	 * 1 - 运行
	 * @return 
	 */
	public short getState() {
		return state;
	}

	/**
	 * 获得该线程的轮巡时间。
	 * @return 
	 */
	public int getLoopInterval() {
		return loopInterval;
	}

	/**
	 * 判断是否有session超时。将Session对象从SessionList中删除，如果SessionList已经为空
	 * ，则停止该线程的运行。
	 * @roseuid 3EE94C85035E
	 */
	public void run() {		
		Session t_session = null;//临时对象		
		state = 0 ; //初始状态为停止
		Hashtable ht = sessionControl.getSessionList();
		//扫描sessionList，判断是否有session超时
		while (sessionControl.getSessionList().size() > 0) {
			//若sessionList中还有session， 其状态始终为运行状态
			state = 1;
			for (Enumeration e = ht.elements(); e.hasMoreElements();) {
				t_session = (Session) (e.nextElement());
				//判断当前已空闲的时间是否已超过最大空闲时间（以秒为单位），若已超时则将该session对象删除
				if (t_session.getIdleTime() > sessionControl.getMaxSessionIdlePeriod()) {
					ht.remove(t_session.getSessionId());
				}
			}
			//线程等待一段时间后再扫描
			try {
				Thread.sleep(loopInterval * 1000);
			} catch (Exception e) {
				//log
			}
		}
		//重置状态
		state = 0;
	}
}
