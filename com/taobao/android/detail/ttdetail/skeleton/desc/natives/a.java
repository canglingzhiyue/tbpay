package com.taobao.android.detail.ttdetail.skeleton.desc.natives;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10811a;
    private List<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> b;
    private HashMap<String, Integer> c;
    private int d;
    private HashMap<Integer, com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e> e = new HashMap<>();
    private boolean f = false;
    private long g = 0;

    static {
        kge.a(1534018562);
    }

    public long b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2e", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public a(Context context, List<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> list) {
        this.f10811a = context;
        this.b = list;
        e();
        this.d = this.c.size() + 5;
    }

    public void a(List<com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        this.b = list;
        e();
        if (this.d < this.c.size()) {
            this.f = true;
        } else {
            this.f = false;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.c = new HashMap<>();
        for (com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar : this.b) {
            if (!this.c.containsKey(eVar.h())) {
                this.c.put(eVar.h(), Integer.valueOf(i));
                i++;
            }
        }
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b.size();
    }

    public Object a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("9da1ccf7", new Object[]{this, new Integer(i)}) : this.b.get(i);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.d;
    }

    public int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue();
        }
        String h = this.b.get(i).h();
        if (this.c.get(h) == null) {
            return 0;
        }
        return this.c.get(h).intValue();
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public View a(int i, View view, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a94c758", new Object[]{this, new Integer(i), view, viewGroup});
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e eVar = this.b.get(i);
        if (view == null) {
            com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e<? extends com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.e> a2 = d.a(this.f10811a, eVar);
            if (a2 != null) {
                View d = a2.d(eVar);
                if (d != null) {
                    d.setTag(a2);
                    view = d;
                } else {
                    view = new View(this.f10811a);
                }
            } else {
                view = new View(this.f10811a);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbsListView.LayoutParams layoutParams2 = new AbsListView.LayoutParams(-1, -2);
            if (layoutParams != null) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            }
            view.setLayoutParams(layoutParams2);
            if (view instanceof ViewGroup) {
                view.setDescendantFocusability(393216);
            }
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e)) {
            com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e eVar2 = (com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e) tag;
            eVar2.b(i);
            this.e.put(Integer.valueOf(i), eVar2);
            try {
                eVar2.e(eVar);
            } catch (Exception e) {
                com.taobao.android.detail.ttdetail.utils.i.a("DescRecycleEngine", "VessleView bindData异常", e);
            }
        }
        if (this.g != 0 && (i == 0 || i == b() - 1)) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescRecycleEngine", "Detail view holder first view time:" + (SystemClock.uptimeMillis() - this.g));
            this.g = 0L;
        }
        return view;
    }

    public com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e) ipChange.ipc$dispatch("ce06825", new Object[]{this, new Integer(i)});
        }
        if (!this.e.containsKey(Integer.valueOf(i))) {
            return null;
        }
        com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e eVar = this.e.get(Integer.valueOf(i));
        if (eVar.e() != i) {
            return null;
        }
        return eVar;
    }

    public ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this});
        }
        ArrayList<com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.e> arrayList = new ArrayList<>();
        arrayList.addAll(this.e.values());
        return arrayList;
    }
}
