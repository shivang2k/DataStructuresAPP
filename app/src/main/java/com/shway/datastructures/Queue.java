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
public class Queue extends Fragment {


    public Queue() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_queue, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.q);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.data_queue, "Queue and its Operations"));

        View head = ctv.mainHead("Queue", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_queue), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_queue_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.real_queue), container.getContext());
        View text2 = ctv.normalText(getString(R.string.real_queue_txt), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        View ss100 = ctv.subHead("Complexities", container.getContext());
        linearLayout.addView(ss100);

        View cv1 = ccv.listItemMulti(container.getContext(), getString(R.string.acc_qu),
                getString(R.string.search_qu), getString(R.string.insertion_qu),
                getString(R.string.del_qu), getString(R.string.space_qu));
        linearLayout.addView(cv1);

        View subHead3 = ctv.subHead(getString(R.string.properties), container.getContext());
        View text3 = ctv.normalText(getString(R.string.qu_properties), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        View subHead4 = ctv.subHead(getString(R.string.type_qu), container.getContext());
        View text4 = ctv.normalText(getString(R.string.type_qu_txt), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);

        View subHead5 = ctv.subHead2(getString(R.string.deque), container.getContext());
        View text5 = ctv.normalText(getString(R.string.deque_txt), container.getContext());
        linearLayout.addView(subHead5);
        linearLayout.addView(text5);

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.restricted_queue, "Output restricted queue"));


        View subHead6 = ctv.subHead2(getString(R.string.priority), container.getContext());
        View text6 = ctv.normalText(getString(R.string.priority_txt), container.getContext());
        linearLayout.addView(subHead6);
        linearLayout.addView(text6);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.fifo_is, "Priority Queue"));

        View subHead7 = ctv.subHead2(getString(R.string.circular_qu), container.getContext());
        View text7 = ctv.normalText(getString(R.string.circular_qu_txt), container.getContext());
        linearLayout.addView(subHead7);
        linearLayout.addView(text7);

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.ring_buffer, "Circular Queue"));

        View subHead8 = ctv.subHead(getString(R.string.queue_mani), container.getContext());
        View text8 = ctv.normalText(getString(R.string.qu_mani_txt), container.getContext());
        linearLayout.addView(subHead8);
        linearLayout.addView(text8);

        View subHead9 = ctv.subHead(getString(R.string.enqueue), container.getContext());
        View text9 = ctv.normalText(getString(R.string.enqueue_txt), container.getContext());
        linearLayout.addView(subHead9);
        linearLayout.addView(text9);

        View subHead10 = ctv.subHead(getString(R.string.dequeue), container.getContext());
        View text10 = ctv.normalText(getString(R.string.dequeue_txt), container.getContext());
        linearLayout.addView(subHead10);
        linearLayout.addView(text10);

        View subHead11 = ctv.subHead(getString(R.string.imple_que), container.getContext());
        linearLayout.addView(subHead11);

        CardView card2 = ccv.makeCardView(container.getContext());
        LinearLayout linearLayoutCard2 = new LinearLayout(container.getContext());
        linearLayoutCard2.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
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
                Navigation.findNavController(view).navigate(R.id.action_q_qa);
            }
        });
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_q_ql);
            }
        });

        return root;

    }

}
