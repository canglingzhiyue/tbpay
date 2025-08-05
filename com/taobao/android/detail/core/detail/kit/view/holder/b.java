package com.taobao.android.detail.core.detail.kit.view.holder;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.open.j;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.ecg;
import tb.emu;
import tb.epf;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f9567a;
    private List<epf> b;
    private HashMap<String, Integer> c;
    private int d;
    private HashMap<Integer, com.taobao.android.detail.core.detail.kit.view.holder.desc.b> e = new HashMap<>();
    private boolean f = false;
    private long g = 0;

    static {
        kge.a(237872345);
    }

    public long b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2e", new Object[]{this, new Integer(i)})).longValue() : i;
    }

    public b(Activity activity, List<epf> list) {
        this.f9567a = activity;
        this.b = list;
        e();
        this.d = this.c.size() + 5;
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.DescRecycleEngine");
    }

    public void a(List<epf> list) {
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
        for (epf epfVar : this.b) {
            if (!this.c.containsKey(epfVar.E_())) {
                this.c.put(epfVar.E_(), Integer.valueOf(i));
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
        String E_ = this.b.get(i).E_();
        if (this.c.get(E_) == null) {
            return 0;
        }
        return this.c.get(E_).intValue();
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
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a94c758", new Object[]{this, new Integer(i), view, viewGroup});
        }
        epf epfVar = this.b.get(i);
        if (view == null) {
            com.taobao.android.detail.core.detail.kit.view.holder.desc.b a2 = j.a(this.f9567a, epfVar);
            if (a2 != null) {
                View d = a2.d((com.taobao.android.detail.core.detail.kit.view.holder.desc.b) epfVar);
                if (d != null) {
                    d.setTag(a2);
                    view = d;
                } else {
                    view = new View(this.f9567a);
                }
            } else {
                view = new View(this.f9567a);
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            AbsListView.LayoutParams layoutParams2 = new AbsListView.LayoutParams(-1, -2);
            if (layoutParams != null) {
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
            }
            view.setLayoutParams(layoutParams2);
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setDescendantFocusability(393216);
            }
            i2 = 1;
        }
        Object tag = view.getTag();
        if (tag != null && (tag instanceof com.taobao.android.detail.core.detail.kit.view.holder.desc.b)) {
            com.taobao.android.detail.core.detail.kit.view.holder.desc.b bVar = (com.taobao.android.detail.core.detail.kit.view.holder.desc.b) tag;
            bVar.b(i);
            this.e.put(Integer.valueOf(i), bVar);
            try {
                bVar.e((com.taobao.android.detail.core.detail.kit.view.holder.desc.b) epfVar);
            } catch (Exception e) {
                i.a("DescRecycleEngine", "VessleView bindData异常", e);
                Activity activity = this.f9567a;
                ecg.d(activity, "", "", "", "在bindData中捕获异常:" + e.getMessage() + "debugInfo==" + i2);
            }
        }
        if (this.g != 0 && (i == 0 || i == b() - 1)) {
            h.p(this.f9567a, SystemClock.uptimeMillis() - this.g);
            this.g = 0L;
        }
        return view;
    }

    public com.taobao.android.detail.core.detail.kit.view.holder.desc.b d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.core.detail.kit.view.holder.desc.b) ipChange.ipc$dispatch("6d46f93e", new Object[]{this, new Integer(i)});
        }
        if (!this.e.containsKey(Integer.valueOf(i))) {
            return null;
        }
        com.taobao.android.detail.core.detail.kit.view.holder.desc.b bVar = this.e.get(Integer.valueOf(i));
        if (bVar.h() != i) {
            return null;
        }
        return bVar;
    }

    public ArrayList<com.taobao.android.detail.core.detail.kit.view.holder.desc.b> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("379df345", new Object[]{this});
        }
        ArrayList<com.taobao.android.detail.core.detail.kit.view.holder.desc.b> arrayList = new ArrayList<>();
        arrayList.addAll(this.e.values());
        return arrayList;
    }
}
