package com.taobao.pha.core.rescache;

import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.rescache.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.ngd;
import tb.nge;

/* loaded from: classes7.dex */
public class RequestInterceptor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final d sNetworkResourceProvider;

    /* renamed from: a  reason: collision with root package name */
    private final List<Map.Entry<String, c>> f18781a = new ArrayList();
    private e b;

    /* loaded from: classes7.dex */
    public @interface ResourceSource {
        public static final String BUILT_IN_SCRIPT = "BUILT_IN_SCRIPT";
        public static final String NETWORK = "NETWORK";
        public static final String OFFLINE_RESOURCE = "OFFLINE_RESOURCE";
        public static final String THIRD_PARTY = "THIRD_PARTY";
    }

    static {
        kge.a(1637547692);
        sNetworkResourceProvider = new d(true);
    }

    public RequestInterceptor(List<String> list) {
        this.f18781a.add(a(ResourceSource.BUILT_IN_SCRIPT, new a()));
        if (list != null && !list.isEmpty()) {
            this.b = new e(list);
            this.f18781a.add(a(ResourceSource.OFFLINE_RESOURCE, new f(this.b)));
        }
        this.f18781a.add(a(ResourceSource.THIRD_PARTY, new i()));
    }

    private static Map.Entry<String, c> a(final String str, final c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map.Entry) ipChange.ipc$dispatch("b982405b", new Object[]{str, cVar}) : new Map.Entry<String, c>() { // from class: com.taobao.pha.core.rescache.RequestInterceptor.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.String] */
            @Override // java.util.Map.Entry
            public /* synthetic */ String getKey() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("24024602", new Object[]{this}) : a();
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.pha.core.rescache.c, java.lang.Object] */
            @Override // java.util.Map.Entry
            public /* synthetic */ c getValue() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6045ccb0", new Object[]{this}) : b();
            }

            /* JADX WARN: Type inference failed for: r4v4, types: [com.taobao.pha.core.rescache.c, java.lang.Object] */
            @Override // java.util.Map.Entry
            public /* synthetic */ c setValue(c cVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("b40eb7e0", new Object[]{this, cVar2}) : a(cVar2);
            }

            public String a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : str;
            }

            public c b() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (c) ipChange2.ipc$dispatch("2a91deef", new Object[]{this}) : cVar;
            }

            public c a(c cVar2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (c) ipChange2.ipc$dispatch("efc8e1ee", new Object[]{this, cVar2}) : cVar;
            }
        };
    }

    public g a(ngd ngdVar) {
        c value;
        d.a aVar;
        boolean z;
        e eVar;
        d.a b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("5bcc4da7", new Object[]{this, ngdVar});
        }
        Uri a2 = ngdVar.a();
        if (a2 == null) {
            return null;
        }
        String uri = a2.toString();
        long currentTimeMillis = System.currentTimeMillis();
        for (int i = 0; i < this.f18781a.size(); i++) {
            Map.Entry<String, c> entry = this.f18781a.get(i);
            if (entry != null && (value = entry.getValue()) != null) {
                nge a3 = value.a(ngdVar);
                if (a3 != null || !(value instanceof f) || (eVar = this.b) == null || !eVar.a(uri) || (b = sNetworkResourceProvider.b(ngdVar)) == null) {
                    aVar = a3;
                    z = false;
                } else {
                    f.a(uri, b.f18784a);
                    b.f18784a = null;
                    z = true;
                    aVar = b;
                }
                if (aVar != null) {
                    g gVar = new g();
                    gVar.c = currentTimeMillis;
                    gVar.f18787a = aVar;
                    gVar.b = z ? ResourceSource.NETWORK : entry.getKey();
                    gVar.d = System.currentTimeMillis();
                    Map<String, String> d = aVar.d();
                    if (d == null) {
                        d = new HashMap<>();
                    }
                    d.put(c.RESPONSE_HEADER_PHA_PACKAGE_RESOURCE, gVar.b);
                    d.put(c.RESPONSE_HEADER_PHA_PACKAGE_COST, String.valueOf(gVar.d - gVar.c));
                    aVar.a(d);
                    return gVar;
                }
            }
        }
        return null;
    }
}
