package com.shway.datastructures;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CTextViews {

    public View normalText(String text, Context context)
    {
        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body1);
        tv.setPadding(0,0,0,8);
        return tv;
    }

    public void mainHead(String text, LinearLayout ll, Context context)
    {
        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body2);
        tv.setTextSize(36);
        tv.setPadding(0,0,0,8);
        ll.addView(tv);
    }

    public void subHead(String text, LinearLayout ll, Context context)
    {
        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body2);
        tv.setTextSize(24);
        tv.setPadding(0,0,0,8);
        ll.addView(tv);
    }
}
