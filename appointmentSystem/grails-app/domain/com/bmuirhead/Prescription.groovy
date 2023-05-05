package com.bmuirhead

class Prescription {

    int prescriptionNumber
    String medicine
    int daysSupply
    String totalCost
    Date dateIssued
    boolean patientPaying

    String toString(){

    }

    static constraints = {
        prescriptionNumber (unique: true)
    }
    static hasOne = [doctor:Doctor, patient:Patient]
}
