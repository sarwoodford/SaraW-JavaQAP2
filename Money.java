public class Money {
    // assign attributes
    private long dollars;
    private long cents;

    // constructors 
    public Money(double amount){
        this.dollars = (long) amount;
        this.cents = Math.round((amount - this.dollars) * 100 );
    }

    // copy construtor 
    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // methods 
    // add specified amount
    // changed because .02 in SECOND_AMOUNT was not being handled correctly
    public Money add(Money otherAmount){
        long totalCents = this.cents + otherAmount.cents;
        long extraDollars = totalCents / 100;
        long newCents = totalCents % 100;
        long newDollars = this.dollars + otherAmount.dollars + extraDollars;
        //convertin cents back to a double 
        double totalAmount = newDollars +  (double)newCents / 100;
        return new Money(totalAmount);
    }
    

    // subtract specified amount
    // modified because .02 in SECOND_AMOUNT was not being handled correctly
    public Money subtract(Money otherAmount){
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long centDiff = totalCents1 - totalCents2;
        return new Money(centDiff / 100.0);
    }

    // compare balances 
    public int compareTo(Money otherObject){
        if (this.dollars > otherObject.dollars || this.dollars == otherObject.dollars && this.cents > otherObject.cents){
            return  1;
        } else if(this.dollars < otherObject.dollars || this.dollars == otherObject.dollars && this.cents < otherObject.cents){
            return -1;
        } else{
            return 0;
        }
    }

    // compare balances to see if they're equal
    public boolean equals(Money otherObject){
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    // display results
    public String toString(){
        return ("$" + this.dollars + "." + String.format("%02d",this.cents));
    }
}
