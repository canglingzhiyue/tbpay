package com.alibaba.wireless.aliprivacyext;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.wireless.aliprivacy.AuthStatus;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4239a;

        static {
            int[] iArr = new int[AuthStatus.values().length];
            f4239a = iArr;
            try {
                iArr[AuthStatus.SHOULD_SHOW_RATIONALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4239a[AuthStatus.FIRST_TIME_OR_NEVER_AGAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4239a[AuthStatus.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4239a[AuthStatus.GRANTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int a(AuthStatus authStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17ed6d9b", new Object[]{authStatus})).intValue();
        }
        int i = a.f4239a[authStatus.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return -1;
        }
        return i != 4 ? -3 : 1;
    }

    public static JSONArray b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("fe97466b", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseArray(str);
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static Map<String, Object> b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("567fb0fa", new Object[]{obj});
        }
        try {
            if (obj instanceof String) {
                return (Map) JSON.parseObject((String) obj, Map.class);
            }
            return (Map) JSON.toJSON(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T> List<T> b(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1bbed2dd", new Object[]{str, cls});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseArray(str, cls);
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static String c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a6ba28c2", new Object[]{context});
        }
        int identifier = context.getResources().getIdentifier("ttid", "string", context.getPackageName());
        return identifier > 0 ? context.getString(identifier) : "";
    }

    public static JSONObject a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("73d7af52", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static String a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{obj});
        }
        if (obj == null) {
            return "";
        }
        try {
            return JSON.toJSONString(obj);
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "toJSON error:", th);
            return "";
        }
    }

    public static <T> T a(String str, Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("21de4147", new Object[]{str, cls});
        }
        if (str == null) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, cls);
        } catch (Throwable th) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "string2Json error:", th);
            return null;
        }
    }

    public static String b(Context context) {
        PackageManager packageManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        PackageInfo packageInfo = null;
        try {
            packageManager = context.getPackageManager();
        } catch (Exception e) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "getAppVersion error", e);
        }
        if (packageManager == null) {
            return null;
        }
        packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
        return packageInfo != null ? packageInfo.versionName : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r4) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.wireless.aliprivacyext.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            java.lang.String r4 = "bbc5dc40"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L15:
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Exception -> L28
            if (r1 != 0) goto L1d
            return r0
        L1d:
            java.lang.String r4 = r4.getPackageName()     // Catch: java.lang.Exception -> L26
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r4, r2)     // Catch: java.lang.Exception -> L26
            goto L31
        L26:
            r4 = move-exception
            goto L2a
        L28:
            r4 = move-exception
            r1 = r0
        L2a:
            java.lang.String r2 = "CommonUtils"
            java.lang.String r3 = "getApplicationName error"
            com.alibaba.wireless.aliprivacy.c.b(r2, r3, r4)
        L31:
            if (r0 == 0) goto L3a
            java.lang.CharSequence r4 = r1.getApplicationLabel(r0)
            java.lang.String r4 = (java.lang.String) r4
            goto L3c
        L3a:
            java.lang.String r4 = ""
        L3c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.aliprivacyext.f.a(android.content.Context):java.lang.String");
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return TextUtils.isEmpty(str) ? i : Integer.parseInt(str);
        } catch (Exception e) {
            com.alibaba.wireless.aliprivacy.c.b("CommonUtils", "strToInt error", e);
            return i;
        }
    }

    private static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        int length = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            j = (j * 31) + charArray[i];
        }
        return Long.MAX_VALUE & j;
    }

    public static boolean a(String str, long j, String str2) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa210a20", new Object[]{str, new Long(j), str2})).booleanValue();
        }
        try {
            long parseLong = Long.parseLong(str2);
            long c = c(str) % j;
            StringBuilder sb = new StringBuilder();
            sb.append("grayCompute result: ");
            i = (c > parseLong ? 1 : (c == parseLong ? 0 : -1));
            sb.append(i < 0);
            com.alibaba.wireless.aliprivacy.c.a("CommonUtils", sb.toString());
        } catch (Throwable unused) {
        }
        return i < 0;
    }
}
