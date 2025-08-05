package com.taobao.android.weex_uikit.widget.slide;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.util.g;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int e;

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d, android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    static {
        kge.a(400178703);
        e = 500;
    }

    public f(MUSDKInstance mUSDKInstance) {
        super(mUSDKInstance);
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public int a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{this, new Integer(i)})).intValue() : !this.d ? i : i % a();
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public void a(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f8e6f", new Object[]{this, viewPager, new Integer(i)});
        } else if (i < 0 || i >= a()) {
            g.a("[Slide]: index is beyond bounds");
        } else if (this.d) {
            viewPager.setCurrentItem(b() + i, false);
        } else {
            viewPager.setCurrentItem(i, false);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d, android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.d) {
            return this.b.size() * e;
        }
        return this.b.size();
    }

    private int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        if (a() == 0) {
            return 0;
        }
        int a2 = (e * a()) / 2;
        if (a2 % a() == 0) {
            return a2;
        }
        while (a2 % a() != 0) {
            a2++;
        }
        return a2;
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.d
    public void a(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2029c714", new Object[]{this, viewPager});
        } else if (!this.d) {
        } else {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem == 0) {
                viewPager.setCurrentItem(b(), false);
            } else if (currentItem != getCount() - 1) {
            } else {
                viewPager.setCurrentItem((b() + this.b.size()) - 1, false);
            }
        }
    }
}
