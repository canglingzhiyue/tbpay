package com.taobao.pha.core.manifest;

import android.net.Uri;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.util.Map;
import tb.Cnew;
import tb.kge;
import tb.nft;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18748a;
    private static volatile nft b;
    private static volatile JSONObject c;
    private static volatile boolean d;
    private static final Object e;

    public static /* synthetic */ JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{jSONObject});
        }
        c = jSONObject;
        return jSONObject;
    }

    public static /* synthetic */ nft a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nft) ipChange.ipc$dispatch("f0832e2", new Object[0]) : b;
    }

    public static /* synthetic */ nft a(nft nftVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nft) ipChange.ipc$dispatch("ffc1c12e", new Object[]{nftVar});
        }
        b = nftVar;
        return nftVar;
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f18748a;
    }

    static {
        kge.a(568581693);
        f18748a = d.class.getSimpleName();
        d = false;
        e = d.class;
        c();
    }

    private d() {
    }

    public static boolean a(String str, String str2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("398076a8", new Object[]{str, str2, jSONArray})).booleanValue();
        }
        if (!d || b == null) {
            return false;
        }
        if (c == null) {
            c = new JSONObject();
        }
        Uri a2 = c.a(Uri.parse(str), jSONArray);
        if (a2 == null) {
            return false;
        }
        String uri = a2.toString();
        synchronized (e) {
            c.put(uri, (Object) str2);
            b.a("pha-manifest-header-entry-key", c.toJSONString());
        }
        String str3 = f18748a;
        ngr.b(str3, "putHeaders " + a2 + " " + str2);
        return true;
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        String str2 = null;
        if (!d || c == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        synchronized (e) {
            for (Map.Entry<String, Object> entry : c.entrySet()) {
                if (entry != null && entry.getKey() != null) {
                    Uri parse2 = Uri.parse(entry.getKey());
                    if (ngn.a(parse2, parse) && ngn.b(parse2, parse) && entry.getValue() != null) {
                        str2 = entry.getValue().toString();
                    }
                }
            }
        }
        String str3 = f18748a;
        ngr.b(str3, "getHeaders " + str + " " + str2);
        return str2;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        ngr.b(f18748a, "start to init ManifestHeaderCache");
        Cnew.a(new Runnable() { // from class: com.taobao.pha.core.manifest.d.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                d.a(p.b().h().a("pha-manifest-header"));
                if (d.a() == null) {
                    ngr.b(d.b(), "failed to create a storage instance for caching manifest headers");
                    return;
                }
                ngr.b(d.b(), "finish initializing ManifestHeaderCache");
                String a2 = d.a().a("pha-manifest-header-entry-key");
                d.a(ngn.i(a2));
                String b2 = d.b();
                ngr.b(b2, "finish loading the index file: " + a2);
                d.a(true);
            }
        });
    }
}
