/**
 */
package ssda_research;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Under Sampling technique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage#getUnderSampling_technique()
 * @model
 * @generated
 */
public enum UnderSampling_technique implements Enumerator {
	/**
	 * The '<em><b>Tomek Links</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOMEK_LINKS_VALUE
	 * @generated
	 * @ordered
	 */
	TOMEK_LINKS(0, "TomekLinks", "TomekLinks"),

	/**
	 * The '<em><b>Near Miss</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_MISS_VALUE
	 * @generated
	 * @ordered
	 */
	NEAR_MISS(1, "NearMiss", "NearMiss");

	/**
	 * The '<em><b>Tomek Links</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOMEK_LINKS
	 * @model name="TomekLinks"
	 * @generated
	 * @ordered
	 */
	public static final int TOMEK_LINKS_VALUE = 0;

	/**
	 * The '<em><b>Near Miss</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEAR_MISS
	 * @model name="NearMiss"
	 * @generated
	 * @ordered
	 */
	public static final int NEAR_MISS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Under Sampling technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnderSampling_technique[] VALUES_ARRAY = new UnderSampling_technique[] { TOMEK_LINKS,
			NEAR_MISS, };

	/**
	 * A public read-only list of all the '<em><b>Under Sampling technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnderSampling_technique> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Under Sampling technique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnderSampling_technique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnderSampling_technique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Under Sampling technique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnderSampling_technique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnderSampling_technique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Under Sampling technique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UnderSampling_technique get(int value) {
		switch (value) {
		case TOMEK_LINKS_VALUE:
			return TOMEK_LINKS;
		case NEAR_MISS_VALUE:
			return NEAR_MISS;
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
	private UnderSampling_technique(int value, String name, String literal) {
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

} //UnderSampling_technique
