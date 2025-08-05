package com.taobao.mytaobao.basement;

import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.BasementScrollTraceHelper$onScrollListener$2;
import com.taobao.mytaobao.basement.monitor.b;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import com.taobao.weex.common.Constants;
import kotlin.Metadata;
import kotlin.d;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.kge;
import tb.mtz;
import tb.mua;
import tb.mxq;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0018\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010(\u001a\u00020\u0014H\u0002J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0014H\u0002J\u0006\u0010/\u001a\u00020*J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\nH\u0002J\u0010\u00103\u001a\u00020\n2\u0006\u00104\u001a\u00020\nH\u0002J\b\u00105\u001a\u00020*H\u0007J\b\u00106\u001a\u00020*H\u0007R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/taobao/mytaobao/basement/BasementScrollTraceHelper;", "", "rv", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "controller", "Lcom/taobao/mytaobao/basement/BasementViewController;", "(Lcom/taobao/mytaobao/view/MTPtrRecyclerView;Lcom/taobao/mytaobao/basement/BasementViewController;)V", "basementRect", "Landroid/graphics/Rect;", "beginScrollOffsetY", "", "getController", "()Lcom/taobao/mytaobao/basement/BasementViewController;", "hasConsumeScrollBegin", "", "hasConsumeTouchTrace", "hasTraceEnterBasement", "isFirstGesture", "isFirstScroll", "lastTouchY", "", "mainHandler", "Landroid/os/Handler;", "onScrollListener", "com/taobao/mytaobao/basement/BasementScrollTraceHelper$onScrollListener$2$1", "getOnScrollListener", "()Lcom/taobao/mytaobao/basement/BasementScrollTraceHelper$onScrollListener$2$1;", "onScrollListener$delegate", "Lkotlin/Lazy;", "onTouchListener", "Landroid/view/View$OnTouchListener;", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "onTouchListener$delegate", "getRv", "()Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", Constants.Name.SCROLL_DIRECTION, "viewStatus_begin", "viewStatus_end", "viewStatus_gesture", "calcBasementShowHeight", "considerTraceEnterBasement", "", "considerTraceScrollBegin", "considerTraceScrollEnd", "considerTraceTouchEvent", "deltaY", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "generateBaseParams", "Lcom/alibaba/fastjson/JSONObject;", "exposureHeightPx", "getCurrentViewStatus", "exposureHeight", "registerListener", "unregisterListener", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f18320a;
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private float h;
    private int i;
    private final Handler j;
    private int k;
    private int l;
    private int m;
    private final d n;
    private final d o;
    private final MTPtrRecyclerView p;
    private final i q;
    private final Rect r;

    static {
        kge.a(1332347417);
        f18320a = new k[]{t.a(new PropertyReference1Impl(t.b(h.class), "onTouchListener", "getOnTouchListener()Landroid/view/View$OnTouchListener;")), t.a(new PropertyReference1Impl(t.b(h.class), "onScrollListener", "getOnScrollListener()Lcom/taobao/mytaobao/basement/BasementScrollTraceHelper$onScrollListener$2$1;"))};
    }

    private final View.OnTouchListener d() {
        IpChange ipChange = $ipChange;
        return (View.OnTouchListener) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("d85fcfbd", new Object[]{this}) : this.n.getValue());
    }

    private final BasementScrollTraceHelper$onScrollListener$2.AnonymousClass1 e() {
        IpChange ipChange = $ipChange;
        return (BasementScrollTraceHelper$onScrollListener$2.AnonymousClass1) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("cbc766b7", new Object[]{this}) : this.o.getValue());
    }

    public h(MTPtrRecyclerView rv, i controller) {
        q.c(rv, "rv");
        q.c(controller, "controller");
        this.p = rv;
        this.q = controller;
        this.b = -1;
        this.f = 1;
        this.g = 1;
        this.h = -1.0f;
        this.j = new Handler(mtz.b);
        this.k = -999;
        this.l = -999;
        this.m = -999;
        this.r = new Rect();
        this.n = kotlin.e.a(new BasementScrollTraceHelper$onTouchListener$2(this));
        this.o = kotlin.e.a(new BasementScrollTraceHelper$onScrollListener$2(this));
        this.j.postDelayed(new Runnable() { // from class: com.taobao.mytaobao.basement.h.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                int a2 = e.a(h.this.c());
                JSONObject b = h.b(h.this, a2);
                b.put("offsetHeight", (Object) Float.valueOf(mxq.a(h.this.c().calcVerticalScrollOffset())));
                b.put("offsetHeightPx", (Object) Integer.valueOf(h.this.c().calcVerticalScrollOffset()));
                b.put("viewStatus", (Object) Integer.valueOf(h.c(h.this, a2)));
                String str = a.b() ? "checkTaoliveWebVisible_Weex" : "checkTaoliveWebVisible";
                TLog.loge("BasementScrollTraceHelper", str + ",args=" + b.toJSONString());
                mua.a(b.MODULE_NAME, 19997, str, null, null, b);
            }
        }, 10000L);
    }

    public static final /* synthetic */ void a(h hVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2914ead3", new Object[]{hVar, new Float(f)});
        } else {
            hVar.h = f;
        }
    }

    public static final /* synthetic */ void a(h hVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2914f616", new Object[]{hVar, new Integer(i)});
        } else {
            hVar.b = i;
        }
    }

    public static final /* synthetic */ void a(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291535e7", new Object[]{hVar, new Boolean(z)});
        } else {
            hVar.c = z;
        }
    }

    public static final /* synthetic */ JSONObject b(h hVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("296629d5", new Object[]{hVar, new Integer(i)}) : hVar.a(i);
    }

    public static final /* synthetic */ void b(h hVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a678772", new Object[]{hVar, new Float(f)});
        } else {
            hVar.a(f);
        }
    }

    public static final /* synthetic */ void b(h hVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a67d286", new Object[]{hVar, new Boolean(z)});
        } else {
            hVar.e = z;
        }
    }

    public static final /* synthetic */ int c(h hVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ebba2f47", new Object[]{hVar, new Integer(i)})).intValue() : hVar.b(i);
    }

    public static final /* synthetic */ void c(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e4f58f", new Object[]{hVar});
        } else {
            hVar.h();
        }
    }

    public static final /* synthetic */ void d(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("448cc910", new Object[]{hVar});
        } else {
            hVar.f();
        }
    }

    public static final /* synthetic */ void e(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58349c91", new Object[]{hVar});
        } else {
            hVar.g();
        }
    }

    public final MTPtrRecyclerView c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTPtrRecyclerView) ipChange.ipc$dispatch("4643c5f8", new Object[]{this}) : this.p;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.p.registerOnTouchListener(d());
        this.p.addOnScrollListener(e());
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.p.unregisterOnTouchListener(d());
        this.p.removeOnScrollListener(e());
    }

    private final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else if (this.d) {
        } else {
            this.i = this.p.calcVerticalScrollOffset();
            String str = a.b() ? "scrollBeginDragging_Weex" : "scrollBeginDragging";
            int a2 = e.a(this.p);
            this.l = b(a2);
            JSONObject a3 = a(a2);
            a3.put("action", (Object) str);
            a3.put("isFirstGesture", (Object) Integer.valueOf(this.g));
            a3.put(Constants.Name.SCROLL_DIRECTION, (Object) Integer.valueOf(this.b));
            a3.put("contentOffsety", (Object) Integer.valueOf(this.i));
            a3.put("viewStatus_gesture", (Object) Integer.valueOf(this.k));
            a3.put("viewStatus_begin", (Object) Integer.valueOf(this.l));
            TLog.loge("BasementScrollTraceHelper", str + " args=" + a3.toJSONString());
            b.a().a("scrollTrace", a3, 1.0d, false);
            mua.a(b.MODULE_NAME, 19997, str, null, null, a3);
            this.d = true;
            this.g = 0;
        }
    }

    private final float i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue();
        }
        FrameLayout flEndViewContainer = this.p.getFlEndViewContainer();
        if (flEndViewContainer == null) {
            return -300.0f;
        }
        q.a((Object) flEndViewContainer, "rv.flEndViewContainer?:return -300F");
        if (!flEndViewContainer.isShown()) {
            return -200.0f;
        }
        if (flEndViewContainer.getGlobalVisibleRect(this.r)) {
            return mxq.a(this.p.getBottom() - this.r.top);
        }
        return -100.0f;
    }

    private final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        int calcVerticalScrollOffset = this.p.calcVerticalScrollOffset();
        String str = a.b() ? "scrollEndDragging_Weex" : "scrollEndDragging";
        int a2 = e.a(this.p);
        this.m = b(a2);
        JSONObject a3 = a(a2);
        a3.put("action", (Object) str);
        a3.put("isFirstGesture", (Object) Integer.valueOf(this.g));
        a3.put(Constants.Name.SCROLL_DIRECTION, (Object) Integer.valueOf(this.b));
        a3.put("contentOffsety", (Object) Integer.valueOf(calcVerticalScrollOffset));
        a3.put("scrollHeight", (Object) Integer.valueOf(calcVerticalScrollOffset - this.i));
        a3.put("viewStatus_gesture", (Object) Integer.valueOf(this.k));
        a3.put("viewStatus_begin", (Object) Integer.valueOf(this.l));
        a3.put("viewStatus_end", (Object) Integer.valueOf(this.m));
        a3.put("basementShowHeight", (Object) Float.valueOf(i()));
        TLog.loge("BasementScrollTraceHelper", str + " args=" + a3.toJSONString());
        b.a().a("scrollTrace", a3, 1.0d, false);
        mua.a(b.MODULE_NAME, 19997, str, null, null, a3);
        this.g = 0;
        this.d = false;
        this.k = -999;
        this.l = -999;
        this.m = -999;
    }

    private final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else if (f < 2 && f > -2) {
        } else {
            int i = f < ((float) 0) ? 1 : 0;
            String str = a.b() ? "scrollGestureStart_Weex" : "scrollGestureStart";
            int a2 = e.a(this.p);
            this.k = b(a2);
            JSONObject a3 = a(a2);
            a3.put("action", (Object) str);
            a3.put("isFirstGesture", (Object) Integer.valueOf(this.f));
            a3.put(Constants.Name.SCROLL_DIRECTION, (Object) Integer.valueOf(i));
            a3.put("viewStatus_gesture", (Object) Integer.valueOf(this.k));
            a3.put("viewStatus_begin", (Object) Integer.valueOf(this.l));
            TLog.loge("BasementScrollTraceHelper", str + " args=" + a3.toJSONString());
            b.a().a("scrollTrace", a3, 1.0d, false);
            mua.a(b.MODULE_NAME, 19997, str, null, null, a3);
            this.f = 0;
            this.c = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int, boolean] */
    private final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else if (this.e || !a.b() || this.p.canScrollVertically(1)) {
        } else {
            ?? b = a.b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isWeex", (Object) Integer.valueOf(b == true ? 1 : 0));
            TLog.loge(com.taobao.mytaobao.basement.monitor.c.TAG, "吸顶校验19997成功上报，isWeex=" + ((int) b));
            mua.a(b.MODULE_NAME, 19997, "enterBasement", null, null, jSONObject);
            this.e = true;
        }
    }

    private final JSONObject a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        int i2 = 2;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eef312bb", new Object[]{this, new Integer(i)});
        }
        boolean b = a.b();
        boolean canScrollVertically = this.p.canScrollVertically(1);
        if (a.b() && !this.p.canScrollVertically(1)) {
            z = true;
        }
        if (i < 0) {
            i2 = -1;
        } else if (z) {
            i2 = 3;
        } else if (i <= 0) {
            i2 = 1;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("screenStatus", (Object) Integer.valueOf(this.q.t() ? 1 : 0));
        jSONObject.put("isShowTaoFriend", (Object) Integer.valueOf(b ? 1 : 0));
        jSONObject.put("viewStatus", (Object) Integer.valueOf(i2));
        jSONObject.put("screenHeight", (Object) Float.valueOf(mxq.a(this.p.getHeight())));
        jSONObject.put("screenHeightPx", (Object) Integer.valueOf(this.p.getHeight()));
        jSONObject.put("exposureHeight", (Object) Float.valueOf(mxq.a(i)));
        jSONObject.put("exposureHeightPx", (Object) Integer.valueOf(i));
        jSONObject.put("canScroll", (Object) Integer.valueOf(canScrollVertically ? 1 : 0));
        return jSONObject;
    }

    private final int b(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue();
        }
        if (a.b() && !this.p.canScrollVertically(1)) {
            z = true;
        }
        if (i < 0) {
            return -1;
        }
        if (z) {
            return 3;
        }
        return i > 0 ? 2 : 1;
    }
}
