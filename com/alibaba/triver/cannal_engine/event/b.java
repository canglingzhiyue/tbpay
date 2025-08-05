package com.alibaba.triver.cannal_engine.event;

import android.view.MotionEvent;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.mto;

/* loaded from: classes3.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f3641a = true;
    private double b = mto.a.GEO_NOT_SUPPORT;
    private double c = mto.a.GEO_NOT_SUPPORT;
    private WeakReference<App> d;

    static {
        kge.a(-898505814);
    }

    public void a(App app) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eb61d7c", new Object[]{this, app});
        } else {
            this.d = new WeakReference<>(app);
        }
    }

    public void a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f37b47d", new Object[]{this, motionEvent});
        } else if (motionEvent == null) {
        } else {
            double x = motionEvent.getX();
            double y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (this.d != null) {
                ((IWidgetTouchEventBridge) RVProxy.get(IWidgetTouchEventBridge.class)).onTouch(motionEvent, this.d.get());
            }
            if (action == 0) {
                this.f3641a = false;
                this.b = x;
                this.c = y;
            } else if ((action != 1 && action != 3) || Math.abs(this.b - x) >= 2.0d || Math.abs(this.c - y) >= 2.0d) {
            } else {
                b(motionEvent);
            }
        }
    }

    private void b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74207cbe", new Object[]{this, motionEvent});
        } else if (this.f3641a) {
        } else {
            if (this.d != null) {
                ((IWidgetTouchEventBridge) RVProxy.get(IWidgetTouchEventBridge.class)).onClick(motionEvent, this.d.get());
            }
            this.f3641a = true;
        }
    }
}
