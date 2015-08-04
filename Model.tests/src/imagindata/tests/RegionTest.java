/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imagindata.tests;

import imagindata.Region;
import imagindata.imagindataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegionTest extends InterfaceContainerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RegionTest.class);
	}

	/**
	 * Constructs a new Region test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Region test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Region getFixture() {
		return (Region)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(imagindataFactory.eINSTANCE.createRegion());
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

} //RegionTest
