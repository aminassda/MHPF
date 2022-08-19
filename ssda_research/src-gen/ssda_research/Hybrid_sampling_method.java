/**
 */
package ssda_research;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hybrid sampling method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage#getHybrid_sampling_method()
 * @model
 * @generated
 */
public enum Hybrid_sampling_method implements Enumerator {
	/**
	 * The '<em><b>SMOTE Tomek</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOTE_TOMEK_VALUE
	 * @generated
	 * @ordered
	 */
	SMOTE_TOMEK(0, "SMOTETomek", "SMOTETomek");

	/**
	 * The '<em><b>SMOTE Tomek</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOTE_TOMEK
	 * @model name="SMOTETomek"
	 * @generated
	 * @ordered
	 */
	public static final int SMOTE_TOMEK_VALUE = 0;

	/**
	 * An array of all the '<em><b>Hybrid sampling method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Hybrid_sampling_method[] VALUES_ARRAY = new Hybrid_sampling_method[] { SMOTE_TOMEK, };

	/**
	 * A public read-only list of all the '<em><b>Hybrid sampling method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Hybrid_sampling_method> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hybrid sampling method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Hybrid_sampling_method get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Hybrid_sampling_method result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hybrid sampling method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Hybrid_sampling_method getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Hybrid_sampling_method result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hybrid sampling method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Hybrid_sampling_method get(int value) {
		switch (value) {
		case SMOTE_TOMEK_VALUE:
			return SMOTE_TOMEK;
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
	private Hybrid_sampling_method(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //Hybrid_sampling_method
