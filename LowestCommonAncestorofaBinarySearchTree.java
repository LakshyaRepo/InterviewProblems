/*Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants 
(where we allow a node to be a descendant of itself). 

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.


*/ 
 Difficulty Level->Easy
 idea-> Make use of binary search property
 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            
           TreeNode node=root;
            while(node!=null){
                    
                    //case1 if p and q are in left subtree
                    if(p.val < node.val && q.val < node.val)
                     node=node.left;       
                    //case 2--> if p and q are in right subtree
                    else if(p.val > node.val && q.val > node.val)
                    node=node.right;
                    //case 3--> means p and q are on different subtree in this case common ancestor would be node itself
                    else
                        return node;    
             }
            return null;   
            //time complexity-->O(n)
            
        
    }
}
