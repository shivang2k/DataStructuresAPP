package com.shway.datastructures;

import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.protectsoft.webviewcode.Codeview;
import com.protectsoft.webviewcode.Settings;

import pl.droidsonroids.gif.GifDrawable;

public class CCardView {

    public View listItem(String txt, String head,int resID, Context context)
    {
        ImageView iv = new ImageView(context);
        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.VERTICAL);
        CTextViews cTextViews = new CTextViews();

        final int VALUE_IN_DP_10 = (int)(10 * context.getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_5 = (int)(5 * context.getResources().getDisplayMetrics().density);
        ll.addView(cTextViews.cardHead(head, context));
        ll.addView(cTextViews.cardText(txt, context));
        ll.setPadding(VALUE_IN_DP_10, VALUE_IN_DP_10, VALUE_IN_DP_10, 0);

        iv.setImageResource(resID);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(140, 140);
        lp.gravity = Gravity.CENTER;
        iv.setLayoutParams(lp);
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
        iv.setAdjustViewBounds(true);
        iv.setPadding(VALUE_IN_DP_5, VALUE_IN_DP_10, 0, VALUE_IN_DP_10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(iv);
        linearLayout.addView(ll);

        TypedValue outValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.selectableItemBackground, outValue, true);
        linearLayout.setBackgroundResource(outValue.resourceId);
        return linearLayout;
    }


    public View listItemMulti(Context context, String...a)
    {
        final int VALUE_IN_DP_8 = (int)(8 * context.getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_10 = (int)(10 * context.getResources().getDisplayMetrics().density);
        final int VALUE_IN_DP_16 = (int)(16 * context.getResources().getDisplayMetrics().density);
        CardView cv = makeCardView(context);

        LinearLayout ll = new LinearLayout(context);
        ll.setOrientation(LinearLayout.HORIZONTAL);


        for(String x : a)
        {
            TextView tv = new TextView(context);
            tv.setText(Html.fromHtml(x));
            tv.setGravity(Gravity.CENTER_HORIZONTAL);
            tv.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.WRAP_CONTENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT, 1f));
            ll.addView(tv);
        }
        cv.addView(ll);
        cv.setPadding(0, VALUE_IN_DP_8, 0, VALUE_IN_DP_8);
        LinearLayout.LayoutParams cardViewParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cv.setLayoutParams(cardViewParams);
        ViewGroup.MarginLayoutParams cardViewMarginParams = (ViewGroup.MarginLayoutParams) cv.getLayoutParams();
        cardViewMarginParams.setMargins(0, VALUE_IN_DP_10, 0, VALUE_IN_DP_10);
        cv.requestLayout();
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

        LinearLayout.LayoutParams cardViewParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        cv.setLayoutParams(cardViewParams);
        ViewGroup.MarginLayoutParams cardViewMarginParams = (ViewGroup.MarginLayoutParams) cv.getLayoutParams();
        cardViewMarginParams.setMargins(0, VALUE_IN_DP_10, 0, VALUE_IN_DP_10);
        cv.requestLayout();

        return cv;
    }

    public View Code(Context context, String code)
    {
        LinearLayout ll = new LinearLayout(context);
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp.gravity = Gravity.CENTER;
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(llp);
        WebView wv = new WebView(context);
        wv.setBackgroundColor(Color.parseColor("#2b2b2b"));
        Codeview.with(context)
                .withCode(code)
                .setStyle(Settings.WithStyle.DARKULA)
                .setLang(Settings.Lang.CPLUSPLUS)
                .into(wv);

        CTextViews cTextViews = new CTextViews();
        ll.addView(cTextViews.subHead("Example Code",context));
        ll.addView(wv);
        return ll;
    }

    public View Image(Context context, int img, String text)
    {
        LinearLayout ll = new LinearLayout(context);
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp.gravity = Gravity.CENTER;
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(llp);
        ll.setBackgroundColor(context.getColor(R.color.img));
        ImageView iv = null;
        final int VALUE_IN_DP_16 = (int)(16 * context.getResources().getDisplayMetrics().density);
        ll.setPadding(VALUE_IN_DP_16,VALUE_IN_DP_16,VALUE_IN_DP_16, VALUE_IN_DP_16);
        LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 600);

        CTextViews ctv = new CTextViews();
        try {
            iv = new ImageView(context);
            iv.setImageDrawable(context.getDrawable(img));
            iv.setPadding(0,0,0, VALUE_IN_DP_16);
            iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iv.setAdjustViewBounds(true);
        }
        catch (Exception ignored){}
        iv.setMaxHeight(600);
        ll.addView(iv);
        ll.addView(ctv.cardText2(text, context));
        return ll;
    }

    public View Gif(Context context, int gif, String text)
    {
        LinearLayout ll = new LinearLayout(context);
        LinearLayout.LayoutParams llp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        llp.gravity = Gravity.CENTER;
        ll.setOrientation(LinearLayout.VERTICAL);
        ll.setLayoutParams(llp);
        ll.setBackgroundColor(context.getColor(R.color.img));
        ImageView iv = null;
        LinearLayout.LayoutParams llp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 600);

        final int VALUE_IN_DP_16 = (int)(16 * context.getResources().getDisplayMetrics().density);
        ll.setPadding(VALUE_IN_DP_16,VALUE_IN_DP_16,VALUE_IN_DP_16, VALUE_IN_DP_16);
        CTextViews ctv = new CTextViews();
        try {
            GifDrawable gifFromResource = new GifDrawable( context.getResources(), gif);
            gifFromResource.setSpeed(1.5f);
            iv = new ImageView(context);
            iv.setImageDrawable(gifFromResource);
            iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iv.setPadding(0,0,0, VALUE_IN_DP_16);
            iv.setAdjustViewBounds(true);
        }
        catch (Exception ignored){}
        iv.setMaxHeight(600);
        ll.addView(iv);
        ll.addView(ctv.cardText2(text, context));
        return ll;
    }

}