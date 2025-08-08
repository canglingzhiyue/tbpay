package com.meizu.cloud.pushsdk.e.b;

import android.graphics.Bitmap;
import mtopsdk.common.util.StringUtils;
import android.widget.ImageView;
import com.meizu.cloud.pushsdk.e.b.b;
import com.meizu.cloud.pushsdk.e.d.b;
import com.meizu.cloud.pushsdk.e.d.c;
import com.meizu.cloud.pushsdk.e.d.f;
import com.meizu.cloud.pushsdk.e.d.g;
import com.meizu.cloud.pushsdk.e.d.h;
import com.meizu.cloud.pushsdk.e.d.j;
import com.meizu.cloud.pushsdk.e.d.k;
import java.io.File;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.riy;

/* loaded from: classes4.dex */
public class b<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    private static final g f7898a = g.a("application/json; charset=utf-8");
    private static final g b = g.a("text/x-markdown; charset=utf-8");
    private static final Object c = new Object();
    private int A;
    private boolean B;
    private int C;
    private com.meizu.cloud.pushsdk.e.e.a D;
    private Bitmap.Config E;
    private int F;
    private int G;
    private ImageView.ScaleType H;
    private final Executor I;
    private String J;
    private Type K;
    private final int d;
    private final com.meizu.cloud.pushsdk.e.b.d e;
    private final int f;
    private final String g;
    private int h;
    private final Object i;
    private com.meizu.cloud.pushsdk.e.b.e j;
    private final HashMap<String, String> k;
    private HashMap<String, String> l;
    private HashMap<String, String> m;
    private HashMap<String, String> n;
    private final HashMap<String, String> o;
    private final HashMap<String, String> p;
    private HashMap<String, File> q;
    private String r;
    private String s;
    private JSONObject t;
    private JSONArray u;
    private String v;
    private byte[] w;
    private File x;
    private g y;
    private com.meizu.cloud.pushsdk.e.d.a z;

    /* loaded from: classes4.dex */
    class a implements com.meizu.cloud.pushsdk.e.e.a {
        a() {
        }

        @Override // com.meizu.cloud.pushsdk.e.e.a
        public void a(long j, long j2) {
            b.this.A = (int) ((100 * j) / j2);
            if (b.this.D == null || b.this.B) {
                return;
            }
            b.this.D.a(j, j2);
        }
    }

    /* renamed from: com.meizu.cloud.pushsdk.e.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class C0278b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7900a;

        static {
            int[] iArr = new int[com.meizu.cloud.pushsdk.e.b.e.values().length];
            f7900a = iArr;
            try {
                iArr[com.meizu.cloud.pushsdk.e.b.e.JSON_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7900a[com.meizu.cloud.pushsdk.e.b.e.JSON_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7900a[com.meizu.cloud.pushsdk.e.b.e.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7900a[com.meizu.cloud.pushsdk.e.b.e.BITMAP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7900a[com.meizu.cloud.pushsdk.e.b.e.PREFETCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class c<T extends c> {
        private final String b;
        private Object c;
        private final String g;
        private final String h;
        private Executor j;
        private String k;

        /* renamed from: a  reason: collision with root package name */
        private com.meizu.cloud.pushsdk.e.b.d f7901a = com.meizu.cloud.pushsdk.e.b.d.MEDIUM;
        private final HashMap<String, String> d = new HashMap<>();
        private final HashMap<String, String> e = new HashMap<>();
        private final HashMap<String, String> f = new HashMap<>();
        private int i = 0;

        public c(String str, String str2, String str3) {
            this.b = str;
            this.g = str2;
            this.h = str3;
        }

        public b a() {
            return new b(this);
        }
    }

    /* loaded from: classes4.dex */
    public static class d<T extends d> {
        private final String c;
        private Object d;
        private Bitmap.Config e;
        private int f;
        private int g;
        private ImageView.ScaleType h;
        private Executor l;
        private String m;

        /* renamed from: a  reason: collision with root package name */
        private com.meizu.cloud.pushsdk.e.b.d f7902a = com.meizu.cloud.pushsdk.e.b.d.MEDIUM;
        private final HashMap<String, String> i = new HashMap<>();
        private final HashMap<String, String> j = new HashMap<>();
        private final HashMap<String, String> k = new HashMap<>();
        private final int b = 0;

        public d(String str) {
            this.c = str;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    this.j.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    /* loaded from: classes4.dex */
    public static class e<T extends e> {
        private final String b;
        private Object c;
        private Executor j;
        private String k;
        private String l;

        /* renamed from: a  reason: collision with root package name */
        private com.meizu.cloud.pushsdk.e.b.d f7903a = com.meizu.cloud.pushsdk.e.b.d.MEDIUM;
        private final HashMap<String, String> d = new HashMap<>();
        private final HashMap<String, String> e = new HashMap<>();
        private final HashMap<String, String> f = new HashMap<>();
        private final HashMap<String, String> g = new HashMap<>();
        private final HashMap<String, File> h = new HashMap<>();
        private int i = 0;

        public e(String str) {
            this.b = str;
        }

        public T a(String str, File file) {
            this.h.put(str, file);
            return this;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    this.e.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    /* loaded from: classes4.dex */
    public static class f<T extends f> {
        private final String c;
        private Object d;
        private Executor o;
        private String p;
        private String q;

        /* renamed from: a  reason: collision with root package name */
        private com.meizu.cloud.pushsdk.e.b.d f7904a = com.meizu.cloud.pushsdk.e.b.d.MEDIUM;
        private JSONObject e = null;
        private JSONArray f = null;
        private String g = null;
        private byte[] h = null;
        private File i = null;
        private final HashMap<String, String> j = new HashMap<>();
        private final HashMap<String, String> k = new HashMap<>();
        private final HashMap<String, String> l = new HashMap<>();
        private final HashMap<String, String> m = new HashMap<>();
        private final HashMap<String, String> n = new HashMap<>();
        private final int b = 1;

        public f(String str) {
            this.c = str;
        }

        public T a(HashMap<String, String> hashMap) {
            if (hashMap != null) {
                for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                    this.k.put(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public b a() {
            return new b(this);
        }
    }

    public b(c cVar) {
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.q = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.C = 0;
        this.K = null;
        this.f = 1;
        this.d = 0;
        this.e = cVar.f7901a;
        this.g = cVar.b;
        this.i = cVar.c;
        this.r = cVar.g;
        this.s = cVar.h;
        this.k = cVar.d;
        this.o = cVar.e;
        this.p = cVar.f;
        this.C = cVar.i;
        this.I = cVar.j;
        this.J = cVar.k;
    }

    public b(d dVar) {
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.q = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.C = 0;
        this.K = null;
        this.f = 0;
        this.d = dVar.b;
        this.e = dVar.f7902a;
        this.g = dVar.c;
        this.i = dVar.d;
        this.k = dVar.i;
        this.E = dVar.e;
        this.G = dVar.g;
        this.F = dVar.f;
        this.H = dVar.h;
        this.o = dVar.j;
        this.p = dVar.k;
        this.I = dVar.l;
        this.J = dVar.m;
    }

    public b(e eVar) {
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.q = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.C = 0;
        this.K = null;
        this.f = 2;
        this.d = 1;
        this.e = eVar.f7903a;
        this.g = eVar.b;
        this.i = eVar.c;
        this.k = eVar.d;
        this.o = eVar.f;
        this.p = eVar.g;
        this.n = eVar.e;
        this.q = eVar.h;
        this.C = eVar.i;
        this.I = eVar.j;
        this.J = eVar.k;
        if (eVar.l != null) {
            this.y = g.a(eVar.l);
        }
    }

    public b(f fVar) {
        this.l = new HashMap<>();
        this.m = new HashMap<>();
        this.n = new HashMap<>();
        this.q = new HashMap<>();
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.C = 0;
        this.K = null;
        this.f = 0;
        this.d = fVar.b;
        this.e = fVar.f7904a;
        this.g = fVar.c;
        this.i = fVar.d;
        this.k = fVar.j;
        this.l = fVar.k;
        this.m = fVar.l;
        this.o = fVar.m;
        this.p = fVar.n;
        this.t = fVar.e;
        this.u = fVar.f;
        this.v = fVar.g;
        this.x = fVar.i;
        this.w = fVar.h;
        this.I = fVar.o;
        this.J = fVar.p;
        if (fVar.q != null) {
            this.y = g.a(fVar.q);
        }
    }

    public com.meizu.cloud.pushsdk.e.b.c a() {
        this.j = com.meizu.cloud.pushsdk.e.b.e.BITMAP;
        return com.meizu.cloud.pushsdk.e.f.c.a(this);
    }

    public com.meizu.cloud.pushsdk.e.b.c a(k kVar) {
        com.meizu.cloud.pushsdk.e.b.c<Bitmap> a2;
        int i = C0278b.f7900a[this.j.ordinal()];
        if (i == 1) {
            try {
                return com.meizu.cloud.pushsdk.e.b.c.a(new JSONArray(com.meizu.cloud.pushsdk.e.h.g.a(kVar.a().f()).a()));
            } catch (Exception e2) {
                return com.meizu.cloud.pushsdk.e.b.c.a(com.meizu.cloud.pushsdk.e.i.b.b(new com.meizu.cloud.pushsdk.e.c.a(e2)));
            }
        } else if (i == 2) {
            try {
                return com.meizu.cloud.pushsdk.e.b.c.a(new JSONObject(com.meizu.cloud.pushsdk.e.h.g.a(kVar.a().f()).a()));
            } catch (Exception e3) {
                return com.meizu.cloud.pushsdk.e.b.c.a(com.meizu.cloud.pushsdk.e.i.b.b(new com.meizu.cloud.pushsdk.e.c.a(e3)));
            }
        } else if (i == 3) {
            try {
                return com.meizu.cloud.pushsdk.e.b.c.a(com.meizu.cloud.pushsdk.e.h.g.a(kVar.a().f()).a());
            } catch (Exception e4) {
                return com.meizu.cloud.pushsdk.e.b.c.a(com.meizu.cloud.pushsdk.e.i.b.b(new com.meizu.cloud.pushsdk.e.c.a(e4)));
            }
        } else if (i != 4) {
            if (i == 5) {
                return com.meizu.cloud.pushsdk.e.b.c.a("prefetch");
            }
            return null;
        } else {
            synchronized (c) {
                try {
                    try {
                        a2 = com.meizu.cloud.pushsdk.e.i.b.a(kVar, this.F, this.G, this.E, this.H);
                    } catch (Exception e5) {
                        return com.meizu.cloud.pushsdk.e.b.c.a(com.meizu.cloud.pushsdk.e.i.b.b(new com.meizu.cloud.pushsdk.e.c.a(e5)));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return a2;
        }
    }

    public com.meizu.cloud.pushsdk.e.c.a a(com.meizu.cloud.pushsdk.e.c.a aVar) {
        try {
            if (aVar.c() != null && aVar.c().a() != null && aVar.c().a().f() != null) {
                aVar.a(com.meizu.cloud.pushsdk.e.h.g.a(aVar.c().a().f()).a());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return aVar;
    }

    public void a(com.meizu.cloud.pushsdk.e.d.a aVar) {
        this.z = aVar;
    }

    public void a(String str) {
        this.J = str;
    }

    public com.meizu.cloud.pushsdk.e.b.c b() {
        return com.meizu.cloud.pushsdk.e.f.c.a(this);
    }

    public com.meizu.cloud.pushsdk.e.b.c c() {
        this.j = com.meizu.cloud.pushsdk.e.b.e.JSON_OBJECT;
        return com.meizu.cloud.pushsdk.e.f.c.a(this);
    }

    public com.meizu.cloud.pushsdk.e.b.c d() {
        this.j = com.meizu.cloud.pushsdk.e.b.e.STRING;
        return com.meizu.cloud.pushsdk.e.f.c.a(this);
    }

    public com.meizu.cloud.pushsdk.e.d.a e() {
        return this.z;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String f() {
        return this.r;
    }

    public String g() {
        return this.s;
    }

    public com.meizu.cloud.pushsdk.e.d.c h() {
        c.b bVar = new c.b();
        try {
            for (Map.Entry<String, String> entry : this.k.entrySet()) {
                bVar.a(entry.getKey(), entry.getValue());
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return bVar.a();
    }

    public int hashCode() {
        return super.hashCode();
    }

    public int i() {
        return this.d;
    }

    public j j() {
        h.a a2 = new h.a().a(h.e);
        try {
            for (Map.Entry<String, String> entry : this.n.entrySet()) {
                a2.a(com.meizu.cloud.pushsdk.e.d.c.a("Content-Disposition", "form-data; name=\"" + entry.getKey() + "\""), j.a((g) null, entry.getValue()));
            }
            for (Map.Entry<String, File> entry2 : this.q.entrySet()) {
                if (entry2.getValue() != null) {
                    String name = entry2.getValue().getName();
                    j a3 = j.a(g.a(com.meizu.cloud.pushsdk.e.i.b.a(name)), entry2.getValue());
                    a2.a(com.meizu.cloud.pushsdk.e.d.c.a("Content-Disposition", "form-data; name=\"" + entry2.getKey() + "\"; filename=\"" + name + "\""), a3);
                    g gVar = this.y;
                    if (gVar != null) {
                        a2.a(gVar);
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return a2.a();
    }

    public j k() {
        JSONObject jSONObject = this.t;
        if (jSONObject != null) {
            g gVar = this.y;
            return gVar != null ? j.a(gVar, jSONObject.toString()) : j.a(f7898a, jSONObject.toString());
        }
        JSONArray jSONArray = this.u;
        if (jSONArray != null) {
            g gVar2 = this.y;
            return gVar2 != null ? j.a(gVar2, jSONArray.toString()) : j.a(f7898a, jSONArray.toString());
        }
        String str = this.v;
        if (str != null) {
            g gVar3 = this.y;
            return gVar3 != null ? j.a(gVar3, str) : j.a(b, str);
        }
        File file = this.x;
        if (file != null) {
            g gVar4 = this.y;
            return gVar4 != null ? j.a(gVar4, file) : j.a(b, file);
        }
        byte[] bArr = this.w;
        if (bArr != null) {
            g gVar5 = this.y;
            return gVar5 != null ? j.a(gVar5, bArr) : j.a(b, bArr);
        }
        b.C0279b c0279b = new b.C0279b();
        try {
            for (Map.Entry<String, String> entry : this.l.entrySet()) {
                if (!StringUtils.isEmpty(entry.getKey()) && !StringUtils.isEmpty(entry.getValue())) {
                    c0279b.a(entry.getKey(), entry.getValue());
                }
            }
            for (Map.Entry<String, String> entry2 : this.m.entrySet()) {
                if (!StringUtils.isEmpty(entry2.getKey()) && !StringUtils.isEmpty(entry2.getValue())) {
                    c0279b.b(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return c0279b.a();
    }

    public int l() {
        return this.f;
    }

    public com.meizu.cloud.pushsdk.e.b.e m() {
        return this.j;
    }

    public com.meizu.cloud.pushsdk.e.e.a n() {
        return new a();
    }

    public String o() {
        String str = this.g;
        for (Map.Entry<String, String> entry : this.p.entrySet()) {
            str = str.replace(riy.BLOCK_START_STR + entry.getKey() + riy.BLOCK_END_STR, String.valueOf(entry.getValue()));
        }
        f.b f2 = com.meizu.cloud.pushsdk.e.d.f.b(str).f();
        for (Map.Entry<String, String> entry2 : this.o.entrySet()) {
            f2.a(entry2.getKey(), entry2.getValue());
        }
        return f2.a().toString();
    }

    public String p() {
        return this.J;
    }

    public String toString() {
        return "ANRequest{sequenceNumber='" + this.h + ", mMethod=" + this.d + ", mPriority=" + this.e + ", mRequestType=" + this.f + ", mUrl=" + this.g + '}';
    }
}
