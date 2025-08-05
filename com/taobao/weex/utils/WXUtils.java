package com.taobao.weex.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.util.LruCache;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.media.MediaConstant;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.WXSDKManager;
import com.taobao.weex.adapter.IWXConfigAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.kge;
import tb.mto;

/* loaded from: classes9.dex */
public class WXUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char PERCENT = '%';

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Integer> f23540a;
    private static Pattern b;
    private static final long c;
    private static int d;

    static {
        kge.a(-788094761);
        f23540a = new LruCache<>(64);
        c = System.currentTimeMillis() - SystemClock.uptimeMillis();
        d = new Random().nextInt(100);
    }

    public static boolean isUiThread() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("98bb3193", new Object[0])).booleanValue() : Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
    }

    public static boolean isUndefined(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("711fec97", new Object[]{new Float(f)})).booleanValue() : Float.isNaN(f);
    }

    public static float getFloatByViewport(WXSDKInstance wXSDKInstance, Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e503dd3", new Object[]{wXSDKInstance, obj, new Integer(i)})).floatValue();
        }
        if (obj == null) {
            return Float.NaN;
        }
        String trim = obj.toString().trim();
        if (!"auto".equals(trim) && !"undefined".equals(trim) && !TextUtils.isEmpty(trim)) {
            if (trim.endsWith("wx")) {
                try {
                    return a(trim, i);
                } catch (NumberFormatException e) {
                    WXLogUtils.e("Argument format error! value is " + obj, e);
                } catch (Exception e2) {
                    WXLogUtils.e("Argument error! value is " + obj, e2);
                }
            } else if (trim.endsWith("px")) {
                try {
                    return Float.parseFloat(trim.substring(0, trim.indexOf("px")));
                } catch (NumberFormatException e3) {
                    WXLogUtils.e("Argument format error! value is " + obj, e3);
                } catch (Exception e4) {
                    WXLogUtils.e("Argument error! value is " + obj, e4);
                }
            } else {
                try {
                    return Float.parseFloat(trim);
                } catch (NumberFormatException e5) {
                    WXLogUtils.e("Argument format error! value is " + obj, e5);
                } catch (Exception e6) {
                    WXLogUtils.e("Argument error! value is " + obj, e6);
                }
            }
        }
        return Float.NaN;
    }

    public static float getFloat(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("19eb28b9", new Object[]{obj})).floatValue() : getFloat(obj, Float.valueOf(Float.NaN)).floatValue();
    }

    public static Float getFloat(Object obj, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("31fbba79", new Object[]{obj, f});
        }
        if (obj == null) {
            return f;
        }
        String trim = obj.toString().trim();
        if (!"auto".equals(trim) && !"undefined".equals(trim) && !TextUtils.isEmpty(trim)) {
            if (trim.endsWith("wx")) {
                try {
                    return Float.valueOf(a(trim, 750));
                } catch (NumberFormatException e) {
                    WXLogUtils.e("Argument format error! value is " + obj, e);
                } catch (Exception e2) {
                    WXLogUtils.e("Argument error! value is " + obj, e2);
                }
            } else if (trim.endsWith("px")) {
                try {
                    return Float.valueOf(Float.parseFloat(trim.substring(0, trim.indexOf("px"))));
                } catch (NumberFormatException e3) {
                    WXLogUtils.e("Argument format error! value is " + obj, e3);
                } catch (Exception e4) {
                    WXLogUtils.e("Argument error! value is " + obj, e4);
                }
            } else {
                try {
                    return Float.valueOf(Float.parseFloat(trim));
                } catch (NumberFormatException e5) {
                    WXLogUtils.e("Argument format error! value is " + obj, e5);
                } catch (Exception e6) {
                    WXLogUtils.e("Argument error! value is " + obj, e6);
                }
            }
        }
        return f;
    }

    private static float a(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8123ad01", new Object[]{str, new Integer(i)})).floatValue();
        }
        if (str == null) {
            return 0.0f;
        }
        if (str.endsWith("wx")) {
            str = str.substring(0, str.indexOf("wx"));
        }
        return ((WXEnvironment.sApplication.getResources().getDisplayMetrics().density * Float.valueOf(Float.parseFloat(str)).floatValue()) * i) / WXViewUtils.getScreenWidth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
        return -r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static float fastGetFloat(java.lang.String r10, int r11) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.weex.utils.WXUtils.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L21
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r10
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r11)
            r1[r3] = r10
            java.lang.String r10 = "4a337b20"
            java.lang.Object r10 = r0.ipc$dispatch(r10, r1)
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            return r10
        L21:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r1 = 0
            if (r0 != 0) goto L90
            char r0 = r10.charAt(r2)
            r4 = 45
            if (r0 != r4) goto L33
            r0 = 1
            r4 = 0
            goto L3f
        L33:
            char r0 = r10.charAt(r2)
            r4 = 43
            if (r0 != r4) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            r4 = 1
        L3f:
            int r5 = r10.length()
            r6 = 57
            r7 = 48
            if (r0 >= r5) goto L5d
            char r5 = r10.charAt(r0)
            if (r5 < r7) goto L5d
            if (r5 > r6) goto L5d
            r6 = 1092616192(0x41200000, float:10.0)
            float r1 = r1 * r6
            float r5 = (float) r5
            float r1 = r1 + r5
            r5 = 1111490560(0x42400000, float:48.0)
            float r1 = r1 - r5
            int r0 = r0 + 1
            goto L3f
        L5d:
            int r5 = r10.length()
            if (r0 >= r5) goto L8d
            char r5 = r10.charAt(r0)
            r8 = 46
            if (r5 != r8) goto L8d
            int r0 = r0 + r3
            r3 = 10
            r5 = 10
        L70:
            int r8 = r10.length()
            if (r0 >= r8) goto L8d
            if (r2 >= r11) goto L8d
            char r8 = r10.charAt(r0)
            if (r8 < r7) goto L8d
            if (r8 > r6) goto L8d
            int r8 = r8 + (-48)
            float r8 = (float) r8
            float r9 = (float) r5
            float r8 = r8 / r9
            float r1 = r1 + r8
            int r5 = r5 * 10
            int r0 = r0 + 1
            int r2 = r2 + 1
            goto L70
        L8d:
            if (r4 != 0) goto L90
            float r1 = -r1
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.weex.utils.WXUtils.fastGetFloat(java.lang.String, int):float");
    }

    public static float fastGetFloat(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("264be23", new Object[]{str})).floatValue() : fastGetFloat(str, Integer.MAX_VALUE);
    }

    public static int parseInt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19d449c0", new Object[]{str})).intValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !str.contains(".")) {
                return Integer.parseInt(str);
            }
        } catch (NumberFormatException e) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.e(WXLogUtils.getStackTrace(e));
            }
        }
        return 0;
    }

    public static int parseInt(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cc530fd2", new Object[]{obj})).intValue() : parseInt(String.valueOf(obj));
    }

    public static float parseFloat(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c8c56b3c", new Object[]{obj})).floatValue() : parseFloat(String.valueOf(obj));
    }

    public static float parseFloat(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1646a52a", new Object[]{str})).floatValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "null")) {
                return Float.parseFloat(str);
            }
            if (!WXEnvironment.isApkDebugable()) {
                return 0.0f;
            }
            WXLogUtils.e("WXUtils parseFloat illegal value is " + str);
            return 0.0f;
        } catch (NumberFormatException e) {
            if (!WXEnvironment.isApkDebugable()) {
                return 0.0f;
            }
            WXLogUtils.e(WXLogUtils.getStackTrace(e));
            return 0.0f;
        }
    }

    public static int getInt(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("79d4088f", new Object[]{obj})).intValue() : getInteger(obj, 0).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static Integer getInteger(Object obj, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("cedf6113", new Object[]{obj, num});
        }
        if (obj == null) {
            return num;
        }
        String trim = obj.toString().trim();
        Integer num2 = f23540a.get(trim);
        if (num2 != null) {
            return num2;
        }
        String substring = trim.length() >= 2 ? trim.substring(trim.length() - 2, trim.length()) : "";
        if (TextUtils.equals("wx", substring)) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("the value of " + obj + " use wx unit, which will be not supported soon after.");
            }
            try {
                obj = Integer.valueOf((int) a(trim, 750));
            } catch (NumberFormatException e) {
                WXLogUtils.e("Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                WXLogUtils.e("Argument error! value is " + obj, e2);
            }
        } else if (TextUtils.equals("px", substring)) {
            try {
                String substring2 = trim.substring(0, trim.length() - 2);
                if (!TextUtils.isEmpty(substring2) && substring2.contains(".")) {
                    obj = Integer.valueOf((int) parseFloat(substring2));
                } else {
                    obj = Integer.valueOf(Integer.parseInt(substring2));
                }
            } catch (NumberFormatException e3) {
                WXLogUtils.e("Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                WXLogUtils.e("Argument error! value is " + obj, e4);
            }
        } else {
            try {
            } catch (NumberFormatException e5) {
                if (WXEnvironment.isApkDebugable()) {
                    WXLogUtils.w("The parameter format is not supported", e5);
                }
            } catch (Exception e6) {
                WXLogUtils.e("Argument error! value is " + obj, e6);
            }
            if (!TextUtils.isEmpty(trim)) {
                if (trim.contains(".")) {
                    obj = Integer.valueOf((int) parseFloat(trim));
                } else {
                    obj = Integer.valueOf(Integer.parseInt(trim));
                }
            } else {
                if (WXEnvironment.isApkDebugable()) {
                    WXLogUtils.e("Argument value is null, df is" + num);
                }
                obj = num;
            }
        }
        if (obj != 0 && !obj.equals(num)) {
            f23540a.put(trim, obj);
        }
        return obj;
    }

    @Deprecated
    public static long getLong(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("23c88e09", new Object[]{obj})).longValue();
        }
        if (obj == null) {
            return 0L;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("wx")) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("the value of " + obj + " use wx unit, which will be not supported soon after.");
            }
            try {
                return a(trim, 750);
            } catch (NumberFormatException e) {
                WXLogUtils.e("Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                WXLogUtils.e("Argument error! value is " + obj, e2);
            }
        } else if (trim.endsWith("px")) {
            try {
                return Long.parseLong(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e3) {
                WXLogUtils.e("Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                WXLogUtils.e("Argument error! value is " + obj, e4);
            }
        } else {
            try {
                return Long.parseLong(trim);
            } catch (NumberFormatException e5) {
                WXLogUtils.e("Argument format error! value is " + obj, e5);
            } catch (Exception e6) {
                WXLogUtils.e("Argument error! value is " + obj, e6);
            }
        }
        return 0L;
    }

    @Deprecated
    public static double getDouble(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ca0c4018", new Object[]{obj})).doubleValue();
        }
        if (obj == null) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        String trim = obj.toString().trim();
        if (trim.endsWith("wx")) {
            if (WXEnvironment.isApkDebugable()) {
                WXLogUtils.w("the value of " + obj + " use wx unit, which will be not supported soon after.");
            }
            try {
                return a(trim, 750);
            } catch (NumberFormatException e) {
                WXLogUtils.e("Argument format error! value is " + obj, e);
            } catch (Exception e2) {
                WXLogUtils.e("Argument error! value is " + obj, e2);
            }
        } else if (trim.endsWith("px")) {
            try {
                return Double.parseDouble(trim.substring(0, trim.indexOf("px")));
            } catch (NumberFormatException e3) {
                WXLogUtils.e("Argument format error! value is " + obj, e3);
            } catch (Exception e4) {
                WXLogUtils.e("Argument error! value is " + obj, e4);
            }
        } else {
            try {
                return Double.parseDouble(trim);
            } catch (NumberFormatException e5) {
                WXLogUtils.e("Argument format error! value is " + obj, e5);
            } catch (Exception e6) {
                WXLogUtils.e("Argument error! value is " + obj, e6);
            }
        }
        return mto.a.GEO_NOT_SUPPORT;
    }

    @Deprecated
    public static boolean isTabletDevice() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("28591831", new Object[0])).booleanValue() : (WXEnvironment.getApplication().getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    public static Boolean getBoolean(Object obj, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("8e5b7995", new Object[]{obj, bool});
        }
        if (obj == null) {
            return bool;
        }
        if (TextUtils.equals("false", obj.toString())) {
            return false;
        }
        if (!TextUtils.equals("true", obj.toString())) {
            return bool;
        }
        return true;
    }

    public static long getAvailMemory(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d2775bb", new Object[]{context})).longValue();
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        WXLogUtils.w("app AvailMemory ---->>>" + (memoryInfo.availMem / 1048576));
        return memoryInfo.availMem / 1048576;
    }

    public static String getString(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5cf3bb6c", new Object[]{obj, str});
        }
        if (obj == null) {
            return str;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj.toString();
    }

    public static int parseUnitOrPercent(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("634b525a", new Object[]{str, new Integer(i)})).intValue();
        }
        int lastIndexOf = str.lastIndexOf(37);
        if (lastIndexOf != -1) {
            return b(str.substring(0, lastIndexOf), i);
        }
        return parseInt(str);
    }

    private static int b(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7d253be3", new Object[]{str, new Integer(i)})).intValue() : (int) ((Float.parseFloat(str) / 100.0f) * i);
    }

    public static String getBundleBanner(String str) {
        int i;
        int c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae80b4eb", new Object[]{str});
        }
        int indexOf = str.indexOf("/*!");
        if (indexOf == -1 || (c2 = c(str, (i = indexOf + 3))) == -1) {
            return null;
        }
        int i2 = c2 + 1;
        String substring = str.substring(i2, Integer.parseInt(str.substring(i, c2)) + i2);
        int lastIndexOf = substring.lastIndexOf("!*/");
        if (lastIndexOf == -1) {
            return null;
        }
        String substring2 = substring.substring(0, lastIndexOf);
        StringBuilder sb = new StringBuilder();
        for (String str2 : a(substring2)) {
            sb.append(str2.replaceFirst("\\*", ""));
        }
        return sb.toString();
    }

    private static int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7926cac2", new Object[]{str, new Integer(i)})).intValue();
        }
        int indexOf = str.indexOf("\r", i);
        if (indexOf == -1) {
            indexOf = str.indexOf("\n", i);
        }
        return indexOf == -1 ? str.indexOf("\r\n", i) : indexOf;
    }

    private static String[] a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("ad023781", new Object[]{str});
        }
        String[] split = str.split("\r");
        if (split.length == 1) {
            split = str.split("\n");
        }
        return split.length == 1 ? str.split("\r\n") : split;
    }

    public static int getNumberInt(Object obj, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a96ab83", new Object[]{obj, new Integer(i)})).intValue();
        }
        if (obj == null) {
            return i;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        try {
            String obj2 = obj.toString();
            if (obj2.indexOf(46) >= 0) {
                return (int) Float.parseFloat(obj.toString());
            }
            return Integer.parseInt(obj2);
        } catch (Exception unused) {
            return i;
        }
    }

    public static boolean checkGreyConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b4b412", new Object[]{str, str2, str3})).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter == null) {
            return false;
        }
        double d2 = 100.0d;
        double random = Math.random() * 100.0d;
        try {
            d2 = Double.valueOf(wxConfigAdapter.getConfig(str, str2, str3)).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return random < d2;
    }

    public static long getFixUnixTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e59b18ef", new Object[0])).longValue() : c + SystemClock.uptimeMillis();
    }

    public static long getFixUnixTime(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("cdc87d1d", new Object[]{new Long(j)})).longValue() : c + j;
    }

    public static String transformRGB(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de4d7d4e", new Object[]{str});
        }
        if (b == null) {
            b = Pattern.compile("([rR][gG][bB][aA]?)\\((\\d+\\s*),\\s*(\\d+\\s*),\\s*(\\d+\\s*)(?:,\\s*(\\d+(?:\\.\\d+)?))?\\)");
        }
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group();
            str = str.replace(group, "#" + String.format("%8s", Integer.toHexString(WXResourceUtils.getColor(group, -16777216))).replaceAll("\\s", "0"));
        }
        return str;
    }

    public static void commitComponentInvoke(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8378e5f", new Object[]{str, wXSDKInstance});
            return;
        }
        IWXUserTrackAdapter iWXUserTrackAdapter = WXSDKManager.getInstance().getIWXUserTrackAdapter();
        if (iWXUserTrackAdapter == null || wXSDKInstance == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("containerType", "weex");
        hashMap.put("component", str);
        if (!TextUtils.isEmpty(wXSDKInstance.ak())) {
            Uri parse = Uri.parse(wXSDKInstance.ak());
            if (parse != null) {
                try {
                    hashMap.put("bizId", parse.buildUpon().clearQuery().build().toString());
                } catch (Throwable th) {
                    WXLogUtils.e(e.RECORD_CALLMODULEMETHOD, th.getMessage());
                    hashMap.put("bizId", "unknown");
                }
            }
        } else {
            hashMap.put("bizId", "unknown");
        }
        iWXUserTrackAdapter.commit(wXSDKInstance.O(), null, "WeexComponent", null, hashMap);
    }

    public static boolean enableScreenChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20c1993e", new Object[0])).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter == null) {
            return false;
        }
        return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_common_config", "enableScreenChangeListener", "true"));
    }

    public static boolean forceInitCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffc348b", new Object[0])).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter == null) {
            return false;
        }
        return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_common_config", "forceInitCallback", "false"));
    }

    public static boolean disableBuildVersionFix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("43b33c2e", new Object[0])).booleanValue();
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        if (wxConfigAdapter == null) {
            return false;
        }
        return Boolean.parseBoolean(wxConfigAdapter.getConfig("android_weex_common_config", "disableBuildVersionFix", "false"));
    }

    public static String getConfig(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("611c4ee3", new Object[]{str, str2, str3});
        }
        IWXConfigAdapter wxConfigAdapter = WXSDKManager.getInstance().getWxConfigAdapter();
        return wxConfigAdapter != null ? wxConfigAdapter.getConfig(str, str2, str3) : str3;
    }

    public static boolean checkForceDowngrade(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8d73a07", new Object[]{str})).booleanValue();
        }
        if (!b() || d > a().intValue()) {
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return !b(Uri.parse(str).buildUpon().clearQuery().build().toString());
        } catch (Throwable unused) {
            return true;
        }
    }

    private static Integer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5e2c18f", new Object[0]);
        }
        try {
            return Integer.valueOf(Integer.parseInt(getConfig("android_weex_common_config", "weex_downgrade_rate", "-1")));
        } catch (Throwable th) {
            WXLogUtils.e("TBWeexConfigUtils", th);
            return -1;
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equals(getConfig("android_weex_common_config", "enable_weex_downgrade", "false"));
    }

    private static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        try {
            Iterator<Object> it = JSONArray.parseArray(getConfig("android_weex_common_config", "weex_downgrade_blacklist", MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264)).iterator();
            while (it.hasNext()) {
                if (str.contains(String.valueOf(it.next()))) {
                    return true;
                }
            }
        } catch (Throwable th) {
            WXLogUtils.e("TBWeexConfigUtils", th);
        }
        return false;
    }
}
