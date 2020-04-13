package com.shway.datastructures;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;

public class CTextViews {

    public View normalText(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);

        TextView tv = new TextView(context);
        tv.setText(Html.fromHtml(text));
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body1);
        tv.setPadding(0,VALUE_IN_DP_8,0,0);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat);
        tv.setTypeface(typeface);
        tv.setLineSpacing(0,1.25f);
        return tv;
    }

    public View mainHead(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);

        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body2);
        tv.setTextSize(36);
        tv.setPadding(0,VALUE_IN_DP_8,0,0);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat);
        tv.setTypeface(typeface);
        return tv;
    }

    public View subHead(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);

        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body1);
        tv.setTextSize(24);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat);
        tv.setTypeface(typeface);
        tv.setPadding(0,VALUE_IN_DP_8,0,0);
       return tv;
    }

    public View subHead2(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);

        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body1);
        tv.setTextSize(20);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat);
        tv.setTypeface(typeface);
        tv.setPadding(0,VALUE_IN_DP_8,0,0);
        return tv;
    }

    public View cardHead(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);

        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextAppearance(R.style.TextAppearance_AppCompat_Body2);
        tv.setTextSize(14);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat_bold_1);
        tv.setTypeface(typeface);
        return tv;
    }

    public View cardText(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);

        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextSize(14);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat);
        tv.setTypeface(typeface);
        tv.setLineSpacing(0,1.25f);
        return tv;
    }

    public View cardText2(String text, Context context)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);
        TextView tv = new TextView(context);
        tv.setText(text);
        tv.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        tv.setTextSize(16);
        Typeface typeface = ResourcesCompat.getFont(context, R.font.montserrat);
        tv.setTypeface(typeface);
        tv.setLineSpacing(0,1.25f);
        tv.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.BLACK);
        return tv;
    }
}
