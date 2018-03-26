/******************************************
项目名称：tsmsproject
文件：SubmitResultInfo.java
作者：hspcadmin
描述：系统提交结果结果类型
创建日期：2017年6月15日 下午7:48:48
*******************************************/
package tsms.base.zl.process.result;

/**
 * @author fab
 *
 */
public class SubmitResultInfo {
	//操作结果信息
			private ResultInfo resultInfo;
		public SubmitResultInfo(ResultInfo resultInfo){
			this.resultInfo = resultInfo;
		}
		public ResultInfo getResultInfo() {
			return resultInfo;
		}

		public void setResultInfo(ResultInfo resultInfo) {
			this.resultInfo = resultInfo;
		}
}
