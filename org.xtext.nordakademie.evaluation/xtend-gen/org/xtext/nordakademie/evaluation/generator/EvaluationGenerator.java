/**
 * generated by Xtext
 */
package org.xtext.nordakademie.evaluation.generator;

import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.nordakademie.evaluation.evaluation.Chart;
import org.xtext.nordakademie.evaluation.evaluation.Choice;
import org.xtext.nordakademie.evaluation.evaluation.Freetext;
import org.xtext.nordakademie.evaluation.evaluation.Graduation;
import org.xtext.nordakademie.evaluation.evaluation.Page;
import org.xtext.nordakademie.evaluation.evaluation.Question;
import org.xtext.nordakademie.evaluation.evaluation.Rating;
import org.xtext.nordakademie.evaluation.evaluation.Selection;
import org.xtext.nordakademie.evaluation.evaluation.Survey;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class EvaluationGenerator implements IGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final Survey survey = ((Survey) _head);
    EList<Page> _pages = survey.getPages();
    for (final Page page : _pages) {
      String _name = page.getName();
      String _plus = (_name + ".html");
      CharSequence _html = this.toHtml(survey, page);
      fsa.generateFile(_plus, _html);
    }
  }
  
  public CharSequence toHtml(final Survey survey, final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>");
    String _title = survey.getTitle();
    _builder.append(_title, "\t\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>");
    String _title_1 = survey.getTitle();
    _builder.append(_title_1, "\t\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<p>");
    String _greeting = survey.getGreeting();
    _builder.append(_greeting, "\t\t");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      EList<Question> _questions = page.getQuestions();
      for(final Question question : _questions) {
        _builder.append("\t\t\t\t\t\t");
        CharSequence _select = this.select(question);
        _builder.append(_select, "\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _select(final Freetext question) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<label>");
    String _question = question.getQuestion();
    _builder.append(_question, "\t\t");
    _builder.append("</label><br>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("<input type=\"text\" name=\"");
    String _name = question.getName();
    _builder.append(_name, "\t\t");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("</p>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _select(final Selection question) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<label>");
    String _question = question.getQuestion();
    _builder.append(_question, "\t");
    _builder.append("</label><br>");
    _builder.newLineIfNotEmpty();
    {
      EList<Choice> _choices = question.getChoices();
      for(final Choice choice : _choices) {
        _builder.append("\t");
        _builder.append("<input type=\"checkbox\" name=\"");
        String _name = question.getName();
        _builder.append(_name, "\t");
        _builder.append("\" value=\"");
        String _name_1 = choice.getName();
        _builder.append(_name_1, "\t");
        _builder.append("\"/>");
        String _bulletPoint = choice.getBulletPoint();
        _builder.append(_bulletPoint, "\t");
        _builder.newLineIfNotEmpty();
        {
          boolean _isFreetext = choice.isFreetext();
          if (_isFreetext) {
            _builder.append("\t");
            _builder.append("&nbsp;<input type=\"text\" name=\"");
            String _name_2 = choice.getName();
            _builder.append(_name_2, "\t");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("<br>");
        _builder.newLine();
      }
    }
    _builder.append("</p>\t\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _select(final Chart question) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<label>");
    String _question = question.getQuestion();
    _builder.append(_question, "\t");
    _builder.append("</label><br>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<style> table, td, th { border: 1px solid black; } </style>");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<table> ");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<tr> ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<th>&nbsp;</th>");
    _builder.newLine();
    {
      EList<Graduation> _graduations = question.getGraduations();
      for(final Graduation graduation : _graduations) {
        _builder.append("em\t<th>");
        String _statement = graduation.getStatement();
        _builder.append(_statement, "");
        _builder.append("</th>");
        _builder.newLineIfNotEmpty();
        _builder.append("em");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("em</tr> ");
    _builder.newLine();
    {
      EList<Choice> _choices = question.getChoices();
      for(final Choice choice : _choices) {
        _builder.append("<tr>");
        _builder.newLine();
        _builder.append("<td>");
        String _bulletPoint = choice.getBulletPoint();
        _builder.append(_bulletPoint, "");
        _builder.append("</td>");
        _builder.newLineIfNotEmpty();
        {
          EList<Graduation> _graduations_1 = question.getGraduations();
          for(final Graduation graduation_1 : _graduations_1) {
            _builder.append(" ");
            _builder.append("<td><input type=\"radio\" name=\"");
            String _name = question.getName();
            _builder.append(_name, " ");
            _builder.append("\" value=");
            String _name_1 = choice.getName();
            _builder.append(_name_1, " ");
            _builder.append("></td> \t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append(" ");
        _builder.append("</tr>");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("</table> \t\t\t");
    _builder.newLine();
    _builder.append("</p>\t");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _select(final Rating question) {
    throw new Error("Unresolved compilation problems:"
      + "\nno viable alternative at input \'»\\r\\n\\t\\t\\t<input type=\"radio\" name=\"«\'");
  }
  
  public CharSequence select(final Question question) {
    if (question instanceof Chart) {
      return _select((Chart)question);
    } else if (question instanceof Freetext) {
      return _select((Freetext)question);
    } else if (question instanceof Rating) {
      return _select((Rating)question);
    } else if (question instanceof Selection) {
      return _select((Selection)question);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(question).toString());
    }
  }
}
