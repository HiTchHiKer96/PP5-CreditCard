package CreditCard;

import java.math.BigDecimal;

public class CreditCard {
    private String cardNumber;
    private BigDecimal creditLimit;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void assignLimit(BigDecimal newLimit) {
        creditLimit = newLimit;
    }

    public BigDecimal getLimit() {
        return creditLimit;
    }
}