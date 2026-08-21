class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        // If it's a leaf node, check whether the remaining sum matches
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        // Subtract current node's value and search both subtrees
        int remainingSum = targetSum - root.val;

        return hasPathSum(root.left, remainingSum) ||
               hasPathSum(root.right, remainingSum);
    }
}