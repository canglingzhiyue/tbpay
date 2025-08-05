package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.c;
import com.taobao.tcommon.core.b;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class nmp<OUT, CONTEXT extends c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f31574a;
    private final nna<OUT, CONTEXT> b;
    private nmy c;

    public <NEXT_OUT extends nmq> nmp(nmy<OUT, NEXT_OUT, CONTEXT> nmyVar, boolean z) {
        b.a(nmyVar);
        this.f31574a = z;
        if (this.f31574a && nmyVar.b() && nmyVar.g() != nmyVar.h()) {
            a(nmyVar.j());
        }
        this.b = nmyVar;
        this.c = nmyVar;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        throw new IllegalArgumentException(str + " skip to consume new result, require OUT class must equal NEXT_OUT class");
    }

    public static <O, NEXT_O extends nmq, CONTEXT extends c> nmp<O, CONTEXT> a(nmy<O, NEXT_O, CONTEXT> nmyVar, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nmp) ipChange.ipc$dispatch("f1cb5cbf", new Object[]{nmyVar, new Boolean(z)}) : new nmp<>(nmyVar, z);
    }

    public <NEXT_O, NN_O extends nmq> nmp<OUT, CONTEXT> a(nmy<NEXT_O, NN_O, CONTEXT> nmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmp) ipChange.ipc$dispatch("1e14de57", new Object[]{this, nmyVar});
        }
        b.a(nmyVar);
        if (this.f31574a) {
            Type g = nmyVar.g();
            if (nmyVar.b() && g != nmyVar.h()) {
                a(nmyVar.j());
            }
            Type h = this.c.h();
            if (h != g) {
                throw new RuntimeException("NEXT_OUT " + h + " of last producer(" + this.c.getClass().getSimpleName() + ") not equal OUT " + g + " of next producer(" + nmyVar.getClass().getSimpleName() + riy.BRACKET_END_STR);
            }
        }
        this.c = this.c.a(nmyVar);
        return this;
    }

    public nna<OUT, CONTEXT> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nna) ipChange.ipc$dispatch("f084e9d", new Object[]{this}) : this.b;
    }
}
