package model;


public class SearchBinaryTree_Node<T> {
    public int data;
    public SearchBinaryTree_Node<T> leftChild;
    public SearchBinaryTree_Node<T> rightChild;
    
    public SearchBinaryTree_Node(){
        this.data= 0;
        this.leftChild=this.rightChild=null;
    }
    
    public SearchBinaryTree_Node(T da){
        this.data=(int) da;
        this.leftChild=this.rightChild=null;
    }
    
    public SearchBinaryTree_Node(T da,SearchBinaryTree_Node<T> left,SearchBinaryTree_Node<T>right){
        this.data=(int) da;
        this.leftChild=left;
        this.rightChild=right;
    }
    
    public int getData() {
        return data;
    }
    public void setData(T data) {
		this.data = (int) data;
    }
    public SearchBinaryTree_Node<T> getLeftChild() {
        return leftChild;
    }
    public void setLeftChild(SearchBinaryTree_Node<T> leftChild) {
        this.leftChild = leftChild;
    }
    public SearchBinaryTree_Node<T> getRightChild() {
        return rightChild;
    }
    public void setRightChild(SearchBinaryTree_Node<T> rightChild) {
        this.rightChild = rightChild;
    }
    
    public boolean isLeaf(){
        if(this.leftChild==null&&this.rightChild==null){
            return true;
        }
        return false;
    }

	@Override
	public String toString() {
		return "Nodo with data=" + data + ", leftChild=" + leftChild + ", rightChild=" + rightChild + "]";
	}
    
    
    
 
}
 
