package com.taobao.android.live.plugin.atype.flexalocal.good.tab;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f13822a = new ArrayList(Arrays.asList("宝贝", "拍品", "新品"));
    private final List<View> b;
    private final List<d> c;

    static {
        kge.a(1753427454);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        if (str.hashCode() == 50642664) {
            return new Integer(super.getItemPosition(objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : obj == view;
    }

    public a(List<d> list, List<View> list2) {
        this.b = list2;
        this.c = list;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s()) {
            List<d> list = this.c;
            if (list != null && !list.isEmpty()) {
                return this.c.size();
            }
            return 0;
        }
        List<View> list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            return this.b.size();
        }
        return 0;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (!com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s()) {
            return super.getItemPosition(obj);
        }
        return -2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.s()) {
            List<d> list = this.c;
            if ((list != null && list.isEmpty()) || (frameLayout = this.c.get(i).tabFrameLayout) == null) {
                return null;
            }
            viewGroup.removeView(frameLayout);
            viewGroup.addView(frameLayout);
            return frameLayout;
        }
        List<View> list2 = this.b;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        View view = this.b.get(i);
        viewGroup.removeView(view);
        viewGroup.addView(view);
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

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)}) : i >= this.f13822a.size() ? "宝贝口袋" : this.f13822a.get(i);
    }

    public void a(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (list == null || list.isEmpty()) {
        } else {
            this.f13822a.clear();
            this.f13822a.addAll(list);
        }
    }
}
