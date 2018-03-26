package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Eventuser;
import tsms.base.zl.pojo.po.EventuserExample;

public interface EventuserMapper {
    int countByExample(EventuserExample example);

    int deleteByExample(EventuserExample example);

    int deleteByPrimaryKey(BigDecimal eventuserid);

    int insert(Eventuser record);

    int insertSelective(Eventuser record);

    List<Eventuser> selectByExample(EventuserExample example);

    Eventuser selectByPrimaryKey(BigDecimal eventuserid);

    int updateByExampleSelective(@Param("record") Eventuser record, @Param("example") EventuserExample example);

    int updateByExample(@Param("record") Eventuser record, @Param("example") EventuserExample example);

    int updateByPrimaryKeySelective(Eventuser record);

    int updateByPrimaryKey(Eventuser record);
}