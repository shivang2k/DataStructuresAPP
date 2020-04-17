package com.shway.datastructures;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TreeTraversal extends Fragment {


    public TreeTraversal() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_binary_tree, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.bt);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_node_orders, "Pre, In and Post nodes order"));
        linearLayout.addView(ctv.mainHead("Binary Tree Traversals", container.getContext()));
        linearLayout.addView(ctv.normalText("A binary tree is traversed when one needs to access or display its elements. Each method produces a different order of elements that may be useful in scenarios when needed.\n" +
                "\n" +
                "There are three types of binary tree traversals:", container.getContext()));

        linearLayout.addView(ctv.subHead("1. Inorder [Left - Root - Right]", container.getContext()));
        linearLayout.addView(ctv.normalText("In this traversal, the left child node is visited first, then the root node is visited and later we go for visiting the right child node.", container.getContext()));
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_inorder, "In-Order: A, B, C, D, E, F, G, H, I"));

        linearLayout.addView(ccv.Code(container.getContext(), "void inorder_traversal(struct node* root) {\n" +
                "  if (root != NULL) {\n" +
                "    inorder_traversal(root -> leftChild);\n" +
                "    printf(\"%d \", root -> data);          \n" +
                "    inorder_traversal(root -> rightChild);\n" +
                "  }\n" +
                "}"));
        linearLayout.addView(ctv.subHead("2. Preorder [Root - Left - Right]", container.getContext()));
        linearLayout.addView(ctv.normalText("In this traversal, the root node is visited first, then its left child and later its right child. ", container.getContext()));
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_preorder, "Pre-Order: F, B, A, D, C, E, G, I, H"));
        linearLayout.addView(ccv.Code(container.getContext(), "void preorder_traversal(struct node* root) {\n" +
                "  if (root != NULL) {\n" +
                "    printf(\"%d \", root -> data);\n" +
                "    pre_order_traversal(root -> leftChild);\n" +
                "    pre_order_traversal(root -> rightChild);\n" +
                "  }\n" +
                "}"));


        linearLayout.addView(ctv.subHead("3. Postorder [Left - Right - Root]", container.getContext()));
        linearLayout.addView(ctv.normalText("In this traversal, the left child node is visited first, then its right child and then its root node.", container.getContext()));
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_postorder, "Post-Order: A, C, E, D, B, H, I, G, F"));
        linearLayout.addView(ccv.Code(container.getContext(), "void postorder_traversal(struct node* root) {\n" +
                "  if(root != NULL) {\n" +
                "    post_order_traversal(root -> leftChild);\n" +
                "    post_order_traversal(root -> rightChild);\n" +
                "    printf(\"%d \", root -> data);\n" +
                "  }\n" +
                "}"));
        return root;
    }

}
