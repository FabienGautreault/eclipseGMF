/**
 * <copyright>
 * </copyright>
 *
 * $Id: ButtonDefaultState.java,v 1.3 2010/07/27 13:14:39 kf288526 Exp $
 */
package imagindata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Button Default State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see imagindata.imagindataPackage#getButtonDefaultState()
 * @model
 * @generated
 */
public enum ButtonDefaultState implements Enumerator {
	/**
	 * The '<em><b>Invisible</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVISIBLE_VALUE
	 * @generated
	 * @ordered
	 */
	INVISIBLE(0, "Invisible", "Invisible"),

	/**
	 * The '<em><b>Enabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ENABLED(1, "Enabled", "Enabled"),

	/**
	 * The '<em><b>Disabled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISABLED_VALUE
	 * @generated
	 * @ordered
	 */
	DISABLED(2, "Disabled", "Disabled");

	/**
	 * The '<em><b>Invisible</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Invisible</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVISIBLE
	 * @model name="Invisible"
	 * @generated
	 * @ordered
	 */
	public static final int INVISIBLE_VALUE = 0;

	/**
	 * The '<em><b>Enabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENABLED
	 * @model name="Enabled"
	 * @generated
	 * @ordered
	 */
	public static final int ENABLED_VALUE = 1;

	/**
	 * The '<em><b>Disabled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disabled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISABLED
	 * @model name="Disabled"
	 * @generated
	 * @ordered
	 */
	public static final int DISABLED_VALUE = 2;

	/**
	 * An array of all the '<em><b>Button Default State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ButtonDefaultState[] VALUES_ARRAY =
		new ButtonDefaultState[] {
			INVISIBLE,
			ENABLED,
			DISABLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Button Default State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ButtonDefaultState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Button Default State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ButtonDefaultState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ButtonDefaultState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Button Default State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ButtonDefaultState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ButtonDefaultState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Button Default State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ButtonDefaultState get(int value) {
		switch (value) {
			case INVISIBLE_VALUE: return INVISIBLE;
			case ENABLED_VALUE: return ENABLED;
			case DISABLED_VALUE: return DISABLED;
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
	private ButtonDefaultState(int value, String name, String literal) {
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
	
} //ButtonDefaultState
