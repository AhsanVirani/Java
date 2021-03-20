public class BinaryTree<T> {
    private BinaryNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryNode<T> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<T> root) {
        this.root = root;
    }

    public void insert(T data) {
        // Base case root = 0
        if(this.root == null) {
            BinaryNode<T> node = new BinaryNode<T>(data);
            this.root = node;
            return;
        }
        // wrapper for recursion
        if (data < this.root.getData()) {
            insertR(this.root.getLeft(), data);
        } else {
            insertR(this.root.getRight(), data);
        }

    }

    private void insertR(BinaryNode<T> node, T data) {
        // insert left


        // insert right

    }
}
