package com.alipay.mobile.verifyidentity.alipay.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.verifyidentity.log.LoggerFactory;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class H5Utils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f5856a = "H5Utils";

    public static void startH5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318c6220", new Object[]{str});
        } else {
            startH5(a(), str);
        }
    }

    public static void startH5(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe6d07fc", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.alipay.android.msp.ui.views.MspWebActivity");
        if (a(context, intent)) {
            intent.putExtra("url", str);
            intent.putExtra("title", "");
            intent.putExtra("type", MspEventTypes.ACTION_STRING_OPENWEB);
            try {
                Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.engine.MicroModuleContext", "getInstance", new Class[0], new Object[0]);
                if (invokeStaticMethod == null) {
                    return;
                }
                ReflectUtils.invokeMethod(invokeStaticMethod, "startActivityByContext", new Class[]{Intent.class}, new Object[]{intent});
                return;
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().error(f5856a, th);
                return;
            }
        }
        LoggerFactory.getTraceLogger().info(f5856a, "收银台H5承载页不可用");
    }

    private static Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("75941360", new Object[0]);
        }
        try {
            Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.mobile.verifyidentity.engine.MicroModuleContext", "getInstance", new Class[0], new Object[0]);
            if (invokeStaticMethod == null) {
                return null;
            }
            return (Context) ReflectUtils.invokeMethod(invokeStaticMethod, "getContext", new Class[0], new Object[0]);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error(f5856a, th);
            return null;
        }
    }

    private static boolean a(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c9cc21", new Object[]{context, intent})).booleanValue();
        }
        ResolveInfo resolveInfo = null;
        if (context != null) {
            try {
                resolveInfo = context.getPackageManager().resolveActivity(intent, 0);
            } catch (Throwable th) {
                LoggerFactory.getTraceLogger().warn(f5856a, th);
            }
        }
        return resolveInfo != null;
    }
}
