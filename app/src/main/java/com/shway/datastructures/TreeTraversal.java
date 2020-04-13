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
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_preorder, "Pre-Order: F, B, A, D, C, E, G, I, H"));
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_inorder, "In-Order: A, B, C, D, E, F, G, H, I"));
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.sorted_binary_tree_postorder, "Post-Order: A, C, E, D, B, H, I, G, F"));
        return root;
    }

}
