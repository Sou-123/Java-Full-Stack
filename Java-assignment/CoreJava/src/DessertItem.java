public abstract class DessertItem {
  protected String name;

  public DessertItem() {
  }

  public DessertItem(String name) {
    if(name.length()<=Shop.ITEM_NAME_MAX_SIZE) this.name = name;
    else throw new IllegalArgumentException("Name exceeds "+Shop.ITEM_NAME_MAX_SIZE+". Try to use a shorter name.");
  }

  /**
   * Form a string of dessert with name align to left and cost align to right.
   * @return Return a String representing the name and cost of this dessert.
   */
  public String toString() {
    StringBuilder builder=new StringBuilder();
    int pad=Shop.PRINT_WIDTH-name.length();
    builder.append(name);
    builder.append(String.format("%"+pad+"s", Shop.cents2dollars(getCost())));
    return builder.toString();
  }
  
  /**
   * 
   * @return Returns name of DessertItem
   */
  public final String getName(){
    return this.name;
  }

  // get the price in cent
  public abstract int getCost();

}
