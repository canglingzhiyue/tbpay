package com.taobao.themis.widget.event;

import android.view.MotionEvent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/widget/event/WidgetTouchEventBridge;", "", "()V", "isSendTouchEvent", "", "mInstanceRef", "Ljava/lang/ref/WeakReference;", "Lcom/taobao/themis/kernel/TMSInstance;", "mStartX", "", "mStartY", "click", "", "ev", "Landroid/view/MotionEvent;", "onTouch", "setInstance", "instance", "themis_widget_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f22921a = true;
    private double b;
    private double c;
    private WeakReference<f> d;

    static {
        kge.a(-905565006);
    }

    public final void a(f instance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0cb8a2d", new Object[]{this, instance});
            return;
        }
        q.d(instance, "instance");
        this.d = new WeakReference<>(instance);
    }

    public final void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (motionEvent == null) {
        } else {
            double x = motionEvent.getX();
            double y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f22921a = false;
                this.b = x;
                this.c = y;
            } else if (action != 1 && action != 3) {
            } else {
                double d = 2;
                if (Math.abs(this.b - x) >= d || Math.abs(this.c - y) >= d) {
                    return;
                }
                b(motionEvent);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        f it;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
        } else if (this.f22921a) {
        } else {
            WeakReference<f> weakReference = this.d;
            if (weakReference != null && (it = weakReference.get()) != null) {
                com.taobao.themis.widget.d dVar = com.taobao.themis.widget.d.INSTANCE;
                q.b(it, "it");
                dVar.a(it);
            }
            this.f22921a = true;
        }
    }
}
