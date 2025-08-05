package com.taobao.android.meta.structure.page;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.g;
import com.taobao.android.searchbaseframe.datasource.impl.bean.TabBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class c extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<TabBean> f14303a;
    private int b;
    private final d c;

    static {
        kge.a(50570742);
    }

    public c(d presenter) {
        q.c(presenter, "presenter");
        this.c = presenter;
        this.f14303a = new ArrayList();
        this.b = -1;
    }

    public final List<TabBean> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f14303a;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f14303a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup container, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, container, new Integer(i)});
        }
        q.c(container, "container");
        g b = this.c.b(i);
        if (b == null) {
            return null;
        }
        container.addView(b.getView(), new ViewGroup.LayoutParams(-1, -1));
        return b.getView();
    }

    @Override // android.support.v4.view.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        int i2 = this.b;
        if (i2 >= 0 && i != i2) {
            return;
        }
        this.c.g(i);
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup container, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, container, new Integer(i), obj});
            return;
        }
        q.c(container, "container");
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        container.removeView((View) obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : q.a(view, obj);
    }
}
