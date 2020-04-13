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
public class ArraySearch extends Fragment {


    public ArraySearch() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Searching In Arrays");
        View root = inflater.inflate(R.layout.fragment_array_search, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.arrsearch);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();
        View head = ctv.mainHead(getString(R.string.search_arr_oper), container.getContext());
        View text = ctv.normalText(getString(R.string.search_arr_oper_txt), container.getContext());

        View subHead1 = ctv.subHead(getString(R.string.liner_arr), container.getContext());
        View text1 = ctv.normalText(getString(R.string.liner_arr_txt), container.getContext());
        View ss1 = ctv.subHead2(getString(R.string.tc_arr), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.arr_syn_11));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView1 = ccv.Code(container.getContext(), c.arr10);

        View subHead2 = ctv.subHead(getString(R.string.bs_arr), container.getContext());
        View text2 = ctv.normalText(getString(R.string.bs_arr_txt), container.getContext());
        View ss2 = ctv.subHead2(getString(R.string.bs_arr), container.getContext());
//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.arr_sun_12));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);
//        codeView2.setNestedScrollingEnabled(false);

        View codeView2 = ccv.Code(container.getContext(), c.arr11);

        linearLayout.addView(head);
        linearLayout.addView(text);


        linearLayout.addView(subHead1);
        linearLayout.addView(text1);
        linearLayout.addView(ss1);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.linearsearch_valero, "Linear Search"));
        linearLayout.addView(codeView1);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(ss2);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.binary_search_depiction, "Binary Search"));
        linearLayout.addView(codeView2);



        return root;
    }

}
