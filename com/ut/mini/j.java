package com.ut.mini;

import android.app.Activity;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import tb.apr;
import tb.aqc;
import tb.kge;
import tb.lyc;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static j f24123a;

    static {
        kge.a(-1517157729);
        f24123a = new j();
    }

    public static j getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("1c45d2af", new Object[0]) : f24123a;
    }

    public void setH5Url(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1b94b1", new Object[]{this, str});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().setH5Url(str);
        }
    }

    public void h5UT(Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80970fce", new Object[]{this, map, obj});
            return;
        }
        if (apr.a()) {
            apr.b("UTHybridHelper", "h5UT view", obj, "dataMap", map);
        }
        if (map == null || map.size() == 0) {
            apr.e("UTHybridHelper", "h5UT dataMap is empty");
            return;
        }
        String str = map.get("functype");
        if (str == null) {
            apr.e("UTHybridHelper", "h5UT funcType is null");
            return;
        }
        String str2 = map.get("utjstype");
        if (str2 != null && !str2.equals("0") && !str2.equals("1")) {
            apr.e("UTHybridHelper", "h5UT utjstype should be 1 or 0 or null");
            return;
        }
        map.remove("functype");
        Date date = new Date();
        if (str.equals("2001")) {
            a(date, map, obj);
            com.ut.mini.internal.f.getInstance().dispatchH5JSCall(obj, map);
            return;
        }
        a(str, date, map);
    }

    public void h5UT2(Map<String, String> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab906ab4", new Object[]{this, map, obj});
            return;
        }
        if (apr.a()) {
            apr.b("UTHybridHelper", "h5UT2 view", obj, "dataMap", map);
        }
        if (map == null || map.size() == 0) {
            apr.e("h5UT", "dataMap is empty");
            return;
        }
        String remove = map.remove("functype");
        if (remove == null) {
            apr.e("h5UT", "funcType is null");
        } else if (remove.equals("page")) {
            map.remove("funcId");
            a(map, obj);
            com.ut.mini.internal.f.getInstance().dispatchH5JSCall(obj, map);
        } else if (!remove.equals("ctrl")) {
        } else {
            a(map);
        }
    }

    private void a(Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else if (map == null || map.size() == 0) {
        } else {
            try {
                i = Integer.parseInt(map.remove("funcId"));
            } catch (Throwable unused) {
                i = -1;
            }
            if (i == -1) {
                return;
            }
            String remove = map.remove("url");
            if (remove == null || aqc.e(remove)) {
                apr.d("h5Ctrl", "pageName is null,return");
                return;
            }
            String remove2 = map.remove("logkey");
            if (remove2 == null || aqc.e(remove2)) {
                apr.d("h5Ctrl", "logkey is null,return");
                return;
            }
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(remove, i, remove2, null, null, map);
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker != null) {
                defaultTracker.send(uTOriginalCustomHitBuilder.build());
            } else {
                apr.e("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
            }
        }
    }

    private void a(Map<String, String> map, Object obj) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a3294b9", new Object[]{this, map, obj});
            return;
        }
        apr.c();
        if (map == null || map.size() == 0) {
            apr.d("h5Page2", "dataMap is null or empty,return");
            return;
        }
        String remove = map.remove("url");
        if (remove == null || aqc.e(remove)) {
            apr.d("h5Page2", "pageName is null,return");
            return;
        }
        String d = q.a().d();
        int i = l.getInstance().c(obj) ? 2001 : 2006;
        HashMap hashMap = new HashMap(map);
        HashMap hashMap2 = new HashMap();
        if (2001 == i) {
            q.a().c(remove);
            Map<String, String> a3 = l.getInstance().a(obj);
            if (a3 != null && a3.size() > 0) {
                hashMap.putAll(a3);
            }
            Map<String, String> b = l.getInstance().b(obj);
            if (b != null && b.size() > 0) {
                hashMap2.putAll(b);
            }
            if ((obj instanceof Activity) && (a2 = a(obj, map, remove, map.get("_h5url"), a3)) != null) {
                hashMap.putAll(a2);
            }
        }
        int i2 = i;
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(remove, i, d, null, null, hashMap);
        uTOriginalCustomHitBuilder.setTmpProperties(hashMap2);
        try {
            String a4 = com.alibaba.analytics.core.config.r.a().a(Uri.parse(map.get("_h5url")), (Map<String, String>) null);
            if (!aqc.e(a4)) {
                uTOriginalCustomHitBuilder.setProperty("_tpk", a4);
            }
        } catch (Throwable th) {
            apr.b(null, th, new Object[0]);
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null) {
            Map<String, String> build = uTOriginalCustomHitBuilder.build();
            if (i2 == 2001) {
                n.a(obj, build);
                a(build, obj, remove, d, hashMap);
            }
            defaultTracker.send(o.a(i2, build));
        } else {
            apr.e("h5Page event error", "Fatal Error,must call setRequestAuthentication method first.");
        }
        l.getInstance().d(obj);
    }

    private void a(Map<String, String> map, Object obj, String str, String str2, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f37d698", new Object[]{this, map, obj, str, str2, map2});
            return;
        }
        try {
            h eventByKey = i.getInstance().getEventByKey(i.getInstance().getKeyForObject(obj));
            eventByKey.setEventId(2001);
            eventByKey.setContext(obj);
            eventByKey.setPageName(str);
            eventByKey.setArg1(str2);
            eventByKey.updateProperties(map2);
            eventByKey.a(true);
            i.getInstance().beginEvent(eventByKey);
            map.put(h.TAG_UTEVENT, "1");
        } catch (Exception unused) {
        }
    }

    private void a(Date date, Map<String, String> map, Object obj) {
        Map<String, String> b;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740ef0f8", new Object[]{this, date, map, obj});
            return;
        }
        apr.c();
        if (map == null || map.size() == 0) {
            return;
        }
        String str = map.get("url");
        String a2 = a(map.get("urlpagename"), str);
        if (a2 == null || aqc.e(a2)) {
            apr.e("h5Page", "pageName is null,return");
            return;
        }
        String str2 = map.get("utjstype");
        map.remove("utjstype");
        if (str2 == null || str2.equals("0")) {
            b = b(map);
        } else {
            b = str2.equals("1") ? c(map) : null;
        }
        int i2 = l.getInstance().c(obj) ? 2001 : 2006;
        String d = q.a().d();
        int i3 = i2;
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(a2, i2, d, null, null, b);
        if (2001 == i3) {
            q.a().c(a2);
            Map<String, String> a3 = l.getInstance().a(obj);
            if (a3 != null && a3.size() > 0) {
                uTOriginalCustomHitBuilder.setProperties(a3);
            }
            Map<String, String> b2 = l.getInstance().b(obj);
            if (b2 != null && b2.size() > 0) {
                uTOriginalCustomHitBuilder.setTmpProperties(b2);
            }
            if (obj instanceof Activity) {
                uTOriginalCustomHitBuilder.setProperties(a(obj, map, str, a3));
            }
        }
        try {
            String a4 = com.alibaba.analytics.core.config.r.a().a(Uri.parse(str), (Map<String, String>) null);
            if (!aqc.e(a4)) {
                uTOriginalCustomHitBuilder.setProperty("_tpk", a4);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null) {
            Map<String, String> build = uTOriginalCustomHitBuilder.build();
            if (i3 == 2001) {
                n.a(obj, build);
                i = i3;
                a(build, obj, a2, d, b);
            } else {
                i = i3;
            }
            defaultTracker.send(o.a(i, build));
        } else {
            apr.e("h5Page event error", "Fatal Error,must call setRequestAuthentication method first.");
        }
        l.getInstance().d(obj);
    }

    private void a(String str, Date date, Map<String, String> map) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f8f712", new Object[]{this, str, date, map});
            return;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Throwable unused) {
            i = -1;
        }
        if (i == -1 || map == null || map.size() == 0) {
            return;
        }
        String a2 = a(map.get("urlpagename"), map.get("url"));
        if (a2 == null || aqc.e(a2)) {
            apr.d("h5Ctrl", "pageName is null,return");
            return;
        }
        String str2 = map.get("logkey");
        if (str2 == null || aqc.e(str2)) {
            apr.d("h5Ctrl", "logkey is null,return");
            return;
        }
        Map<String, String> map2 = null;
        String str3 = map.get("utjstype");
        map.remove("utjstype");
        if (str3 == null || str3.equals("0")) {
            map2 = d(map);
        } else if (str3.equals("1")) {
            map2 = e(map);
        }
        UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(a2, i, str2, null, null, map2);
        UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
        if (defaultTracker != null) {
            defaultTracker.send(uTOriginalCustomHitBuilder.build());
        } else {
            apr.e("h5Ctrl event error", "Fatal Error,must call setRequestAuthentication method first.");
        }
    }

    private Map<String, String> b(Map<String, String> map) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ce771b1", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("url");
        hashMap.put("_h5url", str == null ? "" : str);
        if (str != null) {
            try {
                int indexOf = str.indexOf(63);
                if (indexOf > 0 && (a2 = lyc.a.a(str.substring(0, indexOf), Uri.parse(str))) != null) {
                    hashMap.putAll(a2);
                }
            } catch (Throwable unused) {
            }
        }
        if (str != null) {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("spm");
            if (queryParameter != null && !aqc.e(queryParameter)) {
                hashMap.put("spm", queryParameter);
            } else {
                hashMap.put("spm", "0.0.0.0");
            }
            String queryParameter2 = parse.getQueryParameter("scm");
            if (queryParameter2 != null && !aqc.e(queryParameter2)) {
                hashMap.put("scm", queryParameter2);
            }
            String queryParameter3 = parse.getQueryParameter("pg1stepk");
            if (queryParameter3 != null && !aqc.e(queryParameter3)) {
                hashMap.put("pg1stepk", queryParameter3);
            }
            if (!aqc.e(parse.getQueryParameter("point"))) {
                hashMap.put("issb", "1");
            }
        } else {
            hashMap.put("spm", "0.0.0.0");
        }
        String str2 = map.get("spmcnt");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("_spmcnt", str2);
        String str3 = map.get("spmpre");
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("_spmpre", str3);
        String str4 = map.get("lzsid");
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("_lzsid", str4);
        String str5 = map.get("extendargs");
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("_h5ea", str5);
        String str6 = map.get("cna");
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("_cna", str6);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private Map<String, String> c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ca0735d0", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("url");
        if (str == null) {
            str = "";
        }
        hashMap.put("_h5url", str);
        String str2 = map.get("extendargs");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("_h5ea", str2);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private Map<String, String> d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("726f9ef", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("logkeyargs");
        if (str == null) {
            str = "";
        }
        hashMap.put("_lka", str);
        String str2 = map.get("cna");
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("_cna", str2);
        String str3 = map.get("extendargs");
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("_h5ea", str3);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private Map<String, String> e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4446be0e", new Object[]{this, map});
        }
        if (map == null || map.size() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String str = map.get("extendargs");
        if (str == null) {
            str = "";
        }
        hashMap.put("_h5ea", str);
        hashMap.put("_ish5", "1");
        return hashMap;
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if (str != null && !aqc.e(str)) {
            return str;
        }
        if (aqc.e(str2)) {
            return "";
        }
        int indexOf = str2.indexOf("?");
        return indexOf == -1 ? str2 : str2.substring(0, indexOf);
    }

    private Map<String, String> a(Object obj, Map<String, String> map, String str, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("195d548f", new Object[]{this, obj, map, str, map2}) : a(obj, map, str, "", map2, false);
    }

    private Map<String, String> a(Object obj, Map<String, String> map, String str, String str2, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("75085bc5", new Object[]{this, obj, map, str, str2, map2}) : a(obj, map, str, str2, map2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0344  */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.Map<java.lang.String, java.lang.String> a(java.lang.Object r25, java.util.Map<java.lang.String, java.lang.String> r26, java.lang.String r27, java.lang.String r28, java.util.Map<java.lang.String, java.lang.String> r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ut.mini.j.a(java.lang.Object, java.util.Map, java.lang.String, java.lang.String, java.util.Map, boolean):java.util.Map");
    }

    private String a(Object obj) {
        String simpleName;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a5b32dc", new Object[]{this, obj});
        }
        if (obj instanceof String) {
            simpleName = (String) obj;
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return simpleName + hashCode;
    }

    private boolean f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e06b41fc", new Object[]{this, map})).booleanValue();
        }
        if (map == null || !"1".equals(map.get("_ut_update_spm"))) {
            return false;
        }
        apr.b("UTHybridHelper", "_ut_update_spm=1");
        return true;
    }
}
