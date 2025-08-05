package tb;

import com.alibaba.analytics.core.sync.b;
import com.alibaba.analytics.core.sync.e;
import com.alibaba.analytics.core.sync.h;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class aoz implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private aoy f25491a;

    static {
        kge.a(79068487);
        kge.a(1578308352);
    }

    public aoz() {
        this.f25491a = null;
        try {
            this.f25491a = new aoy();
        } catch (Throwable unused) {
            apr.d();
            this.f25491a = null;
        }
    }

    @Override // com.alibaba.analytics.core.sync.e
    public h e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("3a62d683", new Object[]{this});
        }
        aoy aoyVar = this.f25491a;
        if (aoyVar == null) {
            return null;
        }
        return aoyVar.a();
    }

    @Override // com.alibaba.analytics.core.sync.e
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("617dc0c5", new Object[]{this, bVar});
            return;
        }
        aoy aoyVar = this.f25491a;
        if (aoyVar == null) {
            return;
        }
        aoyVar.a(bVar.a());
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        aoy aoyVar = this.f25491a;
        if (aoyVar == null) {
            return 0;
        }
        return aoyVar.b();
    }
}
