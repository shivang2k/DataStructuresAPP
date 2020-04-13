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
public class Graphs extends Fragment {


    public Graphs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_graphs, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.graph);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.directed_acyclic_graph_2, "A directed graph"));
        View head = ctv.mainHead("Graphs", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_graph), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_graph_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);


        View subHead2 = ctv.subHead(getString(R.string.prop_graph), container.getContext());
        View text2 = ctv.normalText(getString(R.string.prop_graph_txt), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);


        View subHead3 = ctv.subHead2(getString(R.string.direct_g), container.getContext());
        View text3 = ctv.normalText(getString(R.string.direct_g_txt), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);


        View subHead4 = ctv.subHead2(getString(R.string.undir_g), container.getContext());
        View text4 = ctv.normalText(getString(R.string.undirect_g_txt), container.getContext());
        linearLayout.addView(subHead4);
        linearLayout.addView(text4);

        View subHead5 = ctv.subHead("Uses in programing", container.getContext());
        View text5 = ctv.normalText(getString(R.string.use_graphs), container.getContext());
        linearLayout.addView(subHead5);
        linearLayout.addView(text5);


        View subHead6 = ctv.subHead("Terminology used in Graphs", container.getContext());
        linearLayout.addView(subHead6);

        View ss1 = ctv.subHead2(getString(R.string.vertex), container.getContext());
        View t1 = ctv.normalText(getString(R.string.vertex_txt), container.getContext());
        linearLayout.addView(ss1);
        linearLayout.addView(t1);

        View ss2 = ctv.subHead2(getString(R.string.edge), container.getContext());
        View t2 = ctv.normalText(getString(R.string.edge_txt), container.getContext());
        linearLayout.addView(ss2);
        linearLayout.addView(t2);

        View ss3 = ctv.subHead2(getString(R.string.ug), container.getContext());
        View t3 = ctv.normalText(getString(R.string.ug_txt), container.getContext());
        linearLayout.addView(ss3);
        linearLayout.addView(t3);

        View ss4 = ctv.subHead2(getString(R.string.dg), container.getContext());
        View t4 = ctv.normalText(getString(R.string.dg_txt), container.getContext());
        linearLayout.addView(ss4);
        linearLayout.addView(t4);

        View ss5 = ctv.subHead2(getString(R.string.mg), container.getContext());
        View t5 = ctv.normalText(getString(R.string.mg_txt), container.getContext());
        linearLayout.addView(ss5);
        linearLayout.addView(t5);

        View ss6 = ctv.subHead2(getString(R.string.origin), container.getContext());
        View t6 = ctv.normalText(getString(R.string.origin_txt), container.getContext());
        linearLayout.addView(ss6);
        linearLayout.addView(t6);

        View ss7 = ctv.subHead2(getString(R.string.destination), container.getContext());
        View t7 = ctv.normalText(getString(R.string.destination_txt), container.getContext());
        linearLayout.addView(ss7);
        linearLayout.addView(t7);

        View ss8 = ctv.subHead2(getString(R.string.adj), container.getContext());
        View t8 = ctv.normalText(getString(R.string.adj_txt), container.getContext());
        linearLayout.addView(ss8);
        linearLayout.addView(t8);

        View ss9 = ctv.subHead2(getString(R.string.path_g), container.getContext());
        View t9 = ctv.normalText(getString(R.string.path_g_txt), container.getContext());
        linearLayout.addView(ss9);
        linearLayout.addView(t9);

        View ss10 = ctv.subHead2(getString(R.string.degree_g), container.getContext());
        View t10 = ctv.normalText(getString(R.string.degree_g_txt), container.getContext());
        linearLayout.addView(ss10);
        linearLayout.addView(t10);

        View ss11 = ctv.subHead2(getString(R.string.ind), container.getContext());
        View t11 = ctv.normalText(getString(R.string.ind_txt), container.getContext());
        linearLayout.addView(ss11);
        linearLayout.addView(t11);

        View ss12 = ctv.subHead2(getString(R.string.odeg), container.getContext());
        View t12 = ctv.normalText(getString(R.string.odeg_txt), container.getContext());
        linearLayout.addView(ss12);
        linearLayout.addView(t12);

        View ss13 = ctv.subHead2(getString(R.string.mst), container.getContext());
        View t13 = ctv.normalText(getString(R.string.mst_txt), container.getContext());
        linearLayout.addView(ss13);
        linearLayout.addView(t13);

        View ss14 = ctv.subHead2(getString(R.string.sg), container.getContext());
        View t14 = ctv.normalText(getString(R.string.sg_txt), container.getContext());
        linearLayout.addView(ss14);
        linearLayout.addView(t14);

        View ss15 = ctv.subHead2(getString(R.string.dag), container.getContext());
        View t15 = ctv.normalText(getString(R.string.dag_txt), container.getContext());
        linearLayout.addView(ss15);
        linearLayout.addView(t15);

        View ss16 = ctv.subHead2(getString(R.string.wg), container.getContext());
        View t16 = ctv.normalText(getString(R.string.wg_txt), container.getContext());
        linearLayout.addView(ss16);
        linearLayout.addView(t16);

        View ss17 = ctv.subHead2(getString(R.string.cg), container.getContext());
        View t17 = ctv.normalText(getString(R.string.cg_txt), container.getContext());
        linearLayout.addView(ss17);
        linearLayout.addView(t17);

        View ss18 = ctv.subHead2(getString(R.string.cong), container.getContext());
        View t18 = ctv.normalText(getString(R.string.cong_txt), container.getContext());
        linearLayout.addView(ss18);
        linearLayout.addView(t18);

        View ss19 = ctv.subHead(getString(R.string.rep_g), container.getContext());
        View t19 = ctv.normalText(getString(R.string.rep_txt), container.getContext());
        linearLayout.addView(ss19);
        linearLayout.addView(t19);

        View ss20 = ctv.subHead2(getString(R.string.adjm), container.getContext());
        View t20 = ctv.normalText(getString(R.string.sdjm_txt), container.getContext());
        linearLayout.addView(ss20);
        linearLayout.addView(t20);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.matrix_for_graph, "Adjacency Matrix for directed and undirected graphs"));

        View ss21 = ctv.subHead2(getString(R.string.adjl), container.getContext());
        View t21 = ctv.normalText(getString(R.string.adjl_txt), container.getContext());
        linearLayout.addView(ss21);
        linearLayout.addView(t21);
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.adj_list, "Adjacency List undirected graph"));


        View ss22 = ctv.subHead(getString(R.string.gt), container.getContext());
        View t22 = ctv.normalText(getString(R.string.gt_txt), container.getContext());
        linearLayout.addView(ss22);
        linearLayout.addView(t22);

        CardView card1 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard = new LinearLayout(container.getContext());
        linearLayoutCard.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard.setLayoutParams(lp);
        View bfs = ccv.listItem(getString(R.string.bfs_txt), getString(R.string.bfs),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View dfs = ccv.listItem(getString(R.string.dfs_txt), getString(R.string.dfs),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard.addView(bfs);
        linearLayoutCard.addView(dfs);
        card1.addView(linearLayoutCard);
        linearLayout.addView(card1);

        bfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_g_bfs);
            }
        });
        dfs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_g_dfs);
            }
        });


        View ss23 = ctv.subHead(getString(R.string.gt), container.getContext());
        linearLayout.addView(ss23);

        CardView card2 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard2 = new LinearLayout(container.getContext());
        linearLayoutCard2.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp2 = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard2.setLayoutParams(lp2);
        View ts = ccv.listItem(getString(R.string.ts_txt), getString(R.string.ts),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard2.addView(ts);
        card2.addView(linearLayoutCard2);
        linearLayout.addView(card2);

        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_g_ts);
            }
        });


        return root;

    }

}
