
public class binarysearchtree{
    class  TNode{
        int value;
        TNode left;
        TNode right;

        public TNode(int value) {
            this.value =value;
            this.left =null;
            this.right =null;

        }   
    }
    private TNode root = null;

    public void insert(int value){
        TNode n = new TNode(value);
        if (root == null){
            root = n;
            return;
        }

        else{
            TNode temp = root;
            while (true) { 

                if (value <= temp.value){
                    if (temp.left == null){
                        temp.left = n;
                        break;
                    }
                    else{
                        temp= temp.left;
                    }
                }
                else {
                    if (temp.right == null){
                        temp.right = n;
                        break;
                    }
                    else{
                        temp= temp.right;
                    }
                }
            }
        }

    }
    public void show(TNode n){
        if (n == null){
            return;
            

        }
        show(n.left);
        System.out.println(n.value);
        show(n.right);
        //System.out.println(n.right);
    }

   
    public static void main(String[] args) {
        binarysearchtree b = new binarysearchtree();
        b.insert(11);
        b.insert(10);
        b.insert(3);
        b.insert(4);
        b.insert(9);
        b.insert(22);
        b.insert(45);
        b.insert(21);
        b.insert(28);
        b.insert(29);
        b.insert(28);
        b.show(b.root);

    }
}