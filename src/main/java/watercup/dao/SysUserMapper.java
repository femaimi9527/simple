package watercup.dao;

import org.apache.ibatis.annotations.*;
import watercup.domain.SysUser;


/**
 * Created by Ji on 2017/2/20.
 */
@Mapper
public interface SysUserMapper {
    @Select("SELECT * FROM sys_user WHERE user_id=#{id}")
    public SysUser getSysUserById(@Param("id") Long id);

}
