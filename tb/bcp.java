package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.data.request.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.j;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bcp extends bcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private IDMComponent i;
    private final bcb j;

    static {
        kge.a(-1865171381);
    }

    public static /* synthetic */ Object ipc$super(bcp bcpVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(bcp bcpVar, int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map map, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784fe84d", new Object[]{bcpVar, new Integer(i), mtopResponse, obj, jnyVar, map, jnvVar});
        } else {
            bcpVar.a(i, mtopResponse, obj, jnyVar, map, jnvVar);
        }
    }

    public bcp(bcb bcbVar, Context context, c cVar) {
        super(bcbVar, context, cVar);
        this.j = bcbVar;
    }

    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        } else {
            this.i = iDMComponent;
        }
    }

    public jnw a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnw) ipChange.ipc$dispatch("f067fcb", new Object[]{this}) : c();
    }

    @Override // tb.bcq
    public j a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("e3ef30c5", new Object[]{this, jnyVar});
        }
        jnw a2 = a();
        a(a2);
        a2.r(jqi.a("iCart", ieu.sEnableMtopStreamJsonForAdjust, false, true));
        return a2.a(this.i, jnyVar);
    }

    private static void a(jnw jnwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbbd245", new Object[]{jnwVar});
            return;
        }
        int f = CheckHoldManager.a().f();
        if (f != 1 && f != 5 && f != 10 && f != 20) {
            return;
        }
        jnwVar.g(ieu.MTOP_TOPIC_UPDATE_PREFIX + f);
    }

    @Override // tb.bcq
    public void a(final jnv jnvVar, jny jnyVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e1001d", new Object[]{this, jnvVar, jnyVar, obj});
        } else if (this.i == null) {
            throw new IllegalStateException("we find you not call setTrigger() method first before you call AdjustCartRequester's sendRequest() method");
        } else {
            this.j.n().A().a(this.b, obj, new bct(jnvVar) { // from class: tb.bcp.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bct, tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj2, jny jnyVar2, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj2, jnyVar2, map});
                    } else {
                        bcp.a(bcp.this, i, mtopResponse, obj2, jnyVar2, map, jnvVar);
                    }
                }
            });
        }
    }

    private void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ? extends Object> map, jnv jnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("288c6b0c", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map, jnvVar});
            return;
        }
        if (bem.n(this.j) == 0) {
            this.j.c("");
        }
        if (jnvVar == null) {
            return;
        }
        jnvVar.a(i, mtopResponse, obj, jnyVar, map);
    }
}
