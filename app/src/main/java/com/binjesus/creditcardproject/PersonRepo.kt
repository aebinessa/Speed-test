package com.binjesus.creditcardproject

class PersonRepo {
    companion object {
        val oneCreditCard = CreditCard("theOne", "34567654", "28/11", 45678)
        val abdullah = Person("Abdullah", 23, 3456.00, oneCreditCard)
    }

}