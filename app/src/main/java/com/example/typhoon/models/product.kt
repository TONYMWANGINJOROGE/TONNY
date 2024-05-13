package com.example.typhoon.models

class Product{
    val imageUri: Any
        get() {
            TODO()
        }
    var name:String=""
    var quantity:String=""
    var price:String=""
    var id:String=""
    var color:String=""

    constructor(name:String,quantity:String,price:String,id:String,color:String){
        this.name=name
        this.quantity=quantity
        this.price=price
        this.id=id
        this.color=color

    }
    constructor()
}