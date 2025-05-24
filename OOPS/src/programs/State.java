package programs;

public class State {
	private String stateName;
	private double stateIncome;
	private Cm c1=new Cm("mgr",15);
	public State(String stateName, double stateIncome) {
		super();
		this.stateName = stateName;
		this.stateIncome = stateIncome;
	}
	public State() {
		super();
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public double getStateIncome() {
		return stateIncome;
	}
	public void setStateIncome(double stateIncome) {
		this.stateIncome = stateIncome;
	}
	public Cm getC1() {
		return c1;
	}
	public void setC1(Cm c1) {
		this.c1 = c1;
	}
	
}
