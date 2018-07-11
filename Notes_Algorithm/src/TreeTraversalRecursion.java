import java.util.ArrayList;
import java.util.List;

public class TreeTraversalRecursion {
    public static void main(String[] args) {

    }

    private List<Integer> PreOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;

        res.add(root.val);
        res.addAll(PreOrder(root.left));
        res.addAll(PreOrder(root.right));

        return res;
    }

    private List<Integer> InOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;

        res.addAll(InOrder(root.left));
        res.add(root.val);
        res.addAll(InOrder(root.right));

        return res;
    }

    private List<Integer> PostOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) return res;

        res.addAll(PostOrder(root.left));
        res.addAll(PostOrder(root.right));
        res.add(root.val);

        return res;
    }
}

