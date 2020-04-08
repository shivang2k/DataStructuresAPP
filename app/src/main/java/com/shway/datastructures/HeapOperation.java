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
public class HeapOperation extends Fragment {


    public HeapOperation()
    {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {

        View root = inflater.inflate(R.layout.fragment_heap_operation, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.heapoper);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

        View head = ctv.mainHead("Operations on Heap", container.getContext());
        View text1 = ctv.normalText(getString(R.string.oper_heap_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(text1);


        View subHead2 = ctv.subHead(getString(R.string.min_max), container.getContext());
        View text2 = ctv.normalText(getString(R.string.min_max_txt), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        View subHead3 = ctv.subHead(getString(R.string.insertion), container.getContext());
        View text3 = ctv.normalText(getString(R.string.ins_heap), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        View subHead4 = ctv.subHead(getString(R.string.deletion), container.getContext());
        View text4 = ctv.normalText(getString(R.string.del_heap), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);

        return root;

    }

}
