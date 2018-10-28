package team.a9043.yiluwiki.service_pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author a9043
 */
@Data
@ApiModel(description = "操作响应模板")
public class OperationResponse<T> implements Serializable {
    @ApiModelProperty("操作状态")
    protected boolean success;
    @ApiModelProperty("操作消息")
    protected String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("响应内容")
    protected T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @ApiModelProperty("响应码")
    protected Integer code;

    public OperationResponse() {
    }

    public OperationResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public OperationResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public OperationResponse(boolean success, String message, T data, Integer code) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.code = code;
    }
}
