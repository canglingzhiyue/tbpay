package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.c;
import com.taobao.rxm.schedule.j;
import tb.nmq;

/* loaded from: classes7.dex */
public class nmt<OUT, NEXT_OUT extends nmq, CONTEXT extends c> implements nmv<NEXT_OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private nmv<OUT, CONTEXT> f31578a;
    private nmy<OUT, NEXT_OUT, CONTEXT> b;
    private j c;

    @Override // tb.nmv
    public /* synthetic */ void b(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7f77ef", new Object[]{this, obj, new Boolean(z)});
        } else {
            a((nmt<OUT, NEXT_OUT, CONTEXT>) ((nmq) obj), z);
        }
    }

    @Override // tb.nmv
    public /* synthetic */ Object e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d74af246", new Object[]{this}) : b();
    }

    public nmt(nmv<OUT, CONTEXT> nmvVar, nmy<OUT, NEXT_OUT, CONTEXT> nmyVar) {
        this.f31578a = nmvVar;
        this.b = nmyVar;
    }

    public nmt<OUT, NEXT_OUT, CONTEXT> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmt) ipChange.ipc$dispatch("f084d29", new Object[]{this});
        }
        a((nmv) null, (nmy) null);
        return this;
    }

    public nmt<OUT, NEXT_OUT, CONTEXT> a(nmv<OUT, CONTEXT> nmvVar, nmy<OUT, NEXT_OUT, CONTEXT> nmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmt) ipChange.ipc$dispatch("3073013a", new Object[]{this, nmvVar, nmyVar});
        }
        this.f31578a = nmvVar;
        this.b = nmyVar;
        this.c = null;
        return this;
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            nmw<OUT, NEXT_OUT, CONTEXT> a2 = this.b.a();
            if (a2 == null || a2.a(this)) {
                return;
            }
            super.finalize();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(NEXT_OUT next_out, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d94eb08e", new Object[]{this, next_out, new Boolean(z)});
            return;
        }
        String j = this.b.j();
        if (b().K()) {
            qol.f("RxSysLog", "[DelegateConsumer] ID=%d cancelled before receiving new result, producer=%s isLast=%b", Integer.valueOf(b().H()), j, Boolean.valueOf(z));
            if (next_out != null) {
                next_out.h();
            }
            this.f31578a.d();
            return;
        }
        if (this.b.d().a(1) || (z && this.b.d().a(2))) {
            z2 = true;
        }
        if (z2) {
            this.b.b((nmv) this.f31578a, z, (boolean) next_out);
        } else {
            this.f31578a.b(next_out, z);
        }
    }

    @Override // tb.nmv
    public void b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd742bac", new Object[]{this, th});
        } else if (this.b.d().a(16)) {
            this.b.b(this.f31578a, th);
        } else {
            this.f31578a.b(th);
        }
    }

    @Override // tb.nmv
    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
        } else if (this.b.d().a(4)) {
            this.b.b(this.f31578a, f);
        } else {
            this.f31578a.b(f);
        }
    }

    @Override // tb.nmv
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.b.d().a(8)) {
            this.b.e(this.f31578a);
        } else {
            this.f31578a.d();
        }
    }

    public nmv<NEXT_OUT, CONTEXT> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmv) ipChange.ipc$dispatch("b8a27763", new Object[]{this, jVar});
        }
        this.c = jVar;
        return this;
    }

    public CONTEXT b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CONTEXT) ipChange.ipc$dispatch("7be85dd4", new Object[]{this});
        }
        nmv<OUT, CONTEXT> nmvVar = this.f31578a;
        if (nmvVar != null) {
            return nmvVar.e();
        }
        return null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(com.taobao.tcommon.core.c.a(getClass()));
        sb.append("[cxt-id:");
        if (b() != null) {
            i = b().H();
        }
        sb.append(i);
        sb.append(riy.ARRAY_END_STR);
        return sb.toString();
    }
}
