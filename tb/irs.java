package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tao.reactivex.b.a;
import tao.reactivex.b.b;
import tao.reactivex.d.h.e;
import tao.reactivex.d.h.i;

/* loaded from: classes9.dex */
public final class irs implements jdz, jeq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public i<jdz> f29259a;
    public volatile boolean b;

    static {
        kge.a(1964944662);
        kge.a(1964944663);
        kge.a(1964944664);
    }

    public void a(i<jdz> iVar) {
        Object[] b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aea991f", new Object[]{this, iVar});
        } else if (iVar != null) {
            ArrayList arrayList = null;
            for (Object obj : iVar.b()) {
                if (obj instanceof jdz) {
                    try {
                        ((jdz) obj).b_();
                    } catch (Throwable th) {
                        b.a(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() != 1) {
                throw new a(arrayList);
            }
            throw e.a((Throwable) arrayList.get(0));
        }
    }

    @Override // tb.jeq
    public boolean a(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef30445c", new Object[]{this, jdzVar})).booleanValue();
        }
        kgk.a(jdzVar, "d is null");
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    i<jdz> iVar = this.f29259a;
                    if (iVar == null) {
                        iVar = new i<>();
                        this.f29259a = iVar;
                    }
                    iVar.a((i<jdz>) jdzVar);
                    return true;
                }
            }
        }
        jdzVar.b_();
        return false;
    }

    @Override // tb.jdz
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.b;
    }

    @Override // tb.jeq
    public boolean b(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddb34add", new Object[]{this, jdzVar})).booleanValue();
        }
        if (!c(jdzVar)) {
            return false;
        }
        jdzVar.b_();
        return true;
    }

    @Override // tb.jdz
    public void b_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac8b2a44", new Object[]{this});
        } else if (this.b) {
        } else {
            synchronized (this) {
                if (this.b) {
                    return;
                }
                this.b = true;
                i<jdz> iVar = this.f29259a;
                this.f29259a = null;
                a(iVar);
            }
        }
    }

    @Override // tb.jeq
    public boolean c(jdz jdzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc36515e", new Object[]{this, jdzVar})).booleanValue();
        }
        kgk.a(jdzVar, "Disposable item is null");
        if (this.b) {
            return false;
        }
        synchronized (this) {
            if (this.b) {
                return false;
            }
            i<jdz> iVar = this.f29259a;
            if (iVar != null && iVar.b(jdzVar)) {
                return true;
            }
            return false;
        }
    }
}
