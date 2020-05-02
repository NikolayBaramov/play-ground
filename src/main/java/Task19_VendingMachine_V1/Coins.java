package Task19_VendingMachine_V1;

public enum Coins {
   penny(1),
    nickel(5),
    dime(10),
    quarter(25);

   private final int value;

   Coins(int value){
       this.value = value;
   }

   public int getCoinValue(){
       return this.value;
   }

}
