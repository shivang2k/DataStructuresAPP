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
public class DFS extends Fragment {


    public DFS() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_dfs, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.dfs);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.depth_first_tree, "Order of nodes visited in DFS"));


        View head = ctv.mainHead("Depth-first search", container.getContext());
        View text = ctv.normalText(getString(R.string.dfs_what), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(text);

        View s1 = ctv.subHead("Time Complexity", container.getContext());
        View t1 = ctv.normalText(getString(R.string.tc_dfs), container.getContext());
        linearLayout.addView(s1);
        linearLayout.addView(t1);

        View s2 = ctv.subHead("Space Complexity", container.getContext());
        View t2 = ctv.normalText(getString(R.string.sc_dfs), container.getContext());
        linearLayout.addView(s2);
        linearLayout.addView(t2);

        View s3 = ctv.subHead("Completeness", container.getContext());
        View t3 = ctv.normalText(getString(R.string.comp_dfs), container.getContext());
        linearLayout.addView(s3);
        linearLayout.addView(t3);

        View s4 = ctv.subHead(getString(R.string.steps_dfs), container.getContext());
        View t4 = ctv.normalText(getString(R.string.steps_dfs_txt), container.getContext());
        linearLayout.addView(s4);
        linearLayout.addView(t4);

        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.depth_first_search, "Depth first search algorithm animation"));


        View s5 = ctv.subHead(getString(R.string.pseudo), container.getContext());
        linearLayout.addView(s5);
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.pseudo_dfs));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);
        View codeView1 = ccv.Code(container.getContext(), getString(R.string.pseudo_dfs));
        linearLayout.addView(codeView1);

        return root;

    }

}
