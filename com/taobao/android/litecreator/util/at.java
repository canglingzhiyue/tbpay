package com.taobao.android.litecreator.util;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import tb.kge;

/* loaded from: classes5.dex */
public class at {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final SimpleDateFormat f13489a;

    static {
        kge.a(-206505732);
        f13489a = new SimpleDateFormat("mm:ss");
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("780680c4", new Object[]{new Long(j)});
        }
        long j2 = ((int) j) % 1000;
        if (j2 > 0) {
            j = (j + 1000) - j2;
        }
        return f13489a.format(Long.valueOf(j));
    }

    public static String b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c2381a05", new Object[]{new Long(j)});
        }
        if (Float.compare(Math.round(((float) (j / 1000)) / ((float) 1000)), 1.0f) >= 0) {
            j += 1000;
        }
        f13489a.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return f13489a.format(Long.valueOf(j));
    }

    public static String c(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c69b346", new Object[]{new Long(j)}) : f13489a.format(new Date(j));
    }

    public static String a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2c07bca8", new Object[]{new Long(j), new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(((float) j) / 1000.0f));
        sb.append(z ? "s" : "");
        return sb.toString();
    }

    public static String b(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("28094b87", new Object[]{new Long(j), new Boolean(z)});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(((float) j) / 1000.0f)));
        sb.append(z ? "s" : "");
        return sb.toString();
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue();
        }
        try {
            return TextUtils.isEmpty(str) ? j : Long.parseLong(str);
        } catch (Throwable unused) {
            return j;
        }
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return TextUtils.isEmpty(str) ? i : Integer.parseInt(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static float a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6251234", new Object[]{obj})).floatValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue();
        }
        if (!(obj instanceof BigDecimal)) {
            return 0.0f;
        }
        return ((BigDecimal) obj).floatValue();
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue();
        }
        try {
            return TextUtils.isEmpty(str) ? f : Float.parseFloat(str);
        } catch (Exception unused) {
            return f;
        }
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            return TextUtils.isEmpty(str) ? z : Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public static boolean b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7d257bc5", new Object[]{str, new Boolean(z)})).booleanValue();
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            if (!str.equalsIgnoreCase("true")) {
                if (!str.equalsIgnoreCase("1")) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return z;
        }
    }

    public static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return TextUtils.isEmpty(str) ? i : Color.parseColor(str);
        } catch (Throwable unused) {
            return i;
        }
    }

    public static int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{str})).intValue() : b(str, 0);
    }

    public static String d(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("569b4c87", new Object[]{new Long(j)}) : (j / 1000) % 60 > 10 ? String.format("%.1f", Float.valueOf(((float) j) / 60000.0f)) : String.format("%d", Long.valueOf(j / 60000));
    }

    public static List<String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{str, str2});
        }
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Arrays.asList(str.split(str2));
    }

    public static String a(JSONObject jSONObject, String str, String... strArr) {
        JSONObject a2;
        String string;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e22343b3", new Object[]{jSONObject, str, strArr}) : (strArr == null || strArr.length == 0 || (a2 = a(jSONObject, strArr.length - 1, strArr)) == null || (string = a2.getString(strArr[strArr.length - 1])) == null) ? str : string;
    }

    private static JSONObject a(JSONObject jSONObject, int i, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5cf9f7e4", new Object[]{jSONObject, new Integer(i), strArr});
        }
        if (strArr == null || i == 0) {
            return jSONObject;
        }
        if (jSONObject == null || strArr.length == 0 || strArr.length < i) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            try {
                jSONObject = jSONObject.getJSONObject(strArr[i2]);
                if (jSONObject == null) {
                    return null;
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return jSONObject;
    }

    public static String a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(context.getAssets(), str)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (IOException e) {
                        e = e;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        k.a(bufferedReader);
                        return sb.toString();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        k.a(bufferedReader);
                        throw th;
                    }
                }
                k.a(bufferedReader2);
            } catch (IOException e2) {
                e = e2;
            }
            return sb.toString();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(String... strArr) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a51c09c9", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (str.contains(",")) {
                    for (String str2 : str.split(",")) {
                        if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                            arrayList.add(str2);
                        }
                    }
                } else if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append((String) arrayList.get(i));
        }
        return sb.toString();
    }

    public static String a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe45281d", new Object[]{list, str});
        }
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            if (i < size - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String a(Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, str, str2});
        }
        if (map == null || map.isEmpty()) {
            return "";
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            str2 = "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z) {
                sb.append(str2);
            }
            sb.append(entry.getKey());
            sb.append(str);
            sb.append(entry.getValue());
            z = false;
        }
        return sb.toString();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
