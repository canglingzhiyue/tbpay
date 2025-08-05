package com.alipay.android.phone.mobilesdk.socketcraft.platform;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.SCLogCatInterface;
import com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor.MonitorPrinter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class PlatformUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f5113a = Logger.getLogger(PlatformUtil.class.getName());
    private static Class b = null;
    private static Class c = null;

    static {
        Logger.getLogger("com.alipay.android.phone.mobilesdk.socketcraft").setLevel(Level.ALL);
    }

    public static final boolean isAndroidPlatform() {
        if (b != null) {
            return true;
        }
        f5113a.info("enter isAndroidPlatform");
        try {
            Class<?> cls = Class.forName("android.os.Build$VERSION");
            if (cls != null) {
                if (((Integer) cls.getField("SDK_INT").get(cls)).intValue() > 0) {
                    return true;
                }
            }
        } catch (Throwable th) {
            f5113a.log(Level.INFO, String.format("isAndroidPlatform err: %s", th.getMessage()));
        }
        return false;
    }

    public static final boolean isAndroidMPaaSPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("86431809", new Object[0])).booleanValue();
        }
        if (!isAndroidPlatform()) {
            return false;
        }
        if (c != null) {
            return true;
        }
        f5113a.info("enter isAndroidMPaaSPlatform");
        try {
            c = Class.forName("com.alipay.mobile.common.transport.utils.LogCatUtil");
            return true;
        } catch (Throwable th) {
            f5113a.log(Level.SEVERE, "isAndroidMPaaSPlatform err", th);
            return false;
        }
    }

    public static final SCLogCatInterface createJavaLogImpl() {
        try {
            f5113a.info("enter createJavaLogImpl");
            return (SCLogCatInterface) Class.forName("com.alipay.android.phone.mobilesdk.socketcraft.platform.logcat.JavaSCLogCatImpl").newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final SCLogCatInterface createAndroidLogImpl() {
        try {
            f5113a.info("enter SCLogCatInterface");
            return (SCLogCatInterface) Class.forName("com.alipay.android.phone.mobilesdk.socketcraft.integrated.logcat.AndroidSCLogCatImpl").newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final SCLogCatInterface createAndroidMPaaSLogImpl() {
        try {
            f5113a.info("enter createAndroidMPaaSLogImpl");
            return (SCLogCatInterface) Class.forName("com.alipay.android.phone.mobilesdk.socketcraft.integrated.logcat.MPaaSSCLogCatImpl").newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static final MonitorPrinter createMPaaSMonitorPrinter() {
        try {
            f5113a.info("enter createMPaaSMonitorPrinter");
            return (MonitorPrinter) Class.forName("com.alipay.android.phone.mobilesdk.socketcraft.integrated.monitor.MPaaSMonitorPrinter").newInstance();
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
