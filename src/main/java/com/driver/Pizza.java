package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public boolean extrachesse;
    public boolean extratoppings;
    private boolean takeaway;

    int top;
    int che;
    int bag;
    int total=0;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            this.top=70;

        }
        else{
            this.price=400;
            this.top=120;

        }
        this.extrachesse=false;
        this.extratoppings=false;
        this.takeaway=false;
        this.che=80;
        this.bag=20;
        // your code goes here
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extrachesse ){
            this.extrachesse=true;
            total+=che;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extratoppings ){
            this.extratoppings=true;
            this.total+=top;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            this.takeaway = true;
            this.total+=bag;
        }


    }

    public String getBill(){
        // your code goes here
        total+=price;
        String str="Base Price Of The Pizza: "+price;
        if(extrachesse){
            str=str+"\nExtra Cheese Added: "+che;

        }
        if(extratoppings){

                str = str + "\nExtra Toppings Added: " + top;



        }
        if(takeaway){str=str+"\nPaperbag Added: "+bag;

        }
        str=str+"\nTotal Price: "+total;
        this.bill=str;
        return this.bill;
    }
}
