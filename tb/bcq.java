package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.data.request.a;
import com.alibaba.android.ultron.trade.data.request.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.j;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bga;

/* loaded from: classes2.dex */
public abstract class bcq extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f25803a;
    public j b;
    public bbz c;
    public bcb d;

    static {
        kge.a(1173555657);
    }

    public abstract j a(jny jnyVar);

    public abstract void a(jnv jnvVar, jny jnyVar, Object obj);

    public bcq(bcb bcbVar, Context context, c cVar) {
        super(bcbVar, context, cVar);
        this.c = bcbVar.n();
        this.d = bcbVar;
    }

    public final void b(jnv jnvVar, jny jnyVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e1f75e", new Object[]{this, jnvVar, jnyVar, obj});
            return;
        }
        this.b = a(jnyVar);
        a(new bct(jnvVar) { // from class: tb.bcq.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -602497363) {
                    super.a(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2], ((Boolean) objArr[3]).booleanValue(), (Map) objArr[4]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // tb.bct, tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj2, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj2, new Boolean(z), map});
                    return;
                }
                super.a(i, mtopResponse, obj2, z, map);
                bga.b.a("iCart", mtopResponse);
            }
        }, jnyVar, obj);
        j jVar = this.b;
        if (jVar == null) {
            return;
        }
        this.f25803a = jVar.a();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f25803a;
    }

    public jnw c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("1e69ca89", new Object[]{this});
        }
        boolean a2 = jqi.a("iCart", "useCustomHandlerForStreamRequest", true);
        jnw k = new jnw(this.f).h(true).j(true).c(this.g.b()).a(this.g.c()).b(this.g.d()).a(this.g.f()).e(this.g.l()).d(this.g.m()).d(this.g.e()).a(this.g.h()).b(this.g.i()).c(this.g.k()).a(this.g.j()).d("UNIT_TRADE").e("iCart").b(this.g.g()).l(false).o(true).m(true).n(!jqi.a("iCart", "ultronEnableClientOptimize", false)).k(false);
        bbz bbzVar = this.c;
        jnw a3 = k.a((bbzVar == null || !a2) ? null : bbzVar.t());
        if (this.d.o().r() == null) {
            z = true;
        }
        return a3.p(z);
    }
}
