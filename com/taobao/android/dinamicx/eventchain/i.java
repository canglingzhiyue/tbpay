package com.taobao.android.dinamicx.eventchain;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.monitor.i;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import tb.alr;
import tb.dkt;
import tb.dle;
import tb.fqi;
import tb.fuw;
import tb.fux;
import tb.fxm;
import tb.fxt;
import tb.kge;
import tb.riy;

/* loaded from: classes.dex */
public class i extends com.taobao.android.dinamicx.m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private dkt i;
    private WeakHashMap<d, Integer> j;
    private List<WeakReference<d>> k;

    static {
        kge.a(-210670051);
    }

    public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public i(r rVar) {
        super(rVar);
        this.c = "main";
        this.d = "$$(";
        this.e = "$(";
        this.f = "@";
        this.g = riy.BRACKET_END_STR;
        this.h = riy.BLOCK_END_STR;
        dkt j = rVar.a().j();
        if (j == null) {
            alr alrVar = new alr(a(), "DX");
            this.i = new dkt();
            this.i.a(alrVar);
        } else {
            this.i = j;
            this.i.a(new alr(a(), "DX"));
        }
        this.j = new WeakHashMap<>();
        this.k = new ArrayList();
    }

    public dkt d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkt) ipChange.ipc$dispatch("2618aa0e", new Object[]{this}) : this.i;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.i.e();
        }
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee0175e8", new Object[]{this, dVar});
        } else if (fqi.v()) {
            this.k.add(new WeakReference<>(dVar));
            fxm.a(this.k);
        } else {
            this.j.put(dVar, Integer.valueOf(dVar.hashCode()));
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            a((fxt<d>) null);
        }
    }

    public void a(fxt<d> fxtVar) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e973fdb6", new Object[]{this, fxtVar});
            return;
        }
        try {
            if (fqi.v()) {
                if (this.k == null) {
                    return;
                }
                String str = " List : size" + this.k.size();
                Iterator<WeakReference<d>> it = this.k.iterator();
                if (it == null) {
                    return;
                }
                while (it.hasNext()) {
                    WeakReference<d> next = it.next();
                    if (next != null && (dVar = next.get()) != null && (fxtVar == null || fxtVar.a(dVar))) {
                        dVar.d();
                    }
                }
            } else if (this.j != null) {
                String str2 = " map : size" + this.j.size();
                for (Map.Entry<d, Integer> entry : this.j.entrySet()) {
                    if (entry != null && entry.getKey() != null && (fxtVar == null || fxtVar.a(entry.getKey()))) {
                        entry.getKey().d();
                    }
                }
            }
        } catch (Throwable th) {
            fux.b("DXEventChainException", "", "cancel event chain error : " + th.getMessage());
        }
    }

    public void a(final DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613bf3c7", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode == null) {
        } else {
            a(new fxt<d>() { // from class: com.taobao.android.dinamicx.eventchain.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.fxt
                public boolean a(d dVar) {
                    DXRuntimeContext a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("ee0175ec", new Object[]{this, dVar})).booleanValue();
                    }
                    if (dVar == null || (a2 = dVar.a()) == null) {
                        return false;
                    }
                    DXWidgetNode d = a2.d();
                    if (!(d instanceof DXRecyclerLayout)) {
                        return false;
                    }
                    boolean z = d == dXWidgetNode;
                    if (z && DinamicXEngine.j()) {
                        fuw.d("EventChainCancel", "cancel eventChain $(" + dVar.t() + ") by " + dXWidgetNode.getClass().getSimpleName());
                    }
                    return z;
                }
            });
        }
    }

    public j a(String str, String str2, d dVar) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("d33e0114", new Object[]{this, str, str2, dVar});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || dVar == null) {
            return j.a(e.EVENT_CHAIN_ERROR_EXECUTE_CONTEXT_IS_NULL);
        }
        dVar.b();
        if (str.startsWith("$(") && str.endsWith(riy.BRACKET_END_STR)) {
            return b(str2, str.substring(2, str.length() - 1), dVar);
        }
        if (str.startsWith("$$(") && str.endsWith(riy.BRACKET_END_STR)) {
            return a(str.substring(3, str.length() - 1), dVar);
        }
        if (str.startsWith("@") && str.endsWith(riy.BLOCK_END_STR) && (a2 = dVar.g().b(str).a(null, dVar.a())) != null) {
            return a(a2.toString(), str2, dVar);
        }
        return null;
    }

    private j a(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("bda79a9e", new Object[]{this, str, dVar});
        }
        if (TextUtils.isEmpty(str) || dVar == null) {
            return j.a(e.EVENT_CHAIN_ERROR_EXECUTE_EVENTCHIAN_CONTEXT_IS_NULL);
        }
        dVar.b(str);
        return b(str, "main", dVar);
    }

    private j b(final String str, String str2, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("ef775473", new Object[]{this, str, str2, dVar});
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || dVar == null) {
            if (DinamicXEngine.j()) {
                int i = -1;
                if (dVar != null) {
                    i = dVar.k() + 1;
                }
                a(i, j.a(e.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL), dVar);
            }
            return j.a(e.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_CONTEXT_IS_NULL);
        }
        final int j = dVar.j();
        i.b bVar = null;
        a a2 = dVar.a(str, str2);
        if (a2 == null) {
            if (DinamicXEngine.j()) {
                a(j, j.a(e.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL), dVar);
            }
            return j.a(e.EVENT_CHAIN_ERROR_EXECUTE_ATOMIC_EVENT_NODE_IS_NULL);
        }
        if (DinamicXEngine.j()) {
            bVar = a(j, a2, dVar);
        }
        j a3 = a2.a(dVar, new c() { // from class: com.taobao.android.dinamicx.eventchain.i.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.eventchain.c
            public void a(m mVar, j jVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bf295439", new Object[]{this, mVar, jVar});
                } else if (jVar.a() == 2) {
                    fux.b("event chain interrupt");
                } else if (dVar.a() == null) {
                    fux.b("callback dxRuntimeContext recycled");
                } else {
                    h h = dVar.h();
                    if (h != null) {
                        h.a(jVar.c());
                        if (dVar.h() != null) {
                            h.b(dVar.h().c());
                            h.c(dVar.h().d());
                        }
                    }
                    if (DinamicXEngine.j()) {
                        d dVar2 = dVar;
                        int i2 = j;
                        dVar2.a(new i.c(i2, "callback_" + mVar.a(), jVar));
                    }
                    if (mVar == null) {
                        return;
                    }
                    i.this.a(mVar.b(), str, dVar);
                }
            }
        });
        if (DinamicXEngine.j()) {
            a(bVar, a2, a3, dVar);
        }
        if (a3 == null || a3.a() == 2) {
            fux.b("event chain interrupt");
            return a3;
        }
        DXRuntimeContext a4 = dVar.a();
        if (a4 == null) {
            fux.b("callback dxRuntimeContext recycled");
            return a3;
        }
        h E = a4.E();
        if (E != null) {
            E.a(a3.c());
            if (dVar.h() != null) {
                E.b(dVar.h().c());
                E.c(dVar.h().d());
            }
        }
        if (DinamicXEngine.j()) {
            dVar.a(new i.c(j, "next", a3));
        }
        return !TextUtils.isEmpty(a2.c()) ? a(a2.c(), str, dVar) : a3;
    }

    public static i.b a(int i, a aVar, d dVar) {
        i.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i.b) ipChange.ipc$dispatch("51db3350", new Object[]{new Integer(i), aVar, dVar});
        }
        if (aVar == null) {
            bVar = new i.b(i, "unknown", -1L, null);
        } else {
            bVar = new i.b(i, aVar.a(), aVar.b().longValue(), null);
        }
        if (dVar != null) {
            bVar.a(dVar.l());
            dle c = dVar.c();
            if (c != null) {
                bVar.b(c.d());
                dkt e = c.e();
                if (e != null) {
                    bVar.c(e.c());
                }
            }
            h h = dVar.h();
            if (h != null) {
                bVar.a(h.b());
                bVar.b(h.c());
            }
            DXRuntimeContext a2 = dVar.a();
            if (a2 != null) {
                bVar.d(a2.e());
                bVar.c(a2.f());
            }
        }
        return bVar;
    }

    public static void a(i.b bVar, a aVar, j jVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1815217", new Object[]{bVar, aVar, jVar, dVar});
            return;
        }
        i.a aVar2 = null;
        if (bVar != null) {
            bVar.a(jVar);
            if (aVar != null) {
                bVar.a(aVar.d());
                bVar.a(aVar.c());
                bVar.a(aVar.e());
            }
        }
        if (dVar != null) {
            aVar2 = dVar.m();
        }
        com.taobao.android.dinamicx.monitor.l.a().a(aVar2, bVar);
    }

    public static void a(int i, j jVar, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49bd68d5", new Object[]{new Integer(i), jVar, dVar});
        } else {
            a(a(i, (a) null, dVar), null, jVar, dVar);
        }
    }
}
