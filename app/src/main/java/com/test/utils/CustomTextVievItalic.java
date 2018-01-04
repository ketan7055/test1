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

public class CustomTextVievItalic extends TextView {

    public CustomTextVievItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(CommonUtils.setFontItalic(context));
    }

    public CustomTextVievItalic(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.setTypeface(CommonUtils.setFontBold(context));
    }

    public CustomTextVievItalic(Context context) {
        super(context);
        this.setTypeface(CommonUtils.setFontBold(context));
    }


}
