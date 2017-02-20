package watercup.service;

import watercup.domain.SysUser;

/**
 * Created by Ji on 2017/2/20.
 */
public interface SysUserService {
    /*通过用户id获取用户*/
    public SysUser getSysUserById(Long userId);
}
