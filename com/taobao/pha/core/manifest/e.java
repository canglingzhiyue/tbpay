package com.taobao.pha.core.manifest;

import android.net.Uri;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.media.MediaConstant;
import com.taobao.pha.core.controller.i;
import com.taobao.pha.core.error.PHAErrorType;
import com.taobao.pha.core.h;
import com.taobao.pha.core.manifest.ManifestProperty;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.Cnew;
import tb.kge;
import tb.nfc;
import tb.nfh;
import tb.nfi;
import tb.ngn;
import tb.ngr;
import tb.ngs;
import tb.ngu;
import tb.riy;

/* loaded from: classes7.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PHA_MANIFEST_DEFAULT = "default";
    public static final String PHA_MANIFEST_UPDATAE = "update";

    /* renamed from: a  reason: collision with root package name */
    private static final String f18749a;
    private final Map<Integer, Future<ManifestModel>> b = new ConcurrentHashMap();
    private final Map<Integer, ManifestProperty> c = new ConcurrentHashMap();
    private final h d = p.c();
    private String e = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
    private String f = MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final e f18751a;

        static {
            kge.a(995620667);
            f18751a = new e();
        }

        public static /* synthetic */ e a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9330f461", new Object[0]) : f18751a;
        }
    }

    public static /* synthetic */ ManifestModel a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ManifestModel) ipChange.ipc$dispatch("e4c54326", new Object[]{str}) : b(str);
    }

    public static /* synthetic */ void a(Uri uri, ManifestModel manifestModel, String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e85d84", new Object[]{uri, manifestModel, str, cVar});
        } else {
            b(uri, manifestModel, str, cVar);
        }
    }

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b32b65", new Object[]{eVar, str});
        } else {
            eVar.c(str);
        }
    }

    public static /* synthetic */ void a(nfh nfhVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d5e18c8", new Object[]{nfhVar, jSONObject});
        } else {
            b(nfhVar, jSONObject);
        }
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : f18749a;
    }

    static {
        kge.a(-1679334155);
        f18749a = e.class.getSimpleName();
    }

    public static e a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("9330f461", new Object[0]) : a.a();
    }

    public Future<?> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("33581bff", new Object[]{this});
        }
        if (!this.d.p() || !this.d.n()) {
            return null;
        }
        final String o = this.d.o();
        final boolean z = !StringUtils.isEmpty(o) && !o.equals(this.e);
        final String a2 = this.d.a("manifest_prefetches_v2");
        final boolean z2 = !StringUtils.isEmpty(a2) && !a2.equals(this.f);
        if (!z && !z2) {
            return null;
        }
        if (z) {
            this.e = o;
        }
        if (z2) {
            this.f = a2;
        }
        return Cnew.a(new Runnable() { // from class: com.taobao.pha.core.manifest.e.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                if (z) {
                    e.a(e.this, o);
                }
                if (!z2) {
                    return;
                }
                e.a(e.this, a2);
            }
        });
    }

    private static ManifestModel b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManifestModel) ipChange.ipc$dispatch("d854c767", new Object[]{str});
        }
        try {
            return (ManifestModel) JSONObject.parseObject(str, ManifestModel.class);
        } catch (Exception e) {
            ngr.b(f18749a, ngn.a(e));
            return null;
        }
    }

    private static void b(Uri uri, ManifestModel manifestModel, String str, c cVar) {
        long min;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35616f85", new Object[]{uri, manifestModel, str, cVar});
        } else if (manifestModel == null || uri == null || str == null || cVar == null) {
        } else {
            if (manifestModel.expires == null && manifestModel.maxAge == null) {
                min = System.currentTimeMillis() + (p.c().q() * 1000);
            } else {
                Date j = ngn.j(manifestModel.expires);
                long j2 = Long.MAX_VALUE;
                long time = j == null ? Long.MAX_VALUE : j.getTime();
                if (manifestModel.maxAge != null) {
                    j2 = manifestModel.maxAge.longValue();
                }
                min = Math.min(time, System.currentTimeMillis() + (j2 * 1000));
            }
            cVar.a(uri.toString(), str, min);
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.c.remove(Integer.valueOf(i));
        this.b.remove(Integer.valueOf(i));
    }

    public ManifestModel b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManifestModel) ipChange.ipc$dispatch("1556bb2e", new Object[]{this, new Integer(i)});
        }
        Future<ManifestModel> future = this.b.get(Integer.valueOf(i));
        try {
            ManifestProperty manifestProperty = this.c.get(Integer.valueOf(i));
            if (manifestProperty == null) {
                manifestProperty = new ManifestProperty();
            }
            if (ngn.d()) {
                String str = f18749a;
                ngr.c(str, "source type is " + manifestProperty.g);
            }
            if (future != null) {
                ManifestModel manifestModel = future.get(this.d.s(), TimeUnit.SECONDS);
                this.c.put(Integer.valueOf(i), manifestProperty);
                this.b.remove(Integer.valueOf(i));
                return manifestModel;
            }
            manifestProperty.e = PHAErrorType.NETWORK_ERROR.toString();
            manifestProperty.f = com.taobao.pha.core.error.a.ERR_MSG_MANIFEST_DOWNLOAD_FAILED;
            this.c.put(Integer.valueOf(i), manifestProperty);
            return null;
        } catch (Exception e) {
            ngr.b(f18749a, e.toString());
            return null;
        }
    }

    public int a(Uri uri, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7c1b95dc", new Object[]{this, uri, str})).intValue();
        }
        int hashCode = (uri.toString() + System.currentTimeMillis()).hashCode();
        ManifestProperty manifestProperty = this.c.get(Integer.valueOf(hashCode));
        if (manifestProperty == null) {
            manifestProperty = new ManifestProperty();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        manifestProperty.b = uptimeMillis;
        manifestProperty.f18743a = uptimeMillis;
        manifestProperty.c = SystemClock.uptimeMillis();
        manifestProperty.g = 4;
        ManifestModel b2 = b(str);
        manifestProperty.d = SystemClock.uptimeMillis();
        this.c.put(Integer.valueOf(hashCode), manifestProperty);
        this.b.put(Integer.valueOf(hashCode), new com.taobao.pha.core.manifest.a(b2));
        return hashCode;
    }

    public ManifestProperty c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManifestProperty) ipChange.ipc$dispatch("d10532dd", new Object[]{this, new Integer(i)});
        }
        ManifestProperty manifestProperty = this.c.get(Integer.valueOf(i));
        this.c.remove(Integer.valueOf(i));
        return manifestProperty;
    }

    public int a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b1a285d2", new Object[]{this, uri})).intValue() : a(uri, true);
    }

    public int a(Uri uri, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("82aee8c8", new Object[]{this, uri, new Boolean(z)})).intValue();
        }
        int hashCode = (uri.toString() + System.currentTimeMillis()).hashCode();
        ManifestProperty manifestProperty = this.c.get(Integer.valueOf(hashCode));
        if (manifestProperty == null) {
            manifestProperty = new ManifestProperty();
        }
        this.c.put(Integer.valueOf(hashCode), manifestProperty);
        manifestProperty.f18743a = SystemClock.uptimeMillis();
        b bVar = new b(uri, hashCode, this.c, z);
        if (this.b.containsKey(Integer.valueOf(hashCode))) {
            ngr.b(f18749a, "Manifest hashcode exist.");
        }
        this.b.put(Integer.valueOf(hashCode), Cnew.a(bVar));
        return hashCode;
    }

    public ManifestModel b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ManifestModel) ipChange.ipc$dispatch("3ccffb72", new Object[]{this, uri});
        }
        c a2 = c.a();
        String e = (a2 == null || !a2.b(uri) || !a2.c(uri)) ? null : a2.e(uri);
        if (e == null) {
            return null;
        }
        ManifestModel b2 = b(e);
        if (b2 != null) {
            b2.version = e.hashCode();
        }
        return b2;
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        try {
            ngr.b("ManifestPrefetch", "performManifestPrefetch with config: " + str);
            JSONArray parseArray = JSONArray.parseArray(str);
            for (int i = 0; i < parseArray.size(); i++) {
                Object obj = parseArray.get(i);
                if (obj instanceof String) {
                    d((String) obj);
                } else if (obj instanceof JSONObject) {
                    a((JSONObject) obj);
                }
            }
        } catch (Throwable th) {
            String str2 = f18749a;
            ngr.b(str2, "Manifest prefetch failed: " + th.toString());
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString("url");
        if (StringUtils.isEmpty(string)) {
            ngr.b(f18749a, "url is empty");
            return;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("region");
        String a2 = (p.b() == null || p.b().y() == null) ? "CN" : p.b().y().a();
        if (!a2.equals("GLOBAL")) {
            if (jSONArray == null) {
                z = a2.equals("CN");
            } else if (!jSONArray.contains("GLOBAL")) {
                z = jSONArray.contains(a2);
            }
        }
        if (!z) {
            ngr.b(f18749a, "check region failed");
            return;
        }
        if (jSONObject.containsKey("startTime") || jSONObject.containsKey("endTime")) {
            Date k = ngn.k(jSONObject.getString("startTime"));
            Date k2 = ngn.k(jSONObject.getString("endTime"));
            long j = 0;
            long time = k != null ? k.getTime() : 0L;
            if (k2 != null) {
                j = k2.getTime();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis < time || currentTimeMillis > j) {
                ngr.b(f18749a, "check time failed");
                return;
            }
        }
        d(string);
    }

    private void d(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        Uri parse = Uri.parse(str);
        c a2 = c.a();
        nfh a3 = b.a(parse);
        ManifestModel manifestModel = null;
        String str3 = (a3 == null || a3.a() != 200) ? null : new String(a3.c());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("prefetch", (Object) 1);
        String str4 = "";
        if (str3 != null) {
            manifestModel = b(str3);
            if (manifestModel != null) {
                if (a2 != null) {
                    b(parse, manifestModel, str3, a2);
                }
                str2 = str4;
            } else {
                str4 = PHAErrorType.TYPE_ERROR.toString();
                str2 = com.taobao.pha.core.error.a.ERR_MSG_MANIFEST_PARSE_FAILED;
            }
        } else {
            str4 = PHAErrorType.NETWORK_ERROR.toString();
            str2 = com.taobao.pha.core.error.a.ERR_MSG_MANIFEST_DOWNLOAD_FAILED;
        }
        if (manifestModel != null) {
            i.b(nfc.PHA_MONITOR_MODULE_POINT_MANIFEST_REQUEST, jSONObject);
        } else if (a3 != null && a3.a() == -205) {
        } else {
            b(a3, jSONObject);
            i.a(nfc.PHA_MONITOR_MODULE_POINT_MANIFEST_REQUEST, jSONObject, str4, str2);
        }
    }

    /* loaded from: classes7.dex */
    public static class b implements Callable<ManifestModel> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Uri f18752a;
        private final int b;
        private final Map<Integer, ManifestProperty> c;
        private final boolean d;

        static {
            kge.a(-1311353292);
            kge.a(-119797776);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.pha.core.model.ManifestModel, java.lang.Object] */
        @Override // java.util.concurrent.Callable
        public /* synthetic */ ManifestModel call() throws Exception {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ipChange.ipc$dispatch("6d249ded", new Object[]{this}) : a();
        }

        public b(Uri uri, int i, Map<Integer, ManifestProperty> map, boolean z) {
            this.f18752a = uri;
            this.b = i;
            this.c = map;
            this.d = z;
        }

        public static nfh a(Uri uri) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (nfh) ipChange.ipc$dispatch("a11fd417", new Object[]{uri}) : ngs.a(uri.buildUpon().appendQueryParameter("wh_ttid", "native").build().toString(), "GET", a(uri.toString()));
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x023c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01f4  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0202  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0205  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.taobao.pha.core.model.ManifestModel a() throws java.lang.Exception {
            /*
                Method dump skipped, instructions count: 607
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.core.manifest.e.b.a():com.taobao.pha.core.model.ManifestModel");
        }

        private static JSONObject a(Uri uri, boolean z) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("79ccfff5", new Object[]{uri, new Boolean(z)});
            }
            String uri2 = uri.toString();
            JSONObject jSONObject = new JSONObject();
            if ("true".equals(uri.getQueryParameter("enableOfflineResource"))) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.add("//g.alicdn.com/.*");
                jSONObject.put("offline_resources", (Object) jSONArray);
            }
            JSONObject jSONObject2 = new JSONObject();
            if (ngu.a()) {
                nfi b = p.b().b();
                if ("true".equals(uri.getQueryParameter("x-ssr")) && (!ngu.h() || b == null || !b.a(uri2))) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("type", (Object) "securityguard");
                    jSONObject3.put("key", (Object) "securityguard");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("bizId", (Object) 101);
                    jSONObject4.put("api", (Object) uri2);
                    jSONObject4.put("data", (Object) "{}");
                    jSONObject4.put("useWua", (Object) Boolean.valueOf("wua".equals(uri.getQueryParameter("x-sec"))));
                    jSONObject3.put("params", (Object) jSONObject4);
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.add(jSONObject3);
                    jSONObject.put("custom_data_source", (Object) jSONArray2);
                    JSONObject jSONObject5 = new JSONObject();
                    for (String str : new String[]{HttpHeaderConstant.X_MINI_WUA, "wua", HttpHeaderConstant.X_SIGN, HttpHeaderConstant.X_UMID_TOKEN, "x-sgext"}) {
                        jSONObject5.put(str, (Object) ("${securityguard." + str + riy.BLOCK_END_STR));
                    }
                    jSONObject2.put("request_headers", (Object) jSONObject5);
                }
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put("url", (Object) uri2);
                i.b(nfc.PHA_MONITOR_MODULE_POINT_SECURE_SSR, jSONObject6);
            }
            if (z) {
                jSONObject2.put("key", (Object) ManifestProperty.PHAManifest.H5URL);
            }
            jSONObject2.put("path", (Object) uri2);
            jSONObject2.put("manifest_preset", (Object) true);
            JSONArray jSONArray3 = new JSONArray();
            jSONArray3.add(jSONObject2);
            jSONObject.put("pages", (Object) jSONArray3);
            return jSONObject;
        }

        private static Map<String, String> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{str});
            }
            HashMap hashMap = new HashMap();
            hashMap.put("user-agent", ngn.e());
            hashMap.put(HttpRequest.HEADER_ACCEPT, b());
            JSONObject i = ngn.i(d.a(str));
            if (i != null) {
                String c = e.c();
                ngr.b(c, "additional request headers: " + i.toJSONString());
                for (Map.Entry<String, Object> entry : i.entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        hashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
            return hashMap;
        }

        private static String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
            }
            String a2 = p.c().a("__accept_header__");
            return StringUtils.isEmpty(a2) ? "application/x-pha-manifest+json,text/html;q=0.8" : a2;
        }
    }

    private static void b(nfh nfhVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d5a667", new Object[]{nfhVar, jSONObject});
        } else if (nfhVar == null) {
        } else {
            jSONObject.put("statusCode", (Object) Integer.valueOf(nfhVar.a()));
            jSONObject.put("statusMessage", (Object) nfhVar.b());
            Map<String, List<String>> d = nfhVar.d();
            if (d == null) {
                return;
            }
            d.remove(null);
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.putAll(d);
            Iterator it = new ArrayList(Arrays.asList("x-air-trace-id", "eagleeye-traceid", HttpConstant.Content_MD52, "via")).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list = (List) treeMap.get(str);
                if (list != null && !list.isEmpty()) {
                    String str2 = (String) list.get(0);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, (Object) str2);
                }
            }
        }
    }
}
