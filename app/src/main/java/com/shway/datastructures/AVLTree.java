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
public class AVLTree extends Fragment {


    public AVLTree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_avltree, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.avl);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.avl_tree_balance, "AVL Tree with balance factors shown"));
        View head = ctv.mainHead("AVL Tree", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.avl), container.getContext());
        View text1 = ctv.normalText(getString(R.string.avl_txt ), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.bf), container.getContext());
        View text2 = ctv.normalText(getString(R.string.bf_txt), container.getContext());

        View codeView1 = ccv.Code(container.getContext(), c.BF);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(codeView1);

        View subHead3 = ctv.subHead(getString(R.string.reb), container.getContext());
        View text3 = ctv.normalText(getString(R.string.reb_txt), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        View subHead4 = ctv.subHead(getString(R.string.tree_rot), container.getContext());
        View text4 = ctv.normalText(getString(R.string.tree_rot_txt), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.avl_tree_example, "Rotation in an AVL Tree"));

        return root;

   }

}
