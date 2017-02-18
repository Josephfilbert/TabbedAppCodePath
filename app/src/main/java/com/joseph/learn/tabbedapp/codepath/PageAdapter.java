package com.joseph.learn.tabbedapp.codepath;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.joseph.learn.tabbedapp.codepath.Fragments.FirstFragment;
import com.joseph.learn.tabbedapp.codepath.Fragments.SecondFragment;

/**
 * Created by Joseph on 12/02/2017.
 */

public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return FirstFragment.newInstance(0, "First Fragment");
            case 1: return SecondFragment.newInstance(1, "Second Fragment");
        }
        return null;
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 2;
    }

    /**
     * This method may be called by the ViewPager to obtain a title string
     * to describe the specified page. This method may return null
     * indicating no title for this page. The default implementation returns
     * null.
     *
     * @param position The position of the title requested
     * @return A title for the requested page
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}
