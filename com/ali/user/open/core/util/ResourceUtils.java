package com.ali.user.open.core.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.ali.user.open.core.context.KernelContext;
import com.ali.user.open.core.trace.SDKLogger;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class ResourceUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ResourceUtils";

    static {
        kge.a(380438278);
    }

    public static String getString(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44e9ea5c", new Object[]{context, str});
        }
        if (KernelContext.resources != null) {
            return KernelContext.resources.getString(getIdentifier(context, "string", str));
        }
        return context.getResources().getString(getIdentifier(context, "string", str));
    }

    public static String getString(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str}) : getString(KernelContext.getApplicationContext(), str);
    }

    public static int getIdentifier(Context context, String str, String str2) {
        String packageName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d93fce9", new Object[]{context, str, str2})).intValue();
        }
        if (!StringUtils.isEmpty(KernelContext.packageName)) {
            packageName = KernelContext.packageName;
        } else {
            packageName = context.getPackageName();
        }
        SDKLogger.i("resources", "resources = " + KernelContext.resources + " packageName = " + KernelContext.packageName);
        if (KernelContext.resources != null) {
            return KernelContext.resources.getIdentifier(str2, str, packageName);
        }
        return context.getResources().getIdentifier(str2, str, packageName);
    }
}
