/**
 * generated by Xtext
 */
package org.xtext.nordakademie.evaluation.validation;

import com.google.common.base.Objects;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.xtext.nordakademie.evaluation.evaluation.Bullet;
import org.xtext.nordakademie.evaluation.evaluation.Chart;
import org.xtext.nordakademie.evaluation.evaluation.EvaluationPackage;
import org.xtext.nordakademie.evaluation.evaluation.Graduation;
import org.xtext.nordakademie.evaluation.evaluation.Question;
import org.xtext.nordakademie.evaluation.evaluation.Selection;
import org.xtext.nordakademie.evaluation.validation.AbstractEvaluationValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class EvaluationValidator extends AbstractEvaluationValidator {
  @Check
  public void noEmptyQuestions(final Question question) {
    String _questionText = question.getQuestionText();
    boolean _isEmpty = _questionText.isEmpty();
    if (_isEmpty) {
      this.error("Please insert a question", EvaluationPackage.Literals.QUESTION__QUESTION_TEXT);
    }
  }
  
  @Check
  public void noEmptyBulletPoints(final Bullet bullet) {
    String _bulletText = bullet.getBulletText();
    boolean _isEmpty = _bulletText.isEmpty();
    if (_isEmpty) {
      this.error("Please insert a bullet point", EvaluationPackage.Literals.BULLET__BULLET_TEXT);
    }
  }
  
  @Check
  public void noDoubleBulletPoints(final Selection choice) {
    HashMap<String, Bullet> nameToBullet = CollectionLiterals.<String, Bullet>newHashMap();
    EList<Bullet> _bullets = choice.getBullets();
    for (final Bullet bullet : _bullets) {
      {
        String _bulletText = bullet.getBulletText();
        final Bullet choiceWithSameName = nameToBullet.put(_bulletText, bullet);
        boolean _notEquals = (!Objects.equal(choiceWithSameName, null));
        if (_notEquals) {
          this.error("Duplicate Bullet Point", bullet, EvaluationPackage.Literals.BULLET__BULLET_TEXT);
          this.error("Duplicate Bullet Point", choiceWithSameName, EvaluationPackage.Literals.BULLET__BULLET_TEXT);
        }
      }
    }
  }
  
  @Check
  public void noDoubleChartGraduation(final Chart question) {
    HashMap<String, Graduation> nameToGraduation = CollectionLiterals.<String, Graduation>newHashMap();
    EList<Graduation> _graduations = question.getGraduations();
    for (final Graduation graduation : _graduations) {
      {
        String _graduationText = graduation.getGraduationText();
        final Graduation graduationWithSameName = nameToGraduation.put(_graduationText, graduation);
        boolean _notEquals = (!Objects.equal(graduationWithSameName, null));
        if (_notEquals) {
          this.error("Duplicate Graduation", graduation, EvaluationPackage.Literals.GRADUATION__GRADUATION_TEXT);
          this.error("Duplicate Graduation", graduationWithSameName, EvaluationPackage.Literals.GRADUATION__GRADUATION_TEXT);
        }
      }
    }
  }
}
