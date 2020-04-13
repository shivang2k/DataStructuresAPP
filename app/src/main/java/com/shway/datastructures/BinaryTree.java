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
public class BinaryTree extends Fragment {


    public BinaryTree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_binary_tree, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.bt);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.binary_tree, "Binary Tree"));
        View head = ctv.mainHead("Binary Tree", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_bt), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_bt_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.properties_bt), container.getContext());
        View text2 = ctv.normalText(getString(R.string.properties_bt_txt), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        View subHead3 = ctv.subHead(getString(R.string.bt_rep), container.getContext());
        View text3 = ctv.normalText(getString(R.string.bt_rep_txt), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        View subHead4= ctv.subHead(getString(R.string.bt_arr), container.getContext());
        View text4 = ctv.normalText(getString(R.string.bt_arr_txt), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        // TODO: 06-04-2020 add image
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.binary_tree_arr, "Array Representation"));

        View subHead5 = ctv.subHead(getString(R.string.bt_ll), container.getContext());
        View text5 = ctv.normalText(getString(R.string.bt_ll), container.getContext());
        linearLayout.addView(subHead5);
        linearLayout.addView(text5);

        View subHead6 = ctv.subHead(getString(R.string.types_bt), container.getContext());
        linearLayout.addView(subHead6);

        View ss1 = ctv.subHead2(getString(R.string.sbt), container.getContext());
        View t1 = ctv.normalText(getString(R.string.sbt_txt), container.getContext());
        linearLayout.addView(ss1);
        linearLayout.addView(t1);


        View ss2 = ctv.subHead2(getString(R.string.cbt), container.getContext());
        View t2 = ctv.normalText(getString(R.string.cbt_txt), container.getContext());
        linearLayout.addView(ss2);
        linearLayout.addView(t2);


        View ss3 = ctv.subHead2(getString(R.string.ebt), container.getContext());
        View t3 = ctv.normalText(getString(R.string.ebt_txt), container.getContext());
        linearLayout.addView(ss3);
        linearLayout.addView(t3);


        View ss4 = ctv.subHead2(getString(R.string.tbt), container.getContext());
        View t4 = ctv.normalText(getString(R.string.tbt_txt), container.getContext());
        linearLayout.addView(ss4);
        linearLayout.addView(t4);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.threaded_tree, "Threaded Binary Tree"));

        return root;

    }

}
