package com.alipay.mobile.common.logging.api;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class DeviceInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static DeviceInfo f5412a;
    private int b;
    private int c;
    private Context d;
    private boolean e = false;

    private DeviceInfo(Context context) {
        this.d = context;
    }

    public static DeviceInfo getInstance(Context context) {
        DisplayMetrics displayMetrics;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DeviceInfo) ipChange.ipc$dispatch("f86be4f0", new Object[]{context});
        }
        if (f5412a == null) {
            synchronized (DeviceInfo.class) {
                if (f5412a == null) {
                    DeviceInfo deviceInfo = new DeviceInfo(context);
                    f5412a = deviceInfo;
                    if (Build.VERSION.SDK_INT >= 17) {
                        Display defaultDisplay = ((WindowManager) deviceInfo.d.getSystemService(a.ATOM_EXT_window)).getDefaultDisplay();
                        displayMetrics = new DisplayMetrics();
                        defaultDisplay.getRealMetrics(displayMetrics);
                    } else {
                        displayMetrics = deviceInfo.d.getResources().getDisplayMetrics();
                    }
                    deviceInfo.b = displayMetrics.widthPixels;
                    deviceInfo.c = displayMetrics.heightPixels;
                    deviceInfo.updateAccessibilityState();
                }
            }
        }
        return f5412a;
    }

    public void updateAccessibilityState() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f089c713", new Object[]{this});
            return;
        }
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getSystemService("accessibility");
            boolean isEnabled = accessibilityManager.isEnabled();
            boolean isTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (isEnabled && isTouchExplorationEnabled) {
                z = true;
            }
            this.e = z;
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("DeviceInfo_log", th);
        }
    }

    public boolean getIsAccessibilityEnabled() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f6d9105e", new Object[]{this})).booleanValue() : this.e;
    }

    public int getScreenWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("43d49fe", new Object[]{this})).intValue() : this.b;
    }

    public int getScreenHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("3d9e9723", new Object[]{this})).intValue() : this.c;
    }

    public String getResolution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd471797", new Object[]{this});
        }
        return this.c + "x" + this.b;
    }
}
