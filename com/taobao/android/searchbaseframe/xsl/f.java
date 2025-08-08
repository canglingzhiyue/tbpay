package com.taobao.android.searchbaseframe.xsl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.xsl.module.XslDatasource;
import com.taobao.android.searchbaseframe.xsl.module.XslModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.imn;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f15026a;
    private static f b;
    private Map<String, b> c = new HashMap();
    private Handler d = new Handler(Looper.getMainLooper());
    private volatile boolean e = false;

    /* loaded from: classes6.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes6.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public XslDatasource f15028a;
        public a b;
        public String c;
        public String d;
        public Map<String, String> e;
        public Map<String, String> f;
        public Runnable g;

        static {
            kge.a(948725966);
        }

        public b(XslDatasource xslDatasource, String str, String str2, Map<String, String> map, Map<String, String> map2) {
            this.f15028a = xslDatasource;
            this.c = str;
            this.d = str2;
            this.e = new HashMap(map);
            this.f = new HashMap(map2);
        }
    }

    public static /* synthetic */ Map a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("21f74512", new Object[]{fVar}) : fVar.c;
    }

    static {
        kge.a(-93213559);
        HashSet hashSet = new HashSet();
        f15026a = hashSet;
        hashSet.add("page");
        f15026a.add("sversion");
        f15026a.add("utd_id");
        f15026a.add("ttid");
        b = new f();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("514a7863", new Object[0]) : b;
    }

    private imn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (imn) ipChange.ipc$dispatch("16b7abf3", new Object[]{this}) : XslModule.b();
    }

    public boolean a(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, final a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec065a", new Object[]{this, str, str2, str3, map, map2, aVar, new Boolean(z)})).booleanValue();
        }
        final imn b2 = b();
        if (b2 == null) {
            return false;
        }
        if (this.e) {
            b2.b().d("XslPreloadManager", "Error prepare, disabled in debugMenu");
            return false;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                if (map != null && map2 != null) {
                    final String a2 = a(str);
                    if (this.c.containsKey(a2)) {
                        g.e(a2, "");
                        b2.b().d("XslPreloadManager", "Error prepare duplicate");
                        return false;
                    }
                    if (k.a().c()) {
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(map);
                        hashMap.put("params", map2);
                        k.d("[XS.xsl]", "Preload started, url: %s\n\tparams: %s", str, hashMap);
                    }
                    XslDatasource a3 = XslModule.a((XslModule) null, true);
                    a3.setFlatParams(z);
                    a3.setApi(str2, str3);
                    a3.setParams(map);
                    a3.addBizParam(map2);
                    a3.doNewSearch();
                    a3.setTrackingName("mus_xsearchlist");
                    a3.setBundleUrl(str);
                    b bVar = new b(a3, str2, str3, map, map2);
                    Runnable runnable = new Runnable() { // from class: com.taobao.android.searchbaseframe.xsl.f.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            b bVar2 = (b) f.a(f.this).remove(a2);
                            k b3 = b2.b();
                            b3.d("XslPreloadManager", "Error prepare timeout: " + a2);
                            if (bVar2 == null) {
                                return;
                            }
                            if (b2.a().c()) {
                                k b4 = b2.b();
                                b4.b("XSL请求提前: 超时, pageName: " + bVar2.f15028a.getTrackingPageName());
                            }
                            g.d(a2, bVar2.f15028a.getTrackingPageName());
                        }
                    };
                    bVar.g = runnable;
                    bVar.b = aVar;
                    this.c.put(a2, bVar);
                    this.d.postDelayed(runnable, 30000L);
                    k b3 = b2.b();
                    b3.f("XslPreloadManager", "Prepare Succ: " + a2);
                    return true;
                }
                b2.b().b("XslPreloadManager", "Error prepare args, mtopParams == null");
                return false;
            }
            b2.b().a("XslPreloadManager", "Error prepare args: %s, %s, %s", str, str2, str3);
            return false;
        } catch (Exception e) {
            b2.b().b("XslPreloadManager", "prepare err", e);
            return false;
        }
    }

    public XslDatasource a(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XslDatasource) ipChange.ipc$dispatch("cd15458", new Object[]{this, str, str2, str3, map, map2});
        }
        imn b2 = b();
        if (b2 == null) {
            return null;
        }
        if (this.e) {
            b2.b().d("XslPreloadManager", "Error extract: disabled in debugMenu");
            if (b2.a().c()) {
                b2.b().b("XSL请求提前: 关闭");
            }
            return null;
        }
        try {
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2) && !StringUtils.isEmpty(str3)) {
                String a2 = a(str);
                b bVar = this.c.get(a2);
                if (bVar == null) {
                    k b3 = b2.b();
                    b3.f("XslPreloadManager", "Error extract not exist: " + a2);
                    if (b2.a().c()) {
                        k b4 = b2.b();
                        b4.b("XSL请求提前: 没有触发提前请求: " + a2);
                    }
                    g.b(a2, "");
                    return null;
                }
                this.c.remove(a2);
                this.d.removeCallbacks(bVar.g);
                g.c(a2, bVar.f15028a.getTrackingPageName());
                Map<String, String> a3 = a(bVar, str2, str3, map, map2);
                if (!a3.isEmpty()) {
                    k b5 = b2.b();
                    b5.d("XslPreloadManager", "Error extract param diff: " + a3);
                    if (b2.a().c()) {
                        k b6 = b2.b();
                        b6.b("XSL请求提前: 参数错误\n" + a3);
                    }
                    g.a(a2, bVar.f15028a.getTrackingPageName(), JSON.toJSONString(a3));
                    k.f("[XS.xsl]", "Preload failed, params not matched, preload params: %s\n\tjs params: %s", bVar.f, map2);
                    return null;
                }
                k.d("[XS.xsl]", "Preload success, preload params: %s\n\tjs params: %s", bVar.f, map2);
                k b7 = b2.b();
                b7.f("XslPreloadManager", "Extract Succ: " + a2);
                if (bVar.b != null) {
                    bVar.b.a();
                }
                g.a(a2, bVar.f15028a.getTrackingPageName());
                if (b2.a().c()) {
                    b2.b().b("XSL请求提前: 成功");
                }
                return bVar.f15028a;
            }
            b2.b().a("XslPreloadManager", "Error extract args: %s, %s, %s", str, str2, str3);
            return null;
        } catch (Exception e) {
            b2.b().b("XslPreloadManager", "extract err", e);
            return null;
        }
    }

    public Map<String, String> a(b bVar, String str, String str2, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fa32388", new Object[]{this, bVar, str, str2, map, map2});
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.equals(str, bVar.c)) {
            hashMap.put("mtopApi", "diff");
        }
        if (!StringUtils.equals(str2, bVar.d)) {
            hashMap.put("mtopVersion", "diff");
        }
        if (map == null) {
            map = new HashMap<>();
        }
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        a(bVar.e, map, hashMap);
        a(bVar.f, map2, hashMap);
        return hashMap;
    }

    private void a(Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64ac26bd", new Object[]{this, map, map2, map3});
            return;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            if (!f15026a.contains(key)) {
                String str = map.get(key);
                if (!StringUtils.isEmpty(entry.getValue())) {
                    if (StringUtils.isEmpty(str)) {
                        map3.put(entry.getKey(), "miss");
                    } else if (!StringUtils.equals(str, entry.getValue())) {
                        map3.put(entry.getKey(), "diff");
                    }
                }
            }
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        Uri parse = Uri.parse(str);
        return parse.getHost() + parse.getPath();
    }
}
