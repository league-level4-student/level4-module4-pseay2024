package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> ds;
	ArrayList<Patient> ps;
	Hospital()
	{
		ds = new ArrayList<Doctor>();
		ps = new ArrayList<Patient>();
	}
	public void addDoctor(Doctor d) {
		ds.add(d);
	}
	public List<Doctor> getDoctors() {
		return ds;
	}
	public void addPatient(Patient patient) {
		ps.add(patient);
	}
	public List<Patient> getPatients() {
		return ps;
	}
	public void assignPatientsToDoctors() {
		int n = 0;
		boolean quit = false;
		for (Doctor d : ds)
		{
			while (d.getPatients().size() < 3)
			{
				try {
					if (n != ps.size())d.assignPatient(ps.get(n));
					else quit = true;
				} catch (DoctorFullException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				n++;
				if (quit == true) break;
			}
			if (quit == true) break;
		}
	}

}
