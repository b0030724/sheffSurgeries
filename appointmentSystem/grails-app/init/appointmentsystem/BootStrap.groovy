package appointmentsystem

class BootStrap {

    def init = { servletContext ->

        
    // def surgery = new com.bmuirhead.Surgery
    // (
    // 	name: 'Shoreham Street Surgery',
    // 	address: '251 Shoreham St',
    // 	postcode: 'S1 4SS',
    // 	telephone: '0114 272 1717',
    // 	maxNumberOfPatients: 50,
    // 	openingTime: '8:30 AM - 6:00PM',
    // 	registeringNewPatients: true,
    //     description: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", 
    //     ).save(failOnError:true)
    
    // def surgeryB = new com.bmuirhead.Surgery
    // (
    // 	name: 'Dovercourt Surgery',
    // 	address: '3 Skye Edge Ave',
    // 	postcode: 'S2 5FX',
    // 	telephone: '0114 270 0997',
    // 	maxNumberOfPatients: 70,
    // 	openingTime: '7:30 AM - 6:00PM',
    // 	registeringNewPatients: false,
    //     description: "Lorem ipsum dolor sit amet."
    // ).save(failOnError:true)
    
    // def doctor = new com.bmuirhead.Doctor
    // (
    // 	name: 'Clarence Ada',
    // 	email: 'DrAda@gmail.com',
    // 	phoneNumber: '073469 6432276',
    // 	qualifications: 'MSChB',
    // 	position: 'Surgeon',
    // 	username: 'ada479',
    // 	password: 'password',
    // 	office: 'S-487',
    // 	bio: "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",	
    //     surgery: surgery
    // ).save(failOnError:true)
    
    // def doctorB = new com.bmuirhead.Doctor
    // (
    // 	name: 'Vinny Anne',
    // 	email: 'VAnne@gmail.com',
    // 	phoneNumber: '07323 3425323464',
    // 	qualifications: 'MSChB',
    // 	position: 'Surgeon',
    // 	username: 'VAnne234',
    // 	password: 'password',
    // 	office: 'S-456745',
    // 	bio: "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse laoreet sem vel nulla dignissim venenatis.",
    // 	surgery: surgeryB
    // ).save(failOnError:true)
    
    // def patient = new com.bmuirhead.Patient
    // (
    // 	name:'Debra Wilma',
    // 	phoneNumber: '079 1902 0754',
    // 	address: 'Crasher',
    // 	residence: '13 Stone St',
    // 	dob:'1985-08-07',
    // 	patientID:'DW67456',
    // 	dateRegistered:'2005-05-04',
    // 	surgery:surgery
    // ).save(failOnError:true)
    
    // def patientB = new com.bmuirhead.Patient
    // (
    // 	name:'Grace Nigellus',
    // 	phoneNumber: '077 3458 8233',
    // 	address: 'Duinish',
    // 	residence: '11 Hudston St',
    // 	dob:'2007-05-12',
    // 	patientID:'GN3456',
    // 	dateRegistered:'2012-03-07',
    // 	surgery:surgeryB
    // ).save(failOnError:true)
    
    // def receptionist = new com.bmuirhead.Receptionist
    // (
    // 	name:'Mary Jaqueline',
    // 	email:'MaryJaq3345@yahoo.co.uk',
    // 	phoneNumber: '07542 6235634',
    // 	username:'root',
    // 	password:'password',
    // 	surgery: surgery
    // ).save(failOnError:true)
    
    // def receptionistB = new com.bmuirhead.Receptionist
    // (
    // 	name:'King Antony',
    // 	email:'AntonyTheKing5286@gmail.com',
    // 	phoneNumber: '04353 5826876',
    // 	username:'rosanne',
    // 	password:'password',
    // 	surgery: surgeryB
    // ).save(failOnError:true)
    
    // def nurse = new com.bmuirhead.Nurse
    // (
    // 	name: 'Biddy Krystelle',
    // 	email: 'BKrystelle754@gmail.com',
    // 	phoneNumber: '070 0022 1215',
    // 	qualifications: 'RNDA',
    // 	office: 'N-354',
	// 	username: 'BKrystelle',
	// 	password: 'password',
    // 	surgery: surgery
    // ).save(failOnError:true)
    
    // def nurseB = new com.bmuirhead.Nurse
    // (
    // 	name: 'Bertie Rosemary',
    // 	email: 'BerRosemary45374@hotmail.com',
    // 	phoneNumber: '078 1941 0795',
    // 	qualifications: 'RNDA',
    // 	office: 'N-6475',
	// 	username: 'BRosemary',
	// 	password: 'password',
    // 	surgery: surgeryB
    // ).save(failOnError:true)
    
    // def appointment = new com.bmuirhead.Appointment
    // (
    // 	appDateTime: new Date(2020 - 1900, 8, 2, 4, 0, 0),
    // 	appDuration:30,
    // 	roomNumber: 'S-456',
    // 	surgery: surgery,
    // 	doctor: doctor,
    // 	patient: patient
    // ).save(failOnError:true)
    
    // def appointmentB = new com.bmuirhead.Appointment
    // (
    // 	appDateTime: new Date(2020 - 1900, 3, 5, 1, 0, 0),
    // 	appDuration:45,
    // 	roomNumber: 'S-345',
    // 	surgery: surgeryB,
    // 	doctor: doctorB,
    // 	patient: patientB
    // ).save(failOnError:true)
    
    // def prescription = new com.bmuirhead.Prescription
    // (
    // 	pharmacyName: 'Weldricks',
    // 	prescriptionNumber: 354,
    // 	medicine: 'Aspirin',
    // 	daysSupply: 10,
    // 	totalCost:5.90,
    // 	dateIssued: new Date(2020 - 1900, 4, 2, 6, 0, 0),
    // 	patientPaying: false,
    // 	doctor: doctor,
    // 	patient: patient
    // ).save(failOnError:true)
    
    // def prescriptionB = new com.bmuirhead.Prescription
    // (
    // 	pharmacyName: 'Weldricks',
    // 	prescriptionNumber: 234,
    // 	medicine: 'Rapmril',
    // 	daysSupply: 5,
    // 	totalCost:5.90,
    // 	dateIssued: new Date(2020 - 1900, 6, 2, 1, 0, 0),
    // 	patientPaying: true,
    // 	doctor: doctorB,
    // 	patient: patientB
    // ).save(failOnError:true)
    

    }
    def destroy = {
    }
}
