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
public class Trees extends Fragment {


    public Trees() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_trees, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.tree);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

        View head = ctv.mainHead("Trees", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_tree), container.getContext());
        View text1 = ctv.normalText(getString(R.string.what_tree_txt), container.getContext());
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.binary_tree, "Tree"));
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        View subHead2 = ctv.subHead(getString(R.string.adv_tree), container.getContext());
        View text2 = ctv.normalText(getString(R.string.adv_tree_txt), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        View subHead3 = ctv.subHead("Uses in programing", container.getContext());
        View text3 = ctv.normalText(getString(R.string.use_program_tree), container.getContext());
        linearLayout.addView(subHead3);
        linearLayout.addView(text3);

        View subHead4 = ctv.subHead(getString(R.string.term_tree), container.getContext());
        linearLayout.addView(subHead4);

        View ss1 = ctv.subHead2(getString(R.string.root), container.getContext());
        View t1 = ctv.normalText(getString(R.string.root_txt), container.getContext());
        linearLayout.addView(ss1);
        linearLayout.addView(t1);

        View ss2 = ctv.subHead2(getString(R.string.pnode), container.getContext());
        View t2 = ctv.normalText(getString(R.string.pnode_txt), container.getContext());
        linearLayout.addView(ss2);
        linearLayout.addView(t2);

        View ss3 = ctv.subHead2(getString(R.string.cnode), container.getContext());
        View t3 = ctv.normalText(getString(R.string.cnode_txt), container.getContext());
        linearLayout.addView(ss3);
        linearLayout.addView(t3);

        View ss4 = ctv.subHead2(getString(R.string.siblings), container.getContext());
        View t4 = ctv.normalText(getString(R.string.siblings_txt), container.getContext());
        linearLayout.addView(ss4);
        linearLayout.addView(t4);

        View ss5 = ctv.subHead2(getString(R.string.lnode), container.getContext());
        View t5 = ctv.normalText(getString(R.string.lnode_txt), container.getContext());
        linearLayout.addView(ss5);
        linearLayout.addView(t5);

        View ss6 = ctv.subHead2(getString(R.string.inode), container.getContext());
        View t6 = ctv.normalText(getString(R.string.inode_txt), container.getContext());
        linearLayout.addView(ss6);
        linearLayout.addView(t6);

        View ss7 = ctv.subHead2(getString(R.string.enode), container.getContext());
        View t7 = ctv.normalText(getString(R.string.enode_txt), container.getContext());
        linearLayout.addView(ss7);
        linearLayout.addView(t7);

        View ss8 = ctv.subHead2(getString(R.string.degree), container.getContext());
        View t8 = ctv.normalText(getString(R.string.degree_txt), container.getContext());
        linearLayout.addView(ss8);
        linearLayout.addView(t8);

        View ss9 = ctv.subHead2(getString(R.string.level), container.getContext());
        View t9 = ctv.normalText(getString(R.string.level_txt), container.getContext());
        linearLayout.addView(ss9);
        linearLayout.addView(t9);

        View ss10 = ctv.subHead2(getString(R.string.height), container.getContext());
        View t10 = ctv.normalText(getString(R.string.height_txt), container.getContext());
        linearLayout.addView(ss10);
        linearLayout.addView(t10);

        View ss11 = ctv.subHead2(getString(R.string.depth), container.getContext());
        View t11 = ctv.normalText(getString(R.string.depth_txt), container.getContext());
        linearLayout.addView(ss11);
        linearLayout.addView(t11);

        View ss12 = ctv.subHead2(getString(R.string.path), container.getContext());
        View t12 = ctv.normalText(getString(R.string.path_txt), container.getContext());
        linearLayout.addView(ss12);
        linearLayout.addView(t12);

        View subHead5 = ctv.subHead(getString(R.string.tree_types), container.getContext());
        linearLayout.addView(subHead5);

        CardView card1 = ccv.makeCardView(container.getContext());
        LinearLayout linearLayoutCard = new LinearLayout(container.getContext());
        linearLayoutCard.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard.setLayoutParams(lp);

        View bt = ccv.listItem("Properties of "+ getString(R.string.binary_tree), getString(R.string.binary_tree),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View bst = ccv.listItem("Properties of "+ getString(R.string.binary_stree), getString(R.string.binary_stree),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View mwt = ccv.listItem("Properties of "+ getString(R.string.mw_search), getString(R.string.mw_search),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        View avl = ccv.listItem("Properties of "+ getString(R.string.avl_tree), getString(R.string.avl_tree),
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard.addView(bt);
        linearLayoutCard.addView(bst);
        linearLayoutCard.addView(mwt);
        linearLayoutCard.addView(avl);
        card1.addView(linearLayoutCard);

        linearLayout.addView(card1);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_t_bt);
            }
        });
        bst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_t_bst);
            }
        });
        mwt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_t_mwt);
            }
        });
        avl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_t_avl);
            }
        });


        View ss13 = ctv.subHead(getString(R.string.binary_tree_traversals), container.getContext());
        View t13 = ctv.normalText(getString(R.string.btt_txt), container.getContext());
        linearLayout.addView(ss13);
        linearLayout.addView(t13);



        CardView card2 = ccv.makeCardView(container.getContext());
        LinearLayout linearLayoutCard2 = new LinearLayout(container.getContext());
        linearLayoutCard2.setOrientation(LinearLayout.VERTICAL);
        linearLayoutCard2.setLayoutParams(lp);

        View tm = ccv.listItem("Inorder, Preorder and Postorder traversals", "Traversal Methods",
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard2.addView(tm);
        card2.addView(linearLayoutCard2);
        linearLayout.addView(card2);
        tm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_t_tt);
            }
        });
        return root;
    }

}
