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


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;

        }
        else{
            this.price=400;

        }


        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

           this.extrachesse=true;





    }

    public void addExtraToppings(){
        // your code goes here
        this.extratoppings=true;

    }

    public void addTakeaway(){
        // your code goes here
        this.takeaway=true;


    }

    public String getBill(){
        // your code goes here
        int total=price;
        String str="Base Price Of The Pizza: "+price;
        if(extrachesse){
            str=str+"\nExtra Cheese Added: "+80;
            total+=80;
        }
        if(extratoppings){
            str=str+"\nExtra Toppings Added: "+70;
            total+=70;
        }
        if(takeaway)str=str+"\nPaperbag Added: "+20;{
            total+=20;
        }
        str=str+"\nTotal Price: "+total;
        this.bill=str;
        return this.bill;
    }
}
