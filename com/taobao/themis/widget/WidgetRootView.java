package com.taobao.themis.widget;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.i;
import com.taobao.android.autosize.l;
import com.taobao.themis.kernel.f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\fJ\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/taobao/themis/widget/WidgetRootView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "instance", "Lcom/taobao/themis/kernel/TMSInstance;", "(Landroid/content/Context;Lcom/taobao/themis/kernel/TMSInstance;)V", "mInstanceRef", "Ljava/lang/ref/WeakReference;", "mWidgetTouchEventBridge", "Lcom/taobao/themis/widget/event/WidgetTouchEventBridge;", "mWidgetViewConfig", "Lcom/taobao/themis/external/embed/WidgetViewConfig;", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "getViewConfig", "isExpend", "targetHeight", "", "currentHeight", "updateSize", "", "isSurfaceMode", "newConfig", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class WidgetRootView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WeakReference<f> mInstanceRef;
    private final com.taobao.themis.widget.event.d mWidgetTouchEventBridge;
    private com.taobao.themis.external.embed.a mWidgetViewConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public a(ViewGroup.LayoutParams layoutParams) {
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                WidgetRootView.this.setLayoutParams(this.b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f22909a;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public b(View view, ViewGroup.LayoutParams layoutParams) {
            this.f22909a = view;
            this.b = layoutParams;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f22909a.setLayoutParams(this.b);
            }
        }
    }

    static {
        kge.a(-1858366720);
    }

    public static /* synthetic */ Object ipc$super(WidgetRootView widgetRootView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    private final boolean isExpend(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a38f9093", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : i > i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetRootView(Context context, f instance) {
        super(context);
        com.taobao.themis.external.embed.a aVar;
        q.d(context, "context");
        q.d(instance, "instance");
        this.mInstanceRef = new WeakReference<>(instance);
        this.mWidgetTouchEventBridge = new com.taobao.themis.widget.event.d();
        this.mWidgetTouchEventBridge.a(instance);
        com.taobao.themis.external.embed.a aVar2 = (com.taobao.themis.external.embed.a) instance.a(com.taobao.themis.external.embed.a.class);
        this.mWidgetViewConfig = (aVar2 == null || (aVar = aVar2.d()) == null) ? new com.taobao.themis.external.embed.a(-1, -1) : aVar;
        FrameLayout.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(this.mWidgetViewConfig.b(), this.mWidgetViewConfig.c());
        } else {
            layoutParams.width = this.mWidgetViewConfig.b();
            layoutParams.height = this.mWidgetViewConfig.c();
        }
        setLayoutParams(layoutParams);
        if (l.b(getContext()) || l.d(getContext())) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.taobao.themis.widget.WidgetRootView.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                        return;
                    }
                    Context context2 = WidgetRootView.this.getContext();
                    if (context2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                    int width = i.a((Activity) context2).width();
                    if (WidgetRootView.access$getMWidgetViewConfig$p(WidgetRootView.this).a() == width) {
                        return;
                    }
                    WidgetRootView.access$getMWidgetViewConfig$p(WidgetRootView.this).a(width);
                    WidgetRootView widgetRootView = WidgetRootView.this;
                    widgetRootView.updateSize(false, WidgetRootView.access$getMWidgetViewConfig$p(widgetRootView));
                }
            });
        }
    }

    public static final /* synthetic */ com.taobao.themis.external.embed.a access$getMWidgetViewConfig$p(WidgetRootView widgetRootView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.external.embed.a) ipChange.ipc$dispatch("51e6405c", new Object[]{widgetRootView}) : widgetRootView.mWidgetViewConfig;
    }

    public static final /* synthetic */ void access$setMWidgetViewConfig$p(WidgetRootView widgetRootView, com.taobao.themis.external.embed.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0991c6a", new Object[]{widgetRootView, aVar});
        } else {
            widgetRootView.mWidgetViewConfig = aVar;
        }
    }

    public final com.taobao.themis.external.embed.a getViewConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.external.embed.a) ipChange.ipc$dispatch("60aaa5e4", new Object[]{this}) : this.mWidgetViewConfig;
    }

    public final void updateSize(boolean z, com.taobao.themis.external.embed.a newConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f073e15", new Object[]{this, new Boolean(z), newConfig});
            return;
        }
        q.d(newConfig, "newConfig");
        this.mWidgetViewConfig = newConfig.d();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        ((ViewGroup.LayoutParams) layoutParams2).width = newConfig.b();
        ((ViewGroup.LayoutParams) layoutParams2).height = newConfig.c();
        View childAt = getChildAt(0);
        if (!z || childAt == null) {
            setLayoutParams(layoutParams2);
        } else if (isExpend(newConfig.c(), layoutParams.height)) {
            childAt.setLayoutParams(layoutParams2);
            childAt.postDelayed(new a(layoutParams2), 10L);
        } else {
            setLayoutParams(layoutParams2);
            childAt.postDelayed(new b(childAt, layoutParams2), 10L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        this.mWidgetTouchEventBridge.a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }
}
