/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imagindata.tests;

import imagindata.InterruptibleRegion;
import imagindata.imagindataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interruptible Region</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InterruptibleRegionTest extends RegionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InterruptibleRegionTest.class);
	}

	/**
	 * Constructs a new Interruptible Region test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleRegionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interruptible Region test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InterruptibleRegion getFixture() {
		return (InterruptibleRegion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(imagindataFactory.eINSTANCE.createInterruptibleRegion());
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

} //InterruptibleRegionTest
