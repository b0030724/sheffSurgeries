package com.bmuirhead

class Surgery {

    String name
    String address
    String postcode
    String telephone
    int maxNumberOfPatients
    String openingTime
    boolean registeringNewPatients
    String description

    String toString(){
        return(name)
    }

    static hasMany = [workers:Worker, patients:Patient, appointments:Appointment]

    static belongsTo = Patient

    Integer getPatients(){
        patients?.size() ?: 0
    }

    void beforeUpdate() {
        numberOfPatients = getPatients()
    }

    static constraints = {
    }
}
