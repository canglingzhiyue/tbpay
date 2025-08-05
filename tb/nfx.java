package tb;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.URLUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.input.InputFrame3;
import com.taobao.pha.core.c;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.i;
import com.taobao.pha.core.e;
import com.taobao.pha.core.g;
import com.taobao.pha.core.h;
import com.taobao.pha.core.model.ManifestModel;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabBarModel;
import com.taobao.pha.core.n;
import com.taobao.pha.core.p;
import com.taobao.pha.core.rescache.RequestInterceptor;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public class nfx implements ngg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String f31436a;
    private final AppController b;
    private final PageModel c;
    private final nfv d;
    private g e;
    private boolean f = false;
    private final int g = 3;
    private final h h = p.c();
    private final nex i = p.b().x();
    private final c j = p.b().j();
    private nge k = null;
    private ngd l = null;
    private long m;
    private long n;
    private boolean o;
    private ngk p;

    @Override // tb.ngg
    public boolean a(ngf ngfVar, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b73a6675", new Object[]{this, ngfVar, keyEvent})).booleanValue();
        }
        return false;
    }

    @Override // tb.ngg
    public boolean a(ngf ngfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("46a67af9", new Object[]{this, ngfVar, str})).booleanValue();
        }
        return false;
    }

    public static /* synthetic */ PageModel a(nfx nfxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("f5fd0fec", new Object[]{nfxVar}) : nfxVar.c;
    }

    public static /* synthetic */ AppController b(nfx nfxVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AppController) ipChange.ipc$dispatch("5fd45b6b", new Object[]{nfxVar}) : nfxVar.b;
    }

    static {
        kge.a(129413385);
        kge.a(1028891745);
        f31436a = nfx.class.getSimpleName();
    }

    public void a(ngk ngkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6271bc6", new Object[]{this, ngkVar});
        } else {
            this.p = ngkVar;
        }
    }

    public nfx(AppController appController, nfv nfvVar) {
        this.e = null;
        this.o = false;
        n b = p.b();
        if (b != null) {
            this.e = b.w();
        }
        this.b = appController;
        this.d = nfvVar;
        this.c = nfvVar.e();
        this.o = nfvVar.c();
    }

    @Override // tb.ngg
    public void a(ngf ngfVar, String str, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48056cd9", new Object[]{this, ngfVar, str, bitmap});
            return;
        }
        nfv nfvVar = this.d;
        if (nfvVar == null || !nfvVar.c()) {
            return;
        }
        i P = this.b.P();
        P.a(str);
        P.c(13);
    }

    @Override // tb.ngg
    public void b(ngf ngfVar, String str) {
        com.taobao.pha.core.controller.n O;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8f4336", new Object[]{this, ngfVar, str});
            return;
        }
        nfv nfvVar = this.d;
        if (nfvVar != null && nfvVar.c()) {
            this.b.P().c(14);
        }
        if (this.b.u() != null) {
            z = this.b.u().splashViewClose;
        }
        if (z && (O = this.b.O()) != null) {
            O.b();
        }
        ngk ngkVar = this.p;
        if (ngkVar != null) {
            ngkVar.a(ngfVar, str);
        }
        nex nexVar = this.i;
        if (nexVar == null || !nexVar.f()) {
            return;
        }
        a(this.l, this.k, this.m, this.n);
    }

    @Override // tb.ngg
    public nge a(ngf ngfVar, final ngd ngdVar) {
        Uri a2;
        ngm ngmVar;
        AppController appController;
        nge a3;
        RequestInterceptor f;
        nfh nfhVar;
        ngm ngmVar2;
        JSONObject b;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("83153c8a", new Object[]{this, ngfVar, ngdVar});
        }
        com.taobao.pha.core.rescache.g gVar = null;
        if (ngdVar == null || ngfVar == null || (a2 = ngdVar.a()) == null) {
            return null;
        }
        final String uri = a2.toString();
        if (!(this.h.h() && this.i.f()) || (b = this.i.b()) == null || !b.getBooleanValue("enableProxy")) {
            z = false;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            final Map<String, String> c = ngdVar.c();
            c.put("user-agent", ngfVar.m());
            Map<String, JSONArray> e = this.i.e();
            ngmVar = (e == null || !e.containsKey(uri)) ? null : a(e.get(uri), ngdVar.b(), c);
            if (ngmVar == null) {
                ngmVar = b(uri);
            }
            if (ngmVar == null && URLUtil.isNetworkUrl(uri)) {
                try {
                    nfhVar = (nfh) Cnew.a(new Callable<nfh>() { // from class: tb.nfx.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tb.nfh] */
                        @Override // java.util.concurrent.Callable
                        public /* synthetic */ nfh call() throws Exception {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
                        }

                        public nfh a() {
                            IpChange ipChange2 = $ipChange;
                            return ipChange2 instanceof IpChange ? (nfh) ipChange2.ipc$dispatch("f08316e", new Object[]{this}) : ngs.a(uri, ngdVar.b(), c);
                        }
                    }).get();
                } catch (InterruptedException | ExecutionException e2) {
                    ngr.b(f31436a, "DevTools WebRequests has a problem: " + e2.getMessage());
                    nfhVar = null;
                }
                if (nfhVar != null && nfhVar.d() != null && nfhVar.d().containsKey("content-type")) {
                    List<String> list = nfhVar.d().get("content-type");
                    byte[] c2 = nfhVar.c();
                    if (c2 != null) {
                        if (list != null && !list.isEmpty() && list.get(0).contains("html")) {
                            ngmVar2 = new ngm("text/html", "UTF-8", new ByteArrayInputStream(new String(c2).trim().getBytes()));
                            this.l = ngdVar;
                            this.k = ngmVar2;
                            this.m = currentTimeMillis;
                            this.n = System.currentTimeMillis();
                        } else {
                            ngmVar2 = new ngm(null, "UTF-8", new ByteArrayInputStream(c2));
                        }
                        ngmVar2.a(a(nfhVar.d()));
                        ngmVar = ngmVar2;
                    }
                }
            }
            a(ngdVar, ngmVar, currentTimeMillis, System.currentTimeMillis());
        } else {
            ngmVar = null;
        }
        if (ngu.e()) {
            com.taobao.pha.core.rescache.h g = this.b.g();
            if (g != null) {
                gVar = g.a(ngdVar);
            }
            if (gVar == null && (f = this.b.f()) != null) {
                gVar = f.a(ngdVar);
            }
            if (gVar == null) {
                return ngmVar;
            }
            nge b2 = gVar.b();
            if (b2 != null) {
                JSONObject jSONObject = new JSONObject();
                String c3 = gVar.c();
                jSONObject.put("hitType", (Object) c3);
                jSONObject.put("cost", (Object) Long.valueOf(gVar.e() - gVar.d()));
                jSONObject.put("resUrl", (Object) uri);
                jSONObject.put("isPrefetch", (Object) Boolean.valueOf(gVar.a()));
                if (ngn.d()) {
                    ngr.b(f31436a, "intercepted by PHA: " + jSONObject.toJSONString());
                }
                if (RequestInterceptor.ResourceSource.NETWORK.equals(c3)) {
                    this.b.h().a("offlineResource");
                }
                if (RequestInterceptor.ResourceSource.OFFLINE_RESOURCE.equals(c3)) {
                    this.b.h().a("offlineResource");
                    this.b.h().b("offlineResource");
                }
                this.b.P().a(nfc.PHA_MONITOR_MODULE_POINT_WEB_RESOURCE, jSONObject);
            }
            return b2;
        }
        if (ngmVar == null && this.h.u() && (a3 = a(a2.toString())) != null) {
            ngr.c(f31436a, "builtinScript with url " + a2.toString());
            ngmVar = a3;
        }
        return (ngmVar != null || !p.c().v() || (appController = this.b) == null || appController.n() == null) ? ngmVar : this.b.n().a(a2, ngdVar.c());
    }

    private Map<String, String> a(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("4fc7ad92", new Object[]{this, map});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), TextUtils.join(", ", entry.getValue()));
        }
        if (!hashMap.containsKey(com.taobao.pha.core.rescache.c.HEADER_ACAO) && !hashMap.containsKey(com.taobao.pha.core.rescache.c.HEADER_ACAO.toLowerCase(Locale.ROOT))) {
            hashMap.put(com.taobao.pha.core.rescache.c.HEADER_ACAO, "*");
        }
        return hashMap;
    }

    @Override // tb.ngg
    public void a(ngf ngfVar, ngd ngdVar, nge ngeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b850d4", new Object[]{this, ngfVar, ngdVar, ngeVar});
        } else if (ngfVar == null || ngeVar == null || ngdVar.a() == null) {
        } else {
            String uri = ngdVar.a().toString();
            if (!TextUtils.equals(uri, ngfVar.e()) || c(ngfVar, uri)) {
            }
        }
    }

    private boolean c(ngf ngfVar, String str) {
        PageModel pageModel;
        ArrayList<String> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70780b7b", new Object[]{this, ngfVar, str})).booleanValue();
        }
        String e = ngfVar.e();
        if (e == null || !e.equals(str) || (pageModel = this.c) == null || pageModel.downgradeUrl == null || this.f) {
            return false;
        }
        synchronized (this) {
            if (this.f) {
                return false;
            }
            this.f = true;
            ArrayList<String> arrayList2 = null;
            ngfVar.a("about:blank", (Map<String, String>) null);
            String str2 = this.c.downgradeUrl;
            if (!TextUtils.isEmpty(str2)) {
                Uri t = this.b.t();
                ManifestModel u = this.b.u();
                if (u != null) {
                    arrayList2 = u.queryPass;
                    arrayList = u.queryPassIgnore;
                } else {
                    arrayList = null;
                }
                if (this.c.queryPass != null) {
                    arrayList2 = this.c.queryPass;
                }
                if (this.c.queryPassIgnore != null) {
                    arrayList = this.c.queryPassIgnore;
                }
                Uri a2 = ngn.a(t, Uri.parse(str2), arrayList2, arrayList);
                if (a2 != null) {
                    str2 = a2.toString();
                }
                d(ngfVar, str2);
            }
            return true;
        }
    }

    @Override // tb.ngg
    public void a(ngf ngfVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0759c54", new Object[]{this, ngfVar, new Integer(i), obj});
        } else if (i != 14 || !(obj instanceof Map)) {
        } else {
            Map map = (Map) obj;
            Object obj2 = map.get("ts");
            Object obj3 = map.get("time");
            if (obj2 == null || obj3 == null) {
                return;
            }
            try {
                long parseLong = Long.parseLong((String) obj2);
                this.b.P().a(this.c.getUrl(), Double.parseDouble((String) obj3), parseLong, this.o);
                this.b.a(new e.a("uct2", parseLong));
            } catch (Throwable unused) {
                String str = f31436a;
                ngr.b(str, "error while parse t2, raw: " + obj2);
            }
        }
    }

    @Override // tb.ngg
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        String url = this.c.getUrl();
        if (url != null) {
            String str = f31436a;
            ngr.b(str, "Page WhiteScreen, with manifest: " + this.b.t().toString() + " , webview url: " + url);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageUrl", (Object) url);
            this.b.P().a(jSONObject);
        }
        this.b.a(new e.a("whitescreen"));
    }

    private nge a(String str) {
        InputStream a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("7c72ddc8", new Object[]{this, str});
        }
        g gVar = this.e;
        if (gVar == null || (a2 = gVar.a(Uri.parse(str))) == null) {
            return null;
        }
        ngm ngmVar = new ngm("application/javascript", null, a2);
        HashMap hashMap = new HashMap();
        hashMap.put(com.taobao.pha.core.rescache.c.HEADER_ACAO, "*");
        ngmVar.a(hashMap);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) this.b.t().toString());
        jSONObject.put("resUrl", (Object) str);
        this.b.P().a(nfc.PHA_MONITOR_MODULE_POINT_BUILT_IN_LIBRARY, jSONObject);
        return ngmVar;
    }

    private void d(ngf ngfVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8560d3b8", new Object[]{this, ngfVar, str});
        } else if (ngfVar != null) {
            PageModel pageModel = this.c;
            HashMap hashMap = null;
            JSONArray jSONArray = null;
            hashMap = null;
            if (pageModel != null && pageModel.requestHeaders != null) {
                if (this.b.u() != null) {
                    jSONArray = this.b.u().customDataSource;
                }
                JSONObject a2 = this.b.m().a(this.c.requestHeaders, p.b().a().a(this.b.t(), this.d.r(), jSONArray));
                if (this.c.encodeHeaders) {
                    ngn.a(a2);
                    String str2 = f31436a;
                    ngr.b(str2, "request headers is " + a2.toJSONString());
                }
                hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : a2.entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        hashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
            ngfVar.a(str, hashMap);
        }
    }

    private String a(List<Future<nfh>> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d92c6d16", new Object[]{this, list, new Integer(i)});
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            try {
                nfh nfhVar = list.get(i2).get(i, TimeUnit.SECONDS);
                if (nfhVar != null) {
                    sb.append(new String(nfhVar.c(), "UTF-8"));
                }
            } catch (UnsupportedEncodingException | InterruptedException | ExecutionException | TimeoutException e) {
                ngr.b(f31436a, e.getMessage());
            }
        }
        return sb.toString();
    }

    private nge a(final JSONArray jSONArray, final String str, final Map<String, String> map) {
        ByteArrayInputStream byteArrayInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("229b26ef", new Object[]{this, jSONArray, str, map});
        }
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            final int i2 = i;
            arrayList.add(Cnew.a(new Callable<nfh>() { // from class: tb.nfx.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, tb.nfh] */
                @Override // java.util.concurrent.Callable
                public /* synthetic */ nfh call() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
                }

                public nfh a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (nfh) ipChange2.ipc$dispatch("f08316e", new Object[]{this}) : ngs.a(jSONArray.getString(i2), str, map);
                }
            }));
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(a(arrayList, 3).getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            byteArrayInputStream = null;
        }
        if (byteArrayInputStream == null) {
            return null;
        }
        ngm ngmVar = new ngm("text/javascript", "UTF-8", byteArrayInputStream);
        HashMap hashMap = new HashMap();
        hashMap.put("content-type", "application/javascript");
        hashMap.put(com.taobao.pha.core.rescache.c.HEADER_ACAO, "*");
        ngmVar.a(hashMap);
        ngmVar.a(200, "UnKnownState");
        return ngmVar;
    }

    private void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.b == null) {
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.nfx.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (nfx.a(nfx.this) instanceof TabBarModel) {
                        nfx.b(nfx.this).E().a("devTools.network", jSONObject, "native", "TabBar");
                    } else if (nfx.a(nfx.this) == null || nfx.a(nfx.this).key == null) {
                    } else {
                        nfx.b(nfx.this).E().a("devTools.network", jSONObject, "native", nfx.a(nfx.this).key);
                    }
                }
            });
        }
    }

    private nge b(String str) {
        nge a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nge) ipChange.ipc$dispatch("7d1f8967", new Object[]{this, str});
        }
        c cVar = this.j;
        if (cVar != null && (a2 = cVar.a(str)) != null && a2.e() != null) {
            return a2;
        }
        return null;
    }

    private void a(ngd ngdVar, nge ngeVar, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f61591", new Object[]{this, ngdVar, ngeVar, new Long(j), new Long(j2)});
        } else if (ngdVar == null || ngeVar == null) {
        } else {
            String uri = ngdVar.a().toString();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", (Object) Long.valueOf(j));
            jSONObject2.put("type", (Object) "Document");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("method", (Object) ngdVar.b());
            jSONObject3.put("url", (Object) uri);
            jSONObject3.put("headers", (Object) ngdVar.c());
            jSONObject2.put("request", (Object) jSONObject3);
            jSONObject.put("requestWillBeSent", (Object) jSONObject2);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("timestamp", (Object) Long.valueOf(j2));
            jSONObject4.put("type", (Object) "Document");
            JSONObject jSONObject5 = new JSONObject();
            Map<String, String> d = ngeVar.d();
            jSONObject5.put("status", (Object) Integer.valueOf(ngeVar.c()));
            jSONObject5.put("url", (Object) uri);
            jSONObject5.put("headers", (Object) d);
            jSONObject4.put(InputFrame3.TYPE_RESPONSE, (Object) jSONObject5);
            jSONObject.put("responseReceived", (Object) jSONObject4);
            a(jSONObject);
        }
    }
}
