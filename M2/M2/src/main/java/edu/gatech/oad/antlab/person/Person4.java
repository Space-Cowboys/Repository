package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Bob
 *  @version 1.1
 */
public class Person4 {
/** Holds the persons real name */
	private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
	public Person4(String pname) {
		name = pname;
	}
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 4 put your implementation here
    	char[] array = input.toCharArray();
    	char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        boolean found = false;
        String eString = "";
    	for (int i = 0; i < input.length(); i++) {
            found = false;
    		for (int j = 0; j < alpha.length; j++) {
                 if (array[i] == alpha[j]) {
    				array[i] = alpha[j + 1];
                    eString += array[i];
                    found = true;
                    break;
    			}
    		}
             if (!found) {
                    int thing = Character.getNumericValue(array[i]);
                    thing++;
                    array[i] = 0;
                    eString += thing;
    		
    	}
    }
            return eString;
}
    
    /**
     * Return a string rep of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
    	return name + calc(input);
    }

}

