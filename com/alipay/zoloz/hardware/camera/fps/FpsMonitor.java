package com.alipay.zoloz.hardware.camera.fps;

import com.alipay.zoloz.hardware.log.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class FpsMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String FPS_NAME_COLOR = "color";
    public static final String FPS_NAME_DEPTH = "depth";
    public static final String FPS_NAME_RENDER = "render";
    public static final String FPS_NAME_SLIR = "slir";
    public static final String TAG = "Fps";
    private static final FpsMonitor c = new FpsMonitor();

    /* renamed from: a  reason: collision with root package name */
    private ScheduledExecutorService f6233a;
    private final HashMap<String, ScheduledFuture<?>> b = new HashMap<>();

    private FpsMonitor() {
    }

    public static FpsMonitor getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FpsMonitor) ipChange.ipc$dispatch("bd7b0bc5", new Object[0]) : c;
    }

    public void startFpsMonitor(FpsTask fpsTask) {
        ScheduledFuture<?> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0469e68", new Object[]{this, fpsTask});
            return;
        }
        synchronized (this.b) {
            if (this.f6233a == null) {
                this.f6233a = Executors.newScheduledThreadPool(1);
                Log.d(TAG, "scheduledExecutorService = Executors.newScheduledThreadPool(1)");
            }
            String name = fpsTask.getName();
            if (this.b.containsKey(name) && (remove = this.b.remove(name)) != null) {
                remove.cancel(false);
                Log.w(TAG, "cancel pre '" + name + "' FpsTask");
            }
            fpsTask.reset();
            Log.d(TAG, "startFpsMonitor() : " + name);
            this.b.put(fpsTask.getName(), this.f6233a.scheduleAtFixedRate(fpsTask, 1L, 1L, TimeUnit.SECONDS));
        }
    }

    public void stopFpsMonitor(FpsTask fpsTask) {
        ScheduledFuture<?> remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f7b208", new Object[]{this, fpsTask});
            return;
        }
        synchronized (this.b) {
            String name = fpsTask.getName();
            Log.d(TAG, "stopFpsMonitor() : " + name);
            if (this.b.containsKey(name) && (remove = this.b.remove(name)) != null) {
                remove.cancel(true);
            }
            if (this.b.isEmpty() && this.f6233a != null) {
                this.f6233a.shutdown();
                this.f6233a = null;
                Log.d(TAG, "scheduledExecutorService.shutdown()");
            }
        }
    }
}
