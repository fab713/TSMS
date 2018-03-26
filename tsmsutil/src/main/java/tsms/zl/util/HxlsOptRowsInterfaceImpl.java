/******************************************
项目名称：tsmsutil
文件：HxlsOptRowsInterfaceImpl.java
作者：hspcadmin
描述：测试导入数据接口
创建日期：2017年6月9日 上午12:12:38
*******************************************/
package tsms.zl.util;

import java.util.List;

/**
 * @author hspcadmin
 *
 */
public class HxlsOptRowsInterfaceImpl implements HxlsOptRowsInterface {
	@Override
	public String optRows(int sheetIndex, int curRow, List<String> rowlist)
			throws Exception {
		//插入数据库
		System.out.println("sheetIndex="+sheetIndex+"curRow="+curRow+rowlist);
		return null;
	}
}
