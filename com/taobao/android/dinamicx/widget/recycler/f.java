package com.taobao.android.dinamicx.widget.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ah;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;
import com.taobao.android.dinamicx.widget.recycler.h;
import com.taobao.weex.ui.component.WXBasicComponentType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.fpv;
import tb.fpw;
import tb.fuw;
import tb.fzy;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_BATCH_SIZE;

    /* renamed from: a  reason: collision with root package name */
    public int f12134a;
    public Map<Integer, a> b;
    private int l;
    private int m;
    private boolean n;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f12137a;
        public boolean b;
        public boolean c;
        public DXWidgetNode d;
        public DXRuntimeContext e;
        public int f;
        public int g;

        static {
            kge.a(-1572156565);
        }

        public a(int i, DXWidgetNode dXWidgetNode, DXRuntimeContext dXRuntimeContext, int i2, int i3) {
            this.f12137a = i;
            this.d = dXWidgetNode;
            this.e = dXRuntimeContext;
            this.f = i2;
            this.g = i3;
        }
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1223807075:
                super.a(((Number) objArr[0]).intValue(), (DXWidgetNode) objArr[1], (com.taobao.analysis.v3.h) objArr[2], (String) objArr[3], (h.a) objArr[4]);
                return null;
            case -542147006:
                super.a((ArrayList) objArr[0]);
                return null;
            case -376278381:
                super.a((fzy) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 910252672:
                super.c((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ int a(f fVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e397fc4b", new Object[]{fVar, new Integer(i)})).intValue();
        }
        fVar.l = i;
        return i;
    }

    public static /* synthetic */ void a(f fVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ba80ca", new Object[]{fVar, th});
        } else {
            fVar.a(th);
        }
    }

    public static /* synthetic */ boolean a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("757780f", new Object[]{fVar})).booleanValue() : fVar.k();
    }

    public static /* synthetic */ int b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3530125d", new Object[]{fVar})).intValue() : fVar.l;
    }

    static {
        kge.a(434904161);
        DEFAULT_BATCH_SIZE = Runtime.getRuntime().availableProcessors();
    }

    public f(Context context, boolean z, boolean z2) {
        super(context, z, z2);
        this.f12134a = DEFAULT_BATCH_SIZE;
        this.b = new LinkedHashMap();
        this.l = 0;
        this.m = 0;
        this.n = true;
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.taobao.android.dinamicx.widget.recycler.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                int b;
                int min;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                try {
                    if (f.a(f.this)) {
                        f.a(f.this, f.b(f.this) + i2);
                        fuw.d("RecyclerPrefetch", "更新 nextBatchStart" + f.b(f.this));
                    } else if (f.this.g() - i2 != i || (min = Math.min(f.b(f.this) + f.this.f12134a, f.this.g())) <= (b = f.b(f.this))) {
                    } else {
                        f.a(f.this, f.b(f.this) + f.this.f12134a);
                        f.a(f.this, Math.min(f.this.g(), f.b(f.this)));
                        f.this.a(b, min);
                    }
                } catch (Throwable th) {
                    f.a(f.this, th);
                }
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeRemoved(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i), new Integer(i2)});
                    return;
                }
                f.this.b(i, i2);
                if (i > f.b(f.this)) {
                    return;
                }
                f fVar = f.this;
                f.a(fVar, Math.max(0, Math.min(f.b(fVar) - i, i2)));
            }

            @Override // android.support.v7.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i), new Integer(i2)});
                } else {
                    f.this.b(i, i2);
                }
            }
        });
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.h, com.taobao.android.dinamicx.widget.recycler.a
    public void a(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb19487e", new Object[]{this, viewHolder, new Integer(i)});
        } else {
            super.c(viewHolder, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.h
    public void a(int i, DXWidgetNode dXWidgetNode, com.taobao.analysis.v3.h hVar, String str, h.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70e2f9d", new Object[]{this, new Integer(i), dXWidgetNode, hVar, str, aVar});
            return;
        }
        super.a(i, dXWidgetNode, hVar, str, aVar);
        if (k()) {
            o(i);
        } else {
            f(i);
        }
        b(i, true);
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.h
    public void a(ArrayList<DXWidgetNode> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            return;
        }
        try {
            super.a(arrayList);
            d();
            if (arrayList != null && bx.l()) {
                fuw.d("RecyclerPrefetch", "调用 setDataSource reloadPrefetch " + arrayList.size() + "  nextBatchStart " + this.l);
            }
            if (arrayList != null && arrayList.size() > 0) {
                if (k()) {
                    o(Math.max(g() - 1, 0));
                } else {
                    f(0);
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.recycler.h
    public void a(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9927293", new Object[]{this, fzyVar});
            return;
        }
        super.a(fzyVar);
        d();
    }

    public int[] a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("c64285fd", new Object[]{this, dXWidgetNode});
        }
        boolean d = dXWidgetNode instanceof ac ? ((ac) dXWidgetNode).d() : false;
        if (this.g == null) {
            return null;
        }
        int measuredWidth = this.g.getMeasuredWidth();
        if (!d) {
            measuredWidth = (((measuredWidth - ((this.g.g() - 1) * this.g.h())) - this.g.i()) - this.g.j()) / this.g.g();
        } else if (this.g.t()) {
            measuredWidth = (measuredWidth - this.g.i()) - this.g.j();
        }
        return new int[]{DXWidgetNode.DXMeasureSpec.a(measuredWidth, 1073741824), DXWidgetNode.DXMeasureSpec.a(8388607, 0)};
    }

    public void d() {
        int min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (k()) {
            i();
        } else {
            e();
            this.l = this.f12134a;
            if (g() <= 0 || (min = Math.min(this.f12134a, g())) <= 1) {
                return;
            }
            a(1, min);
        }
    }

    public void i() {
        int max;
        int max2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        e();
        this.l = Math.max(g() - 1, 0);
        if (g() <= 0 || (max2 = Math.max(0, g() - this.f12134a)) >= (max = Math.max(g() - 1, 0))) {
            return;
        }
        a(max, max2);
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.l - this.f12134a;
        if (bx.l()) {
            Log.e("RecyclerPrefetch", "preLoadNextBatch " + i);
        }
        if (i2 != i) {
            return;
        }
        int i3 = this.l;
        int min = Math.min(this.f12134a + i3, g());
        if (min > i3) {
            this.l += this.f12134a;
            this.l = Math.min(g(), this.l);
            if (bx.l()) {
                Log.e("RecyclerPrefetch", i + "开始预加载下一批: " + i3 + "-" + min + "/ nextBatchStart: " + this.l);
            }
            a(i3, min);
        } else if (!bx.l()) {
        } else {
            Log.e("RecyclerPrefetch", i + "加载不了下一批emm: " + i3 + "-" + min + "/ nextBatchStart: " + this.l);
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0056c4d", new Object[]{this, new Integer(i)});
            return;
        }
        int i2 = this.l;
        DinamicXEngine.j();
        if (i2 != i) {
            return;
        }
        int i3 = this.l;
        int max = Math.max(i3 - this.f12134a, 0);
        if (max < i3) {
            this.l -= this.f12134a;
            this.l = Math.max(0, this.l);
            if (bx.l()) {
                Log.e("RecyclerPrefetch", i + "preLoadNextBatchReverser 开始预加载下一批: " + i3 + "-" + max + "/ nextBatchStart: " + this.l);
            }
            a(max, i3);
        } else if (!bx.l()) {
        } else {
            Log.e("RecyclerPrefetch", i + "preLoadNextBatchReverser 加载不了下一批emm: " + i3 + "-" + max + "/ nextBatchStart: " + this.l);
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            if (g() <= 0) {
                return;
            }
            int max = Math.max(0, Math.min(g(), i2));
            for (int max2 = Math.max(0, i); max2 < max; max2++) {
                a aVar = this.b.get(Integer.valueOf(max2));
                if (aVar != null) {
                    b(max2, true);
                    if (aVar.d == n(max2)) {
                        continue;
                    }
                }
                DXWidgetNode n = n(max2);
                if (n == null) {
                    return;
                }
                if (!n.getStatInPrivateFlags(32)) {
                    DXRuntimeContext b = b(n);
                    DinamicXEngine b2 = b.C().b();
                    int[] a2 = a(n);
                    if (a2 == null) {
                        e();
                        return;
                    }
                    n.setLayoutWidth(-1);
                    n.setLayoutHeight(-2);
                    DXRenderOptions a3 = new DXRenderOptions.a().c(1).d(2).e(4).a(a2[0]).d(this.n).b(a2[1]).a();
                    if (!(n instanceof ah)) {
                        final a aVar2 = new a(max2, n, b, a2[0], a2[1]);
                        this.b.put(Integer.valueOf(max2), aVar2);
                        b2.a(b, a3, (View) null, new fpv<DXRuntimeContext>() { // from class: com.taobao.android.dinamicx.widget.recycler.f.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // tb.fpv
                            public void a(DXRuntimeContext dXRuntimeContext) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("487cd5d9", new Object[]{this, dXRuntimeContext});
                                } else {
                                    f.this.a(aVar2, false, dXRuntimeContext);
                                }
                            }

                            @Override // tb.fpv
                            public void a(DXRuntimeContext dXRuntimeContext, Throwable th) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("7d1d6fbc", new Object[]{this, dXRuntimeContext, th});
                                } else {
                                    f.this.a(aVar2, true, dXRuntimeContext);
                                }
                            }
                        });
                    }
                } else {
                    continue;
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    public void e() {
        fpw q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        for (Integer num : this.b.keySet()) {
            b(num.intValue(), false);
        }
        this.b.clear();
        if (this.g == null || (q = this.g.getDXRuntimeContext().C().b().q()) == null) {
            return;
        }
        q.e();
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            try {
                b(i3, true);
            } catch (Throwable th) {
                a(th);
                return;
            }
        }
    }

    public void b(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f7cdda", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        try {
            a(z ? this.b.remove(Integer.valueOf(i)) : this.b.get(Integer.valueOf(i)));
        } catch (Throwable th) {
            a(th);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e2e996e", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            aVar.c = true;
            if (aVar.b) {
                return;
            }
            DXRuntimeContext dXRuntimeContext = aVar.d.getDXRuntimeContext();
            fpw q = dXRuntimeContext.C().b().q();
            if (q == null) {
                return;
            }
            q.b(dXRuntimeContext);
        }
    }

    public void a(a aVar, boolean z, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df09417", new Object[]{this, aVar, new Boolean(z), dXRuntimeContext});
            return;
        }
        if (bx.l()) {
            Log.e("RecyclerPrefetch", aVar.f12137a + " 主线程回调回来: " + dXRuntimeContext.u());
        }
        try {
            aVar.b = true;
            this.b.remove(Integer.valueOf(aVar.f12137a));
            if (aVar.c) {
                if (!bx.l()) {
                    return;
                }
                Log.e("RecyclerPrefetch", aVar.f12137a + " 主线程已渲染，跳过: " + dXRuntimeContext.u());
            } else if (dXRuntimeContext == null || aVar.f12137a < 0 || aVar.f12137a >= g()) {
            } else {
                DXWidgetNode n = n(aVar.f12137a);
                if (dXRuntimeContext.d() != null && n != null) {
                    dXRuntimeContext.d().setParentWidget(n.getParentWidget());
                    if (bx.l() && dXRuntimeContext.d() != null) {
                        Log.e("RecyclerPrefetch", n.hashCode() + "  替换 index: " + dXRuntimeContext.d().hashCode());
                    }
                    a(aVar.f12137a, dXRuntimeContext.d());
                }
            }
        } catch (Throwable th) {
            a(th);
        }
    }

    private void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
            return;
        }
        com.taobao.android.dinamicx.exception.a.b(th);
        s sVar = new s(WXBasicComponentType.RECYCLER);
        s.a aVar = new s.a(DXMonitorConstant.DX_MONITOR_ENGINE, DXMonitorConstant.DX_MONITOR_SERVICE_ID_ENGINE_RENDER, s.DX_RECYCLER_PREFETCH_CRASH);
        aVar.e = com.taobao.android.dinamicx.exception.a.a(th);
        sVar.c.add(aVar);
        com.taobao.android.dinamicx.monitor.b.a(sVar);
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        if (i <= 0) {
            i = DEFAULT_BATCH_SIZE;
        }
        this.f12134a = i;
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ba44ec", new Object[]{this, new Integer(i)});
        } else {
            this.m = i;
        }
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.m == 1;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }
}
