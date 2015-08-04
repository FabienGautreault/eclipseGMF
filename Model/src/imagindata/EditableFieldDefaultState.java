/**
 * <copyright>
 * </copyright>
 *
 * $Id: EditableFieldDefaultState.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Editable Field Default State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see imagindata.imagindataPackage#getEditableFieldDefaultState()
 * @model
 * @generated
 */
public enum EditableFieldDefaultState implements Enumerator {
	/**
	 * The '<em><b>Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	EMPTY(0, "Empty", "Empty"),

	/**
	 * The '<em><b>Not Empty</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EMPTY_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EMPTY(1, "NotEmpty", "NotEmpty");

	/**
	 * The '<em><b>Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMPTY
	 * @model name="Empty"
	 * @generated
	 * @ordered
	 */
	public static final int EMPTY_VALUE = 0;

	/**
	 * The '<em><b>Not Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Empty</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EMPTY
	 * @model name="NotEmpty"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EMPTY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Editable Field Default State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EditableFieldDefaultState[] VALUES_ARRAY =
		new EditableFieldDefaultState[] {
			EMPTY,
			NOT_EMPTY,
		};

	/**
	 * A public read-only list of all the '<em><b>Editable Field Default State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EditableFieldDefaultState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Editable Field Default State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditableFieldDefaultState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EditableFieldDefaultState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Editable Field Default State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditableFieldDefaultState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EditableFieldDefaultState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Editable Field Default State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EditableFieldDefaultState get(int value) {
		switch (value) {
			case EMPTY_VALUE: return EMPTY;
			case NOT_EMPTY_VALUE: return NOT_EMPTY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EditableFieldDefaultState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EditableFieldDefaultState
