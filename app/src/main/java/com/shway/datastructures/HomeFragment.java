package com.shway.datastructures;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class HomeFragment extends Fragment{

  //  private NavController navController;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.linearlayout);

        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();

        View head = ctv.mainHead(getString(R.string.data_structures), container.getContext());
        View text = ctv.normalText(getString(R.string.ds_text), container.getContext());

        View subHead1 = ctv.subHead(getString(R.string.inbuilt_data_structures), container.getContext());
        View text1 = ctv.normalText(getString(R.string.ids_text), container.getContext());

        CardView card1 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard = new LinearLayout(container.getContext());
        linearLayoutCard.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard.setLayoutParams(lp);


        View arr = ccv.listItem(getString(R.string.arr_text), getString(R.string.arr),
                R.drawable.grid, container.getContext());
        View struct = ccv.listItem(getString(R.string.struct_txt), getString(R.string.structure),
                R.drawable.structure, container.getContext());

        arr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_arrayIntro);
            }
        });

        struct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_structures);
            }
        });

        linearLayoutCard.addView(arr);
        linearLayoutCard.addView(struct);
        card1.addView(linearLayoutCard);

        View subHead2 = ctv.subHead(getString(R.string.adt), container.getContext());
        View text2 = ctv.normalText(getString(R.string.adt_text), container.getContext());

        CardView card2 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard2 = new LinearLayout(container.getContext());
        linearLayoutCard2.setOrientation(LinearLayout.VERTICAL);
        linearLayoutCard2.setLayoutParams(lp);


        View ll = ccv.listItem(getString(R.string.ll_text), "Linked List",
                R.drawable.ll, container.getContext());
        View stack = ccv.listItem(getString(R.string.stack_text), "Stack",
                R.drawable.stack, container.getContext());
        View queue = ccv.listItem(getString(R.string.queue_text), "Queue",
                R.drawable.queue, container.getContext());
        View tree = ccv.listItem(getString(R.string.tree_text), "Tree",
                R.drawable.tree, container.getContext());
        View heap = ccv.listItem(getString(R.string.heap_text), "Heap",
                R.drawable.heap, container.getContext());
        View graph = ccv.listItem(getString(R.string.graph_text), "Graph",
                R.drawable.graph, container.getContext());
        View hash = ccv.listItem(getString(R.string.hash_text), "Hash Table",
                R.drawable.table, container.getContext());

        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_linkedList);
            }
        });
        stack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_stack);
            }
        });
        queue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_queue);
            }
        });
        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_trees);
            }
        });
        heap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_heap);
            }
        });
        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_graphs);
            }
        });
        hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_home_to_hashTable);
            }
        });

        linearLayoutCard2.addView(ll);
        linearLayoutCard2.addView(stack);
        linearLayoutCard2.addView(queue);
        linearLayoutCard2.addView(tree);
        linearLayoutCard2.addView(heap);
        linearLayoutCard2.addView(graph);
        linearLayoutCard2.addView(hash);

        card2.addView(linearLayoutCard2);


        linearLayout.addView(head);
        linearLayout.addView(text);

        linearLayout.addView(subHead1);
        linearLayout.addView(text1);

        linearLayout.addView(card1);

        linearLayout.addView(subHead2);
        linearLayout.addView(text2);

        linearLayout.addView(card2);
        super.onViewCreated(root, savedInstanceState);
        return root;
    }


}