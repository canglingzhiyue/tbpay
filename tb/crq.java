package tb;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.model.d;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.ai;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes3.dex */
public final class crq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f26477a;
    private volatile PhotoFrom b;
    private volatile Uri c;
    private volatile int d;
    private volatile Bitmap e;
    private volatile Bitmap f;
    private volatile String g;
    private volatile Map<String, String> h;
    private volatile Map<String, String> i;
    private volatile String j;
    private volatile AtomicReference<String> k = new AtomicReference<>();
    private volatile Boolean l;
    private volatile Map<String, String> m;
    private volatile Map<String, String> n;
    private volatile Map<String, String> o;
    private volatile int p;
    private Map<String, String> q;

    static {
        kge.a(-95657573);
        Companion = new a(null);
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-686864605);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final crq a(IrpDatasource irpDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (crq) ipChange.ipc$dispatch("64af3e1a", new Object[]{this, irpDatasource});
            }
            q.c(irpDatasource, "irpDatasource");
            crq crqVar = new crq();
            crqVar.b(irpDatasource.Q());
            crqVar.a(irpDatasource.r());
            crqVar.a(irpDatasource.a());
            crqVar.a(irpDatasource.b());
            crqVar.a(irpDatasource.c());
            crqVar.a(irpDatasource.l());
            crqVar.a(ai.b(irpDatasource.d()));
            return crqVar;
        }
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f26477a = str;
        }
    }

    public final String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.f26477a;
    }

    public final void a(PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0785ad0", new Object[]{this, photoFrom});
        } else {
            this.b = photoFrom;
        }
    }

    public final PhotoFrom r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PhotoFrom) ipChange.ipc$dispatch("dc04a265", new Object[]{this}) : this.b;
    }

    public final Uri a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Uri) ipChange.ipc$dispatch("d258659f", new Object[]{this}) : this.c;
    }

    public final void a(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a285df", new Object[]{this, uri});
        } else {
            this.c = uri;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public final int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.d;
    }

    public final void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
        } else {
            this.e = bitmap;
        }
    }

    public final Bitmap c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("f13cc48", new Object[]{this}) : this.e;
    }

    public final void b(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad6d9e65", new Object[]{this, bitmap});
        } else {
            this.f = bitmap;
        }
    }

    public final Bitmap d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("3863b0c9", new Object[]{this}) : this.f;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.g;
    }

    public final void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.h = map;
        }
    }

    public final Map<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("a4689162", new Object[]{this}) : this.h;
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this}) : this.i;
    }

    public final void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b41f8", new Object[]{this, map});
        } else {
            this.q = map;
        }
    }

    public final Map<String, String> v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7f0ead72", new Object[]{this}) : this.q;
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
        } else {
            this.m = map;
        }
    }

    public final void d(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1127953a", new Object[]{this, map});
        } else {
            this.n = map;
        }
    }

    public final void e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8c96b99", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this}) : this.j;
    }

    public final AtomicReference<String> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicReference) ipChange.ipc$dispatch("861efad", new Object[]{this}) : this.k;
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6782aff", new Object[]{this})).booleanValue() : this.p == 2;
    }

    public final boolean j() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        Boolean bool2 = this.l;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (this.c == null || TextUtils.isEmpty(String.valueOf(this.c))) {
            bool = false;
        } else {
            try {
                Uri uri = this.c;
                if (uri == null) {
                    q.a();
                }
                String scheme = uri.getScheme();
                if (scheme == null) {
                    scheme = "";
                }
                if (!q.a((Object) "http", (Object) scheme)) {
                    if (!q.a((Object) "https", (Object) scheme)) {
                        z = false;
                    }
                }
            } catch (Exception unused) {
            }
            bool = Boolean.valueOf(z);
        }
        this.l = bool;
        return bool.booleanValue();
    }

    public final boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        Uri uri = this.c;
        if (uri != null) {
            return q.a((Object) "weex", (Object) uri.getScheme());
        }
        return false;
    }

    public final String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this});
        }
        Uri uri = this.c;
        if (uri == null) {
            return null;
        }
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        q.a((Object) schemeSpecificPart, "innerUri.schemeSpecificPart");
        if (schemeSpecificPart == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String substring = schemeSpecificPart.substring(2);
        q.b(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        Map<String, String> map = this.h;
        return map == null ? "" : map.get("pssource");
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.h;
        if (map != null) {
            return q.a((Object) map.get(d.KEY_PHOTO_FROM), (Object) PhotoFrom.Values.PRODUCT_CODE.getValue());
        }
        return false;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this});
        }
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            return "";
        }
        return "0," + bitmap.getWidth() + ",0," + bitmap.getHeight();
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        Map<String, String> map = this.n;
        if (map != null) {
            z = q.a((Object) "true", (Object) map.get("watermark"));
        }
        if (z) {
            return true;
        }
        Map<String, String> map2 = this.o;
        return map2 != null ? q.a((Object) "true", (Object) map2.get("watermark")) : z;
    }

    public final Map<String, String> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("160f882f", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> map = this.m;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Map<String, String> map2 = this.n;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        Map<String, String> map3 = this.o;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        Map<String, String> map4 = this.i;
        if (map4 != null) {
            linkedHashMap.putAll(map4);
        }
        Map<String, String> map5 = this.q;
        if (map5 != null) {
            linkedHashMap.putAll(map5);
        }
        return linkedHashMap;
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        Bitmap bitmap = this.e;
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = this.f;
        if (bitmap2 == null) {
            return;
        }
        bitmap2.recycle();
    }
}
