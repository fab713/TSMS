/******************************************
项目名称：tsmsproject
文件：UserinfoMapperCustom.java
作者：fab
描述：扩展mapper
创建日期：2017年9月18日 下午9:37:53
*******************************************/
package tsms.base.zl.dao.mapper;

import java.util.List;

import tsms.base.zl.pojo.vo.UserinfoQueryVo;
import tsms.base.zl.pojo.vo.UserinfoCustom;

/**
 * @author fab
 *
 */
public interface UserinfoMapperCustom {
    //查询用户列表
    public List<UserinfoCustom> findUserinfoList (UserinfoQueryVo userinfoQueryVo)throws Exception;
    //查询记录条数
   public int findUserinfoCount (UserinfoQueryVo userinfoQueryVo) throws Exception;
}
