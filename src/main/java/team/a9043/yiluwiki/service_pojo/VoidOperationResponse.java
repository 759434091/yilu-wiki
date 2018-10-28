package team.a9043.yiluwiki.service_pojo;

import io.swagger.annotations.ApiModel;

/**
 * @author a9043
 */
@ApiModel(description = "空内容操作响应模板")
public class VoidOperationResponse extends OperationResponse<Void> {
    public VoidOperationResponse() {
    }

    public VoidOperationResponse(boolean success, String message) {
        super(success, message);
    }

    public void setData(Void data) {
    }

    public Void getData() {
        return null;
    }
}
