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
public class TopologicalSort extends Fragment {


    public TopologicalSort() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_topological_sort, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.ts);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.directed_acyclic_graph_2, "A directed acyclic graph on which topological sort is performed"));


        View head = ctv.mainHead("Topological Sorting", container.getContext());
        View text = ctv.normalText(getString(R.string.topo_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(text);

        View t1 = ctv.normalText(getString(R.string.topo_algo), container.getContext());
        linearLayout.addView(t1);

        View s2 = ctv.subHead(getString(R.string.khans), container.getContext());
        View t2 = ctv.normalText(getString(R.string.khans_txt), container.getContext());
        linearLayout.addView(s2);
        linearLayout.addView(t2);

        View s3 = ctv.subHead(getString(R.string.dfs_app), container.getContext());
        View t3 = ctv.normalText(getString(R.string.dfs_app_txt), container.getContext());
        linearLayout.addView(s3);
        linearLayout.addView(t3);

        return root;

    }

}
