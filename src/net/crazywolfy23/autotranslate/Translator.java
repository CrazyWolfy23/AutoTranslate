package net.crazywolfy23.autotranslate;

public class Translator {
	//_ZN4Item7setIconERKSsi Example
	Auto auto;
	String s;
	public Translator(Auto auto,String text){
		this.auto = auto;
		s = text;
		s = s.substring(3);
		char[] temp_1 = s.toCharArray();
		if(temp_1[0] == "K".toCharArray()[0]){
			s = s.substring(1);
		}
		s = s.substring(1);
		char[] temp_2 = s.toCharArray();
		boolean temp_3 = false;
		String s_1 = "";
		for(int i = 0; i<temp_2.length; i++){
			if(temp_2[i] == "0".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "1".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "2".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "3".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "4".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "5".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "6".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "7".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "8".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_2[i] == "9".toCharArray()[0]){
				if(!temp_3){
					s_1 = s_1+"::";
					temp_3 = true;
				}
			}
			else if(temp_3){
				String temp_s = "";
				for(int j = i; j<temp_2.length; j++){
					temp_s = temp_s+temp_2[j];
				}
				s = s_1+temp_s;
				break;
			}else{
				s_1 = s_1+temp_2[i];
			}
		}
		String s_2 = s.split("E")[s.split("E").length-1];
		s = substringBackwards(s,s_2.length()+1);
		s_2 = replaceFirst(s_2,"R","");
		String s_3 = "";
		boolean b_1 = false;
		boolean b_2 = false;
		for(int i = 0; i<s_2.length(); i++){
			if(s_2.toCharArray()[i] == "K".toCharArray()[0]){
				b_1 = true;
			}
			else if(s_2.toCharArray()[i] == "S".toCharArray()[0]){
				if(s_2.toCharArray()[i+1] == "s".toCharArray()[0]){
					if(b_1){
						if(b_2){
							s_3 = s_3+", const std::string&";
						}else{
							s_3 = s_3+"const std::string&";
						}
						b_1 = false;
					}else{
						if(b_2){
							s_3 = s_3+", std::string";
						}else{
							s_3 = s_3+"std::string";
						}
					}
					b_2 = true;
				}
			}
			else if(s_2.toCharArray()[i] == "i".toCharArray()[0]){
				if(b_1){
					if(b_2){
						s_3 = s_3+", const int&";
					}else{
						s_3 = s_3+"const int&";
					}
					b_1 = false;
				}else{
					if(b_2){
						s_3 = s_3+", int";
					}else{
						s_3 = s_3+"int";
					}
				}
				b_2 = true;
			}
			else if(s_2.toCharArray()[i] == "h".toCharArray()[0]){
				if(b_1){
					if(b_2){
						s_3 = s_3+", const unsigned char&";
					}else{
						s_3 = s_3+"const unsigned char&";
					}
				}
				else{
					if(b_2){
						s_3 = s_3+", unsigned char";
					}else{
						s_3 = s_3+"unsigned char";
					}
				}
				b_2 = true;
			}
			else if(s_2.toCharArray()[i] == "v".toCharArray()[0]){
				if(b_1){
					if(b_2){
						s_3 = s_3+", const void&";
					}else{
						s_3 = s_3+"const void&";
					}
				}
				else{
					if(b_2){
						s_3 = s_3+", void";
					}else{
						s_3 = s_3+"void";
					}
				}
				b_2 = true;
			}
			if(s_2.toCharArray()[i] == "a".toCharArray()[0]){
				if(b_1){
					if(b_2){
						s_3 = s_3+", const signed char&";
					}else{
						s_3 = s_3+"const signed char&";
					}
				}
				else{
					if(b_2){
						s_3 = s_3+", signed char";
					}else{
						s_3 = s_3+"signed char";
					}
				}
				b_2 = true;
			}
			if(s_2.toCharArray()[i] == "f".toCharArray()[0]){
				if(b_1){
					if(b_2){
						s_3 = s_3+", const float&";
					}else{
						s_3 = s_3+"const float&";
					}
				}
				else{
					if(b_2){
						s_3 = s_3+", float";
					}else{
						s_3 = s_3+"float";
					}
				}
				b_2 = true;
			}
			if(s_2.toCharArray()[i] == "b".toCharArray()[0]){
				if(b_1){
					if(b_2){
						s_3 = s_3+", const boolean&";
					}else{
						s_3 = s_3+"const boolean&";
					}
				}
				else{
					if(b_2){
						s_3 = s_3+", boolean";
					}else{
						s_3 = s_3+"boolean";
					}
				}
				b_2 = true;
			}
		}
		s = s+"("+s_3+");";
		auto.mFrame.output.setText(s);
	}
	
	public String replaceFirst(String s, String ss, String sss){
		String ssss = "";
		if(s.length() >= ss.length()){
			for(int i = 0; i<ss.length(); i++){
				ssss = ssss+s.charAt(i);
			}
			if(ssss.equals(ss)){
				s = s.substring(ss.length());
				s = sss+s;
			}
		}
		return s;
	}
	
	public String substringBackwards(String s, int i){
		String ss = "";
		String sss = "";
		for(int j = 0; j<s.length(); j++){
			ss = ss+s.charAt((s.length()-1)-j);
		}
		ss = ss.substring(i);
		for(int j = 0; j<ss.length(); j++){
			sss = sss+ss.charAt((ss.length()-1)-j);
		}
		return sss;
	}
}
