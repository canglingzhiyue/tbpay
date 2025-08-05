package com.taobao.pha.core.controller;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabBarItemModel;
import com.taobao.pha.core.tabcontainer.TabBar;
import com.taobao.pha.core.ui.fragment.AppFragment;
import com.taobao.pha.core.ui.fragment.TabFragment;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.kge;
import tb.neh;
import tb.nfz;
import tb.ngl;

/* loaded from: classes7.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ManifestModel f18733a;
    private final Fragment b;
    private final AppController d;
    private Fragment f;
    private int c = -1;
    private final List<k> e = new ArrayList();

    static {
        kge.a(-469417414);
    }

    public o(AppController appController, Fragment fragment, ManifestModel manifestModel, int i) {
        this.d = appController;
        this.f18733a = manifestModel;
        this.b = fragment;
        d(i);
    }

    private void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        int size = this.f18733a.pages.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.e.add(null);
        }
        if (this.b.getChildFragmentManager() == null) {
            return;
        }
        Fragment fragment = this.b;
        if (fragment instanceof AppFragment) {
            ((AppFragment) fragment).setOnTabChangeListener(new TabBar.a() { // from class: com.taobao.pha.core.controller.o.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.pha.core.tabcontainer.TabBar.a
                public void a(int i3, TabBarItemModel tabBarItemModel, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c0f4729", new Object[]{this, new Integer(i3), tabBarItemModel, new Boolean(z)});
                    } else {
                        o.this.a(i3);
                    }
                }
            });
        }
        a(i, false);
    }

    public boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Fragment fragment = this.b;
        if (fragment instanceof AppFragment) {
            return ((AppFragment) fragment).showTabWithAnimation(i, i2);
        }
        Fragment fragment2 = this.f;
        if (!(fragment2 instanceof TabFragment)) {
            return false;
        }
        return ((TabFragment) fragment2).showTabWithAnimation(i, i2);
    }

    public boolean b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90f78e0d", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        Fragment fragment = this.b;
        if (fragment instanceof AppFragment) {
            return ((AppFragment) fragment).hideTabWithAnimation(i, i2);
        }
        Fragment fragment2 = this.f;
        if (!(fragment2 instanceof TabFragment)) {
            return false;
        }
        return ((TabFragment) fragment2).hideTabWithAnimation(i, i2);
    }

    private void a(int i, boolean z) {
        PageModel pageModel;
        FragmentManager childFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (i < 0 || i >= this.f18733a.pages.size() || (pageModel = this.f18733a.pages.get(i)) == null || this.c == i || (childFragmentManager = this.b.getChildFragmentManager()) == null) {
        } else {
            if (z) {
                e(i);
            }
            int i2 = this.c;
            this.c = i;
            k kVar = null;
            if (i2 >= 0 && i2 < this.e.size()) {
                kVar = this.e.get(i2);
            }
            k kVar2 = this.e.get(i);
            if (kVar2 == null || kVar2.a()) {
                k kVar3 = new k(this.d, pageModel);
                this.e.set(i, kVar3);
                com.taobao.pha.core.phacontainer.c c = kVar3.c();
                if (c != null) {
                    if (z && this.d.q() != null) {
                        this.d.q().a(pageModel);
                    }
                    c.setPageIndex(i);
                    if (c instanceof Fragment) {
                        childFragmentManager.beginTransaction().add(R.id.pha_page_container, (Fragment) c, "tab_page_" + i).commitAllowingStateLoss();
                    }
                }
            } else {
                kVar2.b();
            }
            if (kVar == null || kVar.a()) {
                return;
            }
            kVar.f();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a(i, true);
        }
    }

    private void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msgType", (Object) "call");
        jSONObject.put("func", (Object) "tabBarItemClick");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("index", (Object) Integer.valueOf(i));
        jSONObject.put("param", (Object) jSONObject2);
        neh J = this.d.J();
        if (J != null) {
            J.a((Object) jSONObject.toJSONString());
        }
        b E = this.d.E();
        if (E == null || J == null) {
            return;
        }
        E.a("tabbaritemclick", jSONObject2, "native", J);
        E.a("tab_bar_item_click", jSONObject, "native", J);
    }

    public k a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (k) ipChange.ipc$dispatch("a99355ce", new Object[]{this}) : b(this.c);
    }

    public com.taobao.pha.core.phacontainer.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.pha.core.phacontainer.c) ipChange.ipc$dispatch("f5142bd9", new Object[]{this}) : c(this.c);
    }

    public k b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("beb4183c", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.e.size()) {
            return this.e.get(i);
        }
        return null;
    }

    public com.taobao.pha.core.phacontainer.c c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.pha.core.phacontainer.c) ipChange.ipc$dispatch("7a9044e9", new Object[]{this, new Integer(i)});
        }
        k b = b(i);
        if (b == null) {
            return null;
        }
        return b.c();
    }

    public TabBar c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBar) ipChange.ipc$dispatch("750ace71", new Object[]{this});
        }
        Fragment fragment = this.b;
        if (fragment instanceof AppFragment) {
            return ((AppFragment) fragment).getTabBar();
        }
        Fragment fragment2 = this.f;
        if (!(fragment2 instanceof TabFragment)) {
            return null;
        }
        return ((TabFragment) fragment2).getTabBar();
    }

    public List<nfz> d() {
        nfz a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("195b8bfc", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        for (k kVar : this.e) {
            if (kVar != null) {
                arrayList.addAll(kVar.j());
            }
        }
        ngl l = this.d.l();
        if (l != null && (a2 = l.a()) != null) {
            arrayList.add(a2);
        }
        return arrayList;
    }
}
