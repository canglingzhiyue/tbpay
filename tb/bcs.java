package tb;

import android.content.Context;
import com.alibaba.android.icart.core.data.config.CartRequestType;
import com.alibaba.android.ultron.trade.data.request.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.j;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* loaded from: classes2.dex */
public class bcs extends bcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean k;
    private final String h;
    private final bcb i;
    private final boolean j;

    public static /* synthetic */ Object ipc$super(bcs bcsVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(1649423158);
        k = true;
    }

    public bcs(bcb bcbVar, Context context, c cVar, String str) {
        super(bcbVar, context, cVar);
        this.i = bcbVar;
        this.h = str;
        this.j = this.i.o().r() != null;
    }

    public jnw a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("f067fcb", new Object[]{this});
        }
        jnw c = c();
        c.r(jqi.a("iCart", ieu.sEnableMtopStreamJsonForQuery, false, true));
        if (this.j) {
            c.f(false);
        }
        a(c);
        return c;
    }

    private void a(jnw jnwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efbbd245", new Object[]{this, jnwVar});
        } else if ("query".equals(this.h)) {
            if (k) {
                k = false;
                jnwVar.g(ieu.MTOP_TOPIC_FIRST_SCREEN_COLD_START_QUERY);
                return;
            }
            jnwVar.g("other");
        } else if (!CartRequestType.queryNextPage.equals(this.h)) {
        } else {
            jnwVar.g("other");
        }
    }

    @Override // tb.bcq
    public j a(jny jnyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("e3ef30c5", new Object[]{this, jnyVar});
        }
        jnw a2 = a();
        if (jnyVar == null) {
            return a2.N();
        }
        return a2.b(jnyVar);
    }

    @Override // tb.bcq
    public void a(final jnv jnvVar, jny jnyVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e1001d", new Object[]{this, jnvVar, jnyVar, obj});
        } else {
            this.c.A().a(this.b, new bct(jnvVar) { // from class: tb.bcs.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.bct, tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj2, jny jnyVar2, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj2, jnyVar2, map});
                        return;
                    }
                    jnv jnvVar2 = jnvVar;
                    if (jnvVar2 == null) {
                        return;
                    }
                    jnvVar2.a(i, mtopResponse, obj2, jnyVar2, (Map<String, ? extends Object>) map);
                }
            });
        }
    }
}
