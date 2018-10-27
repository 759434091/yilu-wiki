package team.a9043.yiluwiki.service_pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author a9043
 */
@Setter
@Getter
public class OperationResponse<T> implements Serializable {
    protected boolean success;
    protected String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
