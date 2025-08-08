package com.alibaba.ut.abtest.bucketing.expression;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ut.abtest.internal.util.s;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-82182036);
    }

    public static boolean a(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("184a7924", new Object[]{obj, obj2})).booleanValue();
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            try {
                String trim = ((String) obj).trim();
                String trim2 = ((String) obj2).trim();
                com.alibaba.ut.abtest.internal.util.h.a("VersionUtils", "version value greaterThan compare: " + trim + "  " + trim2);
                String[] split = trim.split("\\.");
                String[] split2 = trim2.split("\\.");
                for (int i = 0; i < split.length; i++) {
                    if (i >= split2.length) {
                        return true;
                    }
                    if (!split[i].equals(split2[i])) {
                        return s.a(split[i], 0) > s.a(split2[i], 0);
                    }
                }
                return false;
            } catch (Throwable th) {
                com.alibaba.ut.abtest.internal.util.b.a("VersionUtils.greaterThan", th);
            }
        }
        return false;
    }

    public static boolean b(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4eaa425", new Object[]{obj, obj2})).booleanValue();
        }
        if (!(obj instanceof String) || !(obj2 instanceof String)) {
            return false;
        }
        String trim = ((String) obj).trim();
        String trim2 = ((String) obj2).trim();
        com.alibaba.ut.abtest.internal.util.h.a("VersionUtils", "version equal compare: " + trim + "  " + trim2);
        return StringUtils.equals(trim, trim2);
    }
}
