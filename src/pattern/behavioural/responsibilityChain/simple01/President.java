package pattern.behavioural.responsibilityChain.simple01;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * 副董事长类：具体处理者
 *
 * @author wudih
 * @date 2019-03-30 11:46
 * @since master
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    protected void processRequest(PurchaseRequest request) {
        System.out.println(MessageFormat.format("董事长{0}审批采购单：{1}，金额：{2}，采购目的：{3}", this.name, request.getNumber(), request.getAmount(), request.getPurpose()));
    }
}
