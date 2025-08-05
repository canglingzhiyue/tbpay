package android.taobao.windvane.export.network;

import android.os.Handler;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.startup.UCInitializerInfo;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.ado;
import tb.kge;
import tb.mth;

/* loaded from: classes2.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Integer, RequestCache> f1597a;
    private static final Object b;

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            c(str);
        }
    }

    static {
        kge.a(-943609281);
        f1597a = new LinkedHashMap();
        b = new Object();
    }

    public static int a(Request request, RequestCallback requestCallback) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("71142c86", new Object[]{request, requestCallback})).intValue() : a(request, requestCallback, false);
    }

    public static void a(Request request) {
        Request b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e83d09c0", new Object[]{request});
        } else if (!android.taobao.windvane.config.j.commonConfig.cY) {
            com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG).a("sharedResourcePrefetch disabled").a();
        } else {
            synchronized (b) {
                if (f1597a.size() >= 30) {
                    RVLLevel rVLLevel = RVLLevel.Error;
                    com.taobao.android.riverlogger.e.a(rVLLevel, Constants.TAG, "sharedResource prefetch count exceed limit, url: " + request.a());
                    return;
                }
                try {
                    for (Map.Entry<Integer, RequestCache> entry : f1597a.entrySet()) {
                        RequestCache value = entry.getValue();
                        if (value != null && value.a() && (b2 = value.b()) != null && b2.f().a(request.a(), b2.a())) {
                            RVLLevel rVLLevel2 = RVLLevel.Error;
                            com.taobao.android.riverlogger.e.a(rVLLevel2, Constants.TAG, "sharedResource url already exist, url: " + request.a());
                            return;
                        }
                    }
                } catch (Exception unused) {
                }
                a(request, (RequestCallback) null, true);
            }
        }
    }

    private static int a(Request request, final RequestCallback requestCallback, boolean z) {
        final int i;
        int i2;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b1721894", new Object[]{request, requestCallback, new Boolean(z)})).intValue();
        }
        final Request request2 = new Request(request);
        request2.a(Request.StageName.DOCUMENT_REQUEST_START);
        if (request2.e()) {
            if (mth.a(request2.a())) {
                request2.a("x-s-first-chunk", "true");
            } else {
                if (requestCallback != null) {
                    requestCallback.onError(-1, "url not in ssr white list");
                }
                return request2.d();
            }
        }
        final RequestCache requestCache = new RequestCache(request2);
        requestCache.a(z);
        final int d = request2.d();
        int size = f1597a.size();
        final String a2 = request2.a();
        if (request2.j() != 0 || !n.a(android.taobao.windvane.config.a.f)) {
            i = 2;
        } else {
            boolean c = UCInitializerInfo.a().c(10);
            boolean z3 = a2 != null && a2.contains("enable_force_image_prefetch=true");
            if ((!c || z3) && a2 != null) {
                if (a2.contains("cold_start_image_prefetch_mode=0")) {
                    i2 = 0;
                } else if (a2.contains("cold_start_image_prefetch_mode=1")) {
                    i2 = 1;
                }
                request2.b("H5_webviewReadyWhenPrefetch", String.valueOf(c));
                request2.b("wvEnableImagePrefetchExp", String.valueOf(n.a(android.taobao.windvane.config.a.f)));
                i = i2;
            }
            i2 = 2;
            request2.b("H5_webviewReadyWhenPrefetch", String.valueOf(c));
            request2.b("wvEnableImagePrefetchExp", String.valueOf(n.a(android.taobao.windvane.config.a.f)));
            i = i2;
        }
        if (i == 2) {
            z2 = false;
        }
        final ByteArrayOutputStream byteArrayOutputStream = z2 ? new ByteArrayOutputStream() : null;
        request2.b("H5_prefetchImage", String.valueOf(z2));
        com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a("sendRequest").a("existingPrefetchCount", Integer.valueOf(size)).a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(d)).a("url", (Object) request2.a()).a("headers", request2.c()).a("resourceType", (Object) request2.k()).a("shouldPrefetchImage", Boolean.valueOf(z2)).a("imagePrefetchMode", Integer.valueOf(i)).a();
        new e().a(request2, new RequestCallback() { // from class: android.taobao.windvane.export.network.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onNetworkResponse(int i3, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("92d71559", new Object[]{this, new Integer(i3), map});
                    return;
                }
                Request.this.a(Request.StageName.DOCUMENT_NETWORK_TTFB);
                requestCache.onNetworkResponse(i3, map);
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 != null) {
                    requestCallback2.onNetworkResponse(i3, map);
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a("onNetworkResponse").a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(d)).a("headers", map).a();
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onResponse(int i3, Map<String, List<String>> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i3), map});
                    return;
                }
                Request.this.a(Request.StageName.DOCUMENT_TTFB);
                requestCache.onResponse(i3, map);
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 != null) {
                    requestCallback2.onResponse(i3, map);
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a("onResponse").a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(d)).a("headers", map).a();
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onError(int i3, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i3), str});
                    return;
                }
                requestCache.onError(i3, str);
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 != null) {
                    requestCallback2.onError(i3, str);
                }
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable unused) {
                        com.taobao.android.riverlogger.e.a(RVLLevel.Error, "WindVane/NetworkService", "failed to close networkOutputStream.");
                    }
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a("finish").a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(d)).a("success", (Object) false).a("errorMsg", (Object) str).a();
                Request.this.a(Request.StageName.DOCUMENT_REQUEST_END);
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onReceiveData(byte[] bArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                    return;
                }
                requestCache.onReceiveData(bArr);
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 != null) {
                    requestCallback2.onReceiveData(bArr);
                }
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 == null) {
                    return;
                }
                try {
                    byteArrayOutputStream2.write(bArr);
                } catch (Throwable unused) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Error, "WindVane/NetworkService", "failed to write bytes.");
                }
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onFinish() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("badeed9", new Object[]{this});
                    return;
                }
                requestCache.onFinish();
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 != null) {
                    requestCallback2.onFinish();
                }
                ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        String byteArrayOutputStream3 = byteArrayOutputStream2.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        if (!TextUtils.isEmpty(byteArrayOutputStream3)) {
                            Matcher matcher = Pattern.compile(i == 0 ? "<img[^>]*\\bdata-enable-preload\\b[^>]*\\bsrc\\s*=\\s*\"([^\"]*)\"[^>]*>" : "<img\\b(?![^>]*\\bdata-disable-preload\\b)[^>]*\\bsrc=[\"']([^\"']+)[\"'][^>]*>").matcher(byteArrayOutputStream3);
                            while (matcher.find()) {
                                String group = matcher.group(1);
                                if (!TextUtils.isEmpty(group)) {
                                    if (group.startsWith(ado.URL_SEPARATOR)) {
                                        if (a2.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX)) {
                                            group = com.taobao.vessel.utils.b.HTTPS_SCHEMA + group;
                                        } else if (a2.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX)) {
                                            group = "http:" + group;
                                        }
                                    }
                                    if (group.startsWith(com.taobao.search.common.util.k.HTTPS_PREFIX) || group.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX)) {
                                        f.a(new Request.a().a(group).b("GET").a(1).a());
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                        com.taobao.android.riverlogger.e.a(RVLLevel.Error, "WindVane/NetworkService", "failed to close byteArrayOutputStream");
                    }
                }
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a("finish").a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(d)).a("success", (Object) true).a();
                Request.this.a(Request.StageName.DOCUMENT_REQUEST_END);
            }

            @Override // android.taobao.windvane.export.network.RequestCallback
            public void onCustomCallback(int i3, Object... objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c344bdea", new Object[]{this, new Integer(i3), objArr});
                    return;
                }
                requestCache.onCustomCallback(i3, objArr);
                RequestCallback requestCallback2 = requestCallback;
                if (requestCallback2 == null) {
                    return;
                }
                requestCallback2.onCustomCallback(i3, objArr);
            }
        }, null);
        synchronized (b) {
            f1597a.put(Integer.valueOf(d), requestCache);
        }
        Handler b2 = b.a().b();
        if (b2 != null) {
            b2.postDelayed(new Runnable() { // from class: android.taobao.windvane.export.network.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!f.a(d)) {
                    } else {
                        com.taobao.android.riverlogger.e.a(RVLLevel.Error, Constants.TAG).a(Constants.EVENT_PREFETCH_EXPIRED).a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(d)).a();
                        f.b(a2);
                    }
                }
            }, 30000L);
        }
        return d;
    }

    public static boolean a(int i, RequestCallback requestCallback, l lVar) {
        RequestCache remove;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d02ed6d", new Object[]{new Integer(i), requestCallback, lVar})).booleanValue();
        }
        synchronized (b) {
            remove = f1597a.remove(Integer.valueOf(i));
        }
        if (remove != null) {
            return a(remove, requestCallback, lVar);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        r1 = r3.getKey();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r7, android.taobao.windvane.export.network.RequestCallback r8, android.taobao.windvane.export.network.l r9) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = android.taobao.windvane.export.network.f.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1f
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r7
            r7 = 1
            r1[r7] = r8
            r7 = 2
            r1[r7] = r9
            java.lang.String r7 = "4f708844"
            java.lang.Object r7 = r0.ipc$dispatch(r7, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L1f:
            java.lang.Object r0 = android.taobao.windvane.export.network.f.b
            monitor-enter(r0)
            r1 = 0
            java.util.Map<java.lang.Integer, android.taobao.windvane.export.network.RequestCache> r2 = android.taobao.windvane.export.network.f.f1597a     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            android.taobao.windvane.export.network.RequestCache r4 = (android.taobao.windvane.export.network.RequestCache) r4     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r4 == 0) goto L2d
            boolean r5 = r4.a()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r5 == 0) goto L2d
            android.taobao.windvane.export.network.Request r5 = r4.b()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r5 == 0) goto L2d
            android.taobao.windvane.export.network.c r6 = r5.f()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            java.lang.String r5 = r5.a()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            boolean r5 = r6.a(r7, r5)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L69
            if (r5 == 0) goto L2d
            java.lang.Object r7 = r3.getKey()     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L67
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Exception -> L63 java.lang.Throwable -> L67
            r1 = r7
            goto L87
        L63:
            r7 = move-exception
            goto L6b
        L65:
            r4 = r1
            goto L87
        L67:
            r7 = move-exception
            goto L96
        L69:
            r7 = move-exception
            r4 = r1
        L6b:
            com.taobao.android.riverlogger.RVLLevel r2 = com.taobao.android.riverlogger.RVLLevel.Error     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "Themis/Performance/RequestPrefetch"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67
            r5.<init>()     // Catch: java.lang.Throwable -> L67
            java.lang.String r6 = "consumePrefetchResponseWithUrl error: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L67
            r5.append(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r7 = r5.toString()     // Catch: java.lang.Throwable -> L67
            com.taobao.android.riverlogger.e.a(r2, r3, r7)     // Catch: java.lang.Throwable -> L67
        L87:
            if (r4 == 0) goto L90
            if (r1 == 0) goto L90
            java.util.Map<java.lang.Integer, android.taobao.windvane.export.network.RequestCache> r7 = android.taobao.windvane.export.network.f.f1597a     // Catch: java.lang.Throwable -> L67
            r7.remove(r1)     // Catch: java.lang.Throwable -> L67
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            boolean r7 = a(r4, r8, r9)
            return r7
        L96:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L67
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.export.network.f.a(java.lang.String, android.taobao.windvane.export.network.RequestCallback, android.taobao.windvane.export.network.l):boolean");
    }

    public static boolean b(int i) {
        boolean containsKey;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{new Integer(i)})).booleanValue();
        }
        synchronized (b) {
            containsKey = f1597a.containsKey(Integer.valueOf(i));
        }
        return containsKey;
    }

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue();
        }
        RequestCache requestCache = null;
        synchronized (b) {
            try {
                Iterator<Map.Entry<Integer, RequestCache>> it = f1597a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    RequestCache value = it.next().getValue();
                    if (value != null && value.a()) {
                        Request b2 = value.b();
                        if (b2.f().a(str, b2.a())) {
                            requestCache = value;
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                RVLLevel rVLLevel = RVLLevel.Error;
                com.taobao.android.riverlogger.e.a(rVLLevel, Constants.TAG, "consumePrefetchResponseWithUrl error: " + e.getMessage());
            }
        }
        return requestCache != null && requestCache.a();
    }

    private static boolean a(RequestCache requestCache, RequestCallback requestCallback, final l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63242140", new Object[]{requestCache, requestCallback, lVar})).booleanValue();
        }
        if (requestCache == null || !requestCache.a(requestCallback)) {
            return false;
        }
        final Request b2 = requestCache.b();
        b2.a(Request.StageName.DOCUMENT_PREFETCH_CONSUME);
        b2.a(new l() { // from class: android.taobao.windvane.export.network.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private long c;
            private final com.taobao.android.riverlogger.b d = com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a(Constants.EVENT_PREFETCH_TIMING);
            private int e = 0;

            @Override // android.taobao.windvane.export.network.l
            public void recordStage(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6a661a86", new Object[]{this, str, new Long(j)});
                    return;
                }
                if (l.this != null && b2.j() == 0) {
                    l.this.recordStage(str, j);
                }
                if (Request.StageName.DOCUMENT_REQUEST_START.equals(str)) {
                    this.c = j;
                } else {
                    this.d.a(str, Long.valueOf(j - this.c));
                }
                if (Request.StageName.DOCUMENT_REQUEST_END.equals(str) || Request.StageName.DOCUMENT_PREFETCH_CONSUME.equals(str)) {
                    this.e++;
                }
                if (this.e != 2) {
                    return;
                }
                try {
                    this.d.a("type", (Object) (l.this == null ? "system" : "uc")).a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(b2.d())).a("url", (Object) b2.a()).a();
                } catch (Exception unused) {
                }
            }

            @Override // android.taobao.windvane.export.network.l
            public void recordProperty(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d2bd161", new Object[]{this, str, str2});
                    return;
                }
                l lVar2 = l.this;
                if (lVar2 == null) {
                    return;
                }
                lVar2.recordProperty(str, str2);
            }
        });
        com.taobao.android.riverlogger.e.a(RVLLevel.Info, Constants.TAG).a("consume").a(com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.e.REQUEST_ID, Integer.valueOf(b2.d())).a("url", (Object) b2.a()).a("isShared", Boolean.valueOf(requestCache.a())).a();
        return true;
    }

    public static boolean a(int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{new Integer(i)})).booleanValue();
        }
        synchronized (b) {
            if (f1597a.remove(Integer.valueOf(i)) != null) {
                z = true;
            }
        }
        return z;
    }

    private static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        android.taobao.windvane.monitor.a.commitSuccess("wvPrefetchExpired", jSONObject.toJSONString());
    }
}
