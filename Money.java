public class Money {
    private long dollars;
    private long cents;

    public Money(double amount){
        this.dollars = (long) amount;
        this.cents = (long) ((amount - this.dollars) * 100 );
    }

    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherAmount){
        long totalCents = this.cents + otherAmount.cents;
        long extraDollars = totalCents / 100;
        long newCents = totalCents % 100;
        long newDollars = this.dollars + otherAmount.dollars + extraDollars;
        return new Money(newDollars + newCents / 100);
    }

    public Money subtract(Money otherAmount){
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long centDiff = totalCents1 - totalCents2;
        return new Money(centDiff / 100);
    }

    public int compareTo(Money otherObject){
        if (this.dollars > otherObject.dollars || this.dollars == otherObject.dollars && this.cents > otherObject.cents){
            return  1;
        } else if(this.dollars < otherObject.dollars || this.dollars == otherObject.dollars && this.cents < otherObject.cents){
            return -1;
        } else{
            return 0;
        }
    }

    public boolean equals(Money otherObject){
        return this.dollars == otherObject.dollars && this.cents == otherObject.cents;
    }

    public String toString(){
        return ("$" + this.dollars + "." + String.format("%02d",this.cents));
    }
}
