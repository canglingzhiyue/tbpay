package com.alibaba.ariver.kernel.common.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public class TypeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(371298148);
    }

    private static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : j <= 16777215 ? j | (-16777216) : j;
    }

    public static Integer parseColorInt(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("39ad7f69", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            RVLogger.e("parseColorException!", th);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            if (str.charAt(0) == '#') {
                return Integer.valueOf((int) a(Long.parseLong(str.substring(1), 16)));
            }
            return Integer.valueOf((int) a(Integer.parseInt(str)));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf((int) a(((Integer) obj).intValue()));
        }
        return null;
    }

    public static Long parseColorLong(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("680a9686", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        try {
        } catch (Throwable th) {
            RVLogger.e("parseColorException!", th);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            if (str.charAt(0) == '#') {
                return Long.valueOf(a(Long.parseLong(str.substring(1), 16)));
            }
            return Long.valueOf(a(Long.parseLong(str)));
        } else if (obj instanceof Integer) {
            return Long.valueOf(a(((Integer) obj).intValue()));
        } else {
            if (obj instanceof Long) {
                return (Long) obj;
            }
            return null;
        }
    }

    public static double parseDouble(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43fb87e3", new Object[]{str})).doubleValue();
        }
        if (StringUtils.isEmpty(str)) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            RVLogger.e("parse double exception.", th);
            return mto.a.GEO_NOT_SUPPORT;
        }
    }

    public static int parseInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable th) {
            RVLogger.e("parse int exception.", th);
            return 0;
        }
    }

    public static long parseLong(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6eaba914", new Object[]{str})).longValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Throwable th) {
            RVLogger.e("parse long exception.", th);
            return 0L;
        }
    }

    public static float parseFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Throwable th) {
            RVLogger.e("parse long exception.", th);
            return 0.0f;
        }
    }
}
