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
public class Heap extends Fragment {


    public Heap() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_heap, container, false);
        LinearLayout linearLayout = root.findViewById(R.id.heap);
        CTextViews ctv = new CTextViews();
        CCardView ccv = new CCardView();
        linearLayout.addView(ccv.Image(container.getContext(), R.drawable.binary_heap, "Max Heap and array indexing: Notice how parent is greater than its children"));

        View head = ctv.mainHead("Heaps", container.getContext());
        View subHead1 = ctv.subHead(getString(R.string.what_heap), container.getContext());
        View text1 = ctv.normalText(getString(R.string.heap_txt), container.getContext());
        linearLayout.addView(head);
        linearLayout.addView(subHead1);
        linearLayout.addView(text1);


        View subHead2 = ctv.subHead(getString(R.string.exam_stack), container.getContext());
        View text2 = ctv.normalText(getString(R.string.use_heap), container.getContext());
        linearLayout.addView(subHead2);
        linearLayout.addView(text2);


        linearLayout.addView(ccv.Gif(container.getContext(), R.drawable.heap_sort_example, "Sorting using heap sort"));

        CardView card1 = ccv.makeCardView(container.getContext());

        LinearLayout linearLayoutCard = new LinearLayout(container.getContext());
        linearLayoutCard.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        linearLayoutCard.setLayoutParams(lp);
        View exp = ccv.listItem("Different Operations in a Heap", "Heap Operations",
                R.drawable.ic_play_arrow_black_24dp, container.getContext());
        linearLayoutCard.addView(exp);
        card1.addView(linearLayoutCard);
        linearLayout.addView(card1);

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_h_ho);
            }
        });

        return root;

    }

}
