package com.taobao.android.meta.srp;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.meta.structure.childpage.g;
import kotlin.jvm.internal.q;
import tb.hte;
import tb.htj;
import tb.irp;
import tb.irq;
import tb.iru;
import tb.ise;
import tb.itn;
import tb.ito;
import tb.iuk;
import tb.ium;
import tb.kge;
import tb.ssm;

/* loaded from: classes6.dex */
public class a extends hte {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ise<irq, ? extends iuk<?, ?>> d;
    public ise<irp, ? extends itn> e;
    public ise<irp, ? extends ito> f;
    public ise<Activity, ? extends com.taobao.android.meta.srp.ui.list.a> g;
    private boolean i;
    private String k;
    private boolean h = true;
    private boolean j = true;

    static {
        kge.a(112862046);
    }

    public a() {
        i(new ise<irq, g>() { // from class: com.taobao.android.meta.srp.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public final htj a(irq it) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (htj) ipChange.ipc$dispatch("f4d5c1f8", new Object[]{this, it});
                }
                Activity activity = it.c;
                q.a((Object) activity, "it.activity");
                ium iumVar = it.d;
                q.a((Object) iumVar, "it.parent");
                a aVar = a.this;
                q.a((Object) it, "it");
                return new htj(activity, iumVar, a.a(aVar, it), it.f, it.g);
            }
        });
        f(false);
    }

    public static final /* synthetic */ iru a(a aVar, irq irqVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iru) ipChange.ipc$dispatch("8a8fdb25", new Object[]{aVar, irqVar}) : aVar.a(irqVar);
    }

    public final ise<irq, ? extends iuk<?, ?>> ad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("85c08301", new Object[]{this});
        }
        ise<irq, ? extends iuk<?, ?>> iseVar = this.d;
        if (iseVar == null) {
            q.b(ssm.UI_MODULE_SEARCH_BAR);
        }
        return iseVar;
    }

    public final void l(ise<irq, ? extends iuk<?, ?>> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de68808", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.d = iseVar;
    }

    public final ise<irp, ? extends itn> ae() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("8d722860", new Object[]{this});
        }
        ise<irp, ? extends itn> iseVar = this.e;
        if (iseVar == null) {
            q.b("sceneMuiseMod");
        }
        return iseVar;
    }

    public final void m(ise<irp, ? extends itn> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c698e89", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.e = iseVar;
    }

    public final ise<irp, ? extends ito> af() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("9523cdbf", new Object[]{this});
        }
        ise<irp, ? extends ito> iseVar = this.f;
        if (iseVar == null) {
            q.b("sceneWeexMod");
        }
        return iseVar;
    }

    public final void n(ise<irp, ? extends ito> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec950a", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.f = iseVar;
    }

    public final ise<Activity, ? extends com.taobao.android.meta.srp.ui.list.a> ag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ise) ipChange.ipc$dispatch("9cd5731e", new Object[]{this});
        }
        ise<Activity, ? extends com.taobao.android.meta.srp.ui.list.a> iseVar = this.g;
        if (iseVar == null) {
            q.b("listStateView");
        }
        return iseVar;
    }

    public final void o(ise<Activity, ? extends com.taobao.android.meta.srp.ui.list.a> iseVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96f9b8b", new Object[]{this, iseVar});
            return;
        }
        q.c(iseVar, "<set-?>");
        this.g = iseVar;
    }

    public final boolean ah() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab552532", new Object[]{this})).booleanValue() : this.h;
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9bfae0", new Object[]{this, new Boolean(z)});
        } else {
            this.h = z;
        }
    }

    public final boolean ai() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab633cb3", new Object[]{this})).booleanValue() : this.i;
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50d37f", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public final boolean aj() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ab715434", new Object[]{this})).booleanValue() : this.j;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final String aq() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("351da0c9", new Object[]{this}) : this.k;
    }
}
