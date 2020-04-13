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
public class LinkedList extends Fragment {


    public LinkedList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_linked_list, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.linkedl);
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


        View head = ctv.mainHead("Linked List", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.ll_what), container.getContext());
        View text1 = ctv.normalText(getString(R.string.ll_what_txt), container.getContext());
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.singly_linked_list, "Linked List"));
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.node), container.getContext());
        View text2 = ctv.normalText(getString(R.string.node_txt), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.ll_syn_1));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView1 = ccv.Code(container.getContext(), c.ll1);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(codeView1);

        View subHead3 = ctv.subHead(getString(R.string.ll_over_arr), container.getContext());
        View text3 = ctv.normalText(getString(R.string.adv_ll), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        View subHead4 = ctv.subHead(getString(R.string.arr_over_ll), container.getContext());
        View text4 = ctv.normalText(getString(R.string.dis_ll), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);

        View cv1 = ccv.listItemMulti(container.getContext(), getString(R.string.acc_ll),
                getString(R.string.search_ll), getString(R.string.insertion_ll),
                getString(R.string.del_ll), getString(R.string.space_ll));
        linearLayout.addView(cv1);

        View subHead5 = ctv.subHead(getString(R.string.accessing_ll), container.getContext());
        View text5 = ctv.normalText(getString(R.string.accessing_ll_txt), container.getContext());
        linearLayout.addView(subHead5);
        linearLayout.addView(text5);

        View subHead6 = ctv.subHead(getString(R.string.use_ll), container.getContext());
        View text6 = ctv.normalText(getString(R.string.use_ll_txt), container.getContext());
        linearLayout.addView(subHead6);
        linearLayout.addView(text6);

        View subHead7 = ctv.subHead(getString(R.string.type_ll), container.getContext());
        linearLayout.addView(subHead7);


        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        CardView card1 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard1 = new LinearLayout(container.getContext());
        linearLayoutCard1.setOrientation(LinearLayout.VERTICAL);

        linearLayoutCard1.setLayoutParams(lp);

        View sll = ccv.listItem(getString(R.string.sll_txt), getString(R.string.sll),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View dll = ccv.listItem(getString(R.string.dll_txt), getString(R.string.dll),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View cll = ccv.listItem(getString(R.string.cll_txt), getString(R.string.cll),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard1.addView(sll);
        linearLayoutCard1.addView(dll);
        linearLayoutCard1.addView(cll);

        card1.addView(linearLayoutCard1);

        linearLayout.addView(card1);


        sll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_ll_sll);
            }
        });
        dll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_ll_dll);
            }
        });
        cll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_ll_to_cll);
            }
        });
        return root;
    }

}
