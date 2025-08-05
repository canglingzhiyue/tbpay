package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import com.taobao.android.ab.api.c;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class dkn implements dkk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26813a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final Set<b> f = new CopyOnWriteArraySet();

    public dkn(String str, long j, long j2, long j3, long j4) {
        this.f26813a = str;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
    }

    @Override // tb.dkl
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f26813a;
    }

    @Override // tb.dkl
    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }

    @Override // tb.dkl
    public long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue() : this.c;
    }

    @Override // tb.dkl
    public long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2df", new Object[]{this})).longValue() : this.d;
    }

    @Override // tb.dkl
    public long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca60", new Object[]{this})).longValue() : this.e;
    }

    @Override // tb.dkk
    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f2aa7d8b", new Object[]{this, bVar})).booleanValue() : this.f.add(bVar);
    }

    @Override // tb.dkk
    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2aaf1e6", new Object[]{this, cVar});
            return;
        }
        Iterator<b> a2 = cVar.a();
        while (a2.hasNext()) {
            b next = a2.next();
            if (!a(next)) {
                djy.a("VariationSetImpl", "error, exp " + c() + " addVariation " + next + " failed because it is already in the set");
            }
        }
    }

    @Override // tb.dkk
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f.clear();
        }
    }

    @Override // tb.dkl, com.taobao.android.ab.api.c
    public Iterator<b> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Iterator) ipChange.ipc$dispatch("88a51a0f", new Object[]{this}) : this.f.iterator();
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VariationSetImpl{name='" + this.f26813a + '}';
    }
}
