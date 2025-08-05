package com.alipay.bifrost;

import android.content.Context;
import android.os.Build;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BifrostEnvUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Context f5243a;

    public static final void setContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{context});
        } else {
            f5243a = context;
        }
    }

    public static final Context getContext() {
        Context context = f5243a;
        if (context != null) {
            return context;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            try {
                Context context2 = (Context) Class.forName(ProcessUtils.ACTIVITY_THREAD).getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
                f5243a = context2;
                if (context2 != null) {
                    return f5243a;
                }
                LogCatUtil.warn("bifrostEnvUtils", "context from ActivityThread is null");
            } catch (Throwable th) {
                LogCatUtil.error("bifrostEnvUtils", "context from ActivityThread exception", th);
            }
        }
        return f5243a;
    }
}
