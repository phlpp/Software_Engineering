/*
 * generated by Xtext
 */
package org.xtext.nordakademie.evaluation.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractEvaluationValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage.eINSTANCE);
		return result;
	}
}
