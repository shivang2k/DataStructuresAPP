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
public class StackLinkedList extends Fragment {


    public StackLinkedList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_stack_linked_list, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.sll);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();
        View head = ctv.mainHead("Stack Using Linked List", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.bef_imp), container.getContext());
        View text1 = ctv.normalText(getString(R.string.before_stack_ll), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.push_stack), container.getContext());
        View text2 = ctv.normalText(getString(R.string.oush_stack_ll), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.stack_syn_4));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView1 = ccv.Code(container.getContext(), c.s4);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(codeView1);

        View subHead3 = ctv.subHead(getString(R.string.pop_stack), container.getContext());
        View text3 = ctv.normalText(getString(R.string.stack_pop_ll), container.getContext());
//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.stack_syn_5));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView2 = ccv.Code(container.getContext(), c.s5);

        linearLayout.addView(subHead3);
        linearLayout.addView(text3);
        linearLayout.addView(codeView2);

        View subHead4 = ctv.subHead(getString(R.string.dp_menu), container.getContext());
        View text4 = ctv.normalText(getString(R.string.stack_arr_menu), container.getContext());
//        CodeView codeView3 = new CodeView(container.getContext());
//        codeView3.setCode(getString(R.string.stack_syn_6));
//        Objects.requireNonNull(codeView3.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView3 = ccv.Code(container.getContext(), c.s6);

        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        linearLayout.addView(codeView3);


        return root;

    }

}
