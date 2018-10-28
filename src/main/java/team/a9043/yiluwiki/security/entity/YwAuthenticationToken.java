package team.a9043.yiluwiki.security.entity;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import team.a9043.yiluwiki.entity.YwUser;

import java.util.Collection;

/**
 * @author a9043
 */
public class YwAuthenticationToken extends AbstractAuthenticationToken {
    private YwUser ywUser;

    public YwAuthenticationToken(YwUser ywUser,
                                 Collection<? extends GrantedAuthority> authorities) {
        this(authorities);
        this.ywUser = ywUser;
    }

    /**
     * Creates a token with the supplied array of authorities.
     *
     * @param authorities the collection of <tt>GrantedAuthority</tt>s for
     *                    the principal
     *                    represented by this authentication object.
     */
    private YwAuthenticationToken(Collection<? extends GrantedAuthority> authorities) {
        super(authorities);
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return ywUser.getYuId();
    }

    public YwUser getYwUser() {
        return ywUser;
    }
}
