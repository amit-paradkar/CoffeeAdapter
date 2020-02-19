
public class CoffeeTouchScreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine oldCoffeeMachine;
	
	public CoffeeTouchScreenAdapter() {
		oldCoffeeMachine = new OldCoffeeMachine();
	};
	
	@Override
	public void chooseFirstSelection() {
		oldCoffeeMachine.chooseA();
	}

	@Override
	public void chooseSecondSelection() {
		oldCoffeeMachine.chooseB();
	}
}
