package com.taobao.browser.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.ui.HorizontalPagerAdapter;
import com.taobao.browser.jsbridge.ui.ImageViewPager;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes6.dex */
public class HorizontalImageListFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TAG = "HorizontalImageListFragmentContainer";
    public ArrayList<String> mImageUrls = new ArrayList<>();
    private HorizontalPagerAdapter mAdapter = null;
    private View mView = null;
    private List<View> dots = null;
    private String index = "0";

    static {
        kge.a(1462789920);
    }

    public static /* synthetic */ Object ipc$super(HorizontalImageListFragment horizontalImageListFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode != -641568046) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
    }

    public static /* synthetic */ List access$100(HorizontalImageListFragment horizontalImageListFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e575a53e", new Object[]{horizontalImageListFragment}) : horizontalImageListFragment.dots;
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        BrowserUtil.a(this.TAG, BrowserUtil.b, BrowserUtil.c, null, null);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String[] stringArray = arguments.getStringArray("image_list_urls");
        if (stringArray != null) {
            for (String str : stringArray) {
                if (str != null) {
                    this.mImageUrls.add(str);
                }
            }
        }
        this.index = arguments.getString("image_position");
        if (!StringUtils.isEmpty(this.index)) {
            return;
        }
        this.index = "0";
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.mView = layoutInflater.inflate(R.layout.horizontalimagelist_layout, viewGroup, false);
        View view = this.mView;
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        ImageViewPager imageViewPager = (ImageViewPager) this.mView.findViewById(R.id.image_Horizontallist);
        this.mAdapter = new HorizontalPagerAdapter(context);
        this.mAdapter.change(this.mImageUrls);
        imageViewPager.setAdapter(this.mAdapter);
        imageViewPager.setCurrentItem(Integer.parseInt(this.index));
        int size = this.mImageUrls.size();
        ViewGroup viewGroup2 = (ViewGroup) this.mView.findViewById(R.id.v_dots);
        if (size < 10 && size > 1) {
            a aVar = new a();
            imageViewPager.setOnPageChangeListener(aVar);
            this.dots = new ArrayList();
            View findViewById = this.mView.findViewById(R.id.v_dot);
            this.dots.add(findViewById);
            for (int i = 1; i < size; i++) {
                View view2 = new View(context);
                view2.setLayoutParams(findViewById.getLayoutParams());
                view2.setBackgroundResource(R.drawable.image_dot_normal);
                this.dots.add(view2);
                viewGroup2.addView(view2);
            }
            aVar.onPageSelected(Integer.parseInt(this.index));
        } else {
            viewGroup2.setVisibility(8);
        }
        return this.mView;
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        HorizontalPagerAdapter horizontalPagerAdapter = this.mAdapter;
        if (horizontalPagerAdapter != null) {
            horizontalPagerAdapter.clear();
        }
        this.mAdapter = null;
        super.onDestroy();
    }

    /* loaded from: classes6.dex */
    public class a implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        static {
            kge.a(-1359735529);
            kge.a(1848919473);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        private a() {
            this.b = 0;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            ((View) HorizontalImageListFragment.access$100(HorizontalImageListFragment.this).get(this.b)).setBackgroundResource(R.drawable.image_dot_normal);
            ((View) HorizontalImageListFragment.access$100(HorizontalImageListFragment.this).get(i)).setBackgroundResource(R.drawable.image_dot_focused);
            this.b = i;
        }
    }
}
