package com.alipay.zoloz.hardware.camera.fps;

import android.text.TextUtils;
import com.alipay.zoloz.hardware.log.Log;
import com.alipay.zoloz.hardware.log.MonitorLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class FpsTask implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f6234a;
    private FpsCallback b;
    private int c;
    private int d;
    private long e;
    private boolean f;
    private List<Integer> g;

    public FpsTask(String str) {
        this(str, null);
    }

    public FpsTask(String str, FpsCallback fpsCallback) {
        this.c = 0;
        this.d = 0;
        this.e = 0L;
        this.f = false;
        this.g = Collections.synchronizedList(new ArrayList());
        this.f6234a = str;
        this.b = fpsCallback;
    }

    public void setFpsCallback(FpsCallback fpsCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9715d8c1", new Object[]{this, fpsCallback});
        } else {
            this.b = fpsCallback;
        }
    }

    public String getName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this}) : this.f6234a;
    }

    public void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.d++;
        }
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = System.currentTimeMillis();
        this.f = false;
        this.g.clear();
        Log.d(FpsMonitor.TAG, "reset() : " + this.f6234a);
    }

    public void setRender(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c63c595", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f = z;
        Log.v(FpsMonitor.TAG, this.f6234a + " : set render = " + z);
        if (z) {
            return;
        }
        MonitorLogger.performance(this.f6234a, TextUtils.join("|", this.g));
        this.g.clear();
    }

    public boolean isRender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c88507eb", new Object[]{this})).booleanValue() : this.f;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.c++;
        long currentTimeMillis = System.currentTimeMillis();
        float f = (this.d * 1000.0f) / ((float) (currentTimeMillis - this.e));
        FpsCallback fpsCallback = this.b;
        if (fpsCallback != null) {
            fpsCallback.onFps(this.f6234a, this.c, f);
        }
        if (this.f) {
            this.g.add(Integer.valueOf((int) f));
        }
        this.d = 0;
        this.e = currentTimeMillis;
    }
}
