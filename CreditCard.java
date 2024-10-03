public class CreditCard {
    // new Money and Person object attributes
    private Money balance;
    private Money creditLimit;
    private Person owner;

    // constructors
    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = new Money (limit);
        this.balance = new Money(0);
    }

    // getters 
    // return as new Money objects
    public Money getBalance(){
        return new Money (balance);
    }

    public Money getCreditLimit(){
        return new Money (creditLimit);
    }

    // getter for personal info
    public String getPersonals(){
        return owner.toString();
    }

    // method that charges amount to the card
    public void charge(Money amount){
        if(balance.add(amount).compareTo(creditLimit) <= 0){
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        }else{
            System.out.println("Credit Limit Exceeded");
        }
    }

    // payments come out of balance
    public void payment(Money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
