package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Logrec;
import tsms.base.zl.pojo.po.LogrecExample;

public interface LogrecMapper {
    int countByExample(LogrecExample example);

    int deleteByExample(LogrecExample example);

    int deleteByPrimaryKey(BigDecimal logid);

    int insert(Logrec record);

    int insertSelective(Logrec record);

    List<Logrec> selectByExample(LogrecExample example);

    Logrec selectByPrimaryKey(BigDecimal logid);

    int updateByExampleSelective(@Param("record") Logrec record, @Param("example") LogrecExample example);

    int updateByExample(@Param("record") Logrec record, @Param("example") LogrecExample example);

    int updateByPrimaryKeySelective(Logrec record);

    int updateByPrimaryKey(Logrec record);
}