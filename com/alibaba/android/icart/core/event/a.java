package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.android.icart.core.data.model.CartGlobal;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bbz;
import tb.bca;
import tb.bdx;
import tb.bed;
import tb.bei;
import tb.bex;
import tb.bmz;
import tb.jnv;
import tb.jny;
import tb.kge;

/* loaded from: classes2.dex */
public class a extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "AliCartCalculateClickSubscriber";

    static {
        kge.a(1347824202);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ jny a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jny) ipChange.ipc$dispatch("30c7803d", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ bbz b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("5e9c4ab7", new Object[]{aVar}) : aVar.f25791a;
    }

    public static /* synthetic */ bbz c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (bbz) ipChange.ipc$dispatch("8c74e516", new Object[]{aVar}) : aVar.f25791a;
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        CartGlobal.ControlParas controlParas;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        IDMComponent c = bmzVar.c();
        if (c == null || this.f25791a == null) {
            return;
        }
        a(this.f25791a, c);
        CartGlobal m = this.b.m();
        if (m == null || (controlParas = m.getControlParas()) == null || !Boolean.TRUE.toString().equals(controlParas.calcualteDetailDegrade())) {
            return;
        }
        this.d.a("cartCalculateClick");
        this.d.a("isCheckInPoplayer", "true");
        final long currentTimeMillis = System.currentTimeMillis();
        this.f25791a.a(c, this.d, false, new jnv() { // from class: com.alibaba.android.icart.core.event.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                    return;
                }
                bei.a(a.a(a.this));
                a.b(a.this).x().n();
            }

            @Override // tb.joc
            public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                    return;
                }
                bbz c2 = a.c(a.this);
                bex.c(c2, "Page_ShoppingCart_REFRESH_CALCULATE_Response", "costTime=" + (System.currentTimeMillis() - currentTimeMillis));
            }
        }, null);
    }

    private void a(bbz bbzVar, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21811b6", new Object[]{this, bbzVar, iDMComponent});
        } else if (iDMComponent != null) {
            try {
                if (iDMComponent.getEventMap() == null || !iDMComponent.getEventMap().containsKey("calculateClick")) {
                    return;
                }
                List<com.taobao.android.ultron.common.model.b> list = iDMComponent.getEventMap().get("popCalculateWindow");
                String str = "";
                for (com.taobao.android.ultron.common.model.b bVar : list) {
                    if ("openPopupWindow".equals(bVar.getType())) {
                        str = bVar.getFields().getString("nextRenderRoot");
                    }
                }
                if (str.equals(this.b.e()) && bbzVar.x().f()) {
                    bbzVar.x().a(false);
                    return;
                }
                List<IDMComponent> c = bei.c(bbzVar.H());
                JSONArray jSONArray = new JSONArray();
                if (c != null) {
                    for (IDMComponent iDMComponent2 : c) {
                        jSONArray.add(iDMComponent2.getKey());
                    }
                }
                for (com.taobao.android.ultron.common.model.b bVar2 : list) {
                    List<IDMComponent> a2 = bei.a(this.b, bVar2);
                    if (!z && a2 != null && !a2.isEmpty()) {
                        Iterator<IDMComponent> it = a2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                IDMComponent next = it.next();
                                if (TextUtils.equals(next.getTag(), "checkedItemList")) {
                                    JSONObject fields = next.getFields();
                                    if (fields == null) {
                                        fields = new JSONObject();
                                    }
                                    fields.put("items", (Object) jSONArray);
                                    z = true;
                                }
                            }
                        }
                    }
                    bbzVar.F().a(bbzVar.F().a().a(bVar2.getType()).a("componentKey", this.b.e("submit").getKey()).a(bVar2).a(iDMComponent));
                }
            } catch (Throwable th) {
                bdx.a(TAG, "DiscountDetail", "newDiscountDetailError", "deal new discountDetail exception.", th.getMessage());
                bed.a(TAG, th.getMessage());
            }
        }
    }
}
