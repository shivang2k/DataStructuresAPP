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
public class ArraySort extends Fragment {


    public ArraySort() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sorting in Array");
        View root = inflater.inflate(R.layout.fragment_array_sort, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.arrsort);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();

        View head = ctv.mainHead(getString(R.string.sort_oper_arr), container.getContext());
        View text = ctv.normalText(getString(R.string.sort_intro_arr), container.getContext());

        View subHead1 = ctv.subHead(getString(R.string.terminologies), container.getContext());

        View ss1 = ctv.subHead2(getString(R.string.ie_sort), container.getContext());
        View text1 = ctv.normalText(getString(R.string.ie_sort_txt), container.getContext());

        View ss2 = ctv.subHead2(getString(R.string.stab_sort), container.getContext());
        View text2 = ctv.normalText(getString(R.string.stab_sort_txt), container.getContext());

        View subHead2 = ctv.subHead(getString(R.string.bub_sort), container.getContext());
        View text2_1 = ctv.normalText(getString(R.string.bub_sort_txt), container.getContext());
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.arr_syn_13));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView1 = ccv.Code(container.getContext(), c.arr12);

        View subHead3 = ctv.subHead(getString(R.string.ins_sort), container.getContext());
        View text3 = ctv.normalText(getString(R.string.bub_sort_txt), container.getContext());

        View ss3 = ctv.subHead2(getString(R.string.steps), container.getContext());

        View text4 = ctv.normalText(getString(R.string.ins_sort_steps), container.getContext());
//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.arr_syn_14));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView2 = ccv.Code(container.getContext(), c.arr13);

        View subHead4 = ctv.subHead(getString(R.string.sel_sort), container.getContext());
        View text5 = ctv.normalText(getString(R.string.sel_sort_steps), container.getContext());

        View ss4 = ctv.subHead2(getString(R.string.steps), container.getContext());

        View text6 = ctv.normalText(getString(R.string.sel_sort_steps), container.getContext());
        View ss5 = ctv.subHead2(getString(R.string.note_sel_sort), container.getContext());
        View text7 = ctv.normalText(getString(R.string.note_sel_sort_txt), container.getContext());
//
//        CodeView codeView3 = new CodeView(container.getContext());
//        codeView3.setCode(getString(R.string.arr_syn_15));
//        Objects.requireNonNull(codeView3.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView3 = ccv.Code(container.getContext(), c.arr14);

        View subHead5 = ctv.subHead(getString(R.string.mer_sort), container.getContext());
        View text8 = ctv.normalText(getString(R.string.mer_sort_txt), container.getContext());

        View ss6 = ctv.subHead2(getString(R.string.steps), container.getContext());

        View text9 = ctv.normalText(getString(R.string.mer_sort_steps), container.getContext());
        View ss7 = ctv.subHead2(getString(R.string.mer_sort_notes), container.getContext());
        View text10 = ctv.normalText(getString(R.string.mer_sort_notes_txt), container.getContext());


//        CodeView codeView4 = new CodeView(container.getContext());
//        codeView4.setCode(getString(R.string.arr_syn_16));
//        Objects.requireNonNull(codeView4.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView4 = ccv.Code(container.getContext(), c.arr15);


        View subHead6 = ctv.subHead(getString(R.string.quick_sort), container.getContext());
        View text11 = ctv.normalText(getString(R.string.quick_sort_txt), container.getContext());

        View ss8 = ctv.subHead2(getString(R.string.steps), container.getContext());

        View text12 = ctv.normalText(getString(R.string.quick_sort_steps), container.getContext());

        View ss9 = ctv.subHead2(getString(R.string.complex_quick), container.getContext());

        View text13 = ctv.normalText(getString(R.string.complex_quick_txt), container.getContext());


        View codeView5 = ccv.Code(container.getContext(), c.arr16);

        linearLayout.addView(head);
        linearLayout.addView(text);


        linearLayout.addView(subHead1);
        linearLayout.addView(text1);
        linearLayout.addView(ss1);
        linearLayout.addView(text2_1);
        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.bubble, "Bubble Sort Animation"));
        linearLayout.addView(codeView1);

        linearLayout.addView(subHead3);
        linearLayout.addView(text3);
        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.insertion_sort, "Insertion Sort Animation"));
        linearLayout.addView(ss3);
        linearLayout.addView(text4);
        linearLayout.addView(codeView2);
        linearLayout.addView(subHead4);
        linearLayout.addView(text5);
        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.selection_sort, "Selection Sort Animation"));
        linearLayout.addView(ss4);
        linearLayout.addView(text6);
        linearLayout.addView(ss5);
        linearLayout.addView(text7);
        linearLayout.addView(codeView3);
        linearLayout.addView(subHead5);
        linearLayout.addView(text8);
        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.merge_sort, "Merge Sort Animation"));
        linearLayout.addView(ss6);
        linearLayout.addView(text9);
        linearLayout.addView(ss7);
        linearLayout.addView(text10);
        linearLayout.addView(codeView4);
        linearLayout.addView(subHead6);
        linearLayout.addView(text11);
        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.sorting_quicksort_anim, "Quick Sort Animation"));
        linearLayout.addView(ss8);
        linearLayout.addView(text12);
        linearLayout.addView(ss9);
        linearLayout.addView(text13);
        linearLayout.addView(codeView5);

        return root;}

}
