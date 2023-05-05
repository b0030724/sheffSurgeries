package com.bmuirhead

class Appointment {

    Date appDateTime
    int appDuration
    String roomNumber

    static constraints = {
    }

    String toString(){
        return(appDuration)
    }

    static hasOne = [doctor:Doctor, patient:Patient, surgery:Surgery]
}
