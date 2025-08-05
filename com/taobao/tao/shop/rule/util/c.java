package com.taobao.tao.shop.rule.util;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtopsdk.mtop.global.SDKUtils;
import tb.ado;
import tb.kge;

/* loaded from: classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PRE = "majorVersion_";

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f21102a;

    static {
        kge.a(-1444972271);
        f21102a = Pattern.compile("^shop([0-9]+)(\\.m)*(\\.wapa)*(\\.waptest)*\\.(tmall|taobao)\\.com$");
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : !TextUtils.isEmpty(str) && Boolean.TRUE.toString().equals(str);
    }

    public static boolean b(String str) {
        Map<String, String> c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (c = c(str)) == null || !c.containsKey("wh_weex")) {
            return false;
        }
        return Boolean.TRUE.toString().equals(c.get("wh_weex"));
    }

    public static Map<String, String> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e68dc5e9", new Object[]{str});
        }
        if (!TextUtils.isEmpty(str)) {
            return a(Uri.parse(str));
        }
        return null;
    }

    public static Map<String, String> a(Uri uri) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e82965d4", new Object[]{uri});
        }
        Matcher matcher = null;
        if (uri == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String encodedFragment = uri.getEncodedFragment();
        String encodedQuery = uri.getEncodedQuery();
        String[] split = (encodedFragment == null || !encodedFragment.contains("?")) ? null : encodedFragment.split("\\?");
        if (split != null && split.length > 0) {
            encodedFragment = split[0];
            if (split.length > 1) {
                encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + split[1] : split[1];
            }
        }
        if (encodedFragment != null && encodedFragment.contains("&") && (indexOf = encodedFragment.indexOf("&")) > 0) {
            encodedQuery = !TextUtils.isEmpty(encodedQuery) ? encodedQuery + "&" + encodedFragment.substring(indexOf + 1) : encodedFragment.substring(indexOf + 1);
            encodedFragment.substring(0, indexOf);
        }
        String[] split2 = !TextUtils.isEmpty(encodedQuery) ? encodedQuery.split("&") : null;
        if (split2 != null && split2.length > 0) {
            for (String str : split2) {
                String[] split3 = str.split("=");
                if (split3.length == 2) {
                    hashMap.put(split3[0], split3[1]);
                }
            }
        }
        try {
            matcher = f21102a.matcher(uri.getHost());
        } catch (Exception unused) {
        }
        if (matcher != null && matcher.find()) {
            String group = matcher.group(1);
            if (!TextUtils.isEmpty(group)) {
                hashMap.put("shop_id", group);
            }
        }
        return hashMap;
    }

    public static String a(Map<String, ? extends Serializable> map) {
        String str;
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext() && (next = it.next()) != null) {
                if (map.get(next) != null) {
                    sb.append(next);
                    sb.append("=");
                    sb.append(map.get(next));
                    sb.append("&");
                }
            }
            int length = sb.length();
            if (length > 0) {
                str = sb.substring(0, length - 1);
                return str.toString();
            }
        }
        str = "";
        return str.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String d(java.lang.String r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.tao.shop.rule.util.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L15
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            java.lang.String r6 = "f4d254b"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.String r6 = (java.lang.String) r6
            return r6
        L15:
            java.io.File r0 = new java.io.File
            android.app.Application r1 = com.taobao.tao.shop.e.b
            java.io.File r1 = r1.getFilesDir()
            r0.<init>(r1, r6)
            boolean r6 = r0.exists()
            r1 = 0
            if (r6 != 0) goto L28
            return r1
        L28:
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            java.lang.String r0 = "UTF-8"
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L5a
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L7d
            r0.<init>()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L7d
            r3 = 2096(0x830, float:2.937E-42)
            char[] r3 = new char[r3]     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L7d
        L3d:
            int r4 = r6.read(r3)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L7d
            r5 = -1
            if (r4 == r5) goto L48
            r0.append(r3, r2, r4)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L7d
            goto L3d
        L48:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L7d
            r6.close()     // Catch: java.io.IOException -> L50
            goto L54
        L50:
            r6 = move-exception
            r6.printStackTrace()
        L54:
            return r0
        L55:
            r0 = move-exception
            goto L5c
        L57:
            r0 = move-exception
            r6 = r1
            goto L7e
        L5a:
            r0 = move-exception
            r6 = r1
        L5c:
            java.lang.String r2 = "ShopRule"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "getRuleFromFile error,"
            r3.append(r4)     // Catch: java.lang.Throwable -> L7d
            r3.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L7d
            android.util.Log.e(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L7c
            r6.close()     // Catch: java.io.IOException -> L78
            goto L7c
        L78:
            r6 = move-exception
            r6.printStackTrace()
        L7c:
            return r1
        L7d:
            r0 = move-exception
        L7e:
            if (r6 == 0) goto L88
            r6.close()     // Catch: java.io.IOException -> L84
            goto L88
        L84:
            r6 = move-exception
            r6.printStackTrace()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.shop.rule.util.c.d(java.lang.String):java.lang.String");
    }

    public static boolean a(String str, String str2) {
        OutputStreamWriter outputStreamWriter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue();
        }
        OutputStreamWriter outputStreamWriter2 = null;
        File file = new File(com.taobao.tao.shop.e.b.getFilesDir(), str2);
        if (file.exists()) {
            file.delete();
        }
        try {
            try {
                if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                    return false;
                }
                if (file.createNewFile()) {
                    outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
                    try {
                        outputStreamWriter.write(str);
                        outputStreamWriter.flush();
                    } catch (IOException e) {
                        outputStreamWriter2 = outputStreamWriter;
                        e = e;
                        Log.e("ShopRule", "saveRuleFile error," + e + ",rule null? " + TextUtils.isEmpty(str));
                        if (outputStreamWriter2 != null) {
                            try {
                                outputStreamWriter2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        outputStreamWriter2 = outputStreamWriter;
                        if (outputStreamWriter2 != null) {
                            try {
                                outputStreamWriter2.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    outputStreamWriter = null;
                }
                if (outputStreamWriter != null) {
                    try {
                        outputStreamWriter.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return true;
            } catch (IOException e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j)})).longValue() : a() + 28800000 + j;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : Calendar.getInstance().getTimeInMillis() - TimeZone.getDefault().getRawOffset();
    }

    public static long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[0])).longValue();
        }
        long a2 = a(SDKUtils.getTimeOffset() * 1000);
        new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss").format(new Date(a2));
        new SimpleDateFormat("yyyy年MM月dd日   HH:mm:ss").format(new Date());
        return a2;
    }

    private static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONArray parseArray = JSON.parseArray(str2);
                if (parseArray == null) {
                    return false;
                }
                int size = parseArray.size();
                for (int i = 0; i < size; i++) {
                    Object obj = parseArray.get(i);
                    if (obj != null && (obj instanceof String)) {
                        String str3 = (String) obj;
                        if (!TextUtils.isEmpty(str3) && str3.equals(str)) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                Log.e("ShopRule", "getRuleFromFile error," + e);
            }
        }
        return false;
    }

    public static String a(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7974943e", new Object[]{str, str2, new Boolean(z), str3});
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                Uri parse = Uri.parse(str2);
                try {
                    Uri parse2 = Uri.parse(str);
                    StringBuilder sb = new StringBuilder();
                    if (TextUtils.isEmpty(parse.getScheme())) {
                        if (str2.startsWith(ado.URL_SEPARATOR)) {
                            sb.append(com.taobao.vessel.utils.b.HTTPS_SCHEMA);
                        } else {
                            sb.append(k.HTTPS_PREFIX);
                        }
                    }
                    boolean contains = str2.contains("?");
                    int indexOf = str2.indexOf("?");
                    boolean contains2 = str2.contains("#");
                    int indexOf2 = str2.indexOf("#");
                    if (contains2 && contains) {
                        indexOf = Math.min(indexOf, indexOf2);
                    } else if (contains2) {
                        indexOf = indexOf2;
                    } else if (!contains) {
                        indexOf = str2.length();
                    }
                    String substring = str2.substring(0, indexOf);
                    if (!TextUtils.isEmpty(substring)) {
                        sb.append(substring);
                    }
                    String a2 = a(parse2, parse, z, str3);
                    if (!TextUtils.isEmpty(a2)) {
                        sb.append("?");
                        sb.append(a2);
                    }
                    String encodedFragment = parse.getEncodedFragment();
                    if (!TextUtils.isEmpty(encodedFragment)) {
                        sb.append("#");
                        sb.append(encodedFragment);
                    }
                    return sb.toString();
                } catch (Exception unused) {
                    return str;
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    private static String a(Uri uri, Uri uri2, boolean z, String str) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6f59ba0a", new Object[]{uri, uri2, new Boolean(z), str});
        }
        if (uri == null || uri2 == null) {
            return null;
        }
        Map<String, String> a3 = a(uri);
        Map<String, String> a4 = a(uri2);
        HashMap hashMap = new HashMap();
        if (a3 != null && a3.size() > 0) {
            hashMap.putAll(a3);
        }
        if (a4 != null && a4.size() > 0) {
            hashMap.putAll(a4);
        }
        if (hashMap.size() != 0 && (a2 = a(hashMap, z, str)) != null) {
            return a(a2);
        }
        return null;
    }

    private static Map<String, String> a(Map<String, String> map, boolean z, String str) {
        String next;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1c9f1ad6", new Object[]{map, new Boolean(z), str});
        }
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            String str2 = map.get(next);
            if (str2 != null && (z || !b(next, str))) {
                if (!z) {
                    next = f(next);
                }
                hashMap.put(next, str2);
            }
        }
        return hashMap;
    }

    private static String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "shop_id".equals(str) ? "shopId" : ("uid".equals(str) || "seller_id".equals(str) || "user_id".equals(str) || "userId".equals(str)) ? "sellerId" : "nick".equals(str) ? "sellerNick" : str;
    }

    public static String e(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("666b162a", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Uri parse = Uri.parse(str);
            String str3 = "";
            if (parse.getQuery() == null) {
                str2 = str3;
            } else {
                str2 = "?" + parse.getEncodedQuery();
            }
            if (parse.getEncodedFragment() != null) {
                str3 = "#" + parse.getEncodedFragment();
            }
            return "http://shop.m.taobao.com/shop/allweex_loft_index.htm" + str2 + str3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0668d9", new Object[]{map, str});
        }
        if (map != null && !TextUtils.isEmpty(str)) {
            return map.get(str);
        }
        return null;
    }
}
