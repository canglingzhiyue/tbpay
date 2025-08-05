package mtopsdk.network.domain;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.riy;
import tb.rys;

/* loaded from: classes.dex */
public final class Request {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public final String B;
    public boolean C;

    /* renamed from: a  reason: collision with root package name */
    public final String f25005a;
    public final String b;
    public final Map<String, String> c;
    public final mtopsdk.network.domain.a d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    @Deprecated
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final int p;
    public final Object q;
    public final String r;
    public String s;
    public Map<String, String> t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public Class<?> y;
    public boolean z;

    /* loaded from: classes9.dex */
    public interface Environment {
        public static final int DAILY = 2;
        public static final int ONLINE = 0;
        public static final int PRE = 1;

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Definition {
        }
    }

    static {
        kge.a(598984546);
    }

    private Request(a aVar) {
        this.f25005a = aVar.f25006a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.B = aVar.z;
        this.n = aVar.m;
        this.m = aVar.n;
        this.o = aVar.o;
        this.p = aVar.p;
        this.q = aVar.q;
        this.r = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.A = aVar.y;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.h = aVar.h;
        this.i = aVar.i;
        this.z = aVar.x;
        this.C = aVar.A;
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("e68b0fde", new Object[]{this}) : new a();
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : this.c.get(str);
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            this.c.put(str, str2);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Request{ url=");
        sb.append(this.f25005a);
        sb.append(", method=");
        sb.append(this.b);
        sb.append(", appKey=");
        sb.append(this.m);
        sb.append(", authCode=");
        sb.append(this.o);
        sb.append(", headers=");
        sb.append(this.c);
        sb.append(", body=");
        sb.append(this.d);
        sb.append(", seqNo=");
        sb.append(this.e);
        sb.append(", connectTimeoutMills=");
        sb.append(this.f);
        sb.append(", readTimeoutMills=");
        sb.append(this.g);
        sb.append(", retryTimes=");
        sb.append(this.j);
        sb.append(", bizId=");
        sb.append(!TextUtils.isEmpty(this.l) ? this.l : String.valueOf(this.k));
        sb.append(", bizTopic=");
        sb.append(this.B);
        sb.append(", pTraceId=");
        sb.append(this.n);
        sb.append(", env=");
        sb.append(this.p);
        sb.append(", reqContext=");
        sb.append(this.q);
        sb.append(", api=");
        sb.append(this.r);
        sb.append(riy.BLOCK_END_STR);
        return sb.toString();
    }

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean A;

        /* renamed from: a  reason: collision with root package name */
        public String f25006a;
        public String b;
        public Map<String, String> c;
        public mtopsdk.network.domain.a d;
        public String e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        @Deprecated
        public int k;
        public String l;
        public String m;
        public String n;
        public String o;
        public int p;
        public Object q;
        public String r;
        public boolean s;
        public boolean t;
        public boolean u;
        public boolean v;
        public Class<?> w;
        public boolean x;
        public boolean y;
        public String z;

        static {
            kge.a(-1042932679);
        }

        public a() {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.s = true;
            this.t = false;
            this.y = false;
            this.b = "GET";
            this.c = new HashMap();
        }

        private a(Request request) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.s = true;
            this.t = false;
            this.y = false;
            this.f25006a = request.f25005a;
            this.b = request.b;
            this.d = request.d;
            this.c = new HashMap(request.c);
            this.e = request.e;
            this.f = request.f;
            this.g = request.g;
            this.j = request.j;
            this.k = request.k;
            this.l = request.l;
            this.z = request.B;
            this.m = request.n;
            this.n = request.m;
            this.o = request.o;
            this.q = request.q;
            this.r = request.r;
            this.s = request.u;
            this.t = request.v;
            this.u = request.w;
            this.v = request.x;
            this.w = request.y;
            this.h = request.h;
            this.i = request.i;
            this.x = request.z;
            this.A = request.C;
        }

        public a a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4a59d154", new Object[]{this, str});
            }
            if (str == null) {
                throw new IllegalArgumentException("url == null");
            }
            this.f25006a = str;
            return this;
        }

        public a a(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f133b4c9", new Object[]{this, map});
            }
            if (map != null) {
                this.c = map;
            }
            return this;
        }

        public a b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b902433", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("32aadb0b", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.f = i;
            }
            return this;
        }

        public a b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fbabd24c", new Object[]{this, new Integer(i)});
            }
            if (i > 0) {
                this.g = i;
            }
            return this;
        }

        public a c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c4acc98d", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        @Deprecated
        public a d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("8dadc0ce", new Object[]{this, new Integer(i)});
            }
            this.k = i;
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4cc67712", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public a h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("52d6156d", new Object[]{this, str});
            }
            this.z = str;
            return this;
        }

        public a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4dfcc9f1", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4f331cd0", new Object[]{this, str});
            }
            this.n = str;
            return this;
        }

        public a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("50696faf", new Object[]{this, str});
            }
            this.o = str;
            return this;
        }

        public a e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("56aeb80f", new Object[]{this, new Integer(i)});
            }
            this.p = i;
            return this;
        }

        public a a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3d879582", new Object[]{this, obj});
            }
            this.q = obj;
            return this;
        }

        public a g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("519fc28e", new Object[]{this, str});
            }
            this.r = str;
            return this;
        }

        public a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("eadd995a", new Object[]{this, new Boolean(z)});
            }
            this.s = z;
            return this;
        }

        public a a(String str, mtopsdk.network.domain.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("75f5e759", new Object[]{this, str, aVar});
            }
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("method == null || method.length() == 0");
            }
            if (aVar == null && rys.a(str)) {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
            this.b = str;
            this.d = aVar;
            return this;
        }

        public a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b3de909b", new Object[]{this, new Boolean(z)});
            }
            this.t = z;
            return this;
        }

        public a f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d7e26d9f", new Object[]{this, new Boolean(z)});
            }
            this.y = z;
            return this;
        }

        public a c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7cdf87dc", new Object[]{this, new Boolean(z)});
            }
            this.u = z;
            return this;
        }

        public a a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6a84757e", new Object[]{this, new Integer(i), new Integer(i2)});
            }
            if (i2 > 0) {
                this.h = i;
            }
            if (i2 > 0) {
                this.i = i2;
            }
            return this;
        }

        public a d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("45e07f1d", new Object[]{this, new Boolean(z)});
            }
            this.v = z;
            return this;
        }

        public a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ee1765e", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("a0e364e0", new Object[]{this, new Boolean(z)});
            }
            this.A = z;
            return this;
        }

        public a a(Class<?> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("63eb1611", new Object[]{this, cls});
            }
            this.w = cls;
            return this;
        }

        public Request a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Request) ipChange.ipc$dispatch("fc82acfb", new Object[]{this});
            }
            if (this.f25006a == null) {
                throw new IllegalStateException("url == null");
            }
            return new Request(this);
        }
    }
}
