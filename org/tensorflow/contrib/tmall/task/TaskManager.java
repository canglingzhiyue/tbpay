package org.tensorflow.contrib.tmall.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.compute.ServiceListener;
import tb.kge;

/* loaded from: classes9.dex */
public class TaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TaskManager sInstance;
    private long nativeHandle;

    private static native void nativeAddListener(long j, ServiceListener serviceListener);

    private static native long nativeGetHandle();

    private static native void nativeInit();

    private static native void nativeInitializeMonitor(boolean z);

    private static native void nativeSetDevicePreviewEnabled(boolean z);

    public static TaskManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskManager) ipChange.ipc$dispatch("f096e00b", new Object[0]);
        }
        if (sInstance == null) {
            sInstance = new TaskManager();
        }
        return sInstance;
    }

    public void initializeMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f91c3", new Object[]{this, new Boolean(z)});
        } else {
            nativeInitializeMonitor(z);
        }
    }

    public void setDevicePreviewEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba2c3fc", new Object[]{this, new Boolean(z)});
        } else {
            nativeSetDevicePreviewEnabled(z);
        }
    }

    public void addListener(ServiceListener serviceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da332a54", new Object[]{this, serviceListener});
        } else {
            nativeAddListener(this.nativeHandle, serviceListener);
        }
    }

    private TaskManager() {
        this.nativeHandle = 0L;
        this.nativeHandle = nativeGetHandle();
    }

    public void onNativeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ae368d", new Object[]{this});
        } else {
            nativeInit();
        }
    }

    static {
        kge.a(-1810550216);
        sInstance = null;
    }
}
