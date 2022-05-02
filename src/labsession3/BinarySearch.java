package labsession3;

import java.util.HashSet;
import java.util.Scanner;

public class BinarySearch {
	static class Node {
        int data;
        Node left, right;
    };
 
    static Node NewNode(int data)
    {
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
 
    static Node insert(Node root, int key)
    {
        if (root == null)
            return NewNode(key);
        if (key < root.data)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);
        return root;
    }
 
    static boolean FindPair(Node root, int sum,HashSet<Integer> set)
    {
        if (root == null)
            return false;
 
        if (FindPair(root.left, sum, set))
            return true;
 
        if (set.contains(sum - root.data)) {
            System.out.println("Pair is ("+ (sum - root.data) + ", "+ root.data + ")");
            return true;
        }
        else
            set.add(root.data);
 
        return FindPair(root.right, sum, set);
    }
 
    static void findPair(Node root, int sum)
    {
        HashSet<Integer> set = new HashSet<Integer>();
        if (!FindPair(root, sum, set))
            System.out.print("nodes are not found"+ "\n");
    }
 
    // Driver code
    public static void main(String[] args)
    {
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Sum");
    	int sum=sc.nextInt();
        Node root = null;
        root = insert(root, 15);
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 8);
        root = insert(root, 12);
        root = insert(root, 60);
        root = insert(root, 70);
        root = insert(root, 10);
 
        
        findPair(root, sum);
    }

}
