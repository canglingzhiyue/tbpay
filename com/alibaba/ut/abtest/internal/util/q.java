package com.alibaba.ut.abtest.internal.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cew;
import tb.kge;

/* loaded from: classes.dex */
public final class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-501841170);
    }

    public static String a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b1ea56b8", new Object[]{new Long(j), new Long(j2)});
        }
        return cew.a.TRACK_PREFIX + j + "_" + j2;
    }

    public static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str.split("\\.");
        }
        return null;
    }

    public static String a(Object obj) {
        String simpleName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return simpleName + hashCode;
    }
}
