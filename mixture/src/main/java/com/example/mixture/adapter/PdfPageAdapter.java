package com.example.mixture.adapter;

import java.util.ArrayList;

import androidx.core.app.Fragment;
import androidx.core.app.FragmentManager;
import androidx.core.app.FragmentStatePagerAdapter;

import com.example.mixture.fragment.ImageFragment;

public class PdfPageAdapter extends FragmentStatePagerAdapter {
    private ArrayList<String> mImgArray = new ArrayList<String>();

    public PdfPageAdapter(FragmentManager fm, ArrayList<String> imgArray) {
        super(fm);
        mImgArray = imgArray;
    }

    public int getCount() {
        return mImgArray.size();
    }

    public Fragment getItem(int position) {
        return ImageFragment.newInstance(mImgArray.get(position));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "第" + (position + 1) + "页";
    }

}
