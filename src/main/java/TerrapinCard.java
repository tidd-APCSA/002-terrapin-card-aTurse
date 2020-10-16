public class TerrapinCard {

  private double balance;
  private double econCost = 2.50;
  private double gourmetCost = 4.00;
  
  public TerrapinCard(double balanceAtStart){
    balance = balanceAtStart; 
  }

  public String toString(){
    String stringReturn = "The card has " + balance + " dollars";
    return stringReturn;
  }

  public void payEconomical(){
    if (balance > econCost){
      balance = balance - econCost;
    }else{
      balance = balance;
    } 
  }

  public void payGourmet(){
    if (balance > gourmetCost){
    balance = balance - gourmetCost;
  }else{
    balance = balance;  
  }
  }

  public void loadMoney(double amount){
    if (amount > 0){
    if (balance + amount > 150){
      amount = amount - ((balance + amount) - 150);
      balance = balance + amount;
    }else{
      balance = balance + amount;
    }
    }




}
}