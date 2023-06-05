package com.example.projectrevisao

sealed class Destination(var route: String){
     object ScreenFirst: Destination("ScreenFirst")
     object ScreenSecond: Destination("ScreenSecond")
    //object ScreenThird: Destination("ScreenThird")
}
