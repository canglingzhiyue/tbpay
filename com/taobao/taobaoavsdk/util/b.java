package com.taobao.taobaoavsdk.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import tb.ddc;
import tb.kge;
import tb.mto;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static double f21343a;
    private static String b;
    private static boolean c;
    private static float d;

    static {
        kge.a(43673252);
        f21343a = mto.a.GEO_NOT_SUPPORT;
        b = null;
        c = false;
        d = 0.0f;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3dd7e566", new Object[]{str})).intValue();
        }
        if (StringUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{str})).longValue();
        }
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static float d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d23b17e5", new Object[]{str})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static Double e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("448c726a", new Object[]{str});
        }
        double d2 = mto.a.GEO_NOT_SUPPORT;
        if (str == null) {
            return Double.valueOf((double) mto.a.GEO_NOT_SUPPORT);
        }
        try {
            d2 = Double.parseDouble(str);
        } catch (Exception unused) {
        }
        return Double.valueOf(d2);
    }

    public static String a(String str, StringBuilder sb) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9311c587", new Object[]{str, sb});
        }
        try {
            Uri parse = Uri.parse(str);
            String encodedQuery = parse.getEncodedQuery();
            if (StringUtils.isEmpty(encodedQuery)) {
                str2 = sb.toString();
            } else {
                str2 = ((Object) sb) + "&" + encodedQuery;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme()).encodedAuthority(parse.getEncodedAuthority()).encodedPath(parse.getEncodedPath()).encodedQuery(str2).fragment(parse.getEncodedFragment());
            return builder.build().toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        try {
            Uri parse = Uri.parse(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(parse.getScheme()).encodedAuthority(parse.getHost()).encodedPath(str2);
            return builder.build().toString();
        } catch (Exception e) {
            AVSDKLog.e(com.taobao.taobaoavsdk.Tracer.c.MODULE_SDK_PAGE, "replaceUriPath error " + e.toString());
            return str;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("929ad04a", new Object[]{str, str2, str3})).booleanValue();
        }
        ArrayList<String> arrayList = null;
        try {
            JSONArray parseArray = JSON.parseArray(str2);
            if (parseArray.size() > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < parseArray.size(); i++) {
                    if (!StringUtils.isEmpty(parseArray.getString(i))) {
                        arrayList.add(parseArray.getString(i));
                    }
                }
            }
            if (!StringUtils.isEmpty(str) && arrayList != null) {
                for (String str4 : arrayList) {
                    if (!StringUtils.isEmpty(str4) && (str4.equalsIgnoreCase(str) || str4.equals(str3))) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static List<String> a(String str, Boolean[] boolArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("22f7e73d", new Object[]{str, boolArr});
        }
        try {
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray.size() <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < parseArray.size(); i++) {
                try {
                    if (!StringUtils.isEmpty(parseArray.getString(i))) {
                        String string = parseArray.getString(i);
                        if (boolArr != null && "*".equals(string)) {
                            boolArr[0] = true;
                            return arrayList;
                        }
                        arrayList.add(string);
                    }
                } catch (Throwable unused) {
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
            if ("*".equals(str2)) {
                return true;
            }
            Boolean[] boolArr = {false};
            List<String> a2 = a(str2, boolArr);
            if (boolArr[0].booleanValue()) {
                return true;
            }
            if (!StringUtils.isEmpty(str) && a2 != null) {
                for (String str3 : a2) {
                    if (!StringUtils.isEmpty(str3)) {
                        if (str3.equalsIgnoreCase(str)) {
                            return true;
                        }
                        if ("TRIVER_*".equals(str3) && str.startsWith("TRIVER_")) {
                            return true;
                        }
                        if ("SPM_*".equals(str3) && str.startsWith("SPM_")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str)) {
            if ("*".equals(str2)) {
                return true;
            }
            Boolean[] boolArr = {false};
            List<String> a2 = a(str2, boolArr);
            if (boolArr[0].booleanValue()) {
                return true;
            }
            if (!StringUtils.isEmpty(str) && a2 != null) {
                for (String str3 : a2) {
                    if (!StringUtils.isEmpty(str3) && Pattern.matches(str3, str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f180e83", new Object[]{str, str2})).booleanValue();
        }
        List<String> a2 = a(str2, (Boolean[]) null);
        if (!StringUtils.isEmpty(str) && a2 != null) {
            for (String str3 : a2) {
                if (!StringUtils.isEmpty(str3) && str.startsWith(str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20f12ca9", new Object[]{new Integer(i), str})).booleanValue();
        }
        if ("*".equals(str)) {
            return true;
        }
        ArrayList<Integer> arrayList = null;
        try {
            JSONArray parseArray = JSON.parseArray(str);
            if (parseArray.size() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < parseArray.size(); i2++) {
                    try {
                        if (!StringUtils.isEmpty(parseArray.getString(i2))) {
                            arrayList2.add(parseArray.getInteger(i2));
                        }
                    } catch (Throwable unused) {
                    }
                }
                arrayList = arrayList2;
            }
        } catch (Throwable unused2) {
        }
        if (arrayList != null) {
            for (Integer num : arrayList) {
                if (num.intValue() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int a(ddc ddcVar, String str, String str2, String str3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb0c7d23", new Object[]{ddcVar, str, str2, str3, new Integer(i)})).intValue();
        }
        String str4 = null;
        try {
            JSONObject parseObject = JSON.parseObject(ddcVar.getConfig(str, "PlayerCoreType1", null));
            str4 = parseObject.getString(str3.toUpperCase());
            if (StringUtils.isEmpty(str4) && !StringUtils.isEmpty(str2)) {
                str4 = parseObject.getString((str2 + "-*").toUpperCase());
            }
            if (StringUtils.isEmpty(str4)) {
                str4 = parseObject.getString("ALL_BIZCODE");
            }
        } catch (Throwable unused) {
        }
        if (!StringUtils.isEmpty(str4)) {
            if ("mediaplayer".equals(str4)) {
                return 2;
            }
            if ("ijkplayer".equals(str4)) {
                return 1;
            }
            if ("taobaoplayer".equals(str4)) {
                return 3;
            }
        }
        return i;
    }

    public static int a(ddc ddcVar, String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eee77d6d", new Object[]{ddcVar, str, str2, new Integer(i)})).intValue();
        }
        String str3 = null;
        try {
            JSONObject parseObject = JSON.parseObject(ddcVar.getConfig(str, "PlayerCoreType1", null));
            str3 = parseObject.getString(str2.toUpperCase());
            if (StringUtils.isEmpty(str3)) {
                str3 = parseObject.getString("ALL_BIZCODE");
            }
        } catch (Throwable unused) {
        }
        if (!StringUtils.isEmpty(str3)) {
            if ("mediaplayer".equals(str3)) {
                return 2;
            }
            if ("ijkplayer".equals(str3)) {
                return 1;
            }
            if ("taobaoplayer".equals(str3)) {
                return 3;
            }
        }
        return i;
    }

    public static String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8cbeb20", new Object[]{str, str2});
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            try {
                return Uri.parse(str).getQueryParameter(str2);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static long a(ddc ddcVar, String str, String str2, String str3) {
        String str4;
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("71637c27", new Object[]{ddcVar, str, str2, str3})).longValue();
        }
        if (ddcVar != null && !StringUtils.isEmpty(str2)) {
            if (!StringUtils.isEmpty(str3)) {
                str4 = str2 + "-" + str3;
            } else {
                str4 = str2;
            }
            String str5 = null;
            try {
                config = ddcVar.getConfig(str, "GrtnInitialDelayWithBusinessIds", null);
            } catch (Throwable unused) {
            }
            if (StringUtils.isEmpty(config)) {
                return 0L;
            }
            JSONObject parseObject = JSON.parseObject(config);
            str5 = parseObject.getString(str4.toUpperCase());
            if (StringUtils.isEmpty(str5) && !StringUtils.isEmpty(str2)) {
                str5 = parseObject.getString((str2 + "-*").toUpperCase());
            }
            if (StringUtils.isEmpty(str5)) {
                str5 = parseObject.getString("ALL_BIZCODE");
            }
            if (StringUtils.isEmpty(str5)) {
                return 0L;
            }
            long c2 = c(str5);
            if (c2 >= 10 && c2 <= 10000) {
                return c2;
            }
        }
        return 0L;
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        if ("qcom".equals(Build.HARDWARE)) {
            return Build.BOARD;
        }
        return Build.HARDWARE;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        String lowerCase = Build.HARDWARE.toLowerCase();
        return lowerCase.contains("qcom") || lowerCase.contains("qualcomm") || lowerCase.equalsIgnoreCase("msm") || lowerCase.startsWith("sdm");
    }

    public static String a(int i) {
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        String str = "";
        InputStream inputStream = null;
        try {
            inputStream = new ProcessBuilder("/system/bin/cat", String.format("/sys/devices/system/cpu/cpu%d/cpufreq/cpuinfo_max_freq", Integer.valueOf(i))).start().getInputStream();
            if (inputStream != null) {
                while (inputStream.read(new byte[24]) != -1) {
                    str = str + new String(bArr);
                }
                inputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            str = "N/A";
        }
        c.a("CpuManager", "CPU max freq: " + str.trim());
        return str.trim();
    }

    /* loaded from: classes8.dex */
    public class a implements FileFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1943859185);
            kge.a(-1123682416);
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("50e018ca", new Object[]{this, file})).booleanValue() : Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new a());
            c.a("CpuManager", "CPU Count: " + listFiles.length);
            return listFiles.length;
        } catch (Exception e) {
            c.a("CpuManager", "CPU Count: Failed.");
            e.printStackTrace();
            return 1;
        }
    }

    public static String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75b9023f", new Object[]{str, str2});
        }
        return str + "_" + str2;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (b == null) {
            synchronized (b.class) {
                if (context == null) {
                    return "";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("appVersion/");
                try {
                    sb.append(context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName);
                } catch (PackageManager.NameNotFoundException unused) {
                    sb.append("unknown");
                }
                sb.append(";appID/");
                sb.append(context.getPackageName());
                sb.append(";systemVersion/");
                sb.append(Build.VERSION.SDK_INT);
                sb.append(";systemName/Android");
                b = sb.toString();
            }
        }
        return b;
    }

    public static String a(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e49249dd", new Object[]{str, list});
        }
        if (list == null || list.size() == 0) {
            return str;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            str = str.replaceAll("&?" + it.next() + "=[^&]*", "");
        }
        return str.replaceFirst("[?]&", "?");
    }

    public static HashMap<String, String> b(String str, String str2, String str3) {
        String[] split;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("da873eaa", new Object[]{str, str2, str3});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
            for (String str4 : str.split(str2)) {
                int indexOf = str4.indexOf(str3);
                int length = str4.length();
                if (indexOf > 0 && (i = indexOf + 1) < length) {
                    hashMap.put(str4.substring(0, indexOf), str4.substring(i, length));
                }
            }
        }
        return hashMap;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        return System.currentTimeMillis() + "_" + new Random().nextInt(1000);
    }

    public static boolean g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24f88f86", new Object[]{str, str2})).booleanValue();
        }
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            return false;
        }
        return length == length2 ? str.equalsIgnoreCase(str2) : str.substring(0, length2).equalsIgnoreCase(str2);
    }
}
