package com.alipay.mobile.common.transport.utils;

import android.content.Context;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class TransportEnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f5639a;

    public static final void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else {
            f5639a = context;
        }
    }

    public static final Context getContext() {
        Context context = f5639a;
        if (context != null) {
            return context;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                Context context2 = (Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                f5639a = context2;
                if (context2 != null) {
                    return f5639a;
                }
                LogCatUtil.warn("TransportEnvUtil", "context from ActivityThread is null");
            } catch (Throwable th) {
                LogCatUtil.error("TransportEnvUtil", "context from ActivityThread exception", th);
            }
        }
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                Context context3 = (Context) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(null, new Object[0]);
                f5639a = context3;
                return context3;
            } catch (Throwable th2) {
                LogCatUtil.error("TransportEnvUtil", "[getContext] getInitialApplication failed, context is null. Exception: " + th2.toString());
            }
        }
        try {
            Context context4 = (Context) Class.forName("com.alipay.mobile.quinox.LauncherApplication").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
            f5639a = context4;
            if (context4 == null) {
                LogCatUtil.warn("TransportEnvUtil", "context from LauncherApplication is null");
            }
        } catch (Throwable th3) {
            LogCatUtil.error("TransportEnvUtil", "context from LauncherApplication exception", th3);
        }
        return f5639a;
    }

    public static final boolean isRunningJunitEnv() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("883c93ff", new Object[0])).booleanValue() : StringUtils.equals(System.getProperty("OS_ENV"), "OS_ENV_JUNIT");
    }

    public static final boolean isRunningWalletEnv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94f7098a", new Object[0])).booleanValue();
        }
        String property = System.getProperty("OS_ENV");
        if (!StringUtils.isEmpty(property)) {
            return StringUtils.equals(property, "OS_ENV_WALLET");
        }
        return true;
    }
}
