class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot)
    {
        if(root==null)
        {
            return false;
        }
        if(isSub(root,subRoot))
        {
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    
    boolean isSub(TreeNode r,TreeNode s)
    {
        if(r==null || s==null)
        {
            return r==null && s==null;
        }
        if(r.val==s.val)
        {
            return isSub(r.left,s.left) && isSub(r.right,s.right);
        }
        return false;
    }
}
