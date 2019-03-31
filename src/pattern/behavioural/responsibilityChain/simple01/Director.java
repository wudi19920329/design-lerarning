package pattern.behavioural.responsibilityChain.simple01;

import java.math.BigDecimal;
import java.text.MessageFormat;

/**
 * 主任类：具体处理者
 *
 * @author wudih
 * @date 2019-03-30 11:46
 * @since master
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    protected void processRequest(PurchaseRequest request) {
        if (request.getAmount().compareTo(BigDecimal.valueOf(50000)) < 0) {
            System.out.println(MessageFormat.format("主任{0}审批采购单：{1}，金额：{2}，采购目的：{3}", this.name, request.getNumber(), request.getAmount(), request.getPurpose()));
            return;
        }
        this.approver.processRequest(request);
    }
}
