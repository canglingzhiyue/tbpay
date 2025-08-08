package com.taobao.pha.core.rescache;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.p;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import tb.Cnew;
import tb.kge;
import tb.nfn;
import tb.ngd;
import tb.nge;
import tb.ngm;
import tb.ngn;
import tb.ngr;

/* loaded from: classes7.dex */
public class f implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f18786a;
    public static final nfn sPackageCacheDistLru;
    private final e b;

    static {
        kge.a(-2082769076);
        kge.a(-96877230);
        f18786a = f.class.getSimpleName();
        sPackageCacheDistLru = new nfn(p.e(), "PHAOfflineResources", a());
        Cnew.a(new Runnable() { // from class: com.taobao.pha.core.rescache.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    f.sPackageCacheDistLru.a();
                }
            }
        });
    }

    public f(e eVar) {
        this.b = eVar;
    }

    private static int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        try {
            String a2 = p.c().a("disk_size_limit");
            if (StringUtils.isEmpty(a2)) {
                return 52428800;
            }
            int parseInt = Integer.parseInt(a2);
            if (parseInt <= 0) {
                return 52428800;
            }
            return (parseInt << 10) << 10;
        } catch (Throwable unused) {
            ngr.b(f18786a, "Can not parse orange config.");
            return 52428800;
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

    public static String a(Uri uri) {
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

    @Override // com.taobao.pha.core.rescache.c
    public nge a(ngd ngdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("b9283c6d", new Object[]{this, ngdVar});
        }
        Uri a2 = ngdVar.a();
        if (a2 == null) {
            return null;
        }
        String uri = a2.toString();
        if (this.b.a(uri)) {
            String a3 = a(uri);
            if (!StringUtils.isEmpty(a3)) {
                ngm ngmVar = new ngm(a(a2), null, new ByteArrayInputStream(a3.getBytes()));
                HashMap hashMap = new HashMap(2);
                hashMap.put(c.RESPONSE_HEADER_PHA_PACKAGE_RESOURCE, "hit");
                hashMap.put(c.HEADER_ACAO, "*");
                ngmVar.a(hashMap);
                return ngmVar;
            }
        }
        return null;
    }
}
