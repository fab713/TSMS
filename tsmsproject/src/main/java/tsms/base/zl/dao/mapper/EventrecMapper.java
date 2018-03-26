package tsms.base.zl.dao.mapper;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tsms.base.zl.pojo.po.Eventrec;
import tsms.base.zl.pojo.po.EventrecExample;
import tsms.base.zl.pojo.po.EventrecWithBLOBs;

public interface EventrecMapper {
    int countByExample(EventrecExample example);

    int deleteByExample(EventrecExample example);

    int deleteByPrimaryKey(BigDecimal eventrecid);

    int insert(EventrecWithBLOBs record);

    int insertSelective(EventrecWithBLOBs record);

    List<EventrecWithBLOBs> selectByExampleWithBLOBs(EventrecExample example);

    List<Eventrec> selectByExample(EventrecExample example);

    EventrecWithBLOBs selectByPrimaryKey(BigDecimal eventrecid);

    int updateByExampleSelective(@Param("record") EventrecWithBLOBs record, @Param("example") EventrecExample example);

    int updateByExampleWithBLOBs(@Param("record") EventrecWithBLOBs record, @Param("example") EventrecExample example);

    int updateByExample(@Param("record") Eventrec record, @Param("example") EventrecExample example);

    int updateByPrimaryKeySelective(EventrecWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EventrecWithBLOBs record);

    int updateByPrimaryKey(Eventrec record);
}