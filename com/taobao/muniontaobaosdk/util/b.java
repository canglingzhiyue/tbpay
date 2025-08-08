package com.taobao.muniontaobaosdk.util;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.zip.CRC32;
import tb.kge;

/* loaded from: classes7.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f18296a;
    private static String b;

    static {
        kge.a(1775819719);
    }

    public static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : str == null ? "" : str;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        try {
            return String.format("%032x", new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes())));
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : str == null || str.length() == 0;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{str})).booleanValue() : !b(str);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : a(Global.getApplication());
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (b == null) {
            f18296a = MunionDeviceUtil.getUtdid(context);
            CRC32 crc32 = new CRC32();
            crc32.update(f18296a.getBytes());
            b = String.valueOf(crc32.getValue());
        }
        return b + System.currentTimeMillis() + new Random().nextInt(10000);
    }

    public static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        return StringUtils.join(",", arrayList);
    }

    public static String c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28f46725", new Object[]{map});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
        }
        return StringUtils.join(",", arrayList);
    }

    public static String a(Throwable th, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d959a93", new Object[]{th, new Integer(i), new Integer(i2)});
        }
        if (th == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (int i3 = i; i3 < stackTrace.length && i3 < i + i2; i3++) {
                    if (sb.length() > 1) {
                        sb.append("<-");
                    }
                    sb.append(stackTrace[i3].getClassName());
                    sb.append("::");
                    sb.append(stackTrace[i3].getMethodName());
                }
            }
        } catch (Throwable unused) {
        }
        return "track=" + sb.toString();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : UUID.randomUUID().toString().replace("-", "");
    }

    public static String b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("154c93a4", new Object[]{map});
        }
        if (map != null) {
            return JSONObject.toJSONString(map);
        }
        return null;
    }
}
