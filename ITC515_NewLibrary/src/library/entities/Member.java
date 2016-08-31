/**
 * 
 */
package library.entities;

import java.util.List;

import library.interfaces.entities.EMemberState;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

/**
 * @author user
 *
 */
public class Member implements IMember {

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#hasOverDueLoans()
	 */
	@Override
	public boolean hasOverDueLoans() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#hasReachedLoanLimit()
	 */
	@Override
	public boolean hasReachedLoanLimit() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#hasFinesPayable()
	 */
	@Override
	public boolean hasFinesPayable() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#hasReachedFineLimit()
	 */
	@Override
	public boolean hasReachedFineLimit() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getFineAmount()
	 */
	@Override
	public float getFineAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#addFine(float)
	 */
	@Override
	public void addFine(float fine) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#payFine(float)
	 */
	@Override
	public void payFine(float payment) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#addLoan(library.interfaces.entities.ILoan)
	 */
	@Override
	public void addLoan(ILoan loan) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getLoans()
	 */
	@Override
	public List<ILoan> getLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#removeLoan(library.interfaces.entities.ILoan)
	 */
	@Override
	public void removeLoan(ILoan loan) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getState()
	 */
	@Override
	public EMemberState getState() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getFirstName()
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getLastName()
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getContactPhone()
	 */
	@Override
	public String getContactPhone() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getEmailAddress()
	 */
	@Override
	public String getEmailAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see library.interfaces.entities.IMember#getID()
	 */
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
