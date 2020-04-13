package com.shway.datastructures;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class Stack extends Fragment {


    public Stack() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_stack, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.s);
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

        View head = ctv.mainHead("Stack", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_stack), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_struct_txt), container.getContext());
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.stack_data_structure, "Stack"));
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.exam_stack), container.getContext());
        View text2 = ctv.normalText(getString(R.string.exam_stack_txt), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        CardView card1 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard = new LinearLayout(container.getContext());
        linearLayoutCard.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard.setLayoutParams(lp);
        View exp = ccv.listItem(getString(R.string.exp_stack_txt), getString(R.string.exp_stack),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard.addView(exp);
        card1.addView(linearLayoutCard);
        linearLayout.addView(card1);

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_s_exp);
            }
        });

        View ss100 = ctv.subHead("Complexities", container.getContext());
        linearLayout.addView(ss100);
        View cv1 = ccv.listItemMulti(container.getContext(), getString(R.string.acc_st),
                getString(R.string.search_st), getString(R.string.insertion_st),
                getString(R.string.del_st), getString(R.string.space_st));
        linearLayout.addView(cv1);

        View subHead3 = ctv.subHead(getString(R.string.properties), container.getContext());
        View text3 = ctv.normalText(getString(R.string.prop_stack), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.lifo_stack, "Pop and Push Operation"));

        View subHead4 = ctv.subHead(getString(R.string.stack_mani), container.getContext());
        linearLayout.addView(subHead4);

        View ss1 = ctv.subHead2(getString(R.string.push_oper), container.getContext());
        View text4 = ctv.normalText(getString(R.string.push_oper_txt), container.getContext());
        linearLayout.addView(ss1);
        linearLayout.addView(text4);

        View ss2 = ctv.subHead2(getString(R.string.pop_oper), container.getContext());
        View text5 = ctv.normalText(getString(R.string.pop_oper_txt), container.getContext());
        linearLayout.addView(ss2);
        linearLayout.addView(text5);

        View ss3 = ctv.subHead2(getString(R.string.peek_oper), container.getContext());
        View text6 = ctv.normalText(getString(R.string.peek_oper_txt), container.getContext());
        linearLayout.addView(ss3);
        linearLayout.addView(text6);

        View subHead5 = ctv.subHead(getString(R.string.impl_stack), container.getContext());
        linearLayout.addView(subHead5);


        CardView card2 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard2 = new LinearLayout(container.getContext());
        linearLayoutCard2.setOrientation(LinearLayout.VERTICAL);
        linearLayoutCard2.setLayoutParams(lp);
        View arr = ccv.listItem(getString(R.string.arr_stack_txt), getString(R.string.arr_stack),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View ll = ccv.listItem(getString(R.string.ll_stack_txt), getString(R.string.ll_stack),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard2.addView(arr);
        linearLayoutCard2.addView(ll);
        card2.addView(linearLayoutCard2);
        linearLayout.addView(card2);

        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_s_sa);
            }
        });
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_s_ll);
            }
        });

        return root;

    }

}
