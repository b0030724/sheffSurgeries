package com.bmuirhead

class Patient extends Person {

    String address
    String residence
    Date dob
    String patientID
    Date dateRegistered

    static constraints = {
        prescriptions(nullable:true)
    }
    static hasMany=[surgeries:Surgery, appointments:Appointment, prescriptions:Prescription]
}
