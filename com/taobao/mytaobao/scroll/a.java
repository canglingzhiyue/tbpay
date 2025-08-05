package com.taobao.mytaobao.scroll;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.p;
import com.taobao.mytaobao.basement.BasementConstants;
import com.taobao.mytaobao.basement.weex.BasementWeexView;
import com.taobao.mytaobao.scroll.WeexNestedScrollHelper$flingListener$2;
import com.taobao.mytaobao.scroll.WeexNestedScrollHelper$scrollListener$2;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.d;
import kotlin.e;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;
import kotlin.reflect.k;
import tb.jvs;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0003\u000f\u001a!\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0015J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0002J\u0006\u0010.\u001a\u00020(J\u0014\u0010/\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u00010\nH\u0002J\b\u00101\u001a\u00020\fH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u0010\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b\"\u0010#R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper;", "", "rv", "Lcom/taobao/mytaobao/view/MTPtrRecyclerView;", "basementWeexView", "Lcom/taobao/mytaobao/basement/weex/BasementWeexView;", "(Lcom/taobao/mytaobao/view/MTPtrRecyclerView;Lcom/taobao/mytaobao/basement/weex/BasementWeexView;)V", "afterTouchListener", "Landroid/view/View$OnTouchListener;", "cellRootView", "Landroid/view/View;", "downX", "", "downY", "flingListener", "com/taobao/mytaobao/scroll/WeexNestedScrollHelper$flingListener$2$1", "getFlingListener", "()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$flingListener$2$1;", "flingListener$delegate", "Lkotlin/Lazy;", "forbidDispatchTouchEventToWeex", "", "isFirst", "needForbidVerticalScroll", "Ljava/lang/Boolean;", "nestedScrollHook", "com/taobao/mytaobao/scroll/WeexNestedScrollHelper$nestedScrollHook$1", "Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$nestedScrollHook$1;", "onTouchListener", "getOnTouchListener", "()Landroid/view/View$OnTouchListener;", "onTouchListener$delegate", "scrollListener", "com/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1", "getScrollListener", "()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1;", "scrollListener$delegate", "unConsumedFlingDistance", "", "changeScrollController", "", "weexControlScroll", "considerCheckIsBasementHorizonScroll", "e", "Landroid/view/MotionEvent;", "considerDispatchMockEventToWeex", ErrorCode.DEFAULT_WINDOW_FRAME_DISPOSE_EX, "findCellRootView", "v", "getCellRootViewY", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ k[] f18467a;
    private boolean b;
    private int c;
    private boolean d;
    private final d e;
    private final d f;
    private final d g;
    private final MTPtrRecyclerView h;
    private final BasementWeexView i;
    private View j;
    private Boolean k;
    private float l;
    private float m;
    private final View.OnTouchListener n;
    private final b o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.taobao.mytaobao.scroll.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class View$OnTouchListenerC0740a implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public View$OnTouchListenerC0740a() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, event})).booleanValue();
            }
            a aVar = a.this;
            q.a((Object) event, "event");
            a.b(aVar, event);
            return true;
        }
    }

    static {
        kge.a(-269608589);
        f18467a = new k[]{t.a(new PropertyReference1Impl(t.b(a.class), "flingListener", "getFlingListener()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$flingListener$2$1;")), t.a(new PropertyReference1Impl(t.b(a.class), "scrollListener", "getScrollListener()Lcom/taobao/mytaobao/scroll/WeexNestedScrollHelper$scrollListener$2$1;")), t.a(new PropertyReference1Impl(t.b(a.class), "onTouchListener", "getOnTouchListener()Landroid/view/View$OnTouchListener;"))};
    }

    private final WeexNestedScrollHelper$flingListener$2.AnonymousClass1 b() {
        IpChange ipChange = $ipChange;
        return (WeexNestedScrollHelper$flingListener$2.AnonymousClass1) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("4af8b100", new Object[]{this}) : this.e.getValue());
    }

    private final WeexNestedScrollHelper$scrollListener$2.AnonymousClass1 c() {
        IpChange ipChange = $ipChange;
        return (WeexNestedScrollHelper$scrollListener$2.AnonymousClass1) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("1a6ea7ee", new Object[]{this}) : this.f.getValue());
    }

    private final View.OnTouchListener d() {
        IpChange ipChange = $ipChange;
        return (View.OnTouchListener) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("d85fcfbd", new Object[]{this}) : this.g.getValue());
    }

    public a(MTPtrRecyclerView rv, BasementWeexView basementWeexView) {
        q.c(rv, "rv");
        q.c(basementWeexView, "basementWeexView");
        this.h = rv;
        this.i = basementWeexView;
        this.b = true;
        this.d = true;
        this.e = e.a(new WeexNestedScrollHelper$flingListener$2(this));
        this.f = e.a(new WeexNestedScrollHelper$scrollListener$2(this));
        this.g = e.a(new WeexNestedScrollHelper$onTouchListener$2(this));
        this.n = new View$OnTouchListenerC0740a();
        this.o = new b();
        this.h.registerOnFlingListener(b());
        this.h.addOnScrollListener(c());
        this.h.registerOnTouchListener(d());
        MTPtrRecyclerView mTPtrRecyclerView = this.h;
        mTPtrRecyclerView.nestedScrollHook = this.o;
        mTPtrRecyclerView.afterTouchListener = this.n;
        this.i.setOverScrollListener(new jvs() { // from class: com.taobao.mytaobao.scroll.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.jvs
            public final void a(Map<String, Object> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                    return;
                }
                try {
                    Object obj = map.get("pixels");
                    if (obj == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
                    }
                    double doubleValue = ((Double) obj).doubleValue();
                    Object obj2 = map.get("velocity");
                    if (obj2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Double");
                    }
                    double doubleValue2 = ((Double) obj2).doubleValue();
                    Object obj3 = map.get("axis");
                    if (!(obj3 instanceof String)) {
                        obj3 = null;
                    }
                    if (!q.a((Object) ((String) obj3), (Object) "vertical")) {
                        return;
                    }
                    if (doubleValue > 0) {
                        TLog.loge(BasementConstants.WEEX_TAG, "overScroll setScrollEnable=true");
                        a.this.a(false);
                    }
                    if (doubleValue2 <= 10) {
                        return;
                    }
                    TLog.loge(BasementConstants.WEEX_TAG, "invoke parent scroll" + doubleValue);
                    a.a(a.this).fling(0, ((int) doubleValue2) * (-2));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public static final /* synthetic */ MTPtrRecyclerView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MTPtrRecyclerView) ipChange.ipc$dispatch("e79ddf0c", new Object[]{aVar}) : aVar.h;
    }

    public static final /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d736ed", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.c = i;
        }
    }

    public static final /* synthetic */ void a(a aVar, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adac116b", new Object[]{aVar, motionEvent});
        } else {
            aVar.a(motionEvent);
        }
    }

    public static final /* synthetic */ void b(a aVar, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6821b1ec", new Object[]{aVar, motionEvent});
        } else {
            aVar.b(motionEvent);
        }
    }

    public static final /* synthetic */ Boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("4ec97356", new Object[]{aVar}) : aVar.k;
    }

    private final void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
        } else if (motionEvent.getPointerCount() > 1) {
        } else {
            if (motionEvent.getAction() == 0) {
                this.l = motionEvent.getX();
                this.m = motionEvent.getY();
            } else if (motionEvent.getAction() == 2) {
                float abs = Math.abs(motionEvent.getX() - this.l);
                float abs2 = Math.abs(motionEvent.getY() - this.m);
                if (motionEvent.getY() <= e() || this.k != null) {
                    return;
                }
                float f = 20;
                if (abs <= f && abs2 <= f) {
                    return;
                }
                if (abs / abs2 > 1) {
                    z = true;
                }
                this.k = Boolean.valueOf(z);
            } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
            } else {
                this.k = null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J4\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"com/taobao/mytaobao/scroll/WeexNestedScrollHelper$nestedScrollHook$1", "Lcom/taobao/mytaobao/view/INestedScrollHook;", "dispatchNestedPreFling", "", "velocityX", "", "velocityY", "processDispatchNestedPreScroll", "dx", "", "dy", "consumed", "", "offsetInWindow", "type", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class b implements com.taobao.mytaobao.view.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.mytaobao.view.b
        public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d285e23", new Object[]{this, new Integer(i), new Integer(i2), iArr, iArr2, new Integer(i3)})).booleanValue();
            }
            if (!q.a((Object) a.d(a.this), (Object) true) || i3 != 0 || iArr == null || iArr.length != 2) {
                return false;
            }
            iArr[1] = i2;
            return true;
        }

        @Override // com.taobao.mytaobao.view.b
        public boolean a(float f, float f2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : q.a((Object) a.d(a.this), (Object) true);
        }
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if ((!this.h.isScrollEnable()) == z && !this.d) {
        } else {
            this.d = false;
            if (z) {
                TLog.loge(BasementConstants.WEEX_TAG, "parent禁止滚动");
                p mInstance = this.i.getMInstance();
                if (mInstance == null) {
                    return;
                }
                this.h.setScrollEnable(false);
                mInstance.setScrollEnabled(true);
                return;
            }
            Log.e(BasementConstants.WEEX_TAG, "parent允许滚动");
            this.h.setScrollEnable(true);
            p mInstance2 = this.i.getMInstance();
            if (mInstance2 == null) {
                return;
            }
            mInstance2.setScrollEnabled(false);
        }
    }

    private final void a(MotionEvent motionEvent) {
        View renderView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (motionEvent.getPointerCount() > 1) {
        } else {
            boolean z = motionEvent.getAction() == 0;
            if (z) {
                this.b = true;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getX(), Math.max(0.0f, motionEvent.getY() - e()), motionEvent.getMetaState());
            p mInstance = this.i.getMInstance();
            ViewParent parent = (mInstance == null || (renderView = mInstance.getRenderView()) == null) ? null : renderView.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view = (View) parent;
            if (view == null) {
                return;
            }
            if (z) {
                this.b = false;
            }
            if (this.b) {
                return;
            }
            view.onTouchEvent(obtain);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.h.unregisterOnFlingListener(b());
        this.h.removeOnScrollListener(c());
        this.h.unregisterOnTouchListener(d());
        MTPtrRecyclerView mTPtrRecyclerView = this.h;
        mTPtrRecyclerView.nestedScrollHook = null;
        mTPtrRecyclerView.afterTouchListener = null;
    }

    private final float e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5c", new Object[]{this})).floatValue();
        }
        View view = this.j;
        if (view != null) {
            if (view == null) {
                q.a();
            }
            return view.getY();
        }
        View a2 = a(this.i);
        this.j = a2;
        if (a2 == null) {
            return 0.0f;
        }
        return a2.getY();
    }

    private final View a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9c7a352c", new Object[]{this, view});
        }
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof RecyclerView) {
            return view;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            parent = null;
        }
        return a((View) parent);
    }
}
