package com.example.typhoon.models

class Upload{
    var name:String=""
    var quantity:String=""
    var price:String=""
    var imageUrl:String=""
    var color:String=""
    var id:String=""

    constructor(name:String,quantity:String,price:String,imageUrl:String,id:String,color:String){

        this.name=name
        this.quantity=quantity
        this.price=price
        this.imageUrl=imageUrl
        this.color=color
        this.id=id

    }
    constructor()
}