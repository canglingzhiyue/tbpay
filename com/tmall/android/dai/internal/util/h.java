package com.tmall.android.dai.internal.util;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.desc.MRTFilesDescription;
import com.tmall.android.dai.DAI;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import tb.dvq;
import tb.kge;
import tb.rkq;

/* loaded from: classes.dex */
public final class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Application f23716a;

    static {
        kge.a(-2067215755);
    }

    public static synchronized Application a() {
        synchronized (h.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Application) ipChange.ipc$dispatch("f921f837", new Object[0]);
            }
            if (f23716a == null) {
                f23716a = b();
            }
            return f23716a;
        }
    }

    private static Application b() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            declaredField.setAccessible(true);
            return (Application) declaredField.get(declaredMethod.invoke(null, new Object[0]));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        if (str == null) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static void a(String str, String str2, Map<String, Object> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feaf5d6b", new Object[]{str, str2, map, new Boolean(z)});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.taobao.mrt.utils.a.e("Util", "Intent广播发送！broadcastName=" + str2 + ",modelName=" + str2);
            str = str2;
        }
        try {
            Intent intent = new Intent(DAI.ACTION_COMPUTE_COMPLETE);
            intent.setPackage(rkq.d().e().getPackageName());
            intent.setData(Uri.fromParts("DAI_" + str, "com.tmall.android.dai", null));
            intent.putExtra("com.tmall.android.dai.intent.extra.RESULT", z);
            intent.putExtra("com.tmall.android.dai.intent.extra.MODEL_NAME", str2);
            if (map != null && map.size() > 0) {
                intent.putExtra("com.tmall.android.dai.intent.extra.OUTPUT_DATA", new HashMap(map));
            }
            rkq.d().e().sendBroadcast(intent);
            com.taobao.mrt.utils.a.e("Util", "Intent广播发送成功！broadcastName=" + str + ",modelName=" + str2);
        } catch (Throwable th) {
            com.taobao.mrt.utils.a.c("Util", "Intent广播发送失败！broadcastName=" + str + ",modelName=" + str2, th);
        }
    }

    public static void a(String str, MRTFilesDescription mRTFilesDescription, int i, boolean z) {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80e8de65", new Object[]{str, mRTFilesDescription, new Integer(i), new Boolean(z)});
            return;
        }
        Intent intent = new Intent(DAI.WALLE_RESOURCE_DOWNLOAD);
        StringBuilder sb = new StringBuilder();
        int size = mRTFilesDescription.files.size();
        for (String str2 : mRTFilesDescription.files.keySet()) {
            sb.append(str2);
            if (i2 < size - 1) {
                sb.append(",");
            }
            i2++;
        }
        intent.putExtra("name", str);
        intent.putExtra(dvq.FILES_DIR_NAME, sb.toString());
        intent.putExtra("status", i);
        intent.putExtra("result", z);
        LocalBroadcastManager.getInstance(rkq.d().e()).sendBroadcast(intent);
    }
}
