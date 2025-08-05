package com.taobao.android.detail2.core.framework.view.horizontalscroll;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<View> f11597a;

    static {
        kge.a(1890399310);
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public a(List<View> list) {
        this.f11597a = list;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f11597a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        View view = this.f11597a.get(i);
        if (view.getParent() == null) {
            viewGroup.addView(view);
        }
        return view;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
        } else {
            viewGroup.removeView((View) obj);
        }
    }

    public View a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("46aa9b1d", new Object[]{this, new Integer(i)}) : this.f11597a.get(i);
    }
}
