package pattern.behavioural.responsibilityChain.simple01;

/**
 * 审批者类：抽象处理者
 *
 * @author wudih
 * @date 2019-03-30 11:44
 * @since master
 */
public abstract class Approver {
    protected Approver approver;
    protected String name;

    public Approver(Approver approver, String name) {
        this.approver = approver;
        this.name = name;
    }

    public Approver(Approver approver) {
        this.approver = approver;
    }

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    protected abstract void processRequest(PurchaseRequest request);
}
