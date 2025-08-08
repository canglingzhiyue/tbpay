package com.uc.webview.internal.setup.component;

import mtopsdk.common.util.StringUtils;
import com.alibaba.wireless.security.SecExceptionCode;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import java.net.URL;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.riy;

/* loaded from: classes9.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static String f23945a = ".ver_info";

    /* loaded from: classes9.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final boolean f23946a;

        static {
            String str = GlobalSettings.get((int) SecExceptionCode.SEC_ERROR_INIT_DELAY_REPORT_ERROR, "");
            f23946a = !StringUtils.isEmpty(str) && !x.a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(long j) {
        long currentTimeMillis = j + System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        return String.format("%02d:%02d:%02d.%03d", Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13)), Integer.valueOf(calendar.get(14)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return str2;
        }
        return str.replace("${NAME}", str2).replace("${ARCH}", EnvInfo.is64Bit() ? "Arm64" : "Arm32");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> String a(List<T> list) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (list == null) {
            str = "null";
        } else if (list.size() == 0) {
            str = "empty";
        } else {
            sb.append(riy.ARRAY_START_STR);
            for (T t : list) {
                sb.append(String.valueOf(t));
                sb.append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            str = riy.ARRAY_END_STR;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> String a(Map<K, V> map) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (map == null || map.size() <= 0) {
            str = "null";
        } else {
            sb.append(riy.BLOCK_START_STR);
            for (K k : map.keySet()) {
                sb.append(String.valueOf(k));
                sb.append(ResponseProtocolType.COMMENT);
                sb.append(map.get(k));
                sb.append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            str = riy.BLOCK_END_STR;
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(Object[] objArr) {
        String str;
        StringBuilder sb = new StringBuilder();
        if (objArr != null) {
            sb.append(riy.ARRAY_START_STR);
            for (Object obj : objArr) {
                sb.append(String.valueOf(obj));
                sb.append(", ");
            }
            if (sb.length() > 2) {
                sb.setLength(sb.length() - 2);
            }
            str = riy.ARRAY_END_STR;
        } else {
            str = "null";
        }
        sb.append(str);
        return sb.toString();
    }

    public static boolean a() {
        return a.f23946a;
    }

    public static boolean a(String str) {
        return "disable".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b() {
        return ((System.currentTimeMillis() + TimeZone.getDefault().getRawOffset()) / 1000) % 86400;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(String str) {
        String str2;
        int lastIndexOf;
        try {
            str2 = new URL(str).getPath();
            if (str2 != null && (lastIndexOf = str2.lastIndexOf(47)) >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
        } catch (Throwable unused) {
            str2 = null;
        }
        if (StringUtils.isEmpty(str2)) {
            int lastIndexOf2 = str2.lastIndexOf(47);
            String substring = lastIndexOf2 > 0 ? str2.substring(lastIndexOf2 + 1) : str2;
            return StringUtils.isEmpty(substring) ? str : substring;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(String str, String str2) {
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !str.equals(str2)) {
            try {
                String[] split = str.split("\\.");
                String[] split2 = str2.split("\\.");
                if (split != null && split.length == 4 && split2 != null && split2.length == 4) {
                    for (int i = 0; i < 3; i++) {
                        if (Integer.valueOf(split[i]).intValue() > Integer.valueOf(split2[i]).intValue()) {
                            return true;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c() {
        return (int) ((b() / 60) / 60);
    }
}
