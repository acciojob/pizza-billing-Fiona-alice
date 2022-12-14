package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;
    private int takeawayPrice;

    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeawayAdded;
    boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.cheesePrice = 80;
        this.takeawayPrice = 20;
       if(isVeg==true){
           this.price = 300;
           this.toppingsPrice = 70;
       } else {
           this.price = 400;
           this.toppingsPrice = 120;
       }
       this.isTakeawayAdded = false;
       this.isToppingsAdded = false;
       this.isCheeseAdded = false;
       this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
       if(isCheeseAdded == false){
           //Add the cheese
           this.price = this.price + this.cheesePrice;
           isCheeseAdded = true;
       }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            //Add the extra toppings
            this.price = this.price + this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeawayAdded==false){
            //Add the takeaway
            this.price = this.price + this.takeawayPrice;
            isTakeawayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){

            if(isCheeseAdded == false){
                this.bill = this.bill + "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingsAdded==false){
                this.bill = this.bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeawayAdded==false){
                this.bill = this.bill + "Paperbag Added: "+this.takeawayPrice+"\n";
            }
            this.bill = this.bill + "Total Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
