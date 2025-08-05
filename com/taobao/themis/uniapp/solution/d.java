package com.taobao.themis.uniapp.solution;

import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.RequestCallback;
import android.taobao.windvane.export.network.f;
import android.taobao.windvane.export.network.m;
import com.alibaba.idst.nls.restapi.HttpRequest;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.ui.coordinatorcard.FactoryType;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.weex.e;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import kotlin.text.n;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002JZ\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0013J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u0006J\b\u0010\u001d\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/taobao/themis/uniapp/solution/UniAppDocumentClient;", "", "()V", "callback", "Lcom/taobao/themis/uniapp/solution/UniAppDocumentClient$Callback;", "hasFinishCallback", "", "hasInvalid", "hasRequested", "isStreamType", "loadInfo", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "mDataStream", "Ljava/io/ByteArrayOutputStream;", FactoryType.TYPE_INVALID, "", "onFinish", "request", "url", "", "version", "header", "", "renderer", "directCallback", "isPreset", "setRenderer", "setStreamType", com.taobao.android.weex_framework.util.a.ATOM_boolean, "tryFinishBeforeAllReceive", "Callback", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private boolean f22869a;
    private boolean b;
    private boolean c;
    private ByteArrayOutputStream d;
    private a e;
    private final com.taobao.themis.kernel.preload.c f = new com.taobao.themis.kernel.preload.c();
    private boolean g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J,\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0018\u00010\rH&J\b\u0010\u000f\u001a\u00020\u0003H\u0016J,\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0018\u00010\rH\u0016¨\u0006\u0011"}, d2 = {"Lcom/taobao/themis/uniapp/solution/UniAppDocumentClient$Callback;", "", "onError", "", "code", "", "msg", "", "onFinish", "loadInfo", "Lcom/taobao/themis/kernel/preload/UniAppDocumentLoadInfo;", "onNetWorkResponse", "header", "", "", "onNetworkFinish", "onResponse", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public interface a {

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.themis.uniapp.solution.d$a$a */
        /* loaded from: classes9.dex */
        public static final class C0978a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            static {
                kge.a(849419794);
            }

            public static void a(a aVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6218ce6", new Object[]{aVar});
                }
            }

            public static void a(a aVar, int i, Map<String, List<String>> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("45d9a308", new Object[]{aVar, new Integer(i), map});
                }
            }
        }

        void a();

        void a(int i, String str);

        void a(int i, Map<String, List<String>> map);

        void a(com.taobao.themis.kernel.preload.c cVar);

        void b(int i, Map<String, List<String>> map);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", AdvanceSetting.NETWORK_TYPE, "", "", "kotlin.jvm.PlatformType", "", "isValid"}, k = 3, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c implements m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ String f22871a;

        public c(String str) {
            this.f22871a = str;
        }

        @Override // android.taobao.windvane.export.network.m
        public final boolean a(Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue();
            }
            if (this.f22871a != null && (str = map.get("x-page-version")) != null) {
                return q.a((Object) this.f22871a, (Object) str);
            }
            return true;
        }
    }

    static {
        kge.a(-730355995);
    }

    public static final /* synthetic */ void a(d dVar, ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59f58a8", new Object[]{dVar, byteArrayOutputStream});
        } else {
            dVar.d = byteArrayOutputStream;
        }
    }

    public static final /* synthetic */ void a(d dVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203cf9b1", new Object[]{dVar, new Boolean(z)});
        } else {
            dVar.f22869a = z;
        }
    }

    public static final /* synthetic */ boolean a(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5be0e987", new Object[]{dVar})).booleanValue() : dVar.f22869a;
    }

    public static final /* synthetic */ void b(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63461ea2", new Object[]{dVar});
        } else {
            dVar.b();
        }
    }

    public static final /* synthetic */ boolean c(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6aab53c5", new Object[]{dVar})).booleanValue() : dVar.b;
    }

    public static final /* synthetic */ ByteArrayOutputStream d(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ByteArrayOutputStream) ipChange.ipc$dispatch("c50b199b", new Object[]{dVar}) : dVar.d;
    }

    public static final /* synthetic */ com.taobao.themis.kernel.preload.c e(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.themis.kernel.preload.c) ipChange.ipc$dispatch("be5bd4a5", new Object[]{dVar}) : dVar.f;
    }

    public static final /* synthetic */ a f(d dVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("ace8b8dc", new Object[]{dVar}) : dVar.e;
    }

    public static final /* synthetic */ void g(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8840283d", new Object[]{dVar});
        } else {
            dVar.c();
        }
    }

    public static /* synthetic */ void a(d dVar, String str, String str2, Map map, String str3, boolean z, boolean z2, a aVar, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e6d569", new Object[]{dVar, str, str2, map, str3, new Boolean(z), new Boolean(z2), aVar, new Integer(i), obj});
        } else {
            dVar.a(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : map, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, aVar);
        }
    }

    public final void a(String url, String str, Map<String, String> map, String str2, boolean z, boolean z2, a callback) {
        LinkedHashMap linkedHashMap;
        String sb;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b1451b", new Object[]{this, url, str, map, str2, new Boolean(z), new Boolean(z2), callback});
            return;
        }
        q.d(url, "url");
        q.d(callback, "callback");
        this.e = callback;
        if (map == null || (linkedHashMap = ai.c(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (z2) {
            linkedHashMap.put("x-manifest-preset", "true");
        }
        if (str != null) {
            linkedHashMap.put("x-page-version", str);
        }
        if (str2 == null || q.a((Object) str2, (Object) "weex")) {
            StringBuilder sb2 = new StringBuilder();
            com.taobao.android.weex.c a2 = e.a();
            q.b(a2, "WeexFactory.engine()");
            sb2.append(a2.d());
            sb2.append(",");
            sb = sb2.toString();
        } else {
            sb = "";
        }
        linkedHashMap.put(HttpRequest.HEADER_ACCEPT, sb + android.taobao.windvane.export.network.e.ACCEPTSTR);
        if (q.a((Object) str2, (Object) "web")) {
            this.f22869a = true;
        }
        if (this.b) {
            return;
        }
        this.g = true;
        this.f.a(Integer.valueOf(f.a(new Request.a().a(url).a(linkedHashMap).b("GET").a(new c(str)).a(), new b(callback))));
        this.f.a(this.f22869a);
        if (!z && !this.f22869a) {
            return;
        }
        c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0018\u00010\u000bH\u0016J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J,\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f\u0018\u00010\u000bH\u0016¨\u0006\u0011"}, d2 = {"com/taobao/themis/uniapp/solution/UniAppDocumentClient$request$fetchId$1", "Landroid/taobao/windvane/export/network/RequestCallback;", "onError", "", "code", "", "msg", "", "onFinish", "onNetworkResponse", "header", "", "", "onReceiveData", "data", "", "onResponse", "themis_uniapp_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b extends RequestCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ a b;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1831398055:
                    super.onNetworkResponse(((Number) objArr[0]).intValue(), (Map) objArr[1]);
                    return null;
                case -1155444759:
                    super.onResponse(((Number) objArr[0]).intValue(), (Map) objArr[1]);
                    return null;
                case -229894436:
                    super.onReceiveData((byte[]) objArr[0]);
                    return null;
                case 195948249:
                    super.onFinish();
                    return null;
                case 2053577885:
                    super.onError(((Number) objArr[0]).intValue(), (String) objArr[1]);
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        public b(a aVar) {
            d.this = r1;
            this.b = aVar;
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onResponse(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bb214fe9", new Object[]{this, new Integer(i), map});
                return;
            }
            super.onResponse(i, map);
            this.b.a(i, map);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onNetworkResponse(int i, Map<String, List<String>> map) {
            String str;
            List<String> value;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92d71559", new Object[]{this, new Integer(i), map});
                return;
            }
            super.onNetworkResponse(i, map);
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        Locale locale = Locale.ROOT;
                        q.b(locale, "Locale.ROOT");
                        if (key == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                        str = key.toLowerCase(locale);
                        q.b(str, "(this as java.lang.String).toLowerCase(locale)");
                    } else {
                        str = null;
                    }
                    if (q.a((Object) str, (Object) "content-type") && (value = entry.getValue()) != null && (str2 = (String) p.a((List<? extends Object>) value, 0)) != null && n.b((CharSequence) str2, (CharSequence) "text/html", false, 2, (Object) null)) {
                        d.a(d.this, true);
                    }
                }
            }
            this.b.b(i, map);
            d.b(d.this);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onReceiveData(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f24c16dc", new Object[]{this, bArr});
                return;
            }
            super.onReceiveData(bArr);
            if (d.a(d.this) || d.c(d.this)) {
                return;
            }
            if (d.d(d.this) == null) {
                d.a(d.this, new ByteArrayOutputStream());
                t tVar = t.INSTANCE;
            }
            ByteArrayOutputStream d = d.d(d.this);
            q.a(d);
            d.write(bArr);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onError(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a671c9d", new Object[]{this, new Integer(i), str});
                return;
            }
            super.onError(i, str);
            this.b.a(i, str);
        }

        @Override // android.taobao.windvane.export.network.RequestCallback
        public void onFinish() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
                return;
            }
            super.onFinish();
            if (d.d(d.this) != null && !d.a(d.this)) {
                com.taobao.themis.kernel.preload.c e = d.e(d.this);
                ByteArrayOutputStream d = d.d(d.this);
                q.a(d);
                e.a(d.toByteArray());
            }
            a f = d.f(d.this);
            if (f != null) {
                f.a();
            }
            d.g(d.this);
        }
    }

    public final void a(String renderer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, renderer});
            return;
        }
        q.d(renderer, "renderer");
        if (!q.a((Object) "web", (Object) renderer)) {
            return;
        }
        this.f22869a = true;
        if (!this.g) {
            return;
        }
        b();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = true;
        this.f.a((byte[]) null);
        Integer a2 = this.f.a();
        if (a2 == null) {
            return;
        }
        f.a(a2.intValue());
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.f22869a) {
        } else {
            c();
        }
    }

    private final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.c) {
        } else {
            a aVar = this.e;
            if (aVar != null) {
                aVar.a(this.f);
            }
            this.c = true;
        }
    }
}
