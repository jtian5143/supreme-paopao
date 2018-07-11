import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {
    public static void main(String[] args) {
         //TODO
    }

    private List<Integer> PreOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;

        Stack<TreeNode> visited = new Stack<>();
        visited.push(root);

        while(!visited.isEmpty()) {
            TreeNode cur = visited.pop();
            res.add(cur.val);
            if(cur.right != null) visited.push(cur.right);
            if(cur.left != null) visited.push(cur.left);
        }

        return res;
    }


    private List<Integer> PostOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;

        Stack<TreeNode> visited = new Stack<>();
        visited.push(root);

        while(!visited.isEmpty()) {
            TreeNode cur = visited.pop();
            res.add(0, cur.val);//this is where is different than pre order one
            if(cur.left != null) visited.push(cur.left);
            if(cur.right != null) visited.push(cur.right);
        }

        return res;
    }

    private List<Integer> InOrder(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;

        Stack<TreeNode> visited = new Stack<>();
        TreeNode cur = root;

        while(cur != null || !visited.isEmpty()) {
            while(cur != null) {
                visited.push(cur.left);
                cur = cur.left;
            }
            cur = visited.pop();
            res.add(cur.val);
            cur = cur.right;
        }

        return res;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
