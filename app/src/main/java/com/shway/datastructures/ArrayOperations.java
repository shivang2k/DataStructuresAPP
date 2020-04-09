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
public class ArrayOperations extends Fragment {


    public ArrayOperations() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Array Operations");
        View root = inflater.inflate(R.layout.fragment_array_operations, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.arropr);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();

        View head = ctv.mainHead(getString(R.string.arr_op), container.getContext());
        View text = ctv.normalText(getString(R.string.arr_basic_op), container.getContext());

        View subHead1 = ctv.subHead(getString(R.string.insert_arr), container.getContext());
        View text1 = ctv.normalText(getString(R.string.insert_arr_txt), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.arr_syn_7));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView1 = ccv.Code(container.getContext(), c.arr6);

        View subHead2 = ctv.subHead(getString(R.string.delete_arr), container.getContext());
        View text2 = ctv.normalText(getString(R.string.delete_arr_txt), container.getContext());
//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.arr_syn_8));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView2 = ccv.Code(container.getContext(), c.arr7);

        View subHead3 = ctv.subHead(getString(R.string.access_arr), container.getContext());
        View text3 = ctv.normalText(getString(R.string.access_arr_txt), container.getContext());

        View subHead4 = ctv.subHead2(getString(R.string.one_arr), container.getContext());
        View text4 = ctv.normalText(getString(R.string.one_arr_txt), container.getContext());
//        CodeView codeView3 = new CodeView(container.getContext());
//        codeView3.setCode(getString(R.string.arr_syn_9));
//        Objects.requireNonNull(codeView3.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView3 = ccv.Code(container.getContext(), c.arr8);

        View subHead5 = ctv.subHead2(getString(R.string.mda), container.getContext());
        View text5 = ctv.normalText(getString(R.string.mda_access_txt), container.getContext());
//        CodeView codeView4 = new CodeView(container.getContext());
//        codeView4.setCode(getString(R.string.arr_syn_10));
//        Objects.requireNonNull(codeView4.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView4 = ccv.Code(container.getContext(), c.arr9);

        linearLayout.addView(head);
        linearLayout.addView(text);

        linearLayout.addView(subHead1);
        linearLayout.addView(text1);
        linearLayout.addView(codeView1);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);
        linearLayout.addView(codeView2);

        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        linearLayout.addView(subHead4);
        linearLayout.addView(text4);
        linearLayout.addView(codeView3);

        linearLayout.addView(subHead5);
        linearLayout.addView(text5);
        linearLayout.addView(codeView4);
        super.onViewCreated(root, savedInstanceState);
        return root;
    }

}
