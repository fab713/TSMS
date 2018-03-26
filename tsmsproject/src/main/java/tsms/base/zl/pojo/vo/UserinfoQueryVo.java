/******************************************
项目名称：tsmsproject
文件：UserinfoQueryVo.java
作者：fab
描述：查询条件的封装
创建日期：2017年9月18日 下午9:30:45
*******************************************/
package tsms.base.zl.pojo.vo;

/**
 * @author fab
 *
 */
public class UserinfoQueryVo {
	//查询列表分页参数
	private PageQuery pageQuery;
	//用户的查询条件
	private UserinfoCustom  userinfoCustom;
	
	//可以扩展多个属性

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public UserinfoCustom getUserinfoCustom() {
		return userinfoCustom;
	}

	public void setUserinfoCustom(UserinfoCustom userinfoCustom) {
		this.userinfoCustom = userinfoCustom;
	}
	
	
	
	

}
