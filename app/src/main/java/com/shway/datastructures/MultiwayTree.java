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
public class MultiwayTree extends Fragment {


    public MultiwayTree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_multiway_tree, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.mwt);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

        View head = ctv.mainHead("Multiway Search Tree", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_mwt), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_mwt_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.b_tree, "B-Tree of order 5"));

        View subHead2 = ctv.subHead(getString(R.string.bt), container.getContext());
        View text2 = ctv.normalText(getString(R.string.bt_what), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);


        View subHead3 = ctv.subHead(getString(R.string.properties_bt), container.getContext());
        View text3 = ctv.normalText(getString(R.string.properties_bt_txt), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);


        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.bplustree, "B+ Tree"));
        View subHead4 = ctv.subHead(getString(R.string.bp), container.getContext());
        View text4 = ctv.normalText(getString(R.string.bp_txt), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);


        View subHead5 = ctv.subHead(getString(R.string.uses_bp), container.getContext());
        View text5 = ctv.normalText(getString(R.string.uses_bp_txt), container.getContext());
        linearLayout.addView(subHead5);
        linearLayout.addView(text5);


        View subHead6 = ctv.subHead(getString(R.string.properties_bp), container.getContext());
        View text6 = ctv.normalText(getString(R.string.peoperties_bp_txt), container.getContext());
        linearLayout.addView(subHead6);
        linearLayout.addView(text6);

        return root;

    }

}
