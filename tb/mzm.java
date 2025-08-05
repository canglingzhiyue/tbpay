package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class mzm implements myr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ROOT_SPAN_ID = "0";
    private static Map<String, Integer> j;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Object> f31333a;
    private volatile String b;
    private mzn c;
    public long d;
    private long e;
    private mzo f;
    private List<mzp> g;
    private boolean h;
    private long i;

    static {
        kge.a(-47159884);
        kge.a(-339944983);
        j = new ConcurrentHashMap();
    }

    public mzm(mzo mzoVar, String str, long j2, Map<String, Object> map, List<mzp> list) {
        this.h = false;
        this.b = str;
        this.g = list != null ? new ArrayList(list) : null;
        this.f31333a = map != null ? new HashMap(map) : new HashMap();
        this.d = j2;
        this.f = mzoVar;
        if (list == null || list.isEmpty()) {
            this.c = b();
            Map<String, Integer> map2 = j;
            map2.put(this.c.a() + this.c.b(), 0);
            return;
        }
        this.c = a();
        if (p()) {
            this.h = true;
            return;
        }
        Map<String, Integer> map3 = j;
        map3.put(this.c.a() + this.c.b(), 0);
    }

    private mzn a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mzn) ipChange.ipc$dispatch("f0808dd", new Object[]{this});
        }
        mzp mzpVar = this.g.get(0);
        Iterator<mzp> it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            mzp next = it.next();
            if ("child_of".equals(next.b()) && !"child_of".equals(mzpVar.b())) {
                mzpVar = next;
                break;
            }
        }
        mzn a2 = mzpVar.a();
        if ("follows_from".equals(mzpVar.b())) {
            int lastIndexOf = a2.b().lastIndexOf(".");
            if (lastIndexOf != -1) {
                a2 = new mzn(a2.a(), a2.b().substring(0, lastIndexOf), a2.e());
            } else {
                return b();
            }
        }
        int a3 = a(a2);
        if (a3 <= 0) {
            return b();
        }
        String a4 = a2.a();
        return new mzn(a4, a2.b() + "." + a3, a2.e());
    }

    private mzn b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mzn) ipChange.ipc$dispatch("16b9ae3c", new Object[]{this}) : new mzn(mzq.a(), "0", null);
    }

    @Override // tb.myr
    public mys h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mys) ipChange.ipc$dispatch("44e38b50", new Object[]{this}) : this.c;
    }

    @Override // tb.myr
    public synchronized myr a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("953d4604", new Object[]{this, str, str2});
        }
        return a(str, (Object) str2);
    }

    @Override // tb.myr
    public synchronized myr a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("5f2fe7de", new Object[]{this, str, new Boolean(z)});
        }
        return a(str, Boolean.valueOf(z));
    }

    @Override // tb.myr
    public synchronized myr a(String str, Number number) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("b8ea1b3c", new Object[]{this, str, number});
        }
        return a(str, (Object) number);
    }

    public synchronized <T> myr a(mzi<T> mziVar, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("6e2b3228", new Object[]{this, mziVar, t});
        }
        return a(mziVar.a(), t);
    }

    private myr a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("2f88e7b2", new Object[]{this, str, obj});
        }
        this.f31333a.put(str, obj);
        return this;
    }

    @Override // tb.myr
    public myr f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("7fd208a9", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return this;
        }
        myo dt_ = this.f.dt_();
        dt_.releaseLog(this, "event=" + str);
        return this;
    }

    @Override // tb.myr
    public myr b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("cf07e7e3", new Object[]{this, str, str2});
        }
        this.c.a(str, str2);
        return this;
    }

    public String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bc4e8c7", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return this.c.a(str);
        }
        return null;
    }

    @Override // tb.myr
    public myr g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (myr) ipChange.ipc$dispatch("807eb448", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    @Override // tb.myr
    public Map<String, ?> j() {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("db121866", new Object[]{this});
        }
        synchronized (this) {
            hashMap = new HashMap(this.f31333a);
        }
        return hashMap;
    }

    public Object i(String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d01ffc38", new Object[]{this, str});
        }
        synchronized (this) {
            obj = this.f31333a.get(str);
        }
        return obj;
    }

    @Override // tb.myr
    public long k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95766", new Object[]{this})).longValue() : this.d;
    }

    @Override // tb.myr
    public long l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee7", new Object[]{this})).longValue() : this.e;
    }

    @Override // tb.myr
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b(n());
        }
    }

    @Override // tb.myr
    public void b(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j2)});
            return;
        }
        if (j2 < 0) {
            j2 = n();
        }
        synchronized (this) {
            if (this.h) {
                return;
            }
            this.h = true;
            this.e = j2;
            this.i = this.e - this.d;
            b(this.c);
        }
    }

    @Override // tb.myr
    public String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.b;
    }

    public boolean ds_() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("737cb23b", new Object[]{this})).booleanValue();
        }
        synchronized (this) {
            z = this.h;
        }
        return z;
    }

    public static long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[0])).longValue() : System.currentTimeMillis();
    }

    public static long k(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dcd06ba5", new Object[]{l})).longValue();
        }
        if (l != null && l.longValue() > 0) {
            return l.longValue();
        }
        return n();
    }

    private static int a(mzn mznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f57f5eca", new Object[]{mznVar})).intValue();
        }
        if (mznVar == null) {
            return 0;
        }
        String str = mznVar.a() + mznVar.b();
        Integer num = j.get(str);
        if (num == null) {
            return -1;
        }
        Integer valueOf = Integer.valueOf(num.intValue() + 1);
        j.put(str, valueOf);
        return valueOf.intValue();
    }

    private void b(mzn mznVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4026558", new Object[]{this, mznVar});
        } else if (mznVar == null) {
        } else {
            j.remove(mznVar.a() + mznVar.b());
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.c.toString() + " - " + this.b;
    }

    public long o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("631b56a", new Object[]{this})).longValue() : this.i;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : "0".equalsIgnoreCase(h().b());
    }
}
