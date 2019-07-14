package _04_hospital;

public class Patient {
	boolean pulseChecked;
	Doctor current;
	Patient() {
		pulseChecked = false;
	}
	public void assignDoctor(Doctor d) {
		if (current == null)
		{
			current = d;
		}
	}
	public void checkPulse()
	{
		pulseChecked = true;
	}
	public Object feelsCaredFor() {
		return pulseChecked;
	}

}
