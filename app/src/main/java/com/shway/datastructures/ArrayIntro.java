package com.shway.datastructures;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class ArrayIntro extends Fragment {



    public ArrayIntro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final int VALUE_IN_DP_16 = (int)(16 * getResources().getDisplayMetrics().density);

        View root = inflater.inflate(R.layout.fragment_array_intro, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.arrll);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        CardView cv = ccv.makeCardView(container.getContext());
        cv.addView(ccv.listItem("HELLO", "HELLO MORE", container.getContext(), R.mipmap.ic_launcher));
        linearLayout.addView(cv);
        //linearLayout.addView(cv);
        linearLayout.addView(ccv.listItemMulti(container.getContext(), "hello", "hello2", "hello3"));
        return root;
    }

}
