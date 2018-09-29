package quick.pager.pay.dto.pay;

import lombok.Data;
import lombok.EqualsAndHashCode;
import quick.pager.pay.dto.BaseDTO;
import quick.pager.pay.dto.BasePayDTO;


/**
 * 微信平台验签dto
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class WeChatVerifyDTO extends BasePayDTO {
    private static final long serialVersionUID = 7295877036694394037L;
    /**
     * 应用授权作用域
     */
    private String scope;
    /**
     * 随机字符串
     */
    private String nonceStr;
    /**
     * 当前支付时间戳
     */
    private String timestamp;


}
