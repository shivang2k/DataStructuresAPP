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
public class Structures extends Fragment {


    public Structures() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_structures, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.struct);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();
//        View head = ctv.mainHead(getString(R.string.arr), container.getContext());
//        View subHead1 = ctv.subHead(getString(R.string.what_arr), container.getContext());
//        View text1 = ctv.normalText(getString(R.string.ans_arr), container.getContext());
//        View ss1 = ctv.subHead2(getString(R.string.rep_sm), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.arr_syn_6));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
//
//        linearLayout.addView();


        View head = ctv.mainHead(getString(R.string.structure), container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_struct), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_struct_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.how_struct), container.getContext());
        View text2 = ctv.normalText(getString(R.string.how_struct_txt), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.struct_syn_1));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView1 = ccv.Code(container.getContext(), c.struct1);
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(codeView1);

        View text3 = ctv.normalText(getString(R.string.how_struct_txt2), container.getContext());
        View codeView2 = ccv.Code(container.getContext(), c.struct2);
        linearLayout.addView(text3);
        linearLayout.addView(codeView2);

        View subHead3 = ctv.subHead(getString(R.string.self_struct), container.getContext());
        View text4 = ctv.normalText(getString(R.string.self_struct_txt), container.getContext());
        View codeView3 = ccv.Code(container.getContext(), c.struct3);
        linearLayout.addView(subHead3);
        linearLayout.addView(text4);
        linearLayout.addView(codeView3);

        return root;
    }

}
