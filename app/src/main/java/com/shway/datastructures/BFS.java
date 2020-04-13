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
public class BFS extends Fragment {


    public BFS() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_bfs, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.bfs);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.breadth_first_tree, "order of nodes visited in BFS"));
        View head = ctv.mainHead("Breadth-first search", container.getContext());
        View text = ctv.normalText(getString(R.string.bfs_what), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(text);

        View s1 = ctv.subHead("Time Complexity", container.getContext());
        View t1 = ctv.normalText(getString(R.string.bfs_tc), container.getContext());
        linearLayout.addView(s1);
        linearLayout.addView(t1);

        View s2 = ctv.subHead("Space Complexity", container.getContext());
        View t2 = ctv.normalText(getString(R.string.bfs_sc), container.getContext());
        linearLayout.addView(s2);
        linearLayout.addView(t2);

        View s3 = ctv.subHead("Completeness", container.getContext());
        View t3 = ctv.normalText(getString(R.string.compl_txt), container.getContext());
        linearLayout.addView(s3);
        linearLayout.addView(t3);

        View s4 = ctv.subHead(getString(R.string.steps_bsf), container.getContext());
        View t4 = ctv.normalText(getString(R.string.steps_bfs_txt), container.getContext());
        linearLayout.addView(s4);
        linearLayout.addView(t4);

        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.breadth_first_search_algorithm, "Breadth First search algorithm animation"));


        View s5 = ctv.subHead(getString(R.string.pseudo), container.getContext());
        linearLayout.addView(s5);
//        CodeView codeView1 = new CodeView(container.getContext());
//        codeView1.setCode(getString(R.string.bsf_pseudo));
//        Objects.requireNonNull(codeView1.getOptions()).withTheme(ColorTheme.MONOKAI);

        View codeView1 = ccv.Code(container.getContext(), getString(R.string.bsf_pseudo));


        linearLayout.addView(codeView1);


        return root;

    }

}
