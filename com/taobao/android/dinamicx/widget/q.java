package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXViewEvent;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.view.DXNativeFrameLayout;
import com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import tb.fuo;
import tb.fux;
import tb.fxf;
import tb.jqm;

/* loaded from: classes5.dex */
public class q extends j implements fxf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXLOOPVIEWLAYOUT_AUTOLOOP = 1174195018790483035L;
    public static final long DXLOOPVIEWLAYOUT_LAYERORDER = 2392273351067921955L;
    public static final int DXLOOPVIEWLAYOUT_LAYERORDER_NORMAL = 0;
    public static final int DXLOOPVIEWLAYOUT_LAYERORDER_REVERSE = 1;
    public static final long DXLOOPVIEWLAYOUT_LOOPBEGINTIME = 3376036431954601531L;
    public static final long DXLOOPVIEWLAYOUT_LOOPINTERVAL = 7318592948653306891L;
    public static final long DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT = -2740032205478963263L;
    public static final long DXLOOPVIEWLAYOUT_ONPAGEAPPEAR = -8975334121118753601L;
    public static final long DXLOOPVIEWLAYOUT_ONPAGEDISAPPEAR = -5201408949358043646L;
    public static final long DXLOOPVIEWLAYOUT_STARTPLAY = -7438709554197156915L;
    private ArrayList<DXWidgetNode> e;
    private com.taobao.android.dinamicx.as f;
    private int g;
    private b h;
    private c i;
    private d j;
    private boolean k;
    private boolean l;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12110a = true;
    private int b = 0;
    private long c = 0;
    private long d = 0;
    private final DXNativeLoopViewLayout.b m = new DXNativeLoopViewLayout.b() { // from class: com.taobao.android.dinamicx.widget.q.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.b
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else {
                q.a(q.this, i);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                q.a(q.this);
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.b
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                q.b(q.this);
            }
        }
    };

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new q();
        }
    }

    public static /* synthetic */ Object ipc$super(q qVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1834790766:
                super.onBeforeBindChildData();
                return null;
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1440851004:
                super.onSetLongAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).longValue());
                return null;
            case -1399192248:
                super.bindRuntimeContext((DXRuntimeContext) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -1085610847:
                return new Long(super.getDefaultValueForLongAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1327675976:
                return new Boolean(super.onEvent((DXEvent) objArr[0]));
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5028fe", new Object[]{qVar});
        } else {
            qVar.e();
        }
    }

    public static /* synthetic */ void a(q qVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb569c5", new Object[]{qVar, new Integer(i)});
        } else {
            qVar.a(i);
        }
    }

    public static /* synthetic */ void b(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39197bf", new Object[]{qVar});
        } else {
            qVar.d();
        }
    }

    public static /* synthetic */ c c(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("91aa5d4d", new Object[]{qVar}) : qVar.i;
    }

    public static /* synthetic */ long d(q qVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("be147535", new Object[]{qVar})).longValue() : qVar.c;
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new q();
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (!(dXWidgetNode instanceof q)) {
        } else {
            super.onClone(dXWidgetNode, z);
            q qVar = (q) dXWidgetNode;
            if (this.e != null) {
                if (jqm.a()) {
                    new RuntimeException();
                }
                fux.b("DXLoopViewLayout#onClone#unexpected_change_item#" + com.taobao.android.dinamicx.exception.a.a(new RuntimeException()));
            }
            this.f12110a = qVar.f12110a;
            this.b = qVar.b;
            this.c = qVar.c;
            this.d = qVar.d;
            this.e = qVar.e;
            this.f = qVar.f;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeforeBindChildData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a35092", new Object[]{this});
            return;
        }
        super.onBeforeBindChildData();
        g();
        i();
        if (this.e != null) {
            if (jqm.a()) {
                new RuntimeException();
            }
            fux.b("DXLoopViewLayout#onBeforeBindChildData#unexpected_change_item#" + com.taobao.android.dinamicx.exception.a.a(new RuntimeException()));
        }
        this.g = 0;
        this.h = null;
        this.i = null;
        this.k = false;
        List<DXWidgetNode> children = getChildren();
        this.e = children == null ? new ArrayList<>() : new ArrayList<>(children);
        setDisableFlatten(true);
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context}) : new DXNativeLoopViewLayout(context);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        String str = this + " onRenderView";
        if (!(view instanceof DXNativeLoopViewLayout)) {
            return;
        }
        DXNativeLoopViewLayout dXNativeLoopViewLayout = (DXNativeLoopViewLayout) view;
        if (this.i == null) {
            b();
        }
        DinamicXEngine b2 = getDXRuntimeContext().C().b();
        ArrayList<DXWidgetNode> arrayList = this.e;
        if ((arrayList == null || arrayList.isEmpty()) && b2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new s.a("DXLoopViewLayout", "data_error", com.taobao.android.dinamicx.s.DX_ERROR_BIZ_CODE));
            DinamicXEngine.a(b2.a(), getDXRuntimeContext().c(), arrayList2);
        }
        if (this.h == null) {
            this.h = new b(this.f, context, this);
            this.h.a(this.e);
        }
        if (this.j == null) {
            this.j = new d(b2);
        }
        dXNativeLoopViewLayout.bindData(getMeasuredWidth(), getMeasuredHeight(), this.h, this.g, this.b);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        DXRootView s = getDXRuntimeContext().s();
        if (s == null) {
            this.i = null;
            return;
        }
        this.i = c.a(s);
        this.i.a();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.f == null) {
            this.f = new com.taobao.android.dinamicx.as(getDXRuntimeContext().C(), 3, UUID.randomUUID().toString());
        }
        if (getChildrenCount() > 0 && !(getChildAt(0) instanceof m)) {
            super.onMeasure(i, i2);
            removeAllChild();
            return;
        }
        removeAllChild();
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void bindRuntimeContext(DXRuntimeContext dXRuntimeContext, boolean z) {
        ArrayList<DXWidgetNode> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac9a0548", new Object[]{this, dXRuntimeContext, new Boolean(z)});
            return;
        }
        super.bindRuntimeContext(dXRuntimeContext, z);
        if (dXRuntimeContext == null || (arrayList = this.e) == null) {
            return;
        }
        Iterator<DXWidgetNode> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().bindRuntimeContext(dXRuntimeContext, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.j, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DXLOOPVIEWLAYOUT_AUTOLOOP) {
            if (i == 0) {
                z = false;
            }
            this.f12110a = z;
        } else if (j == DXLOOPVIEWLAYOUT_LAYERORDER) {
            this.b = i;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetLongAttribute(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1e5bc4", new Object[]{this, new Long(j), new Long(j2)});
        } else if (j == DXLOOPVIEWLAYOUT_LOOPBEGINTIME) {
            this.c = j2;
            if (this.c >= 0) {
                return;
            }
            this.c = getDefaultValueForLongAttr(j);
        } else if (j == DXLOOPVIEWLAYOUT_LOOPINTERVAL) {
            this.d = j2;
            if (this.d >= 0) {
                return;
            }
            this.d = getDefaultValueForLongAttr(j);
        } else {
            super.onSetLongAttribute(j, j2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
            return;
        }
        if (fuo.DX_PARSER_LISTDATA == j && jSONArray != null && jSONArray.size() == 2) {
            jSONArray.add(jSONArray.get(0));
            jSONArray.add(jSONArray.get(1));
        }
        super.onSetListAttribute(j, jSONArray);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == DXLOOPVIEWLAYOUT_AUTOLOOP) {
            return 1;
        }
        if (j != DXLOOPVIEWLAYOUT_LAYERORDER) {
            return super.getDefaultValueForIntAttr(j);
        }
        return 0;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public long getDefaultValueForLongAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf4ae4a1", new Object[]{this, new Long(j)})).longValue();
        }
        if (j != DXLOOPVIEWLAYOUT_LOOPBEGINTIME && j != DXLOOPVIEWLAYOUT_LOOPINTERVAL) {
            return super.getDefaultValueForLongAttr(j);
        }
        return 0L;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean onEvent(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f22ba48", new Object[]{this, dXEvent})).booleanValue();
        }
        if (!dXEvent.isPrepareBind()) {
            long eventId = dXEvent.getEventId();
            String str = this + " onEvent " + eventId;
            if (eventId == 5288671110273408574L) {
                a(dXEvent);
            } else if (eventId == 5388973340095122049L) {
                b(dXEvent);
            } else if (eventId == DXLOOPVIEWLAYOUT_STARTPLAY) {
                c();
            }
        }
        return super.onEvent(dXEvent);
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f12110a) {
        } else {
            a();
        }
    }

    private DXWidgetNode a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("ff356489", new Object[]{this, view});
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (!(tag instanceof DXWidgetNode)) {
            return null;
        }
        return ((DXWidgetNode) tag).getDXRuntimeContext().d();
    }

    private void a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed70072a", new Object[]{this, dXEvent});
            return;
        }
        c(dXEvent);
        if (!this.f12110a) {
            return;
        }
        f();
        h();
    }

    private void b(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe25d3eb", new Object[]{this, dXEvent});
            return;
        }
        c(dXEvent);
        if (!this.f12110a) {
            return;
        }
        i();
        g();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        String str = this + " onScreenOn";
        if (!this.f12110a) {
            return;
        }
        h();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        String str = this + " onScreenOff";
        if (!this.f12110a) {
            return;
        }
        i();
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        String str = this + " onWindowVisibilityChanged " + i;
        if (i == 0) {
            h();
        } else {
            i();
        }
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.l) {
        } else {
            this.l = true;
            DXNativeLoopViewLayout j = j();
            if (j == null || a(j) != this) {
                return;
            }
            String str = this + " registerLoopViewLayoutLifecycle " + j;
            j.setLifecycleListener(this.m);
        }
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.l) {
        } else {
            this.l = false;
            DXNativeLoopViewLayout j = j();
            if (j == null || a(j) != this) {
                return;
            }
            String str = this + " unregisterLoopViewLayoutLifecycle " + j;
            j.setLifecycleListener(null);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        c cVar = this.i;
        if (cVar == null || this.j == null || this.d <= 0 || this.k) {
            return;
        }
        this.k = true;
        cVar.b();
        this.j.a(this.i.a(this.c, this.d), this.d, new d.a() { // from class: com.taobao.android.dinamicx.widget.q.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.widget.q.d.a
            public long a(long j) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("a8219750", new Object[]{this, new Long(j)})).longValue() : q.c(q.this) == null ? j : q.c(q.this).a(q.d(q.this), j);
            }
        }, this);
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (!this.k) {
        } else {
            c cVar = this.i;
            if (cVar != null) {
                cVar.c();
            }
            d dVar = this.j;
            if (dVar != null) {
                dVar.b();
            }
            this.k = false;
        }
    }

    private void c(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edba0ac", new Object[]{this, dXEvent});
            return;
        }
        b bVar = this.h;
        DXWidgetNode a2 = bVar != null ? bVar.a(this.g) : null;
        if (a2 == null) {
            return;
        }
        String str = this + " broadcast event " + dXEvent.getEventId() + " to child " + a2;
        a2.sendBroadcastEvent(dXEvent);
    }

    @Override // tb.fxf
    public void a() {
        DXNativeLoopViewLayout j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            if (this.h == null || this.h.a() < 3 || (j = j()) == null) {
                return;
            }
            if (a(j) != this) {
                if (!this.f12110a) {
                    return;
                }
                g();
                i();
                return;
            }
            j.roll();
            this.g++;
            DXWidgetNode a2 = this.h.a(this.g - 1);
            DXWidgetNode a3 = this.h.a(this.g);
            a2.sendBroadcastEvent(new DXViewEvent(-5201408949358043646L));
            a3.sendBroadcastEvent(new DXViewEvent(-8975334121118753601L));
            a2.sendBroadcastEvent(new DXViewEvent(5388973340095122049L));
            a3.sendBroadcastEvent(new DXViewEvent(5288671110273408574L));
            if (!jqm.a()) {
                return;
            }
            String str = this + " broadcast event -5201408949358043646 to child " + a2;
            String str2 = this + " broadcast event -8975334121118753601 to child " + a3;
            String str3 = this + " broadcast event 5388973340095122049 to child " + a2;
            String str4 = this + " broadcast event 5288671110273408574 to child " + a3;
        } catch (Throwable th) {
            Log.e("LoopViewLayout", "", th);
            String str5 = "unknown";
            DXTemplateItem dXTemplateItem = null;
            DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
            if (dXRuntimeContext != null) {
                DinamicXEngine b2 = getDXRuntimeContext().C().b();
                if (b2 != null) {
                    str5 = b2.a();
                }
                dXTemplateItem = dXRuntimeContext.c();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(new s.a("DXLoopViewLayout", "catch_error", com.taobao.android.dinamicx.s.DX_ERROR_BIZ_CODE));
            DinamicXEngine.a(str5, dXTemplateItem, arrayList);
        }
    }

    private DXNativeLoopViewLayout j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXNativeLoopViewLayout) ipChange.ipc$dispatch("ff93244c", new Object[]{this});
        }
        View v = getDXRuntimeContext().v();
        if (!(v instanceof DXNativeLoopViewLayout)) {
            return null;
        }
        return (DXNativeLoopViewLayout) v;
    }

    /* loaded from: classes5.dex */
    public static class b extends DXNativeLoopViewLayout.a<DXNativeLoopViewLayout.d, DXWidgetNode> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private com.taobao.android.dinamicx.as f12113a;
        private Context b;
        private ArrayList<DXWidgetNode> c;
        private q d;

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public int b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
            }
            return 0;
        }

        public b(com.taobao.android.dinamicx.as asVar, Context context, q qVar) {
            this.f12113a = asVar;
            this.b = context;
            this.d = qVar;
        }

        public void a(ArrayList<DXWidgetNode> arrayList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfaf7e42", new Object[]{this, arrayList});
            } else {
                this.c = arrayList;
            }
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public DXNativeLoopViewLayout.d a(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXNativeLoopViewLayout.d) ipChange.ipc$dispatch("52ad6417", new Object[]{this, viewGroup, new Integer(i)}) : new DXNativeLoopViewLayout.d(new DXNativeFrameLayout(this.b));
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public void a(DXNativeLoopViewLayout.d dVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c4302d60", new Object[]{this, dVar, new Integer(i)});
                return;
            }
            DXWidgetNode a2 = a(i);
            if (a2 == null) {
                return;
            }
            this.f12113a.a(a2, null, dVar.f12004a, a2.getDXRuntimeContext(), 2, 9, DXWidgetNode.DXMeasureSpec.a(this.d.getMeasuredWidth(), 1073741824), DXWidgetNode.DXMeasureSpec.a(this.d.getMeasuredHeight(), 1073741824), i);
            DXRuntimeContext dXRuntimeContext = a2.getDXRuntimeContext();
            DinamicXEngine b = dXRuntimeContext.C().b();
            if (b == null || dXRuntimeContext == null || !dXRuntimeContext.o()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(dXRuntimeContext.n().c);
            arrayList.add(new s.a("DXLoopViewLayout", "child_render_error", com.taobao.android.dinamicx.s.DX_ERROR_BIZ_CODE));
            DinamicXEngine.a(b.a(), dXRuntimeContext.c(), arrayList);
        }

        public DXWidgetNode a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXWidgetNode) ipChange.ipc$dispatch("3b8b8eba", new Object[]{this, new Integer(i)});
            }
            ArrayList<DXWidgetNode> arrayList = this.c;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            ArrayList<DXWidgetNode> arrayList2 = this.c;
            return arrayList2.get(i % arrayList2.size());
        }

        @Override // com.taobao.android.dinamicx.widget.DXNativeLoopViewLayout.a
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
            }
            ArrayList<DXWidgetNode> arrayList = this.c;
            if (arrayList != null) {
                return arrayList.size();
            }
            return 0;
        }
    }

    /* loaded from: classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static WeakHashMap<View, c> f12114a = new WeakHashMap<>();
        private long b;
        private long c;
        private long d;
        private boolean e;

        private c() {
        }

        public static c a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f67fb5c4", new Object[]{dXRootView});
            }
            c cVar = f12114a.get(dXRootView);
            if (cVar != null) {
                return cVar;
            }
            c cVar2 = new c();
            f12114a.put(dXRootView, cVar2);
            return cVar2;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            this.b = -1L;
            this.c = -1L;
            this.d = 0L;
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
                return;
            }
            if (this.b == -1) {
                this.b = SystemClock.elapsedRealtime();
            }
            if (!this.e) {
                return;
            }
            this.e = false;
            if (this.c == -1) {
                return;
            }
            this.d += SystemClock.elapsedRealtime() - this.c;
            this.c = -1L;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            } else if (this.e) {
            } else {
                this.e = true;
                this.c = SystemClock.elapsedRealtime();
            }
        }

        public long a(long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5c11cadc", new Object[]{this, new Long(j), new Long(j2)})).longValue();
            }
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.b) - this.d;
            if (elapsedRealtime <= j) {
                return j - elapsedRealtime;
            }
            long j3 = elapsedRealtime - j;
            return ((((j3 + j2) - 1) / j2) * j2) - j3;
        }
    }

    /* loaded from: classes5.dex */
    public static class d implements fxf {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private Handler f12115a = new Handler(Looper.getMainLooper());
        private DinamicXEngine b;
        private long c;
        private a d;
        private fxf e;
        private boolean f;
        private boolean g;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes5.dex */
        public interface a {
            long a(long j);
        }

        public static /* synthetic */ boolean a(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b9c036c2", new Object[]{dVar})).booleanValue() : dVar.f;
        }

        public static /* synthetic */ boolean a(d dVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e4753da", new Object[]{dVar, new Boolean(z)})).booleanValue();
            }
            dVar.g = z;
            return z;
        }

        public static /* synthetic */ DinamicXEngine b(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("abf7d568", new Object[]{dVar}) : dVar.b;
        }

        public static /* synthetic */ long c(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ef01bbb4", new Object[]{dVar})).longValue() : dVar.c;
        }

        public static /* synthetic */ a d(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("b397dd6e", new Object[]{dVar}) : dVar.d;
        }

        public static /* synthetic */ fxf e(d dVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (fxf) ipChange.ipc$dispatch("b1c14430", new Object[]{dVar}) : dVar.e;
        }

        public d(DinamicXEngine dinamicXEngine) {
            this.b = dinamicXEngine;
        }

        public void a(long j, long j2, a aVar, fxf fxfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("982a60fd", new Object[]{this, new Long(j), new Long(j2), aVar, fxfVar});
            } else if (this.f) {
            } else {
                this.f = true;
                this.c = j2;
                this.d = aVar;
                this.e = fxfVar;
                if (j <= 0) {
                    fxfVar.a();
                    this.b.a(this, j2);
                    return;
                }
                this.b.a(this, j);
            }
        }

        @Override // tb.fxf
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else if (this.g) {
            } else {
                this.g = true;
                this.f12115a.post(new Runnable() { // from class: com.taobao.android.dinamicx.widget.q.d.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        d.a(d.this, false);
                        if (!d.a(d.this)) {
                            return;
                        }
                        d.b(d.this).a(d.this);
                        long a2 = d.d(d.this).a(d.c(d.this));
                        if (a2 == 0) {
                            a2 = d.c(d.this);
                        }
                        d.b(d.this).a(d.this, a2);
                        d.e(d.this).a();
                    }
                });
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else if (!this.f) {
            } else {
                this.f = false;
                this.b.a(this);
                this.d = null;
                this.e = null;
            }
        }
    }
}
