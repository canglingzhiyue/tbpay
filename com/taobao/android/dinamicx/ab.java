package com.taobao.android.dinamicx;

import android.support.v4.util.LruCache;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.fuw;
import tb.gbh;
import tb.kge;

/* loaded from: classes.dex */
public class ab extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LruCache<String, a> c;

    static {
        kge.a(1412512724);
    }

    public ab(r rVar) {
        super(rVar);
        this.c = new LruCache<>(b().d());
    }

    public boolean a(DXWidgetNode dXWidgetNode, DXRenderOptions dXRenderOptions) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f9a2e7d", new Object[]{this, dXWidgetNode, dXRenderOptions})).booleanValue();
        }
        DXEngineConfig b = b();
        return b != null && b.e() && !dXRenderOptions.e() && (dXWidgetNode == null || dXWidgetNode.getParentWidget() == null) && dXRenderOptions.g() != 1 && dXRenderOptions.k();
    }

    public Pair<DXWidgetNode, Integer> a(DXRuntimeContext dXRuntimeContext, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("9f0de863", new Object[]{this, dXRuntimeContext, view});
        }
        try {
            a a2 = a(dXRuntimeContext);
            if (a2 == null || a2.f11792a == null) {
                return null;
            }
            DXWidgetNode dXWidgetNode = a2.f11792a;
            if (dXRuntimeContext.e() != dXWidgetNode.getDXRuntimeContext().e()) {
                return null;
            }
            if (a2.a()) {
                dXRuntimeContext.t.c.addAll(a2.b.c);
            }
            dXWidgetNode.bindRuntimeContext(dXRuntimeContext, true);
            if (view != null) {
                gbh.a(view, dXWidgetNode);
            }
            return new Pair<>(dXWidgetNode, Integer.valueOf(a2.c));
        } catch (Exception e) {
            com.taobao.android.dinamicx.monitor.b.a(this.f11887a, dXRuntimeContext.c(), DXMonitorConstant.DX_MONITOR_RENDER, DXMonitorConstant.RENDER_GET_EXPAND_TREE_CRASH, s.GET_EXPAND_TREE_CRASH, com.taobao.android.dinamicx.exception.a.a(e));
            return null;
        }
    }

    public void a(DXRuntimeContext dXRuntimeContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e68fabf7", new Object[]{this, dXRuntimeContext, aVar});
            return;
        }
        String t = dXRuntimeContext.t();
        DXEngineConfig b = b();
        LruCache<String, a> a2 = a(true);
        if (b == null || !b.e() || TextUtils.isEmpty(t) || aVar == null || a2 == null) {
            return;
        }
        a2.put(t, aVar);
    }

    public a a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("19f8cf7b", new Object[]{this, dXRuntimeContext});
        }
        String t = dXRuntimeContext.t();
        DXEngineConfig b = b();
        LruCache<String, a> a2 = a(false);
        if (b != null && b.e() && !TextUtils.isEmpty(t) && a2 != null) {
            return a2.get(t);
        }
        return null;
    }

    public a a(DXWidgetNode dXWidgetNode, int i, s sVar) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("5dbbb76f", new Object[]{this, dXWidgetNode, new Integer(i), sVar});
        }
        DinamicXEngine dinamicXEngine = null;
        if (dXWidgetNode != null && (dXRuntimeContext = dXWidgetNode.getDXRuntimeContext()) != null && dXRuntimeContext.C() != null) {
            z = dXRuntimeContext.C().n();
            dinamicXEngine = dXRuntimeContext.C().b();
        }
        a aVar = z ? new a(dinamicXEngine, n.a().b()) : new a(dinamicXEngine);
        aVar.f11792a = dXWidgetNode;
        aVar.c = i;
        aVar.b = sVar;
        return aVar;
    }

    public void a(String str) {
        LruCache<String, a> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (a2 = a(false)) == null) {
        } else {
            a2.remove(str);
        }
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        LruCache<String, a> a2 = a(false);
        if (a2 != null) {
            return a2.size();
        }
        return 0;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        LruCache<String, a> a2 = a(false);
        if (a2 != null) {
            a2.evictAll();
        }
        r c = c();
        if (c == null || !c.n()) {
            return;
        }
        n.a().a(c);
    }

    public LruCache<String, a> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("97795e4a", new Object[]{this, new Boolean(z)});
        }
        r c = c();
        if (c.a() != null && c.n()) {
            LruCache<String, a> a2 = n.a().a(c, z);
            if (DinamicXEngine.j() && z) {
                String[] strArr = new String[1];
                StringBuilder sb = new StringBuilder();
                sb.append("优化开，使用新的PipelineCache -> ");
                sb.append(c.p());
                sb.append(ResponseProtocolType.COMMENT);
                sb.append(a2);
                sb.append(" size: ");
                sb.append(a2 == null ? 0 : a2.size());
                strArr[0] = sb.toString();
                fuw.d("DXNewPipelineCache", strArr);
            }
            return a2;
        }
        if (DinamicXEngine.j() && z) {
            fuw.d("DXNewPipelineCache", "优化关，使用旧PipelineCache: " + this.c + " size: " + this.c.size());
        }
        return this.c;
    }

    /* loaded from: classes.dex */
    public static class a extends WeakReference<DinamicXEngine> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public DXWidgetNode f11792a;
        public s b;
        public int c;

        static {
            kge.a(609573467);
        }

        public a(DinamicXEngine dinamicXEngine) {
            super(dinamicXEngine);
        }

        public a(DinamicXEngine dinamicXEngine, ReferenceQueue<? super DinamicXEngine> referenceQueue) {
            super(dinamicXEngine, referenceQueue);
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
            }
            s sVar = this.b;
            return (sVar == null || sVar.c == null || this.b.c.size() <= 0) ? false : true;
        }
    }
}
