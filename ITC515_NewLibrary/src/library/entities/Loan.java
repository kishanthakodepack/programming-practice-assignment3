/**
 * 
 */
package library.entities;

import java.util.Date;

import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
 * @author Kishantha
 *
 */
public class Loan implements ILoan {

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#commit(int)
	 */
	@Override
	public void commit(int id) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#complete()
	 */
	@Override
	public void complete() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#isOverDue()
	 */
	@Override
	public boolean isOverDue() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#checkOverDue(java.util.Date)
	 */
	@Override
	public boolean checkOverDue(Date currentDate) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#getBorrower()
	 */
	@Override
	public IMember getBorrower() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#getBook()
	 */
	@Override
	public IBook getBook() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.ILoan#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
