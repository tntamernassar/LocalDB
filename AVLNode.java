
public class AVLNode {
	AVLNode left, right;
    Comperable data;
    int height;

  
    public AVLNode()
    {
        left = null;
        right = null;
        data = null;
        height = 0;
    }

    public AVLNode(Comperable data)
    {
        left = null;
        right = null;
        this.data = data;
        height = 0;
    }  
    
    
    public Comperable getData() {
    	return this.data;
    }
}
