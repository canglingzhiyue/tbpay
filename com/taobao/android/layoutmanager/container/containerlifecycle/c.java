package com.taobao.android.layoutmanager.container.containerlifecycle;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.container.e;
import com.taobao.tao.flexbox.layoutmanager.container.f;
import com.taobao.tao.flexbox.layoutmanager.container.h;
import com.taobao.tao.flexbox.layoutmanager.container.l;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes5.dex */
public class c implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<e.a> b;
    private Activity c;
    private FrameLayout d;
    private boolean f;
    private l.a g;

    /* renamed from: a  reason: collision with root package name */
    private int f13195a = Integer.MAX_VALUE;
    private List<f> e = new ArrayList();

    static {
        kge.a(-1649230299);
        kge.a(-404689570);
    }

    public static /* synthetic */ void a(c cVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ea0bc2f", new Object[]{cVar, fVar});
        } else {
            cVar.a(fVar);
        }
    }

    public c(Activity activity) {
        this.c = activity;
        this.d = new FrameLayout(activity);
        this.d.setId(R.id.layout_manager_multi_page_container);
        this.d.setTag(this);
        this.d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        a(Integer.MAX_VALUE);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        IDeviceInfo w = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().w();
        if (w != null && w.f()) {
            i = 1;
        }
        this.f13195a = i;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public l.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l.a) ipChange.ipc$dispatch("c8ef4f4a", new Object[]{this});
        }
        if (!a()) {
            return null;
        }
        return this.g;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public void a(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6134b0c", new Object[]{this, aVar});
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(aVar);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public void b(e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba7540d", new Object[]{this, aVar});
            return;
        }
        List<e.a> list = this.b;
        if (list == null) {
            return;
        }
        list.remove(aVar);
    }

    private void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d586d88", new Object[]{this, fVar});
            return;
        }
        List<e.a> list = this.b;
        if (list == null || fVar == null) {
            return;
        }
        for (e.a aVar : list) {
            aVar.a(this.e.size(), fVar);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public boolean a(String str, List<Pair<View, String>> list, Bundle bundle) {
        f fVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6bb5ed5", new Object[]{this, str, list, bundle})).booleanValue();
        }
        if (this.e.size() >= this.f13195a) {
            return false;
        }
        boolean z = list != null && !list.isEmpty();
        if (bundle != null) {
            z |= bundle.getBoolean("has_share_element", false);
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        a(str);
        f a2 = a.a(this.c, this, str, z, bundle);
        if (a2 == null) {
            return false;
        }
        this.e.add(a2);
        int size = this.e.size();
        if (size > 1) {
            fVar = this.e.get(size - 2);
            if (fVar.canMoveToState(3)) {
                fVar.onPause();
            }
        } else {
            fVar = null;
        }
        d.a(fVar, a2, list);
        if (a2.canMoveToState(0)) {
            a2.onCreate(null);
        }
        if (a2.canMoveToState(1)) {
            a2.onStart();
        }
        if (a2.canMoveToState(2)) {
            a2.onResume();
        }
        if (fVar != null && fVar.canMoveToState(4)) {
            fVar.onStop();
        }
        return true;
    }

    public boolean[] a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("2710510d", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
        f d = d();
        if (d != null && d.onBackPressed(z2)) {
            return new boolean[]{true, false};
        }
        final f j = j();
        if (j != null) {
            j.setIsFinishing();
            if (j.canMoveToState(3)) {
                j.onPause();
            }
            if (j.canMoveToState(4)) {
                j.onStop();
            }
            if (j.canMoveToState(5)) {
                j.onDestroy();
            }
        }
        f d2 = d();
        if (d2 != null) {
            if (d2.canMoveToState(1)) {
                d2.onStart();
            }
            if (d2.canMoveToState(2)) {
                d2.onResume();
            }
        }
        final boolean[] zArr = {false};
        if (j != null) {
            zArr[0] = true;
            d.a(d2, j, z, new h.a() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.container.h.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    zArr[0] = false;
                    c.a(c.this, j);
                }
            });
        }
        return new boolean[]{!this.e.isEmpty(), zArr[0]};
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public boolean a(final f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5f650", new Object[]{this, fVar, new Boolean(z)})).booleanValue();
        }
        f d = d();
        if (d == fVar) {
            return a(z, false)[0];
        }
        if (b(fVar)) {
            fVar.setIsFinishing();
            if (fVar.canMoveToState(3)) {
                fVar.onPause();
            }
            if (fVar.canMoveToState(4)) {
                fVar.onStop();
            }
            if (fVar.canMoveToState(5)) {
                fVar.onDestroy();
            }
            d.a(d, fVar, z, new h.a() { // from class: com.taobao.android.layoutmanager.container.containerlifecycle.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.flexbox.layoutmanager.container.h.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        c.a(c.this, fVar);
                    }
                }
            });
        }
        return !this.e.isEmpty();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public ViewGroup c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("6e13476b", new Object[]{this}) : this.d;
    }

    public f d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("bfbed3eb", new Object[]{this});
        }
        int size = this.e.size();
        if (size <= 0) {
            return null;
        }
        return this.e.get(size - 1);
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public f b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("a9c67e7c", new Object[]{this, new Integer(i)});
        }
        if (i >= 0 && i < this.e.size()) {
            return this.e.get(i);
        }
        return null;
    }

    private boolean b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c6acc2cd", new Object[]{this, fVar})).booleanValue() : this.e.remove(fVar);
    }

    private f j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("5c63cba5", new Object[]{this});
        }
        int size = this.e.size();
        if (size <= 0) {
            return null;
        }
        return this.e.remove(size - 1);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        f d = d();
        if (d == null || !d.canMoveToState(2)) {
            return;
        }
        d.onResume();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            i();
        } else {
            f d = d();
            if (d == null || !d.canMoveToState(3)) {
                return;
            }
            d.onPause();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        f d = d();
        if (d == null || !d.canMoveToState(1)) {
            return;
        }
        d.onStart();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        f d = d();
        if (d == null || !d.canMoveToState(4)) {
            return;
        }
        d.onStop();
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.container.e
    public List<f> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.e;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        f fVar = null;
        while (true) {
            f j = j();
            if (j != null) {
                j.setIsFinishing();
                if (j.canMoveToState(3)) {
                    j.onPause();
                }
                if (j.canMoveToState(4)) {
                    j.onStop();
                }
                if (j.canMoveToState(5)) {
                    j.onDestroy();
                }
                fVar = j;
            } else {
                a(fVar);
                return;
            }
        }
    }

    public void a(boolean z, l.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a68fe469", new Object[]{this, new Boolean(z), aVar});
            return;
        }
        this.f = z;
        this.g = aVar;
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String queryParameter = Uri.parse(str).getQueryParameter(aw.PARAM_UT_PARAMS);
            if (TextUtils.isEmpty(queryParameter)) {
                return;
            }
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(queryParameter);
        }
    }
}
