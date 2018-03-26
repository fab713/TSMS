package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Rolefunction;
import tsms.base.zl.pojo.po.RolefunctionExample;

public interface RolefunctionMapper {
    int countByExample(RolefunctionExample example);

    int deleteByExample(RolefunctionExample example);

    int deleteByPrimaryKey(BigDecimal rolefunctionid);

    int insert(Rolefunction record);

    int insertSelective(Rolefunction record);

    List<Rolefunction> selectByExample(RolefunctionExample example);

    Rolefunction selectByPrimaryKey(BigDecimal rolefunctionid);

    int updateByExampleSelective(@Param("record") Rolefunction record, @Param("example") RolefunctionExample example);

    int updateByExample(@Param("record") Rolefunction record, @Param("example") RolefunctionExample example);

    int updateByPrimaryKeySelective(Rolefunction record);

    int updateByPrimaryKey(Rolefunction record);
}