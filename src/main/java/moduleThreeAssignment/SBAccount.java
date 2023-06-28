package moduleThreeAssignment;

public final class SBAccount extends AbstractBankAccount{
	int interestRate = 4;
	final int minimumBalance = 1000;

	@Override
	public void deposit() {
		System.out.println(" in SB acoount....");

	}

	@Override
	public int withdraw() {
		System.out.println(" in SB acoount.. withdraw ..");
		return 0;
	}
}
