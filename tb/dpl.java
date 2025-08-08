package tb;

import android.net.Uri;
import android.support.v4.util.Pair;
import mtopsdk.common.util.StringUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.utils.EncryptUtils;
import com.taobao.android.weex.e;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.android.weex_framework.adapter.c;
import com.taobao.android.weex_framework.common.MUSConstants;
import com.taobao.android.weex_framework.common.a;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import com.taobao.android.weex_framework.l;
import com.taobao.android.weex_framework.m;
import com.taobao.android.weex_framework.r;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.g;
import com.taobao.android.weex_framework.util.k;
import com.taobao.android.weex_framework.util.p;
import com.taobao.zcache.Error;
import com.taobao.zcache.RequestType;
import com.taobao.zcache.ResourceRequest;
import com.taobao.zcache.ResourceResponse;
import com.taobao.zcache.n;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.jvm;

/* loaded from: classes4.dex */
public class dpl implements jvm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "[Template]";

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ boolean f26881a;
    private volatile boolean c = m.c();
    private final Map<String, List<b>> f = new HashMap();

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final dpl f26886a;

        static {
            kge.a(-2009390399);
            try {
                com.taobao.android.weex.d.b();
            } catch (Throwable th) {
                g.c(dpl.LOG_TAG, th);
            }
            f26886a = new dpl();
        }

        public static /* synthetic */ dpl a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dpl) ipChange.ipc$dispatch("f03cbbe", new Object[0]) : f26886a;
        }
    }

    @Override // tb.jvm
    public jvm.c a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("2535e2b4", new Object[]{this, str});
        }
        return null;
    }

    static {
        kge.a(1141515599);
        kge.a(1622151571);
        f26881a = !dpl.class.desiredAssertionStatus();
    }

    public static /* synthetic */ List a(dpl dplVar, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("3701e79a", new Object[]{dplVar, map}) : dplVar.a(map);
    }

    public static /* synthetic */ boolean a(dpl dplVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e595ed7c", new Object[]{dplVar})).booleanValue() : dplVar.c;
    }

    public static /* synthetic */ Map b(dpl dplVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ec101e6e", new Object[]{dplVar}) : dplVar.f;
    }

    public static jvm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm) ipChange.ipc$dispatch("f069c9d", new Object[0]) : a.a();
    }

    @Override // tb.jvm
    public boolean e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c6cb13a", new Object[]{this, str})).booleanValue();
        }
        Pair<Uri, Integer> b2 = b(str);
        if (!f.u()) {
            return b(b2);
        }
        return c(b2) != null;
    }

    private boolean b(Pair<Uri, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f968aa66", new Object[]{this, pair})).booleanValue();
        }
        if (pair != null && pair.second.intValue() != 1 && pair.second.intValue() == 0) {
            return dpm.a().a(c(pair.first));
        }
        return false;
    }

    public jvm.c d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvm.c) ipChange.ipc$dispatch("bdc6a251", new Object[]{this, str}) : a(b(str));
    }

    private jvm.c a(Pair<Uri, Integer> pair) {
        byte[] c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("7c161125", new Object[]{this, pair});
        }
        if (pair == null) {
            return null;
        }
        String c3 = c(pair.first);
        if (pair.second.intValue() == 0 && (c2 = dpm.a().c(c3)) != null && c2.length > 0) {
            return jvm.c.a(c2, c3, "weex_cache");
        }
        return null;
    }

    private jvm.c c(Pair<Uri, Integer> pair) {
        byte[] data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.c) ipChange.ipc$dispatch("1eee3e3", new Object[]{this, pair});
        }
        if (pair == null || com.taobao.android.weex.inspector.b.a()) {
            return null;
        }
        final String c2 = c(pair.first);
        if (pair.second.intValue() == 0) {
            final String uri = pair.first.toString();
            ResourceRequest a2 = a(uri, pair);
            byte[] c3 = dpm.a().c(c2);
            if (c3 != null && c3.length > 0) {
                g.b(LOG_TAG, "Load legacy cache success, start zcache request, url: " + uri);
                n.a(a2, new xit() { // from class: tb.dpl.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.xit
                    public void a(ResourceResponse resourceResponse) {
                        byte[] data2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("557641d4", new Object[]{this, resourceResponse});
                        } else if (resourceResponse == null || resourceResponse.getError() != null || (data2 = resourceResponse.getData()) == null || data2.length == 0) {
                        } else {
                            g.b(dpl.LOG_TAG, "zcache request success, clear legacy cache: " + uri);
                            dpm.a().b(c2);
                        }
                    }
                });
                return jvm.c.a(c3, c2, "weex_cache");
            }
            ResourceResponse a3 = n.a(a2);
            if (a3 != null && a3.getError() == null && (data = a3.getData()) != null && data.length != 0) {
                return jvm.c.a(data, c2, "zcache");
            }
        }
        return null;
    }

    @Override // tb.jvm
    public void a(String str, String str2, String str3, boolean z, r rVar, jvm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3162b50f", new Object[]{this, str, str2, str3, new Boolean(z), rVar, aVar});
        } else {
            a(str, str2, str3, z, true, rVar, aVar, new d(), f.u());
        }
    }

    @Override // tb.jvm
    public void b(String str, String str2, String str3, boolean z, r rVar, jvm.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("718d9bd0", new Object[]{this, str, str2, str3, new Boolean(z), rVar, aVar});
        } else {
            a(str, str2, str3, z, false, rVar, aVar, new d(), false);
        }
    }

    @Override // tb.jvm
    public jvm.d a(List<jvm.b> list, long j, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.d) ipChange.ipc$dispatch("28972f25", new Object[]{this, list, new Long(j), rVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        jvm.d a2 = a(list, j, rVar, true);
        a2.d = System.currentTimeMillis() - currentTimeMillis;
        return a2;
    }

    @Override // tb.jvm
    public jvm.d b(List<jvm.b> list, long j, r rVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvm.d) ipChange.ipc$dispatch("c5052b84", new Object[]{this, list, new Long(j), rVar});
        }
        long currentTimeMillis = System.currentTimeMillis();
        jvm.d a2 = a(list, j, rVar, false);
        a2.d = System.currentTimeMillis() - currentTimeMillis;
        return a2;
    }

    @Override // tb.jvm
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        Pair<Uri, Integer> b2 = b(str);
        if (b2 == null) {
            return;
        }
        String c2 = c(b2.first);
        if (b2.second.intValue() == 0) {
            dpm.a().b(c2);
        } else if (b2.second.intValue() != 1) {
        } else {
            dpm.a().b(d(b2.first));
            dpm.a().b(c2);
        }
    }

    private jvm.d a(List<jvm.b> list, long j, r rVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (jvm.d) ipChange.ipc$dispatch("b6524611", new Object[]{this, list, new Long(j), rVar, new Boolean(z)});
        }
        if (list == null) {
            return new jvm.d();
        }
        d dVar = new d();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final AtomicInteger atomicInteger = new AtomicInteger();
        for (final jvm.b bVar : list) {
            final CountDownLatch countDownLatch2 = countDownLatch;
            i += a(bVar.f29817a, bVar.b, bVar.c, false, true, new r(rVar, bVar.f29817a, bVar.b), new jvm.a() { // from class: tb.dpl.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jvm.a
                public void a(jvm.c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("850799b8", new Object[]{this, cVar});
                        return;
                    }
                    concurrentHashMap.put(bVar.f29817a, cVar);
                    if (!cVar.d()) {
                        atomicInteger.incrementAndGet();
                    }
                    countDownLatch2.countDown();
                }

                @Override // tb.jvm.a
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        countDownLatch2.countDown();
                    }
                }
            }, dVar, f.u()) ? 1 : 0;
            countDownLatch = countDownLatch;
        }
        CountDownLatch countDownLatch3 = countDownLatch;
        if (z) {
            try {
                z2 = countDownLatch3.await(j, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                g.a(LOG_TAG, "syncDownloadOrLoadCache: template download interrupted", e);
                z2 = true;
            }
            if (!z2) {
                g.f(LOG_TAG, "[Download]: timeout in " + j + "ms");
                dVar.a(j);
            }
        }
        jvm.d dVar2 = new jvm.d();
        dVar2.f29819a.putAll(concurrentHashMap);
        dVar2.c = atomicInteger.get();
        dVar2.b = i;
        if (g.a()) {
            for (jvm.b bVar2 : list) {
                if (!StringUtils.isEmpty(bVar2.f29817a) && dVar2.f29819a.containsKey(bVar2.f29817a)) {
                    if (dVar2.f29819a.get(bVar2.f29817a).d()) {
                        g.b(LOG_TAG, "Template load cache success, tItemType: " + bVar2.b + ", url: " + bVar2.f29817a);
                    } else {
                        g.b(LOG_TAG, "Template download success, tItemType: " + bVar2.b + ", url: " + bVar2.f29817a);
                    }
                }
            }
        }
        return dVar2;
    }

    private boolean a(String str, String str2, String str3, boolean z, boolean z2, r rVar, jvm.a aVar, d dVar, boolean z3) {
        boolean z4 = z3;
        IpChange ipChange = $ipChange;
        boolean z5 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e52e7e11", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2), rVar, aVar, dVar, new Boolean(z4)})).booleanValue();
        }
        Pair<Uri, Integer> b2 = b(str);
        if (b2 == null) {
            String str4 = "Url invalid: " + str;
            g.f(LOG_TAG, "Template request start error, url: " + str);
            dVar.a(str2, str, rVar, str4);
            aVar.a(WXExceptionConfig.KEY_PARSE_WLM_URL, str4);
            return false;
        }
        jvm.c cVar = null;
        String c2 = c(b2.first);
        if (z4) {
            if (!z) {
                cVar = c(b2);
            }
        } else if (!z) {
            cVar = a(b2);
        }
        if (cVar != null) {
            if (g.a()) {
                g.b(LOG_TAG, "Template request skip, has cache, url: " + str);
            }
            dVar.c(str2, c2, rVar, "filecache");
            aVar.a(cVar);
            return false;
        }
        if (g.a()) {
            g.b(LOG_TAG, "Template request start, url: " + str);
        }
        if (z) {
            z4 = false;
        }
        boolean z6 = !z2 ? false : z4;
        if (!z2 || z) {
            z5 = true;
        }
        a(str, str2, str3, rVar, c2, b2, aVar, dVar, z5, z, z6);
        return true;
    }

    private void a(final String str, String str2, final String str3, final r rVar, final String str4, final Pair<Uri, Integer> pair, jvm.a aVar, d dVar, boolean z, final boolean z2, boolean z3) {
        String d2;
        IpChange ipChange = $ipChange;
        boolean z4 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9726a", new Object[]{this, str, str2, str3, rVar, str4, pair, aVar, dVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        synchronized (this) {
            List<b> list = this.f.get(str);
            b bVar = new b(str2, rVar, dVar, aVar);
            if (list != null) {
                if (g.a()) {
                    g.b(dpj.TAG, "Http request, task merged: " + str);
                }
                list.add(bVar);
                return;
            }
            LinkedList linkedList = new LinkedList();
            linkedList.add(bVar);
            this.f.put(str, linkedList);
            final long currentTimeMillis = System.currentTimeMillis();
            if (z3 && !com.taobao.android.weex.inspector.b.a()) {
                if (g.a()) {
                    g.b(dpj.TAG, "Http request by zcache: " + str);
                }
                n.a(a(str, pair), new xit() { // from class: tb.dpl.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str5, Object... objArr) {
                        str5.hashCode();
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str5));
                    }

                    @Override // tb.xit
                    public void a(ResourceResponse resourceResponse) {
                        Error error;
                        jvm.c b2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("557641d4", new Object[]{this, resourceResponse});
                        } else if (resourceResponse == null) {
                            a(WXExceptionConfig.KEY_PARSE_CONTENT_ERROR, "ZCache response null");
                        } else {
                            if (resourceResponse.getError() != null) {
                                a(WXExceptionConfig.KEY_PARSE_CONTENT_ERROR, "ZCacheError(" + error.getCode() + "): " + error.getMessage());
                                return;
                            }
                            byte[] data = resourceResponse.getData();
                            if (data == null || data.length == 0) {
                                a(WXExceptionConfig.KEY_PARSE_CONTENT_ERROR, "ZCache response bytes empty");
                                return;
                            }
                            boolean isAllFromCache = resourceResponse.isAllFromCache();
                            if (!isAllFromCache) {
                                MUSAppMonitor.a(rVar, System.currentTimeMillis() - currentTimeMillis);
                            }
                            if (!StringUtils.isEmpty(str3) && !dpl.a(dpl.this) && !StringUtils.equals(str3, c.b(data))) {
                                String str5 = "Http request finished success, but data md5 check failed, expect: " + str3 + ", url: " + str;
                                g.f(dpj.TAG, str5);
                                for (b bVar2 : a()) {
                                    bVar2.c().b(bVar2.a(), str, bVar2.b(), "md5 error, expect " + str3);
                                    try {
                                        bVar2.d().a(WXExceptionConfig.KEY_PARSE_MD5_ERROR, str5);
                                    } catch (Throwable th) {
                                        g.a(th);
                                    }
                                }
                                return;
                            }
                            String str6 = resourceResponse.getHeader().get("X-ZCache-Info");
                            if (g.a()) {
                                g.b(dpj.TAG, "Http request by zcache success: " + str + ", isCache: " + isAllFromCache + ", zcacheInfo: " + str6);
                            }
                            dpm.a().b(str4);
                            List<b> a2 = a();
                            if (isAllFromCache) {
                                b2 = jvm.c.a(data, str, "zcache", str6);
                            } else {
                                b2 = jvm.c.b(data, str, k.a(), str6);
                            }
                            for (b bVar3 : a2) {
                                if (isAllFromCache) {
                                    bVar3.c().c(bVar3.a(), str, bVar3.b(), "zcache");
                                } else {
                                    bVar3.c().a(bVar3.a(), str, bVar3.b());
                                }
                                try {
                                    bVar3.d().a(b2);
                                } catch (Throwable th2) {
                                    g.a(th2);
                                }
                            }
                        }
                    }

                    public void a(String str5, String str6) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str5, str6});
                            return;
                        }
                        g.f(dpj.TAG, "Http request failed, code: " + str5 + ", msg: " + str6);
                        for (b bVar2 : a()) {
                            bVar2.c().a(bVar2.a(), str, bVar2.b(), str6);
                            try {
                                bVar2.d().a(str5, str6);
                            } catch (Throwable th) {
                                g.a(th);
                            }
                        }
                    }

                    private List<b> a() {
                        List<b> list2;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (List) ipChange2.ipc$dispatch("627608df", new Object[]{this});
                        }
                        synchronized (dpl.this) {
                            list2 = (List) dpl.b(dpl.this).remove(str);
                            if (list2 == null || list2.size() == 0) {
                                g.f(dpj.TAG, "WTF, httpTasks is null or empty");
                                list2 = new ArrayList<>();
                            }
                        }
                        return list2;
                    }
                });
                return;
            }
            com.taobao.android.weex_framework.adapter.c d3 = d();
            com.taobao.android.weex_framework.common.a aVar2 = new com.taobao.android.weex_framework.common.a();
            aVar2.c = str;
            aVar2.h = z;
            if (pair.second.intValue() == 1) {
                if (dpm.a().a(str4) && (d2 = dpm.a().d(d(pair.first))) != null) {
                    aVar2.b.put(HttpHeaderConstant.IF_NONE_MATCH, d2);
                    if (g.a()) {
                        g.b(dpj.TAG, "Http request, etag cache: " + d2 + ", url: " + str);
                    }
                }
                try {
                    Uri parse = Uri.parse(str);
                    if (parse != null) {
                        if (!e(parse)) {
                            try {
                                aVar2.b.put(HttpRequest.HEADER_ACCEPT, p.b());
                            } catch (Throwable unused) {
                            }
                            z4 = true;
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            aVar2.b.put("user-agent", m.a("system", "userAgent"));
            aVar2.b.put("x-muise-bin-support", "true");
            aVar2.g = new a.C0618a(NetworkResourceType.Document, rVar != null ? rVar.b() : -1);
            if (m.c()) {
                aVar2.b.put(adk.KEY_GREY, "true");
            }
            final boolean z5 = z4;
            d3.a(aVar2, new c.a() { // from class: tb.dpl.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.adapter.c.a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    }
                }

                @Override // com.taobao.android.weex_framework.adapter.c.a
                public void a(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
                    }
                }

                @Override // com.taobao.android.weex_framework.adapter.c.a
                public void a(int i, Map<String, List<String>> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7fc93e8a", new Object[]{this, new Integer(i), map});
                    }
                }

                @Override // com.taobao.android.weex_framework.adapter.c.a
                public void a(com.taobao.android.weex_framework.common.b bVar2) {
                    jvm.c b2;
                    List<String> list2;
                    List a2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("2660175d", new Object[]{this, bVar2});
                        return;
                    }
                    try {
                        if ("200".equals(bVar2.f15987a)) {
                            MUSAppMonitor.a(rVar, System.currentTimeMillis() - currentTimeMillis);
                            if (z5 && ((a2 = dpl.a(dpl.this, bVar2.f)) == null || a2.size() == 0 || !p.a((String) a2.get(0)))) {
                                g.f(dpj.TAG, "Http request finished 200, but content type error, url: " + str);
                                for (b bVar3 : b()) {
                                    bVar3.c().a(bVar3.a(), str, bVar3.b(), MUSConstants.WEEX_DOWNLOAD_ERROR_MSG);
                                    bVar3.d().a(WXExceptionConfig.KEY_PARSE_CONTENT_ERROR, MUSConstants.WEEX_DOWNLOAD_ERROR_MSG);
                                }
                                return;
                            }
                            byte[] bArr = bVar2.b;
                            if (bArr != null && bArr.length != 0) {
                                if (!StringUtils.isEmpty(str3) && !dpl.a(dpl.this) && !StringUtils.equals(str3, c.b(bArr))) {
                                    String str5 = "Http request finished 200, but data md5 check failed, expect: " + str3 + ", url: " + str;
                                    g.f(dpj.TAG, str5);
                                    for (b bVar4 : b()) {
                                        bVar4.c().b(bVar4.a(), str, bVar4.b(), "md5 error, expect " + str3);
                                        bVar4.d().a(WXExceptionConfig.KEY_PARSE_MD5_ERROR, str5);
                                    }
                                    return;
                                }
                                if (((Integer) pair.second).intValue() == 1 && !z2 && (list2 = bVar2.f.get("etag")) != null && list2.size() > 0 && !StringUtils.isEmpty(list2.get(0))) {
                                    dpm.a().a(dpl.this.d((Uri) pair.first), list2.get(0));
                                    if (g.a()) {
                                        g.a(dpj.TAG, "Save etag[" + list2.get(0) + "] for: " + str4);
                                    }
                                }
                                boolean equals = "ZCache".equals(bVar2.e.get("connectionType"));
                                if (!equals && !z2) {
                                    dpm.a().a(str4, bArr);
                                }
                                String str6 = (String) bVar2.e.get("X-ZCache-Info");
                                List<b> b3 = b();
                                if (equals) {
                                    b2 = jvm.c.a(bArr, str, "zcache", str6);
                                } else {
                                    b2 = jvm.c.b(bArr, str, k.a(), str6);
                                }
                                for (b bVar5 : b3) {
                                    if (equals) {
                                        bVar5.c().c(bVar5.a(), str, bVar5.b(), "zcache");
                                    } else {
                                        bVar5.c().a(bVar5.a(), str, bVar5.b());
                                    }
                                    bVar5.d().a(b2);
                                }
                                return;
                            }
                            g.f(dpj.TAG, "Http request finished 200, but data lost, url: " + str);
                            for (b bVar6 : b()) {
                                bVar6.c().a(bVar6.a(), str, bVar6.b(), "Http request finished 200, but data lost");
                                bVar6.d().a(WXExceptionConfig.KEY_PARSE_CONTENT_ERROR, "Http code: 304, error msg: 304 but cache lost");
                            }
                        } else if ("304".equals(bVar2.f15987a)) {
                            if (((Integer) pair.second).intValue() == 1) {
                                byte[] c2 = dpm.a().c(str4);
                                if (c2 != null && c2.length != 0) {
                                    if (g.a()) {
                                        g.b(dpj.TAG, "Http request finished 304 hit cache, url: " + str);
                                    }
                                    jvm.c a3 = jvm.c.a(c2, str, "weex_cache");
                                    for (b bVar7 : b()) {
                                        bVar7.c().c(bVar7.a(), str, bVar7.b(), "filecache");
                                        bVar7.d().a(a3);
                                    }
                                    return;
                                }
                                String str7 = "Http request finished 304, but cache lost, url: " + str;
                                g.f(dpj.TAG, str7);
                                for (b bVar8 : b()) {
                                    bVar8.c().a(bVar8.a(), str, bVar8.b(), str7);
                                    bVar8.d().a(WXExceptionConfig.KEY_PARSE_CONTENT_ERROR, str7);
                                }
                                return;
                            }
                            String str8 = "Http code: " + bVar2.f15987a + ", error msg: cdn url not support 304";
                            g.f(dpj.TAG, str8);
                            for (b bVar9 : b()) {
                                bVar9.c().a(bVar9.a(), str, bVar9.b(), str8);
                                bVar9.d().a("HTTP_" + bVar2.f15987a, str8);
                            }
                        } else {
                            String str9 = "Http code: " + bVar2.f15987a + ", error msg: " + bVar2.d;
                            for (b bVar10 : b()) {
                                bVar10.c().a(bVar10.a(), str, bVar10.b(), str9);
                                bVar10.d().a("HTTP_" + bVar2.f15987a, str9);
                            }
                        }
                    } catch (Throwable th) {
                        g.c(dpl.LOG_TAG, "download finish exception", th);
                    }
                }

                private List<b> b() {
                    List<b> list2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (List) ipChange2.ipc$dispatch("4a17df3e", new Object[]{this});
                    }
                    synchronized (dpl.this) {
                        list2 = (List) dpl.b(dpl.this).remove(str);
                        if (list2 == null || list2.size() == 0) {
                            g.f(dpj.TAG, "WTF, httpTasks is null or empty");
                            list2 = new ArrayList<>();
                        }
                    }
                    return list2;
                }
            });
        }
    }

    private static ResourceRequest a(String str, Pair<Uri, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResourceRequest) ipChange.ipc$dispatch("521026cf", new Object[]{str, pair});
        }
        ResourceRequest resourceRequest = new ResourceRequest(str, new HashMap());
        resourceRequest.setRequestType(RequestType.Weex);
        if (pair.second.intValue() == 1) {
            resourceRequest.getHeader().put(HttpRequest.HEADER_ACCEPT, "application/vnd.weex.v21,application/vnd.weex.v20");
        }
        resourceRequest.getHeader().put(HttpConstant.USER_AGENT, e.a().e());
        return resourceRequest;
    }

    private List<String> a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a923a28a", new Object[]{this, map});
        }
        if (map == null) {
            return null;
        }
        String str = "Content-Type";
        if (!map.containsKey(str)) {
            str = str.toLowerCase();
        }
        return map.get(str);
    }

    private com.taobao.android.weex_framework.adapter.c d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.adapter.c) ipChange.ipc$dispatch("b120f15", new Object[]{this});
        }
        com.taobao.android.weex_framework.adapter.c g = l.a().g();
        return g == null ? new dpj() : g;
    }

    public Pair<Uri, Integer> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7d05d5bc", new Object[]{this, str});
        }
        try {
            Uri parse = Uri.parse(str);
            if (StringUtils.isEmpty(parse.getPath())) {
                g.f(LOG_TAG, "url parse error, path == null, url:" + str);
                return null;
            } else if (StringUtils.isEmpty(parse.getScheme())) {
                g.f(LOG_TAG, "url parse error, scheme == null, url:" + str);
                return null;
            } else if (StringUtils.isEmpty(parse.getHost())) {
                g.f(LOG_TAG, "url parse error, host == null, url:" + str);
                return null;
            } else if (a(parse)) {
                return Pair.create(parse.buildUpon().clearQuery().build(), 0);
            } else {
                if (b(parse)) {
                    return Pair.create(parse.buildUpon().clearQuery().build(), 1);
                }
                g.f(LOG_TAG, "url parse error, not a cdn or a bundle url, url:" + str);
                return null;
            }
        } catch (Exception e) {
            g.c(LOG_TAG, "url parse error, url: " + str, e);
            return null;
        }
    }

    public boolean a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a285e3", new Object[]{this, uri})).booleanValue();
        }
        String path = uri.getPath();
        if (!f26881a && path == null) {
            throw new AssertionError();
        }
        return path.endsWith(".wlm") || path.endsWith(".wlasm") || path.endsWith(".js");
    }

    public boolean b(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38284082", new Object[]{this, uri})).booleanValue();
        }
        String host = uri.getHost();
        if (!f26881a && host == null) {
            throw new AssertionError();
        }
        return "true".equals(uri.getQueryParameter("wh_muise")) || "true".equals(uri.getQueryParameter("wh_weex"));
    }

    private boolean e(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbb9705f", new Object[]{this, uri})).booleanValue();
        }
        String host = uri.getHost();
        if (!f26881a && host == null) {
            throw new AssertionError();
        }
        return host.startsWith("mo.m.taobao.com") || host.startsWith("pre-mo.m.taobao.com");
    }

    public String c(Uri uri) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6767f723", new Object[]{this, uri}) : uri.toString();
    }

    public String d(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3068ee64", new Object[]{this, uri});
        }
        return "etag://" + uri.toString();
    }

    /* loaded from: classes4.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final char[] f26888a;

        static {
            kge.a(993678411);
            f26888a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        }

        public static String a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4b03f151", new Object[]{bArr});
            }
            StringBuilder sb = new StringBuilder(bArr.length << 1);
            for (byte b : bArr) {
                sb.append(f26888a[(b & 240) >>> 4]);
                sb.append(f26888a[b & 15]);
            }
            return sb.toString();
        }

        public static String b(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("47058030", new Object[]{bArr});
            }
            byte[] c = c(bArr);
            return c != null ? a(c) : EncryptUtils.IV_PARAMETER_SPEC;
        }

        public static byte[] c(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("f6d5d94c", new Object[]{bArr});
            }
            if (bArr == null) {
                return null;
            }
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(bArr);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private boolean f26889a;
        private long b;

        static {
            kge.a(1799309494);
        }

        private d() {
            this.b = 0L;
        }

        public synchronized void a(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
                return;
            }
            this.f26889a = true;
            this.b = j;
        }

        public void a(String str, String str2, r rVar) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a3594f", new Object[]{this, str, str2, rVar});
                return;
            }
            synchronized (this) {
                z = this.f26889a;
            }
            if (z) {
                b(str, str2, rVar);
            } else {
                MUSAppMonitor.a(rVar);
            }
        }

        public void a(String str, String str2, r rVar, String str3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5386d59", new Object[]{this, str, str2, rVar, str3});
                return;
            }
            synchronized (this) {
                z = this.f26889a;
            }
            if (z) {
                b(str, str2, rVar);
            } else {
                MUSAppMonitor.h(rVar, "2000", str3);
            }
        }

        public void b(String str, String str2, r rVar, String str3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5ba3538", new Object[]{this, str, str2, rVar, str3});
                return;
            }
            synchronized (this) {
                z = this.f26889a;
            }
            if (z) {
                b(str, str2, rVar);
            } else {
                MUSAppMonitor.h(rVar, "2000", str3);
            }
        }

        public void c(String str, String str2, r rVar, String str3) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("863bfd17", new Object[]{this, str, str2, rVar, str3});
                return;
            }
            synchronized (this) {
                z = this.f26889a;
            }
            if (z) {
                b(str, str2, rVar);
            } else {
                MUSAppMonitor.h(rVar, "2001", str3);
            }
        }

        private void b(String str, String str2, r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaa4aaee", new Object[]{this, str, str2, rVar});
                return;
            }
            MUSAppMonitor.h(rVar, "2000", "timeout in " + (this.b / 1000) + " seconds");
        }
    }

    /* loaded from: classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f26887a;
        private final r b;
        private final d c;
        private final jvm.a d;

        static {
            kge.a(2093257218);
        }

        public b(String str, r rVar, d dVar, jvm.a aVar) {
            this.f26887a = str;
            this.b = rVar;
            this.c = dVar;
            this.d = aVar;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26887a;
        }

        public r b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("d291124", new Object[]{this}) : this.b;
        }

        public d c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("20fb1d7c", new Object[]{this}) : this.c;
        }

        public jvm.a d() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (jvm.a) ipChange.ipc$dispatch("d6afbdd", new Object[]{this}) : this.d;
        }
    }
}
