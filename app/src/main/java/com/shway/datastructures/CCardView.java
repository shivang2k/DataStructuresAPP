package com.shway.datastructures;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

public class CCardView {

    public View listItem(String txt, String head, Context context, int resID)
    {
       // CardView cv = makeCardView(context);
        ImageView iv = new ImageView(context);
        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.VERTICAL);
        CTextViews cTextViews = new CTextViews();

        final int VALUE_IN_DP_10 = (int)(10 * context.getResources().getDisplayMetrics().density);

        ll.addView(cTextViews.normalText(head, context));
        ll.addView(cTextViews.normalText(txt, context));
        ll.setPadding(VALUE_IN_DP_10, VALUE_IN_DP_10, VALUE_IN_DP_10, VALUE_IN_DP_10);

        iv.setImageResource(resID);
        iv.setPadding(VALUE_IN_DP_10, VALUE_IN_DP_10, 0, VALUE_IN_DP_10);

        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);

        linearLayout.addView(iv);
        linearLayout.addView(ll);

        return linearLayout;
    }


    public View listItemMulti(Context context, String...a)
    {
        CardView cv = makeCardView(context);

        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.HORIZONTAL);

        for(String x : a)
        {
            TextView tv = new TextView(context);
            tv.setText(x);
            tv.setGravity(Gravity.CENTER_HORIZONTAL);
            tv.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
            ll.addView(tv);
        }
        cv.addView(ll);
        return cv;
    }

    public CardView makeCardView(Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_10 = (int)(10 * context.getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_16 = (int)(16 * context.getResources().getDisplayMetrics().density);
        CardView cv = new CardView(context);
        cv.setRadius(VALUE_IN_DP_8);
        cv.setPadding(VALUE_IN_DP_10,VALUE_IN_DP_10,VALUE_IN_DP_10, VALUE_IN_DP_10);
        cv.setContentPadding(VALUE_IN_DP_10, VALUE_IN_DP_10, VALUE_IN_DP_10, VALUE_IN_DP_10);
        return cv;
    }

}
