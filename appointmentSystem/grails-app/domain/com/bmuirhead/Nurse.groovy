package com.bmuirhead

class Nurse extends MedicalStaff {

    static hasMany = [doctors:Doctor]

    static constraints = {
    }
}
