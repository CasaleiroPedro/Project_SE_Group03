package state;

import pt.ulisboa.tecnico.learnjava.bank.exceptions.AccountException;
import pt.ulisboa.tecnico.learnjava.sibs.domain.TransferOperation;

public class Error implements State {

	@Override
	public void process(TransferOperation wrapper) throws AccountException {
		// TODO Auto-generated method stub

	}

	@Override
	public void cancel(TransferOperation wrapper) throws AccountException {
		// TODO Auto-generated method stub

	}

}
