package pattern.behavioural.responsibilityChain.simple01;

import java.math.BigDecimal;

/**
 * @author wudih
 * @date 2019-03-30 11:42
 * @since master
 */
public class PurchaseRequest {
    private BigDecimal amount;
    private Integer number;
    private String purpose;

    public PurchaseRequest(BigDecimal amount, Integer number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
