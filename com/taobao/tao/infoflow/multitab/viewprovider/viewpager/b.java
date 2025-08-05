package com.taobao.tao.infoflow.multitab.viewprovider.viewpager;

import android.support.v4.view.PagerAdapter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.utils.n;
import com.taobao.tao.infoflow.multitab.g;
import com.taobao.tao.infoflow.multitab.i;
import com.taobao.tao.infoflow.multitab.viewprovider.viewpager.a;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;
import tb.kss;
import tb.kst;
import tb.xnh;

/* loaded from: classes8.dex */
public class b extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final i b;
    private final List<a.c> c;
    private ViewGroup e;

    /* renamed from: a  reason: collision with root package name */
    private final List<JSONObject> f20672a = new ArrayList();
    private final List<Integer> d = new CopyOnWriteArrayList();

    static {
        kge.a(-227005184);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue() : view == obj;
    }

    public b(i iVar, List<a.c> list) {
        this.b = iVar;
        this.c = list;
    }

    public void a(List<JSONObject> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.f20672a.clear();
        if (list != null) {
            this.f20672a.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue() : this.f20672a.size();
    }

    @Override // android.support.v4.view.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        g.a("MultiViewPagerAdapter", "instantiateItem position: " + i);
        this.e = viewGroup;
        View a2 = a(viewGroup, i);
        this.d.add(Integer.valueOf(i));
        if (i == this.b.c() && n.o()) {
            a2.setTag(R.id.multi_tab_container_type, this.b.b(i));
            a2.setTag(R.id.multi_tab_position, Integer.valueOf(i));
            a2.setTag(R.id.multi_tab_identifier, kst.d());
        }
        return a2;
    }

    @Override // android.support.v4.view.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        g.a("MultiViewPagerAdapter", "destroyItem container remove: " + i);
        if (i <= this.d.size() - 1) {
            this.d.remove(i);
        }
        viewGroup.removeView((View) obj);
    }

    @Override // android.support.v4.view.PagerAdapter
    public int getItemPosition(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
        }
        if (!xnh.a() || !n.o() || !(obj instanceof View)) {
            return -2;
        }
        View view = (View) obj;
        if (!(view.getTag(R.id.multi_tab_container_type) instanceof String) || !(view.getTag(R.id.multi_tab_position) instanceof Integer) || !(view.getTag(R.id.multi_tab_identifier) instanceof String)) {
            return -2;
        }
        return (!TextUtils.equals((String) view.getTag(R.id.multi_tab_container_type), this.b.b(((Integer) view.getTag(R.id.multi_tab_position)).intValue())) || !TextUtils.equals((String) view.getTag(R.id.multi_tab_identifier), kst.d())) ? -2 : -1;
    }

    public List<JSONObject> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("627608df", new Object[]{this}) : this.f20672a;
    }

    private View a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a545e87e", new Object[]{this, viewGroup, new Integer(i)});
        }
        View a2 = this.b.a(viewGroup, i);
        if (a2 == null) {
            a2 = new View(viewGroup.getContext());
            g.a("MultiViewPagerAdapter", "sub tab createView error: " + i);
        }
        if (a2.getParent() != null) {
            ((ViewGroup) a2.getParent()).removeView(a2);
        }
        this.d.add(Integer.valueOf(i));
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("addTabView container is null:");
            sb.append(viewGroup == null);
            sb.append("View is null: ");
            if (a2 != null) {
                z = false;
            }
            sb.append(z);
            g.a("MultiViewPagerAdapter", sb.toString());
            int visibility = a2.getVisibility();
            g.a("MultiViewPagerAdapter", "addTabView view visible:" + visibility);
            viewGroup.addView(a2);
        } catch (Exception e) {
            g.a("MultiViewPagerAdapter", "MultiViewPagerAddTabViewException:" + e.getMessage());
            kss.a("Page_Home", 19999, "MultiViewPagerAddTabViewException", "exception=" + e.getMessage());
        }
        if (this.b.f(i)) {
            for (a.c cVar : this.c) {
                cVar.a(i);
            }
        }
        return a2;
    }

    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.d.contains(Integer.valueOf(i)) && this.e != null && !z) {
            this.e.removeView(this.b.k(i));
            a(this.e, i);
            g.a("MultiViewPagerAdapter", "reRenderTabView 替换 : " + i);
        } else {
            g.a("MultiViewPagerAdapter", "reRenderTabView : " + i);
            this.b.h(i);
            notifyDataSetChanged();
        }
    }
}
