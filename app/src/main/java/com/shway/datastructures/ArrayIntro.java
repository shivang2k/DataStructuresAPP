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
public class ArrayIntro extends Fragment {



    public ArrayIntro() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Array");
        final int VALUE_IN_DP_16 = (int)(16 * getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_10 = (int)(10 * getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_8 = (int)(8 * getResources().getDisplayMetrics().density);


        View root = inflater.inflate(R.layout.fragment_array_intro, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.arrll);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        Codes c = new Codes();


        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.array1d, "A One Dimensional array"));

        View head = ctv.mainHead(getString(R.string.arr), container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_arr), container.getContext());
        View text1 = ctv.normalText(getString(R.string.ans_arr), container.getContext());

        View subHead2 = ctv.subHead(getString(R.string.why_arr), container.getContext());
        View text2 = ctv.normalText(getString(R.string.ans_why_arr), container.getContext());

        View subHead3 = ctv.subHead(getString(R.string.properties), container.getContext());
        View text3 = ctv.normalText(getString(R.string.arr_prop), container.getContext());

        View ss100 = ctv.subHead("Complexities", container.getContext());

        View cv1 = ccv.listItemMulti(container.getContext(), getString(R.string.acc_arr),
                getString(R.string.search_arr), getString(R.string.insertion_arr),
                getString(R.string.del_arr), getString(R.string.space_arr));


        View subHead4 = ctv.subHead(getString(R.string.declaring_arr), container.getContext());
        View text4 = ctv.normalText(getString(R.string.declaring_ans_arr), container.getContext());

//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.arr_syn_1));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView1 = ccv.Code(container.getContext(), "type name[size];");

        View subHead5 = ctv.subHead(getString(R.string.calc_arr), container.getContext());
        View text5 = ctv.normalText(getString(R.string.calc_txt), container.getContext());

//        CodeView codeView2 = new CodeView(container.getContext());
//        codeView2.setCode(getString(R.string.arr_syn_2));
//        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView2 = ccv.Code(container.getContext(), c.arr1);

        View subHead6 = ctv.subHead(getString(R.string.mda), container.getContext());
        View text6 = ctv.normalText(getString(R.string.mda_txt), container.getContext());

        View subHead7 = ctv.subHead(getString(R.string.dec_2d_arr), container.getContext());
        View text7 = ctv.normalText(getString(R.string.dec_txt_2d), container.getContext());

//        CodeView codeView3 = new CodeView(container.getContext());
//        codeView3.setCode(getString(R.string.arr_syn_3));
//        Objects.requireNonNull(codeView3.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView3 = ccv.Code(container.getContext(), c.arr2);

        View subHead8 = ctv.subHead(getString(R.string.acc_2d), container.getContext());
        View text8 = ctv.normalText(getString(R.string.acc_2d_txt), container.getContext());
//        CodeView codeView4 = new CodeView(container.getContext());
//        codeView4.setCode(getString(R.string.arr_syn_4));
//        Objects.requireNonNull(codeView4.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView4 = ccv.Code(container.getContext(), c.arr3);

        View subHead9 = ctv.subHead(getString(R.string.rep_2d_mem), container.getContext());
        View text9 = ctv.normalText(getString(R.string.rep_2d_txt), container.getContext());

        View subHead10 = ctv.subHead(getString(R.string.rmf), container.getContext());
        View text10 = ctv.normalText(getString(R.string.rmf_txt), container.getContext());
//        CodeView codeView5 = new CodeView(container.getContext());
//        codeView5.setCode(getString(R.string.arr_syn_5));
//        Objects.requireNonNull(codeView5.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView5 = ccv.Code(container.getContext(), c.arr4);

        View subHead11 = ctv.subHead(getString(R.string.cmf), container.getContext());
        View text11 = ctv.normalText(getString(R.string.cmf_txt), container.getContext());
//        CodeView codeView6 = new CodeView(container.getContext());
//        codeView6.setCode(getString(R.string.arr_syn_6));
//        Objects.requireNonNull(codeView6.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView6 = ccv.Code(container.getContext(), c.arr5);


        View subHead12 = ctv.subHead(getString(R.string.sm), container.getContext());
        View text12 = ctv.normalText(getString(R.string.sm_txt), container.getContext());

        View subHead13 = ctv.subHead2(getString(R.string.rep_sm), container.getContext());
        View text13 = ctv.normalText(getString(R.string.rep_sm_txt), container.getContext());

        View subHead14 = ctv.subHead2(getString(R.string.triplet_arr), container.getContext());
        View text14 = ctv.normalText(getString(R.string.triplet_arr_txt), container.getContext());

        View subHead15 = ctv.subHead2(getString(R.string.l_rep), container.getContext());
        View text15 = ctv.normalText(getString(R.string.l_rep_txt), container.getContext());

        View subHead16 = ctv.subHead(getString(R.string.arr_op), container.getContext());
        View text16 = ctv.normalText(getString(R.string.arr_op_txt), container.getContext());

        CardView card1 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard = new LinearLayout(container.getContext());
        linearLayoutCard.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard.setLayoutParams(lp);

        View arr = ccv.listItem(getString(R.string.arr_op_read), getString(R.string.arr_op),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());

        linearLayoutCard.addView(arr);
        card1.addView(linearLayoutCard);

        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_arrayIntro_to_arrayOperations);
            }
        });

        View subHead17 = ctv.subHead(getString(R.string.algo_arr), container.getContext());
        View text17 = ctv.normalText(getString(R.string.algo_arr_txt), container.getContext());

        CardView card2 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard2 = new LinearLayout(container.getContext());
        linearLayoutCard2.setOrientation(LinearLayout.VERTICAL);

        linearLayoutCard2.setLayoutParams(lp);

        View search = ccv.listItem(getString(R.string.ser_arr_txt), getString(R.string.searching_arr),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View sort = ccv.listItem(getString(R.string.sort_arr_txt), getString(R.string.sorting_arr),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_a_to_ase);
            }
        });

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_a_to_asort);
            }
        });

        linearLayoutCard2.addView(search);
        linearLayoutCard2.addView(sort);

        card2.addView(linearLayoutCard2);

        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        linearLayout.addView(ss100);

        linearLayout.addView(cv1);

        linearLayout.addView(subHead4);
        linearLayout.addView(text4);

        linearLayout.addView(codeView1);

        linearLayout.addView(subHead5);
        linearLayout.addView(text5);

        linearLayout.addView(codeView2);

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.array2d, "A 2D array"));
        linearLayout.addView(subHead6);
        linearLayout.addView(text6);

        linearLayout.addView(subHead7);
        linearLayout.addView(text7);

        linearLayout.addView(codeView3);

        linearLayout.addView(subHead8);
        linearLayout.addView(text8);

        linearLayout.addView(codeView4);

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.row_and_column_major_order, "Row and column major order"));
        linearLayout.addView(subHead9);
        linearLayout.addView(text9);

        linearLayout.addView(subHead10);
        linearLayout.addView(text10);

        linearLayout.addView(codeView5);

        linearLayout.addView(subHead11);
        linearLayout.addView(text11);

        linearLayout.addView(codeView6);

        linearLayout.addView(subHead12);
        linearLayout.addView(text12);

        linearLayout.addView(subHead13);
        linearLayout.addView(text13);

        linearLayout.addView(subHead14);
        linearLayout.addView(text14);

        linearLayout.addView(subHead15);
        linearLayout.addView(text15);

        linearLayout.addView(subHead16);
        linearLayout.addView(text16);

        linearLayout.addView(card1);

        linearLayout.addView(subHead17);
        linearLayout.addView(text17);

        linearLayout.addView(card2);
        super.onViewCreated(root, savedInstanceState);
        return root;
    }

}
