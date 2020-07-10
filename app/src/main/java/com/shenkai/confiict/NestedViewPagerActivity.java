package com.shenkai.confiict;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.shenkai.confiict.databinding.ActivityNestedViewPagerBinding;
import com.shenkai.confiict.fragment.RecyclerViewFragment;
import com.shenkai.confiict.viewpager.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class NestedViewPagerActivity extends AppCompatActivity {
    ActivityNestedViewPagerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_view_pager);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_nested_view_pager);
        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(this, getPageFragments());
        binding.viewpagerView.setAdapter(pagerAdapter);
        // binding.comboContentView.setOffscreenPageLimit(1);
        final String[] labels = new String[]{"linear", "scroll", "recycler"};
        new TabLayoutMediator(binding.tablayout, binding.viewpagerView, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText(labels[position]);
            }
        }).attach();

    }

    private List<Fragment> getPageFragments() {
        List<Fragment> data = new ArrayList<>();
        data.add(new RecyclerViewFragment());
        data.add(new RecyclerViewFragment());
        data.add(new RecyclerViewFragment());
        return data;
    }
}
