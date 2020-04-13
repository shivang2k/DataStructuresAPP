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
public class DoubleLinkedList extends Fragment {


    public DoubleLinkedList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_double_linked_list, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.dll);
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


        View head = ctv.mainHead("Doubly Linked List", container.getContext());
        //View text1 = ctv.normalText(getString(R.string.sll_what), container.getContext());
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.doubly_linked_list, "Doubly Linked List"));

        linearLayout.addView(head);
        //linearLayout.addView(text1);


        View subHead2 = ctv.subHead(getString(R.string.bef_imp), container.getContext());
        View text2 = ctv.normalText(getString(R.string.steps_dll), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);


        View subHead3 = ctv.subHead(getString(R.string.ins_beg), container.getContext());
        View text3 = ctv.normalText(getString(R.string.ins_beg_dll), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.ll_syn_9));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView1 = ccv.Code(container.getContext(), c.ll9);

        linearLayout.addView(subHead3);
        linearLayout.addView(text3);
        linearLayout.addView(codeView1);


        View subHead4 = ctv.subHead(getString(R.string.ins_end), container.getContext());
        View text4 = ctv.normalText(getString(R.string.ins_end_dll), container.getContext());
//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.ll_syn_10));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView2 = ccv.Code(container.getContext(), c.ll10);

        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        linearLayout.addView(codeView2);


        View subHead5 = ctv.subHead(getString(R.string.ins_spec), container.getContext());
        View text5 = ctv.normalText(getString(R.string.ins_spec_dll), container.getContext());
//        CodeView codeView3 = new CodeView(container.getContext());
//        codeView3.setCode(getString(R.string.ll_syn_11));
//        Objects.requireNonNull(codeView3.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView3 = ccv.Code(container.getContext(), c.ll11);

        linearLayout.addView(subHead5);
        linearLayout.addView(text5);
        linearLayout.addView(codeView3);

        View subHead6 = ctv.subHead(getString(R.string.del_beg), container.getContext());
        View text6 = ctv.normalText(getString(R.string.del_beg_dll), container.getContext());
//        CodeView codeView4 = new CodeView(container.getContext());
//        codeView4.setCode(getString(R.string.ll_syn_12));
//        Objects.requireNonNull(codeView4.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView4 = ccv.Code(container.getContext(), c.ll12);

        linearLayout.addView(subHead6);
        linearLayout.addView(text6);
        linearLayout.addView(codeView4);

        View subHead7 = ctv.subHead(getString(R.string.del_end), container.getContext());
        View text7 = ctv.normalText(getString(R.string.ins_end_dll), container.getContext());
//        CodeView codeView5 = new CodeView(container.getContext());
//        codeView5.setCode(getString(R.string.ll_syn_13));
//        Objects.requireNonNull(codeView5.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView5 = ccv.Code(container.getContext(), c.ll13);

        linearLayout.addView(subHead7);
        linearLayout.addView(text7);
        linearLayout.addView(codeView5);

        View subHead8 = ctv.subHead(getString(R.string.del_pos), container.getContext());
        View text8 = ctv.normalText(getString(R.string.del_spec_dll), container.getContext());
//        CodeView codeView6 = new CodeView(container.getContext());
//        codeView6.setCode(getString(R.string.ll_syn_14));
//        Objects.requireNonNull(codeView6.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView6 = ccv.Code(container.getContext(), c.ll14);

        linearLayout.addView(subHead8);
        linearLayout.addView(text8);
        linearLayout.addView(codeView6);

        View subHead9 = ctv.subHead(getString(R.string.dp_menu), container.getContext());
        View text9 = ctv.normalText(getString(R.string.de_menu_txt), container.getContext());
//        CodeView codeView7 = new CodeView(container.getContext());
//        codeView7.setCode(getString(R.string.ll_syn_15));
//        Objects.requireNonNull(codeView7.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView7 = ccv.Code(container.getContext(), c.ll15);

        linearLayout.addView(subHead9);
        linearLayout.addView(text9);
        linearLayout.addView(codeView7);

        return root;

    }

}
