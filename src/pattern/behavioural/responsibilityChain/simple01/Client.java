package pattern.behavioural.responsibilityChain.simple01;

import java.math.BigDecimal;

/**
 * @author wudih
 * @date 2019-03-30 11:58
 * @since master
 */
public class Client {

    public static void main(String[] args) {
        Approver approver1 = new Director("woody");
        Approver approver2 = new VicePresident("大地");
        approver1.setApprover(approver2);
        approver2.setApprover(new President("吴棣"));
        PurchaseRequest request1 = new PurchaseRequest(BigDecimal.valueOf(1), 1001, "购买倚天剑");
        PurchaseRequest request2 = new PurchaseRequest(BigDecimal.valueOf(666666), 1001, "购买倚天剑");
        approver1.processRequest(request1);
        approver1.processRequest(request2);

    }
}
