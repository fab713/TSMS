package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Userinfo;
import tsms.base.zl.pojo.po.UserinfoExample;

public interface UserinfoMapper {

	int countByExample(UserinfoExample example);

	int deleteByExample(UserinfoExample example);

	int deleteByPrimaryKey(BigDecimal userid);

	int insert(Userinfo record);

	int insertSelective(Userinfo record);

	List<Userinfo> selectByExample(UserinfoExample example);

	Userinfo selectByPrimaryKey(BigDecimal userid);

	int updateByExampleSelective(@Param("record") Userinfo record,
			@Param("example") UserinfoExample example);

	int updateByExample(@Param("record") Userinfo record,
			@Param("example") UserinfoExample example);

	int updateByPrimaryKeySelective(Userinfo record);

	int updateByPrimaryKey(Userinfo record);

}