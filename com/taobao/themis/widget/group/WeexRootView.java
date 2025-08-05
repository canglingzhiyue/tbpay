package com.taobao.themis.widget.group;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.jvq;
import tb.jvs;
import tb.kge;
import tb.mto;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/widget/group/WeexRootView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "disallowParentIntercept", "", "gestureListener", "Lcom/taobao/android/weex_framework/listeners/IWeexGestureEventListener;", "mCustomGestureEventListener", "mCustomScrollListener", "Lcom/taobao/android/weex_framework/listeners/IWeexScrollListener;", "scrollListener", "dispatchTouchEvent", "ev", "Landroid/view/MotionEvent;", "getGestureListener", "getScrollListener", "setCustomGestureListener", "", DataReceiveMonitor.CB_LISTENER, "setCustomScrollListener", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class WeexRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean disallowParentIntercept;
    private final jvq gestureListener;
    private jvq mCustomGestureEventListener;
    private jvs mCustomScrollListener;
    private final jvs scrollListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "", "kotlin.jvm.PlatformType", "", "", "onGestureEvent"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements jvq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.jvq
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            WeexRootView.access$setDisallowParentIntercept$p(WeexRootView.this, q.a(map.get("state"), (Object) true));
            jvq access$getMCustomGestureEventListener$p = WeexRootView.access$getMCustomGestureEventListener$p(WeexRootView.this);
            if (access$getMCustomGestureEventListener$p == null) {
                return;
            }
            access$getMCustomGestureEventListener$p.a(map);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "", "kotlin.jvm.PlatformType", "", "", "onOverScrolling"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements jvs {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jvs
        public final void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
                return;
            }
            Object obj = map.get("pixels");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
            }
            if (((Double) obj).doubleValue() > mto.a.GEO_NOT_SUPPORT) {
                WeexRootView.access$setDisallowParentIntercept$p(WeexRootView.this, false);
            }
            jvs access$getMCustomScrollListener$p = WeexRootView.access$getMCustomScrollListener$p(WeexRootView.this);
            if (access$getMCustomScrollListener$p == null) {
                return;
            }
            access$getMCustomScrollListener$p.a(map);
        }
    }

    static {
        kge.a(-2089262387);
    }

    public static /* synthetic */ Object ipc$super(WeexRootView weexRootView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WeexRootView(Context context) {
        super(context);
        q.d(context, "context");
        this.disallowParentIntercept = true;
        this.gestureListener = new a();
        this.scrollListener = new b();
    }

    public static final /* synthetic */ jvq access$getMCustomGestureEventListener$p(WeexRootView weexRootView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvq) ipChange.ipc$dispatch("db170d4d", new Object[]{weexRootView}) : weexRootView.mCustomGestureEventListener;
    }

    public static final /* synthetic */ jvs access$getMCustomScrollListener$p(WeexRootView weexRootView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvs) ipChange.ipc$dispatch("a2efa887", new Object[]{weexRootView}) : weexRootView.mCustomScrollListener;
    }

    public static final /* synthetic */ void access$setDisallowParentIntercept$p(WeexRootView weexRootView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a706e4e", new Object[]{weexRootView, new Boolean(z)});
        } else {
            weexRootView.disallowParentIntercept = z;
        }
    }

    public static final /* synthetic */ void access$setMCustomGestureEventListener$p(WeexRootView weexRootView, jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9284a66b", new Object[]{weexRootView, jvqVar});
        } else {
            weexRootView.mCustomGestureEventListener = jvqVar;
        }
    }

    public static final /* synthetic */ void access$setMCustomScrollListener$p(WeexRootView weexRootView, jvs jvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3314cad", new Object[]{weexRootView, jvsVar});
        } else {
            weexRootView.mCustomScrollListener = jvsVar;
        }
    }

    public final void setCustomGestureListener(jvq listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4418dc5c", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.mCustomGestureEventListener = listener;
    }

    public final void setCustomScrollListener(jvs listener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("681d3e4", new Object[]{this, listener});
            return;
        }
        q.d(listener, "listener");
        this.mCustomScrollListener = listener;
    }

    public final jvq getGestureListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvq) ipChange.ipc$dispatch("df226ed3", new Object[]{this}) : this.gestureListener;
    }

    public final jvs getScrollListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvs) ipChange.ipc$dispatch("5be66061", new Object[]{this}) : this.scrollListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, ev})).booleanValue();
        }
        q.d(ev, "ev");
        if (ev.getAction() == 0) {
            this.disallowParentIntercept = true;
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(this.disallowParentIntercept);
        }
        return super.dispatchTouchEvent(ev);
    }
}
