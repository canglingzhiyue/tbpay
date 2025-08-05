package com.taobao.pha.core.rescache;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.model.ResourcePrefetchModel;
import com.taobao.pha.core.rescache.RequestInterceptor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import tb.Cnew;
import tb.kge;
import tb.ngd;

/* loaded from: classes7.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final d f18788a;
    private final RequestInterceptor b;
    private final Map<ResourcePrefetchModel, Future<g>> c = new ConcurrentHashMap();

    public static /* synthetic */ RequestInterceptor a(h hVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RequestInterceptor) ipChange.ipc$dispatch("83e2ffaa", new Object[]{hVar}) : hVar.b;
    }

    public static /* synthetic */ d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("b652a6af", new Object[0]) : f18788a;
    }

    public static /* synthetic */ Map a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("2b563fbd", new Object[]{jSONObject}) : b(jSONObject);
    }

    static {
        kge.a(-760902597);
        f18788a = new d(false);
    }

    public h(RequestInterceptor requestInterceptor, List<ResourcePrefetchModel> list) {
        this.b = requestInterceptor;
        for (ResourcePrefetchModel resourcePrefetchModel : list) {
            a(resourcePrefetchModel);
        }
    }

    private static Map<String, String> b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("592eda1c", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap(jSONObject.size());
        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    public void a(final ResourcePrefetchModel resourcePrefetchModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9395bb52", new Object[]{this, resourcePrefetchModel});
        } else if (resourcePrefetchModel != null && !TextUtils.isEmpty(resourcePrefetchModel.src)) {
            final Uri parse = Uri.parse(resourcePrefetchModel.src);
            if (resourcePrefetchModel.queryParams != null && !resourcePrefetchModel.queryParams.isEmpty()) {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames == null) {
                    return;
                }
                for (int i = 0; i < resourcePrefetchModel.queryParams.size(); i++) {
                    if (!queryParameterNames.contains(resourcePrefetchModel.queryParams.get(i))) {
                        return;
                    }
                }
            }
            this.c.put(resourcePrefetchModel, Cnew.a(new Callable<g>() { // from class: com.taobao.pha.core.rescache.h.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.pha.core.rescache.g, java.lang.Object] */
                @Override // java.util.concurrent.Callable
                public /* synthetic */ g call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
                }

                public g a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (g) ipChange2.ipc$dispatch("b652a70c", new Object[]{this});
                    }
                    ngd ngdVar = new ngd() { // from class: com.taobao.pha.core.rescache.h.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.ngd
                        public String b() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (String) ipChange3.ipc$dispatch("367c9fd7", new Object[]{this}) : "GET";
                        }

                        @Override // tb.ngd
                        public Uri a() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (Uri) ipChange3.ipc$dispatch("d258659f", new Object[]{this}) : parse;
                        }

                        @Override // tb.ngd
                        public Map<String, String> c() {
                            IpChange ipChange3 = $ipChange;
                            return ipChange3 instanceof IpChange ? (Map) ipChange3.ipc$dispatch("3b696c1f", new Object[]{this}) : h.a(resourcePrefetchModel.headers);
                        }
                    };
                    g a2 = h.a(h.this).a(ngdVar);
                    if (a2 == null) {
                        a2 = new g();
                        a2.c = System.currentTimeMillis();
                        a2.f18787a = h.a().b(ngdVar);
                        a2.d = System.currentTimeMillis();
                        a2.b = RequestInterceptor.ResourceSource.NETWORK;
                    }
                    a2.e = true;
                    if (resourcePrefetchModel.mimeType != null) {
                        a2.f18787a.a(resourcePrefetchModel.mimeType);
                    }
                    return a2;
                }
            }));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.pha.core.rescache.g a(tb.ngd r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.pha.core.rescache.h.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r10
            r1[r2] = r11
            java.lang.String r11 = "5bcc4da7"
            java.lang.Object r11 = r0.ipc$dispatch(r11, r1)
            com.taobao.pha.core.rescache.g r11 = (com.taobao.pha.core.rescache.g) r11
            return r11
        L18:
            android.net.Uri r11 = r11.a()
            r0 = 0
            if (r11 != 0) goto L20
            return r0
        L20:
            java.util.Map<com.taobao.pha.core.model.ResourcePrefetchModel, java.util.concurrent.Future<com.taobao.pha.core.rescache.g>> r1 = r10.c
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L2a
            java.lang.Object r5 = r4.getKey()
            com.taobao.pha.core.model.ResourcePrefetchModel r5 = (com.taobao.pha.core.model.ResourcePrefetchModel) r5
            if (r5 == 0) goto L2a
            java.lang.String r6 = r5.src
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.lang.String r7 = r6.getScheme()
            java.lang.String r8 = r11.getScheme()
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.lang.String r7 = r6.getHost()
            java.lang.String r8 = r11.getHost()
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.lang.String r7 = r6.getPath()
            java.lang.String r8 = r11.getPath()
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            if (r7 == 0) goto L2a
            java.util.List<java.lang.String> r7 = r5.queryParams
            if (r7 == 0) goto La9
            java.util.List<java.lang.String> r7 = r5.queryParams
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto La9
            java.util.Set r7 = r11.getQueryParameterNames()
            java.util.List<java.lang.String> r5 = r5.queryParams
            java.util.Iterator r5 = r5.iterator()
        L86:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto La9
            java.lang.Object r8 = r5.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = r7.contains(r8)
            if (r9 != 0) goto L9a
        L98:
            r5 = 0
            goto Laa
        L9a:
            java.lang.String r9 = r6.getQueryParameter(r8)
            java.lang.String r8 = r11.getQueryParameter(r8)
            boolean r8 = android.text.TextUtils.equals(r9, r8)
            if (r8 != 0) goto L86
            goto L98
        La9:
            r5 = 1
        Laa:
            if (r5 == 0) goto L2a
            goto Lae
        Lad:
            r4 = r0
        Lae:
            if (r4 == 0) goto Lc8
            java.util.Map<com.taobao.pha.core.model.ResourcePrefetchModel, java.util.concurrent.Future<com.taobao.pha.core.rescache.g>> r11 = r10.c     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r1 = r4.getKey()     // Catch: java.lang.Exception -> Lc8
            r11.remove(r1)     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r11 = r4.getValue()     // Catch: java.lang.Exception -> Lc8
            java.util.concurrent.Future r11 = (java.util.concurrent.Future) r11     // Catch: java.lang.Exception -> Lc8
            java.lang.Object r11 = r11.get()     // Catch: java.lang.Exception -> Lc8
            com.taobao.pha.core.rescache.g r11 = (com.taobao.pha.core.rescache.g) r11     // Catch: java.lang.Exception -> Lc8
            r11.e = r2     // Catch: java.lang.Exception -> Lc8
            return r11
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.pha.core.rescache.h.a(tb.ngd):com.taobao.pha.core.rescache.g");
    }
}
