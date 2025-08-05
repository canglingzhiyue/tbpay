package com.taobao.agoo.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.l;
import com.taobao.accs.utl.m;
import tb.kge;

/* loaded from: classes.dex */
public class AgooUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Integer f8392a;

    static {
        kge.a(1468839284);
        f8392a = null;
    }

    public static boolean isOptimizationEnabled(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2feb6ddb", new Object[]{context})).booleanValue();
        }
        try {
            String[] split = m.i().split(",");
            Pair create = Pair.create(Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[1])));
            int a2 = a(context);
            boolean z = a2 >= ((Integer) create.first).intValue() && a2 <= ((Integer) create.second).intValue();
            if ("OPPO".equals(Build.BRAND)) {
                z = z && UtilityImpl.isAppKeepAlive();
            }
            ALog.e("AgooUtils", "isOptimizationEnabled range", "enabled", Boolean.valueOf(z), "start", create.first, "end", create.second);
            return z;
        } catch (Throwable th) {
            ALog.e("AgooUtils", "isOptimizationEnabled err", th, new Object[0]);
            return false;
        }
    }

    private static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        if (f8392a == null) {
            try {
                String q = l.q(context);
                if (TextUtils.isEmpty(q)) {
                    return -1;
                }
                f8392a = Integer.valueOf(Math.abs(q.hashCode()) % 100);
                ALog.e("AgooUtils", "getAgooBucketId", "pushBucketId", f8392a);
            } catch (Throwable th) {
                ALog.e("AgooUtils", "getAgooBucketId err", th, new Object[0]);
            }
        }
        return f8392a.intValue();
    }
}
