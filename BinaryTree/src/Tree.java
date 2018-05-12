
class Tree {
    
    int value;
    Tree left;
    Tree right;
    
    public Tree() {
        value = 0;
        left = null;
        right = null;
    }
    
    public Tree(int value) {
        value = this.value;
        left = null;
        right = null;
    }
    
    public int getValue() {
    	return value;
    }
    
    public Tree getLeft() {
        return left;
    }
    
    public Tree getRight() {
        return right;
    }
}