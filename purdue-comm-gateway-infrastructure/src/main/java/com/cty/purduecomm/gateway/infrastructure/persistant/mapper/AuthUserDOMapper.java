package com.cty.purduecomm.gateway.infrastructure.persistant.mapper;

import com.cty.purduecomm.gateway.infrastructure.persistant.dataobject.AuthUserDO;
import com.cty.purduecomm.gateway.infrastructure.persistant.dataobject.AuthUserDOExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
@Mapper
public interface AuthUserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    long countByExample(AuthUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int deleteByExample(AuthUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int insert(AuthUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int insertSelective(AuthUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    List<AuthUserDO> selectByExample(AuthUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    AuthUserDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int updateByExampleSelective(@Param("record") AuthUserDO record, @Param("example") AuthUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int updateByExample(@Param("record") AuthUserDO record, @Param("example") AuthUserDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int updateByPrimaryKeySelective(AuthUserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user
     *
     * @mbg.generated Sat Jun 22 09:36:12 CST 2019
     */
    int updateByPrimaryKey(AuthUserDO record);
}