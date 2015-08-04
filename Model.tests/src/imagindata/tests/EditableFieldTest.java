/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package imagindata.tests;

import imagindata.EditableField;
import imagindata.imagindataFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Editable Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EditableFieldTest extends ObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EditableFieldTest.class);
	}

	/**
	 * Constructs a new Editable Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EditableFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Editable Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EditableField getFixture() {
		return (EditableField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(imagindataFactory.eINSTANCE.createEditableField());
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

} //EditableFieldTest
