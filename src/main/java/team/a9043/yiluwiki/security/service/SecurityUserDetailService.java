package team.a9043.yiluwiki.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import team.a9043.yiluwiki.entity.YwUser;
import team.a9043.yiluwiki.mapper.YwUserMapper;
import team.a9043.yiluwiki.security.entity.SecurityUserDetails;

import javax.annotation.Resource;

/**
 * @author a9043
 */
@Component
public class SecurityUserDetailService implements UserDetailsService {
    @Resource
    private YwUserMapper ywUserMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        YwUser ywUser = ywUserMapper.selectByPrimaryKey(Integer.valueOf(username));
        if (null == ywUser) {
            throw new UsernameNotFoundException("no user " + username);
        }

        return new SecurityUserDetails(ywUser);
    }
}
