package com.wellnr.generator;

import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class StringUtil {
  public String comment(final String s) {
    return this.extend(s, "# ", "");
  }
  
  public String echo(final String s) {
    return this.extend(s, "echo \"", "\"");
  }
  
  public String ensureSentence(final String s) {
    String _xifexpression = null;
    boolean _or = false;
    boolean _or_1 = false;
    boolean _endsWith = s.endsWith(".");
    if (_endsWith) {
      _or_1 = true;
    } else {
      boolean _endsWith_1 = s.endsWith("!");
      _or_1 = _endsWith_1;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _endsWith_2 = s.endsWith("?");
      _or = _endsWith_2;
    }
    if (_or) {
      _xifexpression = s;
    } else {
      _xifexpression = (s + ".");
    }
    return _xifexpression;
  }
  
  public String extend(final String s, final String prefix, final String postfix) {
    String[] _split = s.split("\n");
    final Function1<String, String> _function = (String line) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(prefix, "");
      _builder.append(line, "");
      _builder.append(postfix, "");
      return _builder.toString();
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
    return this.mkString(_map, "\n");
  }
  
  public String mkString(final List<String> strings, final String seperator) {
    final Function2<String, String, String> _function = (String seed, String string) -> {
      String _xblockexpression = null;
      {
        String result = seed;
        int _length = seed.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          result = (result + seperator);
        }
        _xblockexpression = (result + string);
      }
      return _xblockexpression;
    };
    return IterableExtensions.<String, String>fold(strings, "", _function);
  }
  
  public String trimLines(final String s) {
    String _xblockexpression = null;
    {
      final String indent = s.replaceAll("^(\\s*)(?s)(.*)", "$1");
      String[] _split = s.split("\n");
      final Function1<String, String> _function = (String line) -> {
        String _xifexpression = null;
        int _length = line.length();
        int _length_1 = indent.length();
        boolean _greaterEqualsThan = (_length >= _length_1);
        if (_greaterEqualsThan) {
          int _length_2 = indent.length();
          int _minus = (_length_2 - 1);
          _xifexpression = line.substring(_minus);
        } else {
          _xifexpression = line;
        }
        return _xifexpression;
      };
      List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_split)), _function);
      _xblockexpression = this.mkString(_map, "\n");
    }
    return _xblockexpression;
  }
  
  public String variableName(final String s) {
    String[] _split = s.split("\\|");
    String _last = IterableExtensions.<String>last(((Iterable<String>)Conversions.doWrapArray(_split)));
    String _replace = _last.replace("--", "");
    String _replace_1 = _replace.replace("-", "_");
    return _replace_1.toUpperCase();
  }
  
  public CharSequence variable(final String s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("${");
    String _variableName = this.variableName(s);
    _builder.append(_variableName, "");
    _builder.append("}");
    return _builder;
  }
}
