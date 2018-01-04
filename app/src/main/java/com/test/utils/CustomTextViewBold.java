package com.test.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ankit.saini on 16/12/16.
 */

@SuppressWarnings("ALL")
@SuppressLint("ALL")

public class CustomTextViewBold extends TextView {

    public CustomTextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(CommonUtils.setFontBold(context));
    }

    public CustomTextViewBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setTypeface(CommonUtils.setFontBold(context));
    }

    public CustomTextViewBold(Context context) {
        super(context);
        this.setTypeface(CommonUtils.setFontBold(context));
    }


}
