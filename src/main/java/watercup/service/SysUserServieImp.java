package watercup.service;

import org.springframework.beans.factory.annotation.Autowired;
import watercup.dao.SysUserMapper;
import watercup.domain.SysUser;

/**
 * Created by Ji on 2017/2/20.
 */
public class SysUserServieImp implements SysUserService {
    @Autowired
    private SysUserMapper userMapper;
    @Override
    public SysUser getSysUserById(Long userId) {
        userMapper.getSysUserById(userId);
        return null;
    }
}
