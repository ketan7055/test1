package com.test.activity;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.test.ItemFragment;
import com.test.R;
import com.test.databinding.ActivityMainBinding;
import com.test.utils.CommonUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private  ActivityMainBinding binding;
    private Context mContext = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initIds();
        CommonUtils.setFragment(new ItemFragment(),false,this,binding.flContainer,"");
    }

    private void initIds() {
        binding.llHeader.ivFilter.setOnClickListener(this);
        binding.llHeader.ivSortBy.setOnClickListener(this);
        binding.llBotttom.ivOne.setOnClickListener(this);
        binding.llBotttom.ivTwo.setOnClickListener(this);
        binding.llBotttom.ivThird.setOnClickListener(this);
        binding.llBotttom.ivForth.setOnClickListener(this);
        binding.llBotttom.ivFifth.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.ivFilter:
                CommonUtils.showToastWIP(mContext);
                break;
            case R.id.ivSortBy:
                CommonUtils.showToastWIP(mContext);
                break;

            case R.id.iv_one:
                CommonUtils.showToastWIP(mContext);
                break;
            case R.id.iv_two:
                CommonUtils.showToastWIP(mContext);
                break;
            case R.id.iv_third:
                CommonUtils.showToastWIP(mContext);
                break;
            case R.id.iv_forth:
                CommonUtils.showToastWIP(mContext);
                break;
            case R.id.iv_fifth:
                CommonUtils.showToastWIP(mContext);
                break;
        }

    }
}
