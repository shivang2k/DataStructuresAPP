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
public class StackExpression extends Fragment {


    public StackExpression() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_stack_expression, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.s_exp);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

//        View head = ctv.mainHead(getString(R.string.arr), container.getContext());
//        View subHead1 = ctv.subHead(getString(R.string.what_arr), container.getContext());
//        View text1 = ctv.normalText(getString(R.string.ans_arr), container.getContext());
//        View ss1 = ctv.subHead2(getString(R.string.rep_sm), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.arr_syn_6));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
//
//        linearLayout.addView();

        View head = ctv.mainHead("Expression Parsing", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.exp_parsing), container.getContext());
        View text1 = ctv.normalText(getString(R.string.exp_parsing_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.infix), container.getContext());
        View text2 = ctv.normalText(getString(R.string.infix_txt), container.getContext());
        View ss1 = ctv.subHead2(getString(R.string.infix_eg), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(ss1);

        View subHead3 = ctv.subHead(getString(R.string.postfix), container.getContext());
        View text3 = ctv.normalText(getString(R.string.postfix_txt), container.getContext());
        View ss2 = ctv.subHead2(getString(R.string.postfix_eg), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);
        linearLayout.addView(ss2);

        View subHead4 = ctv.subHead(getString(R.string.prefix), container.getContext());
        View text4 = ctv.normalText(getString(R.string.prefix_txt), container.getContext());
        View ss3 = ctv.subHead2(getString(R.string.prefix_eg), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        linearLayout.addView(ss3);

        return root;

    }

}
