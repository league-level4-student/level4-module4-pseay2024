package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	protected boolean surgeon;
	protected boolean practitioner;
	protected ArrayList<Patient> ps;
	Doctor()
	{
		ps = new ArrayList<Patient>();
	}
	ArrayList<Patient> getPatients() {return ps;}
	public boolean performsSurgery() {
		return surgeon;
	}
	public boolean makesHouseCalls() {
		return practitioner;
	}
	public void assignPatient(Patient patient) throws DoctorFullException{
		if (ps.size() == 3)
		{
			throw new DoctorFullException();
		}
		ps.add(patient);
	}
	public void doMedicine() {
		for (Patient p : ps)
		{
			p.checkPulse();
		}
	}
}
