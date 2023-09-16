package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int count=0;
    private int count2=0;
    private boolean extrachesse;
    private boolean extratoppings;
    private boolean takeaway;
    private int total=0;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            this.total+=300;
        }
        else{
            this.price=400;
            this.total+=400;
        }


        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

           this.extrachesse=true;
           this.total+=80;




    }

    public void addExtraToppings(){
        // your code goes here
        this.extratoppings=true;
        this.total+=70;
    }

    public void addTakeaway(){
        // your code goes here
        this.takeaway=true;
        this.total+=20;

    }

    public String getBill(){
        // your code goes here

        String str="Base Price Of The Pizza: "+price;
        if(extrachesse)str=str+"\nExtra Cheese Added: "+80;
        if(extratoppings)str=str+"\nExtra Toppings Added: "+70;
        if(takeaway)str=str+"\nPaperbag Added: "+20;
        str=str+"\nTotal Price: "+total;
        this.bill=str;
        return this.bill;
    }
}
