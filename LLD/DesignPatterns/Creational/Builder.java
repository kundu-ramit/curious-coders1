class Burger {

    private final String bun;
    private final String patty;
    private final String cheese;
    private final String veggies;
    private final String sauce;
  
    private Burger(Builder builder) {
      this.bun = builder.bun;
      this.patty = builder.patty;
      this.cheese = builder.cheese;
      this.veggies = builder.veggies;
      this.sauce = builder.sauce;
    }
  
    public static class Builder {
      private String bun;
      private String patty;
      private String cheese;
      private String veggies;
      private String sauce;
  
      public Builder bun(String bun) {
        this.bun = bun;
        return this;
      }
  
      public Builder patty(String patty) {
        this.patty = patty;
        return this;
      }
  
      public Builder cheese(String cheese) {
        this.cheese = cheese;
        return this;
      }
  
      public Builder veggies(String veggies) {
        this.veggies = veggies;
        return this;
      }
  
      public Builder sauce(String sauce) {
        this.sauce = sauce;
        return this;
      }
  
      public Burger build() {
        return new Burger(this);
      }
    }
  
    @Override
    public String toString() {
      return "Burger [bun=" + bun + ", patty=" + patty + ", cheese=" + cheese + ", veggies=" + veggies
          + ", sauce=" + sauce + "]";
    }
  }

  class BurgerBuilderDemo {
    public static void main(String[] args) {
  
      // Cheeseburger
      Burger cheeseBurger = new Burger.Builder()
          .bun("Sesame Seed Bun")
          .build();
  
      System.out.println(cheeseBurger);
  
      // Veggie Burger
      Burger veggieBurger = new Burger.Builder()
          .bun("Whole Wheat Bun")
          .patty("Black Bean")
          .cheese("Vegan Cheese")
          .veggies("Onions, Peppers")
          .sauce("Hummus")
          .build();
  
      System.out.println(veggieBurger);
    }
  }
  