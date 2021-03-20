public class BinaryNode<T>{
    private BinaryNode<T> left;
    private BinaryNode<T> right;
    private Data<T extends Comparable<T>> data;

    private class Data<T extends Comparable<T>> {
        T data;

        public Data(T data) {
            this.data = data;
        }

        public int compareTo(T object) {
            if (object == null) {
                throw new NullPointerException();
            }
            return this.data.compareTo(object);
        }


    }

    public <T extends Comparable<T>> BinaryNode(T data) {
        this.left = null;
        this.right = null;
        this.data = new Data<T>(data);
    }


    public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }


    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "left=" + left +
                ", right=" + right +
                ", data=" + data +
                '}';
    }

}