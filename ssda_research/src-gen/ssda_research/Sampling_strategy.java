/**
 */
package ssda_research;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Sampling strategy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage#getSampling_strategy()
 * @model
 * @generated
 */
public enum Sampling_strategy implements Enumerator {
	/**
	 * The '<em><b>Minority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINORITY_VALUE
	 * @generated
	 * @ordered
	 */
	MINORITY(0, "minority", "minority"),

	/**
	 * The '<em><b>Majority</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJORITY_VALUE
	 * @generated
	 * @ordered
	 */
	MAJORITY(1, "majority", "majority");

	/**
	 * The '<em><b>Minority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MINORITY
	 * @model name="minority"
	 * @generated
	 * @ordered
	 */
	public static final int MINORITY_VALUE = 0;

	/**
	 * The '<em><b>Majority</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAJORITY
	 * @model name="majority"
	 * @generated
	 * @ordered
	 */
	public static final int MAJORITY_VALUE = 1;

	/**
	 * An array of all the '<em><b>Sampling strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Sampling_strategy[] VALUES_ARRAY = new Sampling_strategy[] { MINORITY, MAJORITY, };

	/**
	 * A public read-only list of all the '<em><b>Sampling strategy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Sampling_strategy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sampling strategy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sampling_strategy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sampling_strategy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sampling strategy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sampling_strategy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Sampling_strategy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sampling strategy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Sampling_strategy get(int value) {
		switch (value) {
		case MINORITY_VALUE:
			return MINORITY;
		case MAJORITY_VALUE:
			return MAJORITY;
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
	private Sampling_strategy(int value, String name, String literal) {
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

} //Sampling_strategy
