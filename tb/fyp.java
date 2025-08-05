package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tb.fyv;

/* loaded from: classes5.dex */
public abstract class fyp<ExposeKey, ExposeData> implements fyt<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final fyw<ExposeKey, ExposeData> f28222a;

    static {
        kge.a(1704513892);
        kge.a(1522750105);
    }

    public fyp(fyw<ExposeKey, ExposeData> fywVar) {
        this.f28222a = fywVar;
    }

    @Override // tb.fyt
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28222a.g()) {
            fyvVar.d().a(fyvVar.a());
        }
    }

    @Override // tb.fyt
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28222a.g(str)) {
            fyvVar.d().a(fyvVar.a());
        }
    }

    @Override // tb.fyt
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28222a.g()) {
            fyvVar.e();
        }
    }

    @Override // tb.fyt
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28222a.g(str)) {
            fyvVar.e();
        }
    }

    @Override // tb.fyt
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        for (fyv<ExposeKey, ExposeData> fyvVar : this.f28222a.g()) {
            fyvVar.d().c();
        }
    }

    @Override // tb.fyt
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b(null);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (str == null) {
            f();
        } else {
            f(str);
        }
    }

    @Override // tb.fyw
    public void a(fyv<ExposeKey, ExposeData> fyvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e982fdf5", new Object[]{this, fyvVar});
        } else {
            this.f28222a.a(fyvVar);
        }
    }

    @Override // tb.fyw
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.f28222a.e();
        }
    }

    @Override // tb.fyw
    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f28222a.e(str);
        }
    }

    @Override // tb.fyw
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
        } else {
            this.f28222a.f();
        }
    }

    @Override // tb.fyw
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.f28222a.f(str);
        }
    }

    @Override // tb.fyw
    public Collection<fyv<ExposeKey, ExposeData>> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Collection) ipChange.ipc$dispatch("11851419", new Object[]{this}) : this.f28222a.g();
    }

    @Override // tb.fyw
    public List<fyv<ExposeKey, ExposeData>> g(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("706b078f", new Object[]{this, str}) : this.f28222a.g(str);
    }

    /* loaded from: classes5.dex */
    public static abstract class a<ExposeKey, ExposeData, CacheDataType> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final fyv.a<ExposeKey, ExposeData> f28223a;
        private final List<Pair<fyr<ExposeKey, ExposeData>, String>> b = new ArrayList();
        private final fys<ExposeKey, ExposeData, CacheDataType> c;
        private fyw<ExposeKey, ExposeData> d;

        static {
            kge.a(597296187);
        }

        public abstract fyt<ExposeKey, ExposeData> a(fyw<ExposeKey, ExposeData> fywVar, Collection<fyv<ExposeKey, ExposeData>> collection);

        public a(fyv.a<ExposeKey, ExposeData> aVar, fys<ExposeKey, ExposeData, CacheDataType> fysVar) {
            this.f28223a = aVar;
            this.c = fysVar;
        }

        public a<ExposeKey, ExposeData, CacheDataType> a(fyy<ExposeKey, ExposeData> fyyVar, long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("663e6bd0", new Object[]{this, fyyVar, new Long(j), str});
            }
            fys<ExposeKey, ExposeData, CacheDataType> fysVar = this.c;
            return fysVar != null ? a(fysVar.a(fyyVar, j), str) : this;
        }

        public a<ExposeKey, ExposeData, CacheDataType> a(fyr<ExposeKey, ExposeData> fyrVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1162e0e9", new Object[]{this, fyrVar, str});
            }
            this.b.add(new Pair<>(fyrVar, str));
            return this;
        }

        public fyt<ExposeKey, ExposeData> a() {
            fyv<ExposeKey, ExposeData> a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (fyt) ipChange.ipc$dispatch("f04d73d", new Object[]{this});
            }
            if (this.d == null) {
                this.d = new fzf();
            }
            for (Pair<fyr<ExposeKey, ExposeData>, String> pair : this.b) {
                if (pair.second != null) {
                    a2 = this.f28223a.a((fyr) pair.first, (String) pair.second);
                } else {
                    a2 = this.f28223a.a((fyr) pair.first);
                }
                this.d.a(a2);
            }
            fyw<ExposeKey, ExposeData> fywVar = this.d;
            if (fywVar == null) {
                fywVar = new fzf<>();
            }
            return a(fywVar, this.d.g());
        }
    }
}
