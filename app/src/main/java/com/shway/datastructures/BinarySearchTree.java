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
public class BinarySearchTree extends Fragment {


    public BinarySearchTree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_binary_search_tree, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.bst);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();
        View head = ctv.mainHead("Binary Search Tree", container.getContext());
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.binary_search_tree, "Binary search tree of size 9 and depth 3 with 8 at the root"));
        View text1 = ctv.normalText(getString(R.string.what_bst), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.opt_bst), container.getContext());
        linearLayout.addView(subHead2);

        View ss1 = ctv.subHead2(getString(R.string.searching), container.getContext());
        View t1= ctv.normalText(getString(R.string.searching_bst), container.getContext());
        linearLayout.addView(ss1);
        linearLayout.addView(t1);

        View ss2 = ctv.subHead2(getString(R.string.insertion), container.getContext());
        View t2 = ctv.normalText(getString(R.string.insertion_bst), container.getContext());
        linearLayout.addView(ss2);
        linearLayout.addView(t2);

        View ss3 = ctv.subHead2(getString(R.string.deletion), container.getContext());
        View t3 = ctv.normalText(getString(R.string.deletion_txt), container.getContext());
        linearLayout.addView(ss3);
        linearLayout.addView(t3);


        View subHead4 = ctv.subHead(getString(R.string.dp_menu), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.tree_syn_1));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView1 = ccv.Code(container.getContext(), c.bst);


        linearLayout.addView(subHead4);
        linearLayout.addView(codeView1);



        return root;
    }

}
