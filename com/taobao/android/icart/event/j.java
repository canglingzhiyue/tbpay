package com.taobao.android.icart.event;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bdx;
import tb.bei;
import tb.bej;
import tb.bex;
import tb.bfb;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes5.dex */
public class j extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Handler c = new Handler(Looper.getMainLooper());

    static {
        kge.a(-1663016002);
    }

    public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ bcb a(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("2cf6cd6a", new Object[]{jVar}) : jVar.b;
    }

    public static /* synthetic */ void a(j jVar, boolean z, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a095408a", new Object[]{jVar, new Boolean(z), list});
        } else {
            jVar.a(z, list);
        }
    }

    public static /* synthetic */ bbz b(j jVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("e66e5a30", new Object[]{jVar}) : jVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        bdx.a(bmzVar);
        if (bmzVar == null) {
            return;
        }
        final List<IDMComponent> b = this.b.w().b();
        a(true, b);
        bei.a(this.b, "elevator", false);
        this.b.k();
        bej.a(this.f25791a);
        bfb r = this.f25791a.r();
        if (r != null) {
            r.b();
        }
        com.alibaba.android.icart.core.data.c.a((com.taobao.android.ultron.datamodel.imp.b) this.g);
        com.alibaba.android.icart.core.data.c.a(this.g, this.e);
        this.f25791a.x().n();
        this.c.post(new Runnable() { // from class: com.taobao.android.icart.event.j.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    j.a(j.this, false, b);
                }
            }
        });
        boolean j = this.b.j();
        if (!this.b.a() && j) {
            final String c = this.b.c();
            this.b.c("");
            this.f25791a.a(true, (Map<String, String>) null, new jnv() { // from class: com.taobao.android.icart.event.j.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    }
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                        return;
                    }
                    j.a(j.this).c(c);
                    j.b(j.this).x().n();
                }
            });
        }
        bbz bbzVar = this.f25791a;
        bex.a(bbzVar, "Page_ShoppingCart_Header_ManageClick", "isManaging=" + j);
    }

    private void a(boolean z, List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab4085d", new Object[]{this, new Boolean(z), list});
        } else if (list != null) {
            for (IDMComponent iDMComponent : list) {
                JSONObject fields = iDMComponent.getFields();
                if (fields != null) {
                    fields.put("_needTransition", (Object) Boolean.valueOf(z));
                }
            }
        }
    }
}
