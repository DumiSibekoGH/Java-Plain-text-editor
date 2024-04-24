/**
 * @author sibekodumisani
 *
 */

public class UndoManager {
    private final Stack<String> history = new Stack<>();
    

    //records the current state into the stack
    public void record(String state) {
    	history.push(state);
    }

    //removes the top state in the stack and returns the new current state
    public String undo() {
    	String s = history.pop();
    	
    	if(s != null)
    		return s;
    	else
    		return "";
    }
    
}

