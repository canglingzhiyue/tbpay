package com.taobao.android.litecreator.sdk.framework.container;

import android.content.Intent;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.af;
import com.taobao.android.litecreator.util.t;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.hew;
import tb.hez;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class j extends hez implements d, e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private CopyOnWriteArrayList<PluginInfo> f13447a = new CopyOnWriteArrayList<>();
    private ConcurrentHashMap<String, h> b = new ConcurrentHashMap<>();
    private ViewGroup c;
    private ViewGroup d;

    static {
        kge.a(1327104438);
        kge.a(481954784);
        kge.a(398807943);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.hez
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : "undefine";
    }

    public j(hew hewVar) {
        a(hewVar);
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.d
    public View A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d32c928a", new Object[]{this});
        }
        ViewGroup viewGroup = this.d;
        return viewGroup != null ? viewGroup : this.c;
    }

    @Override // com.taobao.android.litecreator.sdk.framework.container.d
    public <T extends d> T d(String str) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("75f87684", new Object[]{this, str});
        }
        if (TextUtils.equals(str, "undefine")) {
            return null;
        }
        if (TextUtils.equals(str, e())) {
            return this;
        }
        for (h hVar : this.b.values()) {
            if (hVar != null && (t = (T) hVar.d(str)) != null) {
                return t;
            }
        }
        return null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.f13447a.addAll(a.a(str));
            Iterator<PluginInfo> it = this.f13447a.iterator();
            while (it.hasNext()) {
                h a2 = k.a(this, it.next());
                if (a2 != null && a2.V_()) {
                    b(a2);
                }
            }
        }
    }

    public void b(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3684528", new Object[]{this, viewGroup});
        } else {
            this.d = viewGroup;
        }
    }

    public void a(g gVar, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497863c9", new Object[]{this, gVar, fVar});
            return;
        }
        for (h hVar : this.b.values()) {
            hVar.a(gVar, fVar);
        }
    }

    public void a(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39ed6da9", new Object[]{this, afVar});
        } else if (C() instanceof i) {
            for (j jVar : ((i) C()).p()) {
                jVar.e(afVar);
                jVar.c(afVar);
            }
        }
    }

    public void b(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d788b6a", new Object[]{this, afVar});
        } else if (C() instanceof i) {
            for (j jVar : ((i) C()).p()) {
                jVar.d(afVar);
            }
        }
    }

    public void c(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c103a92b", new Object[]{this, afVar});
            return;
        }
        for (h hVar : this.b.values()) {
            hVar.e(afVar);
            hVar.a(afVar);
        }
    }

    public void d(af afVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec6ec", new Object[]{this, afVar});
            return;
        }
        for (h hVar : this.b.values()) {
            hVar.b(afVar);
        }
    }

    private void a(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82b22a7", new Object[]{this, hVar});
            return;
        }
        this.b.remove(hVar.D().name);
        hVar.W_();
    }

    private void b(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbbaa6e8", new Object[]{this, hVar});
            return;
        }
        t.a("PluginContainer->" + hVar.getClass().getSimpleName() + ".attachToView");
        hVar.b(this.c);
        t.a();
        this.b.put(hVar.D().name, hVar);
        t.a("PluginContainer->" + hVar.getClass().getSimpleName() + ".onCreate");
        hVar.c();
        t.a();
    }

    @Override // tb.hez
    public void W_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c5db6f", new Object[]{this});
            return;
        }
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                a(hVar);
            }
        }
    }

    @Override // tb.hez
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                hVar.d();
            }
        }
    }

    @Override // tb.hez
    public void X_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b7ab40e", new Object[]{this});
            return;
        }
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                hVar.X_();
            }
        }
    }

    @Override // tb.hez
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        for (h hVar : this.b.values()) {
            if (hVar != null) {
                hVar.a(i, i2, intent);
            }
        }
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
            return;
        }
        View inflate = LayoutInflater.from(this.r).inflate(p(), viewGroup, false);
        if (!(inflate instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup2 = this.d;
        if (viewGroup2 == null) {
            viewGroup.addView(inflate);
        } else {
            viewGroup.addView(viewGroup2);
            this.d.addView(inflate);
        }
        this.c = (ViewGroup) inflate;
    }
}
