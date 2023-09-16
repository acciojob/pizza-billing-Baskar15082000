package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int count=0;
    private int count2=0;
    private int extrachesse=0;
    private int extratoppings=0;
    private int takeaway=0;
    private int total=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price=300;

        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(count==0){
           this.extrachesse=80;
        }
        count++;



    }

    public void addExtraToppings(){
        // your code goes here
        if(count2==0){
           this.extratoppings=70;
        }
        count2++;
    }

    public void addTakeaway(){
        // your code goes here
        this.takeaway=20;

    }

    public String getBill(){
        // your code goes here
        this.total=price+extrachesse+extratoppings+takeaway;
        this.bill="Base Price Of The Pizza: "+price+"\nExtra Cheese Added: "+extrachesse+"\nExtra Toppings Added: "+extratoppings+"\nPaperbag Added: "+takeaway+"\nTotal Price: "+total;
        return this.bill;
    }
}
