package com.test.activity;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.test.R;
import com.test.adapter.ViewPagerAdapter;
import com.test.databinding.ActivityMainWithPagerBinding;
import com.test.fragment.ItemFragment;
import com.test.utils.CommonUtils;

public class MainWithPagerActivity extends AppCompatActivity implements View.OnClickListener{
    private ActivityMainWithPagerBinding binding;
    private Context mContext = MainWithPagerActivity.this;
    private ViewPagerAdapter pagerAdapter;
    private ItemFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main_with_pager);
        initViews();
    }

    private void initViews() {
        binding.llHeader.ivFilter.setOnClickListener(this);
        binding.llHeader.ivSortBy.setOnClickListener(this);
        binding.llBotttom.ivOne.setOnClickListener(this);
        binding.llBotttom.ivTwo.setOnClickListener(this);
        binding.llBotttom.ivThird.setOnClickListener(this);
        binding.llBotttom.ivForth.setOnClickListener(this);
        binding.llBotttom.ivFifth.setOnClickListener(this);
        setPagerAdapter();
        setTabLayoutView();
    }

    /*METHOD TO SET PAGER ADAPTER*/
    private void setPagerAdapter() {
        fragment = new ItemFragment();
        pagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(fragment, "PRODUCTS");
        pagerAdapter.addFragment(new ItemFragment(), "SERVICES");
        pagerAdapter.addFragment(new ItemFragment(), "SOLD");
        binding.viewPager.setOffscreenPageLimit(3);
        binding.viewPager.setAdapter(pagerAdapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
    /**
     * Below method is used to customize the Tab layout view
     */
    private void setTabLayoutView() {
        for (int i = 0; i < binding.tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = binding.tabLayout.getTabAt(i);
            RelativeLayout relativeLayout = (RelativeLayout)
                    LayoutInflater.from(this).inflate(R.layout.tab_text, binding.tabLayout, false);
            TextView tabTextView = (TextView) relativeLayout.findViewById(R.id.tab_title);
            tabTextView.setText(tab.getText());
            tab.setCustomView(relativeLayout);
        }
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
