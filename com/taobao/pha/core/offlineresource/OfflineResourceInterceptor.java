package com.taobao.pha.core.offlineresource;

import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.c;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.error.a;
import com.taobao.pha.core.p;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import tb.Cnew;
import tb.kge;
import tb.nfh;
import tb.nfn;
import tb.nge;
import tb.ngm;
import tb.ngn;
import tb.ngr;
import tb.ngs;

/* loaded from: classes7.dex */
public class OfflineResourceInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18757a;
    public static final nfn sPackageCacheDistLru;
    private final AppController b;
    private final List<Pattern> c = new ArrayList();
    private String[] d;
    private String[] e;

    /* loaded from: classes7.dex */
    enum OfflineResourceHitType {
        NO_HIT,
        PARTIAL_HIT,
        ALL_HIT,
        THIRD_PARTY_HIT
    }

    static {
        kge.a(-1573534967);
        f18757a = OfflineResourceInterceptor.class.getName();
        sPackageCacheDistLru = new nfn(p.e(), "PHAOfflineResources", a());
        Cnew.a(new Runnable() { // from class: com.taobao.pha.core.offlineresource.OfflineResourceInterceptor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    OfflineResourceInterceptor.sPackageCacheDistLru.a();
                }
            }
        });
    }

    public OfflineResourceInterceptor(AppController appController, List<String> list) {
        this.b = appController;
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.c.add(Pattern.compile(str));
                } catch (Exception e) {
                    ngr.b(f18757a, e.toString());
                }
            }
        }
    }

    public static boolean a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9378d80", new Object[]{str, str2})).booleanValue() : sPackageCacheDistLru.a(ngn.m(str), str2);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : sPackageCacheDistLru.a(ngn.m(str));
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3dd7e577", new Object[]{str})).booleanValue() : sPackageCacheDistLru.c(ngn.m(str));
    }

    private static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            String a2 = p.c().a("disk_size_limit");
            if (TextUtils.isEmpty(a2)) {
                return 52428800;
            }
            int parseInt = Integer.parseInt(a2);
            if (parseInt <= 0) {
                return 52428800;
            }
            return (parseInt << 10) << 10;
        } catch (Throwable unused) {
            ngr.b(f18757a, "Can not parse orange config.");
            return 52428800;
        }
    }

    private static String a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d56608a1", new Object[]{uri});
        }
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if (uri2.endsWith(".js")) {
            return "application/javascript";
        }
        if (uri2.endsWith(".css")) {
            return "text/css";
        }
        if (!uri2.endsWith(".html")) {
            return null;
        }
        return "text/html";
    }

    private static boolean d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d23b17f9", new Object[]{str})).booleanValue() : str.contains("??");
    }

    private static String[] e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("df82e385", new Object[]{str});
        }
        try {
            String a2 = p.c().a(str);
            if (TextUtils.isEmpty(a2)) {
                return null;
            }
            return a2.split(",");
        } catch (Exception unused) {
            String str2 = f18757a;
            ngr.b(str2, "Get config list fail. configName = " + str);
            return null;
        }
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88097eb8", new Object[]{this, str})).booleanValue();
        }
        if (this.c.isEmpty() || d(str) || f(str) || !g(str)) {
            return false;
        }
        return h(str);
    }

    public nge a(Uri uri, Map<String, String> map) {
        nge a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("796f3fb4", new Object[]{this, uri, map});
        }
        String uri2 = uri.toString();
        if (!c(uri2)) {
            return null;
        }
        this.b.h().a("offlineResource");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("resUrl", (Object) uri2);
        String a3 = b(uri2) ? a(uri2) : null;
        if (TextUtils.isEmpty(a3)) {
            c j = p.b().j();
            if (j != null && (a2 = j.a(uri2)) != null && a2.e() != null) {
                jSONObject.put("hitType", (Object) OfflineResourceHitType.THIRD_PARTY_HIT);
                jSONObject.put("timeCost", (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                this.b.P().a("offlineResource", jSONObject);
                return a2;
            }
            a3 = a(uri2, map, jSONObject);
            jSONObject.put("hitType", (Object) OfflineResourceHitType.NO_HIT);
            jSONObject.put("timeCost", (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (!TextUtils.isEmpty(a3)) {
                if (!a(uri2, a3)) {
                    jSONObject.put("errorCode", (Object) PHAErrorType.FILE_ERROR.toString());
                    jSONObject.put("errorMessage", (Object) a.ERR_MSG_RESOURCE_SAVE_FAILED);
                }
                this.b.P().a("offlineResource", jSONObject);
                z = true;
            } else {
                String pHAErrorType = PHAErrorType.NETWORK_ERROR.toString();
                if (jSONObject.containsKey("errorCode")) {
                    pHAErrorType = jSONObject.getString("errorCode");
                }
                this.b.P().a("offlineResource", new a(pHAErrorType, jSONObject.containsKey("errorMessage") ? jSONObject.getString("errorMessage") : a.ERR_MSG_RESOURCE_REQUEST_FAILED, jSONObject));
            }
        } else {
            this.b.h().b("offlineResource");
            String str = f18757a;
            ngr.c(str, "match offline resource rule with url " + uri2);
            jSONObject.put("hitType", (Object) OfflineResourceHitType.ALL_HIT);
            jSONObject.put("timeCost", (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            this.b.P().a("offlineResource", jSONObject);
        }
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        ngm ngmVar = new ngm(a(uri), null, new ByteArrayInputStream(a3.getBytes()));
        HashMap hashMap = new HashMap(2);
        hashMap.put(com.taobao.pha.core.rescache.c.RESPONSE_HEADER_PHA_PACKAGE_RESOURCE, z ? "no-hit" : "hit");
        hashMap.put(com.taobao.pha.core.rescache.c.HEADER_ACAO, "*");
        ngmVar.a(hashMap);
        return ngmVar;
    }

    private String[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("11a28f78", new Object[]{this});
        }
        String[] strArr = this.d;
        if (strArr != null) {
            return strArr;
        }
        this.d = e("offline_resource_black_list");
        return this.d;
    }

    private String[] c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("5bd428b9", new Object[]{this});
        }
        String[] strArr = this.e;
        if (strArr != null) {
            return strArr;
        }
        this.e = e("offline_resource_url_suffix");
        if (this.e == null) {
            this.e = new String[]{"js"};
        }
        return this.e;
    }

    private boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("669e4a7b", new Object[]{this, str})).booleanValue();
        }
        String[] b = b();
        if (b == null) {
            return false;
        }
        for (String str2 : b) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cfe3bc", new Object[]{this, str})).booleanValue();
        }
        String[] c = c();
        if (c == null) {
            return false;
        }
        for (String str2 : c) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb017cfd", new Object[]{this, str})).booleanValue();
        }
        for (Pattern pattern : this.c) {
            if (pattern != null && pattern.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private String a(String str, Map<String, String> map, JSONObject jSONObject) {
        List<String> list;
        byte[] c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8e25203", new Object[]{this, str, map, jSONObject});
        }
        nfh a2 = ngs.a(str, "GET", map);
        if (a2 == null || a2.d() == null) {
            return null;
        }
        if (a2 != null && a2.a() != 200) {
            jSONObject.put("statusCode", (Object) Integer.valueOf(a2.a()));
            jSONObject.put("statusMessage", (Object) a2.b());
            return null;
        }
        Iterator<Map.Entry<String, List<String>>> it = a2.d().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                list = null;
                break;
            }
            Map.Entry<String, List<String>> next = it.next();
            if (next != null && HttpConstant.Content_MD52.equalsIgnoreCase(next.getKey())) {
                list = next.getValue();
                break;
            }
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        String str2 = list.get(0);
        if (TextUtils.isEmpty(str2) || (c = a2.c()) == null) {
            return null;
        }
        if (TextUtils.equals(str2, ngn.a(c))) {
            return new String(c);
        }
        jSONObject.put("errorCode", (Object) PHAErrorType.TYPE_ERROR.toString());
        jSONObject.put("errorMessage", a.ERR_MSG_RESOURCE_MD5_FAILED);
        return null;
    }
}
