package com.taobao.android.fcanvas.integration;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fcanvas.integration.FCanvasInstance;
import com.taobao.android.fcanvas.integration.bridge.FCanvasJNIBridge;
import tb.kge;

/* loaded from: classes5.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FCanvasJNIBridge f12329a;
    private Surface b;
    private final String c;

    static {
        kge.a(-455632670);
    }

    public c(FCanvasJNIBridge fCanvasJNIBridge, String str) {
        this.f12329a = fCanvasJNIBridge;
        this.c = str;
    }

    public void a(Surface surface, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22fac4cd", new Object[]{this, surface, renderType});
            return;
        }
        if (this.b != null) {
            a(renderType);
        }
        this.b = surface;
        this.f12329a.onSurfaceCreated(surface, this.c, renderType);
    }

    public void a(int i, int i2, FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc56db9", new Object[]{this, new Integer(i), new Integer(i2), renderType});
        } else {
            this.f12329a.onSurfaceChanged(i, i2, this.c, renderType);
        }
    }

    public void a(FCanvasInstance.RenderType renderType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ced7019", new Object[]{this, renderType});
            return;
        }
        this.f12329a.onSurfaceDestroyed(this.c, renderType);
        Surface surface = this.b;
        if (surface != null && surface.isValid()) {
            this.b.release();
        }
        this.b = null;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f545bb1", new Object[]{this, eVar});
        } else {
            this.f12329a.setViewportMetrics(eVar.f12330a, eVar.b, eVar.c);
        }
    }
}
