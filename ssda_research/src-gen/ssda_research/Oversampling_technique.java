/**
 */
package ssda_research;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Oversampling technique</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ssda_research.Ssda_researchPackage#getOversampling_technique()
 * @model
 * @generated
 */
public enum Oversampling_technique implements Enumerator {
	/**
	 * The '<em><b>SMOTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOTE_VALUE
	 * @generated
	 * @ordered
	 */
	SMOTE(0, "SMOTE", "SMOTE"),

	/**
	 * The '<em><b>Random Over Sampler</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_OVER_SAMPLER_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_OVER_SAMPLER(1, "RandomOverSampler", "RandomOverSampler"),

	/**
	 * The '<em><b>ADASYN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADASYN_VALUE
	 * @generated
	 * @ordered
	 */
	ADASYN(2, "ADASYN", "ADASYN");

	/**
	 * The '<em><b>SMOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMOTE_VALUE = 0;

	/**
	 * The '<em><b>Random Over Sampler</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_OVER_SAMPLER
	 * @model name="RandomOverSampler"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_OVER_SAMPLER_VALUE = 1;

	/**
	 * The '<em><b>ADASYN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADASYN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADASYN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Oversampling technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Oversampling_technique[] VALUES_ARRAY = new Oversampling_technique[] { SMOTE,
			RANDOM_OVER_SAMPLER, ADASYN, };

	/**
	 * A public read-only list of all the '<em><b>Oversampling technique</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Oversampling_technique> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Oversampling technique</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Oversampling_technique get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Oversampling_technique result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Oversampling technique</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Oversampling_technique getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Oversampling_technique result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Oversampling technique</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Oversampling_technique get(int value) {
		switch (value) {
		case SMOTE_VALUE:
			return SMOTE;
		case RANDOM_OVER_SAMPLER_VALUE:
			return RANDOM_OVER_SAMPLER;
		case ADASYN_VALUE:
			return ADASYN;
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
	private Oversampling_technique(int value, String name, String literal) {
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

} //Oversampling_technique
