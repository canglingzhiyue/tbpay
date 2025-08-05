package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bcb;
import tb.bex;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class x extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-832215847);
    }

    public static /* synthetic */ bcb a(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("914fc088", new Object[]{xVar}) : xVar.b;
    }

    public static /* synthetic */ bbz b(x xVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("bf285a0e", new Object[]{xVar}) : xVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        boolean z;
        DataBizContext.CartGroupContext d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        Object[] objArr = (Object[]) bmzVar.b("extraParams");
        if (objArr == null || objArr.length < 2) {
            return;
        }
        String str = (String) b(1);
        if (TextUtils.isEmpty(str) || !(b(2) instanceof Integer)) {
            return;
        }
        final String b = this.b.b();
        if (!str.equals(b) || (d = this.b.o().d()) == null) {
            z = true;
        } else {
            str = d.getDefaultFilterItem();
            z = false;
        }
        this.b.o().a(this.h.getKey()).a(bmzVar, ((Integer) b(2)).intValue());
        this.b.b(str);
        this.f25791a.x().g();
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        this.f25791a.b(true, hashMap, new jnv() { // from class: com.alibaba.android.icart.core.event.x.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                }
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z2, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z2), map});
                    return;
                }
                x.a(x.this).b(b);
                x.b(x.this).x().g();
            }
        });
        bbz bbzVar = this.f25791a;
        bex.a(bbzVar, "Page_ShoppingCart_GroupRecommendTab_TabClick", "isOpen=" + z);
    }
}
