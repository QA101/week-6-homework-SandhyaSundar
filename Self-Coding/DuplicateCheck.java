
public class DuplicateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String s="chedkocrtaaasscked";
		   
		  int distinct = 0 ;
		      for (int i = 0; i < s.length(); i++) {
		           for (int j = 0; j < s.length(); j++) {
		              if(s.charAt(i)==s.charAt(j))
		            {
		                distinct++;
		            }
		        }   
		           System.out.println(s.charAt(i)+"="+distinct);
		               String d=String.valueOf(s.charAt(i)).trim();
		                      s= s.replaceAll(d,"");
		                      distinct = 0;

		    }

		}
	}
//https://beginnersbook.com/2014/07/java-program-to-find-duplicate-characters-in-a-string/
