package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Functioninfo;
import tsms.base.zl.pojo.po.FunctioninfoExample;

public interface FunctioninfoMapper {
    int countByExample(FunctioninfoExample example);

    int deleteByExample(FunctioninfoExample example);

    int deleteByPrimaryKey(BigDecimal functioninfoid);

    int insert(Functioninfo record);

    int insertSelective(Functioninfo record);

    List<Functioninfo> selectByExample(FunctioninfoExample example);

    Functioninfo selectByPrimaryKey(BigDecimal functioninfoid);

    int updateByExampleSelective(@Param("record") Functioninfo record, @Param("example") FunctioninfoExample example);

    int updateByExample(@Param("record") Functioninfo record, @Param("example") FunctioninfoExample example);

    int updateByPrimaryKeySelective(Functioninfo record);

    int updateByPrimaryKey(Functioninfo record);
}