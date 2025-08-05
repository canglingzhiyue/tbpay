package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.rxm.request.c;
import com.taobao.rxm.schedule.f;
import com.taobao.rxm.schedule.g;
import com.taobao.rxm.schedule.j;
import com.taobao.tcommon.core.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import tb.nmq;

/* loaded from: classes.dex */
public abstract class nmy<OUT, NEXT_OUT extends nmq, CONTEXT extends c> implements nna<OUT, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31583a;
    private final int b;
    private final nmu c;
    private Type[] d;
    private nna<NEXT_OUT, CONTEXT> e;
    private j f;
    private j g;

    public abstract nmw<OUT, NEXT_OUT, CONTEXT> a();

    public abstract void a(j jVar, nmv<OUT, CONTEXT> nmvVar, f<NEXT_OUT> fVar, boolean z);

    public boolean a(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f680a8e5", new Object[]{this, nmvVar})).booleanValue();
        }
        return false;
    }

    public nmy(String str, int i, int i2) {
        this.f31583a = a(str);
        this.b = i;
        this.c = new nmu(i2);
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String name = getClass().getName();
        int lastIndexOf = name.lastIndexOf(46);
        return lastIndexOf != -1 ? name.substring(lastIndexOf + 1) : name;
    }

    private boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.b == 2;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : !k() && !d().a(1);
    }

    private void b(nmv<OUT, CONTEXT> nmvVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2ebb962", new Object[]{this, nmvVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        nnb P = nmvVar.e().P();
        if (P == null) {
            return;
        }
        P.a(nmvVar.e(), getClass(), z, z2);
    }

    private void a(nmv<OUT, CONTEXT> nmvVar, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8fa47d3", new Object[]{this, nmvVar, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        nnb P = nmvVar.e().P();
        if (P == null) {
            return;
        }
        P.a(nmvVar.e(), getClass(), z, z2, z3);
    }

    public void d(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c209bc64", new Object[]{this, nmvVar});
        } else {
            b((nmv) nmvVar, false, false);
        }
    }

    public void a(nmv<OUT, CONTEXT> nmvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9952613", new Object[]{this, nmvVar, new Boolean(z)});
        } else {
            a((nmv) nmvVar, false, z, false);
        }
    }

    public void b(nmv<OUT, CONTEXT> nmvVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72efb2", new Object[]{this, nmvVar, new Boolean(z)});
        } else {
            b((nmv) nmvVar, true, z);
        }
    }

    public void a(nmv<OUT, CONTEXT> nmvVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59104f21", new Object[]{this, nmvVar, new Boolean(z), new Boolean(z2)});
        } else {
            a((nmv) nmvVar, true, z, z2);
        }
    }

    public boolean a(nmv<OUT, CONTEXT> nmvVar, g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d6a8a8ba", new Object[]{this, nmvVar, gVar})).booleanValue() : a(nmvVar);
    }

    public int c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue() : this.b;
    }

    public nmu d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nmu) ipChange.ipc$dispatch("261d3d65", new Object[]{this}) : this.c;
    }

    public nmy<OUT, NEXT_OUT, CONTEXT> a(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmy) ipChange.ipc$dispatch("b8a277c0", new Object[]{this, jVar});
        }
        this.f = jVar;
        return this;
    }

    public nmy<OUT, NEXT_OUT, CONTEXT> b(j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmy) ipChange.ipc$dispatch("81a36f01", new Object[]{this, jVar});
        }
        this.g = jVar;
        return this;
    }

    public j e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("5df59b0", new Object[]{this}) : this.f;
    }

    public j f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (j) ipChange.ipc$dispatch("1ac821f1", new Object[]{this}) : this.g;
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (this.d == null) {
            try {
                this.d = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
            } catch (Exception e) {
                qol.h("RxSysLog", "chain producer get generic types error=%s", e);
                return false;
            }
        }
        return true;
    }

    public Type g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("20b61717", new Object[]{this});
        }
        if (l()) {
            return this.d[0];
        }
        return null;
    }

    public Type h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Type) ipChange.ipc$dispatch("11871e76", new Object[]{this});
        }
        if (!l()) {
            return null;
        }
        Type[] typeArr = this.d;
        if (typeArr[1] == c.class) {
            return typeArr[0];
        }
        return typeArr[1];
    }

    public nna<NEXT_OUT, CONTEXT> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (nna) ipChange.ipc$dispatch("4c957995", new Object[]{this}) : this.e;
    }

    public <NN_OUT extends nmq> nmy a(nmy<NEXT_OUT, NN_OUT, CONTEXT> nmyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmy) ipChange.ipc$dispatch("1e14df6e", new Object[]{this, nmyVar});
        }
        b.a(nmyVar);
        this.e = nmyVar;
        return nmyVar;
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.f31583a;
    }

    public void a(nmv<OUT, CONTEXT> nmvVar, boolean z, NEXT_OUT next_out, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71f4a743", new Object[]{this, nmvVar, new Boolean(z), next_out, new Boolean(z2)});
            return;
        }
        f<NEXT_OUT> fVar = new f<>(1, z);
        fVar.c = next_out;
        a(this.g, nmvVar, fVar, z2);
    }

    public void b(nmv<OUT, CONTEXT> nmvVar, boolean z, NEXT_OUT next_out) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2719fc50", new Object[]{this, nmvVar, new Boolean(z), next_out});
        } else {
            a((nmv) nmvVar, z, (boolean) next_out, true);
        }
    }

    public void b(nmv<OUT, CONTEXT> nmvVar, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb72a49e", new Object[]{this, nmvVar, new Float(f)});
            return;
        }
        f<NEXT_OUT> fVar = new f<>(4, false);
        fVar.d = f;
        a(this.g, nmvVar, fVar);
    }

    public void e(nmv<OUT, CONTEXT> nmvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b08cc2e5", new Object[]{this, nmvVar});
        } else {
            a(this.g, nmvVar, new f<>(8, true));
        }
    }

    public void b(nmv<OUT, CONTEXT> nmvVar, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691915d3", new Object[]{this, nmvVar, th});
            return;
        }
        f<NEXT_OUT> fVar = new f<>(16, true);
        fVar.e = th;
        a(this.g, nmvVar, fVar);
    }

    public void a(j jVar, nmv<OUT, CONTEXT> nmvVar, f<NEXT_OUT> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7fcc53", new Object[]{this, jVar, nmvVar, fVar});
        } else {
            a(jVar, (nmv) nmvVar, (f) fVar, true);
        }
    }
}
