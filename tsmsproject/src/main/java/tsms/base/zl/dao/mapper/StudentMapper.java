package tsms.base.zl.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tsms.base.zl.pojo.po.Student;
import tsms.base.zl.pojo.po.StudentExample;


public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);
}