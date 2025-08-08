package com.taobao.android.icart.event;

import mtopsdk.common.util.StringUtils;
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

/* loaded from: classes5.dex */
public class l extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(369001773);
    }

    public static /* synthetic */ bcb a(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bcb) ipChange.ipc$dispatch("56c032ec", new Object[]{lVar}) : lVar.b;
    }

    public static /* synthetic */ bbz b(l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("1037bfb2", new Object[]{lVar}) : lVar.f25791a;
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
        if (StringUtils.isEmpty(str) || !(b(2) instanceof Integer)) {
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
        this.f25791a.x().d().a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(RequestConfig.IS_POP_LAYER_FIRST_PAGE, "true");
        hashMap.put(RequestConfig.IS_POP_LAYE_RQUERY, "true");
        if (this.h.getFields().containsKey("tabRequestConfig")) {
            hashMap.put(RequestConfig.CUSTOM_EXPARAMS, String.valueOf(this.h.getFields().get("tabRequestConfig")));
        }
        this.f25791a.b(true, hashMap, new jnv() { // from class: com.taobao.android.icart.event.l.1
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
                l.a(l.this).b(b);
                l.b(l.this).x().g();
            }
        });
        bbz bbzVar = this.f25791a;
        bex.a(bbzVar, "Page_ShoppingCart_AddOn_TabClick", "isOpen=" + z);
    }
}
