
import java.util.*;

public class Checkout {
  private List<DessertItem> cart;
  
  private static final String TAX_TEXT="Tax";
  private static final String TOTAL_COST_TEXT="Total Cost";
  
  
  public Checkout(){
    this.cart=new ArrayList<>();
  };
  
  public int numberOfItems(){
    return cart.size();
  }

  /**
   * A DessertItem is added to the end of the list of items.
   * @param item - DessertItem to add to list of items
   */
  public void enterItem(DessertItem item){
    cart.add(item);
  }
  
//   Clears the Checkout to begin checking out a new set of items
  protected void clear(){
    cart.clear();
  }
  /**
   * @return Returns total cost of items in cents (without tax)
   */
  protected int totalCost(){
    int cost=0;
    for(DessertItem item:cart){
      cost+=item.getCost();
    }
    return cost;
  }
  
  /**
   * @return Returns total tax on items in cents
   */
  protected int totalTax(){
    return Math.round(totalCost()*Shop.TAX_RATE);
  }

  /**
   * @return A string representing a receipt for the current list of items.
   * 
   */
  public String toString(){
    StringBuilder builder=new StringBuilder();
    builder.append(this.getReceiptHeader());
    builder.append(getReceiptBodyItems());
    builder.append(getReceiptFooter());
    builder.append("\n\n");
    return builder.toString();
    
  }
  private String alignCenter(String str){
    return String.format("%"+((Shop.PRINT_WIDTH+Shop.NAME.length())/2)+"s",str);
  }
  
  private String getReceiptHeader(){
    StringBuilder header=new StringBuilder();
    header.append(alignCenter(Shop.NAME)+"\n");
    
    char[] seperateLine=new char[Shop.NAME.length()];
    Arrays.fill(seperateLine, '-');
    header.append(alignCenter(String.valueOf(seperateLine))+"\n\n");
    
    return header.toString();
  }
  
  private String getReceiptFooter(){
    StringBuilder footer=new StringBuilder("\n");
    footer.append(alignBothSides(TAX_TEXT, totalTax()));
    footer.append(alignBothSides(TOTAL_COST_TEXT, totalCost()+totalTax()));    
    return footer.toString();
  }
  
  /**
   * Align the input string to left and the cost   
   */
  private String alignBothSides(String str, int cost){
    StringBuilder footer=new StringBuilder();
    footer.append(str);
    int pad=Shop.PRINT_WIDTH-str.length();
    footer.append(String.format("%"+pad+"s", Shop.cents2dollars(cost)));
    footer.append("\n");
    return footer.toString();
  }
  
  private String getReceiptBodyItems(){
    StringBuilder builder=new StringBuilder();
    for(DessertItem item: this.cart){
      builder.append(item.toString());
      builder.append("\n");
    }
    return builder.toString();
  }
}