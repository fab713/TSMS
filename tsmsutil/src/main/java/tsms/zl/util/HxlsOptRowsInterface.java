/******************************************
项目名称：tsmsutil
文件：HxlsOptRowsInterface.java
作者：hspcadmin
描述：TODO
创建日期：2017年6月9日 上午12:11:35
*******************************************/
package tsms.zl.util;

import java.util.List;

/**
 * @author hspcadmin
 *
 */
public interface HxlsOptRowsInterface {
	public static final String SUCCESS="success";
	/**
	 * 处理excel文件每行数据方法
	 * @param sheetIndex 为sheet的序号
	 * @param curRow	为行号
	 * @param rowlist   行数据
	 * @return success：成功，否则为失败原因
	 * @throws Exception
	 */
	public String optRows(int sheetIndex,int curRow, List<String> rowlist) throws Exception;
}
