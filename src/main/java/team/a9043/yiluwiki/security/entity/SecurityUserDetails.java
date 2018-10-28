package team.a9043.yiluwiki.security.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import team.a9043.yiluwiki.entity.YwUser;

import java.util.Collection;

/**
 * @author a9043
 */
public class SecurityUserDetails implements UserDetails {
    private YwUser ywUser;

    public SecurityUserDetails(YwUser ywUser) {
        this.ywUser = ywUser;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return ywUser.getYuPassword();
    }

    @Override
    public String getUsername() {
        return String.valueOf(ywUser.getYuId());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public YwUser getKsUser() {
        return ywUser;
    }

    public void setKsUser(YwUser ksUser) {
        this.ywUser = ksUser;
    }
}
