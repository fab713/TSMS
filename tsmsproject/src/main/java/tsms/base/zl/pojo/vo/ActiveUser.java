/******************************************
项目名称：tsmsproject
文件：ActiveUser.java
作者：hspcadmin
描述：TODO
创建日期：2017年9月25日 下午3:10:23
*******************************************/
package tsms.base.zl.pojo.vo;

import java.io.Serializable;

/**
 * 用户身份信息，存入session 由于tomcat将session会序列化在本地硬盘上，所以使用Serializable接口
 * @author fab
 *
 */
public class ActiveUser implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userid;// 用户账号

	private String username;// 用户名称
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
