package com.wellnr.generator

import java.util.List

class StringUtil {
	
	def comment(String s) {
		s.extend("# ", "")
	}
	
	def echo(String s) {
		s.extend("echo \"", "\"")
	}
	
	def ensureSentence(String s) {
		if (s.endsWith(".") || s.endsWith("!") || s.endsWith("?")) {
			s
		} else {
			s + "."
		}
	}
	
	def extend(String s, String prefix, String postfix) {
    s.split("\n").map[line|'''«prefix»«line»«postfix»'''].mkString("\n")
  }
  
  def escape(String s) {
    s.replace("$", "\\$").replace("`", "\\`").replace("\"", "\\\"")
  }
  
	def mkString(List<String> strings, String seperator) {
		strings.fold("") [ seed, string |
			var result = seed;
			
			if (seed.length > 0) {
				result = result + seperator	
			}
			
			result + string
		]
	}
	
	def trimLines(String s) {
		val indent = s.replaceAll("^(\\s*)(?s)(.*)", "$1")
		s.split("\n").map[line|
			if (line.length >= indent.length)
			 line.substring(indent.length - 1)
			else {
				line
			}
		].mkString("\n")
	}
	
	def variableName(String s) {
		s.split("\\|").last.replace("--", "").replace('-', '_').toUpperCase
	}
	
	def variable(String s) {
		'''${«s.variableName»}'''
	}
	
}