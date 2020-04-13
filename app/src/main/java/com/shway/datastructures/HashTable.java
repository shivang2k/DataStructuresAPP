package com.shway.datastructures;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import java.util.Objects;

import io.github.kbiakov.codeview.CodeView;
import io.github.kbiakov.codeview.highlight.ColorTheme;


/**
 * A simple {@link Fragment} subclass.
 */
public class HashTable extends Fragment {


    public HashTable() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_hash_table, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.ht);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.ht2, "Simple Hash Table"));

        View head = ctv.mainHead("hash Tables", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.hash_what), container.getContext());
        View text1 = ctv.normalText(getString(R.string.hash_what_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View s1 = ctv.subHead(getString(R.string.adv_hash), container.getContext());
        View t1 = ctv.normalText(getString(R.string.adv_hash_txt), container.getContext());
        linearLayout.addView(s1);
        linearLayout.addView(t1);

        View s2 = ctv.subHead(getString(R.string.hf), container.getContext());
        View t2 = ctv.normalText(getString(R.string.hf_txt), container.getContext());
        linearLayout.addView(s2);
        linearLayout.addView(t2);

        View sub = ctv.subHead(getString(R.string.prop_hf), container.getContext());
        linearLayout.addView(sub);

        View s3 = ctv.subHead2(getString(R.string.unif_hf), container.getContext());
        View t3 = ctv.normalText(getString(R.string.unif_hf_txt), container.getContext());
        linearLayout.addView(s3);
        linearLayout.addView(t3);

        View s4 = ctv.subHead2(getString(R.string.determ_hf), container.getContext());
        View t4 = ctv.normalText(getString(R.string.determ_hf_txt), container.getContext());
        linearLayout.addView(s4);
        linearLayout.addView(t4);

        View s5 = ctv.subHead2(getString(R.string.lc_hf), container.getContext());
        View t5 = ctv.normalText(getString(R.string.lc_hf_txt), container.getContext());
        linearLayout.addView(s5);
        linearLayout.addView(t5);

        View s6 = ctv.subHead("Uses in Programming", container.getContext());
        View t6 = ctv.normalText(getString(R.string.uses_hf), container.getContext());
        linearLayout.addView(s6);
        linearLayout.addView(t6);

        View sub2 = ctv.subHead(getString(R.string.diff_hf), container.getContext());
        linearLayout.addView(sub2);

        View s7 = ctv.subHead2(getString(R.string.div_hf), container.getContext());
        View t7 = ctv.normalText(getString(R.string.div_hf), container.getContext());
        CodeView codeView1 = new CodeView(container.getContext());
        codeView1.setCode(getString(R.string.div_code));
        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        linearLayout.addView(s7);
        linearLayout.addView(t7);
        linearLayout.addView(codeView1);

        View s8 = ctv.subHead2(getString(R.string.mul_hf), container.getContext());
        View t8 = ctv.normalText(getString(R.string.mul_hf_txt), container.getContext());
        CodeView codeView2 = new CodeView(container.getContext());
        codeView2.setCode(getString(R.string.mul_code));
        Objects.requireNonNull(codeView2.getOptions()).withTheme(ColorTheme.MONOKAI);
        linearLayout.addView(s8);
        linearLayout.addView(t8);
        linearLayout.addView(codeView2);

        View s9 = ctv.subHead2(getString(R.string.mid_hf), container.getContext());
        View t9 = ctv.normalText(getString(R.string.mid_hf_txt), container.getContext());
        linearLayout.addView(s9);
        linearLayout.addView(t9);

        View s10 = ctv.subHead(getString(R.string.bh), container.getContext());
        View t10 = ctv.normalText(getString(R.string.bh_txt), container.getContext());
        linearLayout.addView(s10);
        linearLayout.addView(t10);

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.ht3, "Bucket Hashing"));

        View s11 = ctv.subHead(getString(R.string.col), container.getContext());
        View t11 = ctv.normalText(getString(R.string.col_txt), container.getContext());
        linearLayout.addView(s11);
        linearLayout.addView(t11);

        View s12 = ctv.subHead(getString(R.string.oa_hf), container.getContext());
        View t12 = ctv.normalText(getString(R.string.oa_txt), container.getContext());
        linearLayout.addView(s12);
        linearLayout.addView(t12);

        View s13 = ctv.subHead(getString(R.string.sep_hf), container.getContext());
        View t13 = ctv.normalText(getString(R.string.sep_txt), container.getContext());
        linearLayout.addView(s13);
        linearLayout.addView(t13);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.ht1, "Separate Chaining"));
        return root;

    }

}
