package com.taobao.taolive.taolivemorelive.morelive.ui;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.taolivemorelive.morelive.business.TabMenuResponseData;
import java.util.ArrayList;
import java.util.List;
import tb.pqn;
import tb.pro;

/* loaded from: classes8.dex */
public class c extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<TabMenuResponseData.TopTab> f21980a;
    private List<g> b = new ArrayList();
    private com.taobao.alilive.aliliveframework.frame.a c;
    private Context d;

    public c(List<TabMenuResponseData.TopTab> list, com.taobao.alilive.aliliveframework.frame.a aVar, Context context) {
        this.f21980a = list;
        this.c = aVar;
        this.d = context;
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f21980a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public CharSequence getPageTitle(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CharSequence) ipChange.ipc$dispatch("1a9ab8b1", new Object[]{this, new Integer(i)}) : (i < 0 || i >= this.f21980a.size()) ? "" : this.f21980a.get(i).name;
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : ((g) obj).h() == view;
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        g eVar;
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        if (this.b.size() > i && (gVar = this.b.get(i)) != null) {
            return gVar;
        }
        TabMenuResponseData.TopTab topTab = this.f21980a.get(i);
        if (topTab != null && !pro.e(topTab.tabType) && topTab.tabType.equals("h5") && !pro.e(topTab.jumpUrl) && pqn.h()) {
            eVar = new f(this.d, topTab, this.c);
        } else {
            eVar = new e(viewGroup.getContext(), topTab, this.c);
        }
        while (this.b.size() <= i) {
            this.b.add(null);
        }
        viewGroup.removeView(eVar.h());
        viewGroup.addView(eVar.h());
        this.b.set(i, eVar);
        return eVar;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        if (obj instanceof e) {
            viewGroup.removeView(((e) obj).h());
        }
        this.b.set(i, null);
    }
}
