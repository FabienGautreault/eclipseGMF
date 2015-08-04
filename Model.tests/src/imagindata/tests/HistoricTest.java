/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imagindata.tests;

import imagindata.Historic;
import imagindata.imagindataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Historic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistoricTest extends StateObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HistoricTest.class);
	}

	/**
	 * Constructs a new Historic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoricTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Historic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Historic getFixture() {
		return (Historic)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(imagindataFactory.eINSTANCE.createHistoric());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HistoricTest
