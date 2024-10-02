public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
        this.balance = new Money(0);
    }

    public Money getBalance(){
        return balance;
    }

    public Money getCreditLimit(){
        return creditLimit;
    }

    public String getPersonals(){
        return owner.toString();
    }

    public void charge(Money amount){
        if(balance.add(amount).compareTo(creditLimit) <= 0){
            balance = balance.add(amount);
        }else{
            throw new IllegalArgumentException("Credit Limit Exceeded");
        }
    }

    public void payment(Money amount){
        balance = balance.subtract(amount);
    }
}
