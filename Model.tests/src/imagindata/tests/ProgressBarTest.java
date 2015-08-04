/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imagindata.tests;

import imagindata.ProgressBar;
import imagindata.imagindataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Progress Bar</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProgressBarTest extends ObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProgressBarTest.class);
	}

	/**
	 * Constructs a new Progress Bar test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressBarTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Progress Bar test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ProgressBar getFixture() {
		return (ProgressBar)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(imagindataFactory.eINSTANCE.createProgressBar());
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

} //ProgressBarTest
