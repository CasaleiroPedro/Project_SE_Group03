package state;

import pt.ulisboa.tecnico.learnjava.bank.exceptions.AccountException;
import pt.ulisboa.tecnico.learnjava.sibs.domain.TransferOperation;

public class Registered implements State {

	@Override
	public void process(TransferOperation wrapper) throws AccountException {
		wrapper.getServices().withdraw(wrapper.getSourceIban(), wrapper.getValue());
		wrapper.setState(new Withdrawn());
	}

	@Override
	public void cancel(TransferOperation wrapper) {
		wrapper.setState(new Cancelled());
	}

}
