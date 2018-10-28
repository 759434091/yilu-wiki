package team.a9043.yiluwiki.service_pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import team.a9043.yiluwiki.entity.YwUser;

/**
 * @author a9043
 */

@Data
@ApiModel(description = "token响应")
public class TokenResult {
    @ApiModelProperty("在需要认证的接口处, 增加认证请求头Authorization, 值为 \"Bearer \" + 该字符串, 注意空格, 有效期一个月")
    private String accessToken;
    @ApiModelProperty("认证成功后返回用户信息")
    private YwUser ywUser;

    public TokenResult(String accessToken, YwUser ywUser) {
        this.accessToken = accessToken;
        this.ywUser = ywUser;
    }
}
