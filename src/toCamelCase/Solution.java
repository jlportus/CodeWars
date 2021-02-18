package toCamelCase;


class Solution{

	  static String toCamelCase(String s){
		  char[] cadena = s.toCharArray();
		  s = "";
		  for (int i = 0; i < cadena.length; i++) {
			
			  if (cadena[i] == '_' || cadena[i] == '-') {
				s = s.concat((cadena[++i] + "").toUpperCase());
			
			} else {
				s = s.concat(cadena[i] + "");
			}
		}
		return s;
	  }
	}
