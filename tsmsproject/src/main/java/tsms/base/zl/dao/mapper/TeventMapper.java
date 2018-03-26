package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Tevent;
import tsms.base.zl.pojo.po.TeventExample;

public interface TeventMapper {
    int countByExample(TeventExample example);

    int deleteByExample(TeventExample example);

    int deleteByPrimaryKey(BigDecimal eventid);

    int insert(Tevent record);

    int insertSelective(Tevent record);

    List<Tevent> selectByExampleWithBLOBs(TeventExample example);

    List<Tevent> selectByExample(TeventExample example);

    Tevent selectByPrimaryKey(BigDecimal eventid);

    int updateByExampleSelective(@Param("record") Tevent record, @Param("example") TeventExample example);

    int updateByExampleWithBLOBs(@Param("record") Tevent record, @Param("example") TeventExample example);

    int updateByExample(@Param("record") Tevent record, @Param("example") TeventExample example);

    int updateByPrimaryKeySelective(Tevent record);

    int updateByPrimaryKeyWithBLOBs(Tevent record);

    int updateByPrimaryKey(Tevent record);
}