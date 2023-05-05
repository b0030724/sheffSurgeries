package com.bmuirhead

class Worker extends Person {

    String username
    String password
    String email

    static constraints = {
    password(password:true)
    email(email:true)
    }

    static hasOne = [surgery:Surgery]
}
