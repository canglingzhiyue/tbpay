package com.taobao.pha.core.manifest;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import tb.Cnew;
import tb.kge;
import tb.nfl;
import tb.nfn;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile c b;

    /* renamed from: a  reason: collision with root package name */
    public nfl f18745a;
    private JSONObject c;

    static {
        kge.a(1758632323);
    }

    private int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : com.alibaba.ability.impl.photo.b.MAX_IMAGE_SIZE;
    }

    public c() {
        Context e = p.e();
        if (e == null) {
            ngr.c("PHAManifestCacheManager", ": disabled due to context is null.");
        } else if (!c()) {
            ngr.c("PHAManifestCacheManager", ": disabled due to config.");
        } else {
            this.f18745a = new nfn(e, "PHAManifestCacheManager", d());
            Cnew.a(new Runnable() { // from class: com.taobao.pha.core.manifest.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c.this.f18745a.a();
                    ngr.a("PHAManifestCacheManager", "successfully setup.");
                    if (p.c().B()) {
                        return;
                    }
                    try {
                        c.this.b();
                    } catch (Throwable th) {
                        ngr.b("PHAManifestCacheManager", "Error while clear expired cache index, " + ngn.a(th));
                    }
                }
            });
        }
    }

    public static boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{uri})).booleanValue() : p.c().b(uri);
    }

    public static Uri a(Uri uri, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("a4b9fe3e", new Object[]{uri, jSONArray});
        }
        if (uri == null || a(uri)) {
            return null;
        }
        Uri build = uri.buildUpon().clearQuery().build();
        if (jSONArray == null) {
            return build;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            String string = jSONArray.getString(i);
            if (!StringUtils.isEmpty(string)) {
                String queryParameter = uri.getQueryParameter(string);
                if (queryParameter == null) {
                    queryParameter = "";
                }
                build = build.buildUpon().appendQueryParameter(string, queryParameter).build();
            }
        }
        return build;
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9330f423", new Object[0]);
        }
        if (b == null && p.d()) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c();
                }
            }
        }
        return b;
    }

    private static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : p.c().p();
    }

    private static boolean a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("266fb8c", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return true;
        }
        long longValue = jSONObject.getLongValue("expired_ts");
        return longValue == 0 || System.currentTimeMillis() > longValue;
    }

    public boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue() : g(uri) != null;
    }

    public boolean c(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("beadfb21", new Object[]{this, uri})).booleanValue() : a(g(uri));
    }

    public String d(Uri uri) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3068ee64", new Object[]{this, uri});
        }
        if (!c() || a(uri) || (g = g(uri)) == null || a(g)) {
            return null;
        }
        try {
            String a2 = this.f18745a.a(g.getString("manifestFile"));
            if (ngn.d()) {
                ngr.a("PHAManifestCacheManager", "hit index, " + uri.toString() + " " + g.toJSONString());
            }
            return a2;
        } catch (Exception e) {
            ngr.b("PHAManifestCacheManager", ngn.a(e));
            return null;
        }
    }

    public String e(Uri uri) {
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f969e5a5", new Object[]{this, uri});
        }
        if (c() && !a(uri) && (g = g(uri)) != null) {
            try {
                String a2 = this.f18745a.a(g.getString("manifestFile"));
                if (ngn.d()) {
                    ngr.a("PHAManifestCacheManager", "hit index, " + uri.toString() + " " + g.toJSONString());
                }
                return a2;
            } catch (Exception e) {
                ngr.b("PHAManifestCacheManager", ngn.a(e));
            }
        }
        return null;
    }

    public void b() {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (c() && this.f18745a != null && (e = e()) != null) {
            Set<String> keySet = e.keySet();
            ArrayList arrayList = new ArrayList();
            for (String str : keySet) {
                JSONObject jSONObject = e.getJSONObject(str);
                if (jSONObject != null && a(jSONObject)) {
                    arrayList.add(str);
                    ngr.c("PHAManifestCacheManager", "ready to clear the expired item with key: " + str);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                JSONObject jSONObject2 = e.getJSONObject(str2);
                if (jSONObject2 != null) {
                    String string = jSONObject2.getString("manifestFile");
                    if (string != null) {
                        this.f18745a.b(string);
                    }
                    e.remove(str2);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f18745a.a("pha-manifest-index", e.toJSONString());
            this.f18745a.b();
        }
    }

    public boolean f(Uri uri) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("523f2afe", new Object[]{this, uri})).booleanValue();
        }
        if (!c() || (e = e()) == null) {
            return false;
        }
        for (String str : e.keySet()) {
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (ngn.a(parse, uri) && ngn.c(parse, uri)) {
                    ngr.b("PHAManifestCacheManager", "clearCache with key: " + uri);
                    return a(str);
                }
            }
        }
        return false;
    }

    public void a(String str, final String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba98c8", new Object[]{this, str, str2, new Long(j)});
        } else if (str == null || str2 == null || j <= System.currentTimeMillis() || this.f18745a == null) {
        } else {
            Uri parse = Uri.parse(str);
            if (!c() || a(parse)) {
                return;
            }
            if (ngn.d()) {
                ngr.a("PHAManifestCacheManager", "putItem " + str);
            }
            final JSONObject e = e();
            if (e == null) {
                return;
            }
            final String m = ngn.m(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expired_ts", (Object) Long.valueOf(j));
            jSONObject.put("manifestFile", (Object) m);
            e.put(str, (Object) jSONObject);
            Runnable runnable = new Runnable() { // from class: com.taobao.pha.core.manifest.c.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (c.this.f18745a == null) {
                    } else {
                        c.this.f18745a.a("pha-manifest-index", e.toJSONString());
                        c.this.f18745a.a(m, str2);
                        c.this.f18745a.b();
                    }
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                Cnew.a(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        nfl nflVar = this.f18745a;
        if (nflVar == null) {
            return null;
        }
        if (this.c == null) {
            try {
                this.c = JSON.parseObject(nflVar.a("pha-manifest-index"));
            } catch (Throwable th) {
                ngr.b("PHAManifestCacheManager", "try to parse index failed, " + ngn.a(th));
            }
        }
        if (this.c == null) {
            this.c = new JSONObject();
        }
        return this.c;
    }

    private boolean a(String str) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        if (str == null || this.f18745a == null || !c() || (e = e()) == null || (jSONObject = e.getJSONObject(str)) == null) {
            return false;
        }
        String string = jSONObject.getString("manifestFile");
        if (StringUtils.isEmpty(string)) {
            return false;
        }
        e.remove(str);
        this.f18745a.b(string);
        this.f18745a.a("pha-manifest-index", e.toJSONString());
        this.f18745a.b();
        return true;
    }

    private JSONObject g(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f21eecb9", new Object[]{this, uri});
        }
        JSONObject e = e();
        if (e == null) {
            return null;
        }
        for (String str : e.keySet()) {
            if (str != null) {
                Uri parse = Uri.parse(str);
                if (ngn.a(parse, uri) && ngn.c(parse, uri)) {
                    return e.getJSONObject(str);
                }
            }
        }
        return null;
    }
}
