
public class AVLTree {
	private AVLNode root;     
	private Comperator comperator;
	
    /* Constructor */
    public AVLTree(Comperator comperator)
    {
    	this.comperator = comperator;
        root = null;
    }
    /* Function to check if tree is empty */
    public boolean isEmpty()
    {
        return root == null;
    }
   
  
    public void insert(Comperable data)
    {
        root = insert(data, root);
    }
    /* Function to get height of node */
    private int height(AVLNode t )
    {
        return t == null ? -1 : t.height;
    }
    /* Function to max of left/right node */
    private int max(int lhs, int rhs)
    {
        return lhs > rhs ? lhs : rhs;
    }
    /* Function to insert data recursively */
    private AVLNode insert(Comperable data, AVLNode t)
    {
        if (t == null)
            t = new AVLNode(data);
        else if ( comperator.compareTo(data, t.data) < 0 )
        {
            t.left = insert( data, t.left );
            if( height( t.left ) - height( t.right ) == 2 )
                if(comperator.compareTo(data, t.left.data) < 0 )
                    t = rotateWithLeftChild( t );
                else
                    t = doubleWithLeftChild( t );
        }
        else if( comperator.compareTo(data, t.data) > 0)
        {
            t.right = insert( data, t.right );
            if( height( t.right ) - height( t.left ) == 2 )
                if( comperator.compareTo(data, t.left.data) > 0)
                    t = rotateWithRightChild( t );
                else
                    t = doubleWithRightChild( t );
        }
        else
          ;  // Duplicate; do nothing
        t.height = max( height( t.left ), height( t.right ) ) + 1;
        return t;
    }
    /* Rotate binary tree node with left child */     
    private AVLNode rotateWithLeftChild(AVLNode k2)
    {
        AVLNode k1 = k2.left;
        k2.left = k1.right;
        k1.right = k2;
        k2.height = max( height( k2.left ), height( k2.right ) ) + 1;
        k1.height = max( height( k1.left ), k2.height ) + 1;
        return k1;
    }

    /* Rotate binary tree node with right child */
    private AVLNode rotateWithRightChild(AVLNode k1)
    {
        AVLNode k2 = k1.right;
        k1.right = k2.left;
        k2.left = k1;
        k1.height = max( height( k1.left ), height( k1.right ) ) + 1;
        k2.height = max( height( k2.right ), k1.height ) + 1;
        return k2;
    }
    /**
     * Double rotate binary tree node: first left child
     * with its right child; then node k3 with new left child */
    private AVLNode doubleWithLeftChild(AVLNode k3)
    {
        k3.left = rotateWithRightChild( k3.left );
        return rotateWithLeftChild( k3 );
    }
    /**
     * Double rotate binary tree node: first right child
     * with its left child; then node k1 with new right child */      
    private AVLNode doubleWithRightChild(AVLNode k1)
    {
        k1.right = rotateWithLeftChild( k1.right );
        return rotateWithRightChild( k1 );
    }    
    /* Functions to count number of nodes */
    public int countNodes()
    {
        return countNodes(root);
    }
    private int countNodes(AVLNode r)
    {
        if (r == null)
            return 0;
        else
        {
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }

    public Comperable search(Comperable data)
    {
        return search(root, data);
    }
    private Comperable search(AVLNode r, Comperable val)
    {
    	Comperable found = null;
        while ((r != null) && found==null)
        {
        	Comperable rval = ((RowPointer)r.data).getData();
            if (comperator.compareTo(val, rval) < 0)
                r = r.left;
            else if (comperator.compareTo(val, rval) > 0)
                r = r.right;
            else
            {
                found = rval;
                break;
            }
            found = search(r, val);
        }
        
        
        return r !=null ? r.getData() : null;
    }
    
  
    public void inorder()
    {
        inorder(root);
    }
    private void inorder(AVLNode r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data.toString() +" ");
            inorder(r.right);
        }
    }
   
}
