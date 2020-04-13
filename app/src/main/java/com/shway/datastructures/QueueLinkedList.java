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
public class QueueLinkedList extends Fragment {


    public QueueLinkedList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_queue_linked_list, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.qll);
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

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.qll, "Queue using Linked List"));

        View head = ctv.mainHead("Queue using Linked List", container.getContext());
        linearLayout.addView(head);


        View subHead2 = ctv.subHead(getString(R.string.bef_imp), container.getContext());
        View text2 = ctv.normalText(getString(R.string.before_que_ll), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);


        View subHead3 = ctv.subHead(getString(R.string.enque_oper), container.getContext());
        View text3 = ctv.normalText(getString(R.string.enque_ll), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.que_syn_4));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView1 = ccv.Code(container.getContext(), c.q4);

        linearLayout.addView(subHead3);
        linearLayout.addView(text3);
        linearLayout.addView(codeView1);


        View subHead4 = ctv.subHead(getString(R.string.dequeue_oper), container.getContext());
        View text4 = ctv.normalText(getString(R.string.deque_ll), container.getContext());
//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.que_syn_5));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView2 = ccv.Code(container.getContext(), c.q5);

        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        linearLayout.addView(codeView2);


        View subHead9 = ctv.subHead(getString(R.string.dp_menu), container.getContext());
        View text9 = ctv.normalText(getString(R.string.de_menu_txt), container.getContext());
//        CodeView codeView7 = new CodeView(container.getContext());
//        codeView7.setCode(getString(R.string.que_syn_6));
//        Objects.requireNonNull(codeView7.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView3 = ccv.Code(container.getContext(), c.q6);

        linearLayout.addView(subHead9);
        linearLayout.addView(text9);
        linearLayout.addView(codeView3);

        return root;

    }

}
