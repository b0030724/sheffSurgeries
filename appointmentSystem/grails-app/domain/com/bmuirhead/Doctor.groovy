package com.bmuirhead

class Doctor extends MedicalStaff {

    String position
    String bio
    static constraints = {
    }
    static hasMany = [appointments:Appointment, prescriptions:Prescription, nurses:Nurse]
    static belongsTo = [Nurse]
}
