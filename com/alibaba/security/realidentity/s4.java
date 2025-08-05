package com.alibaba.security.realidentity;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import com.alibaba.security.realidentity.biz.config.RPBizConfig;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iju;

/* loaded from: classes3.dex */
public class s4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private int a(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c542837", new Object[]{this, context, rPBizConfig})).intValue();
        }
        if (!m.k()) {
            return e2.f;
        }
        if (!iju.ABI_ARM.equalsIgnoreCase(Build.CPU_ABI) && !"armeabi".equalsIgnoreCase(Build.CPU_ABI) && !"x86".equalsIgnoreCase(Build.CPU_ABI) && !iju.ABI_ARM64.equalsIgnoreCase(Build.CPU_ABI)) {
            return e2.j;
        }
        if (m.e()) {
            return e2.k;
        }
        if (!m2.a().b()) {
            return e2.E;
        }
        if (!a(false)) {
            return e2.g;
        }
        if ((rPBizConfig.getDegradeConfig().isHonorMagicWindowOff && e.g(context)) || !rPBizConfig.getDegradeConfig().isUseHwMagicWindow || !e.h(context)) {
            return 0;
        }
        return e2.m;
    }

    public int b(Context context, RPBizConfig rPBizConfig) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("aeaf3f16", new Object[]{this, context, rPBizConfig})).intValue() : a(context, rPBizConfig);
    }

    private boolean a(boolean z) {
        Camera.CameraInfo cameraInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        try {
            int numberOfCameras = Integer.parseInt(Build.VERSION.SDK) > 8 ? Camera.getNumberOfCameras() : 0;
            for (int i = 0; i < numberOfCameras; i++) {
                try {
                    cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i, cameraInfo);
                } catch (Throwable unused) {
                }
                if (!z && cameraInfo.facing == 1) {
                    return true;
                }
                if (z && cameraInfo.facing == 0) {
                    return true;
                }
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
