package org.webrtc.voiceengine;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class BuildInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1245269238);
    }

    public static String getDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6b1ef52d", new Object[0]) : Build.DEVICE;
    }

    public static String getDeviceModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fd868ddc", new Object[0]) : Build.MODEL;
    }

    public static String getProduct() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("274903e0", new Object[0]) : Build.PRODUCT;
    }

    public static String getBrand() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("935139c8", new Object[0]) : Build.BRAND;
    }

    public static String getDeviceManufacturer() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("551edfdc", new Object[0]) : Build.MANUFACTURER;
    }

    public static String getAndroidBuildId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ea3d0d49", new Object[0]) : Build.ID;
    }

    public static String getBuildType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4d827a27", new Object[0]) : Build.TYPE;
    }

    public static String getBuildRelease() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("425de2a", new Object[0]) : Build.VERSION.RELEASE;
    }

    public static int getSdkVersion() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("541225ae", new Object[0])).intValue() : Build.VERSION.SDK_INT;
    }
}
