package com.test.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.test.R;

/**
 * Created by ketan on 1/3/2018.
 */

public class CommonUtils {


    public static Typeface setFontBold(Context context) {
        Typeface typeLobster = Typeface.createFromAsset(context.getAssets(), "fonts/blogger_sans_bold.ttf");
        return typeLobster;
    }

    public static Typeface  setFontRegular (Context context) {
        Typeface typeLobster = Typeface.createFromAsset(context.getAssets(), "fonts/blogger_sans_light.ttf");
        return typeLobster;
    }

    public static Typeface  setFontItalic (Context context) {
        Typeface typeLobster = Typeface.createFromAsset(context.getAssets(), "fonts/blogger_sans_italic.ttf");
        return typeLobster;
    }

    /**
     * this method is used for set the fragment on activity
     * @param fragment
     * @param removeStack
     * @param activity
     * @param mContainer
     * @param tag
     */
    public static void setFragment(Fragment fragment, boolean removeStack, FragmentActivity activity, FrameLayout mContainer, String tag) {
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction ftTransaction = fragmentManager.beginTransaction();
        if (removeStack) {
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            if (tag != null)
                ftTransaction.replace(mContainer.getId(), fragment, tag);
            else
                ftTransaction.replace(mContainer.getId(), fragment);
        } else {
            if (tag != null)
                ftTransaction.replace(mContainer.getId(), fragment, tag);
            else
                ftTransaction.replace(mContainer.getId(), fragment);
            ftTransaction.addToBackStack(null);
        }
        ftTransaction.commit();
    }


    /* this method is used for add the fragment on activity */
    public static void addFragment(Fragment fragment, boolean removeStack, FragmentActivity activity, FrameLayout mContainer, String tag) {
        FragmentManager fragmentManager = activity.getSupportFragmentManager();
        FragmentTransaction ftTransaction = fragmentManager.beginTransaction();
//        ftTransaction.setCustomAnimations(R.anim.top_bottom_anim, R.anim.bottom_top_anim);
        if (removeStack) {
            fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            if (tag != null)
                ftTransaction.add(mContainer.getId(), fragment, tag);
            else
                ftTransaction.add(mContainer.getId(), fragment);
        } else {
            if (tag != null)
                ftTransaction.add(mContainer.getId(), fragment, tag);
            else
                ftTransaction.add(mContainer.getId(), fragment);
            ftTransaction.addToBackStack(null);
        }
        ftTransaction.commit();
    }

    public static void showToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }


    public static void showToastWIP(Context context) {
        Toast.makeText(context, R.string.wip, Toast.LENGTH_SHORT).show();
    }

}
