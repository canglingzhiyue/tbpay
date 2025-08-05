package com.alibaba.android.icart.core.event;

import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import com.uc.webview.export.extension.UCClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bca;
import tb.bea;
import tb.bed;
import tb.bei;
import tb.bem;
import tb.bev;
import tb.bex;
import tb.bmz;
import tb.kge;

/* loaded from: classes2.dex */
public class ac extends bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-390663782);
    }

    public static /* synthetic */ Object ipc$super(ac acVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.android.ultron.trade.event.d
    public void b(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d08b596a", new Object[]{this, bmzVar});
            return;
        }
        boolean c = c(bmzVar);
        if (c && !bea.d()) {
            return;
        }
        List<IDMComponent> a2 = a(c);
        if (a2 != null && !a2.isEmpty()) {
            bmz a3 = this.f25791a.F().a();
            a3.a("cartSubmit");
            a3.a(this.h);
            a3.c("");
            Object b = bmzVar.b("extraParams");
            if (b instanceof Object[]) {
                Object[] objArr = (Object[]) b;
                if (objArr.length > 1) {
                    a3.a(UCClient.UI_PARAMS_KEY_GESTURE, objArr[1]);
                }
            }
            a3.a(a2);
            a3.a("eventFields", c());
            this.f25791a.F().a(a3);
        }
        if (c) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("selectedItemCount", String.valueOf(bei.e(this.g)));
        JSONObject o = bem.o(this.b);
        if (o != null && !o.isEmpty()) {
            for (String str : o.keySet()) {
                hashMap.put(str, o.get(str) + "");
            }
        }
        if (this.h.getFields() != null && this.h.getFields().getBooleanValue("isHideCalculateBtn")) {
            z = true;
        }
        if (z) {
            hashMap.put("isLocalCalculate", String.valueOf(true));
        }
        c(hashMap);
        bex.a(this.f25791a, "Page_ShoppingCart_Submit_SettlementClick", hashMap);
    }

    private void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2985bedb", new Object[]{this, map});
            return;
        }
        List<IDMComponent> c = bei.c(this.g);
        if (c == null || c.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < c.size(); i++) {
            IDMComponent iDMComponent = c.get(i);
            if (iDMComponent != null) {
                String id = iDMComponent.getId();
                if (!TextUtils.isEmpty(id)) {
                    sb.append(id);
                    if (i < c.size() - 1) {
                        sb.append("_");
                    }
                }
                String string = iDMComponent.getFields().getJSONObject("sku").getString("skuId");
                if (!TextUtils.isEmpty(string)) {
                    sb2.append(string);
                    if (i < c.size() - 1) {
                        sb2.append("_");
                    }
                }
            }
        }
        map.put("itemIds", sb.toString());
        map.put("skuIds", sb2.toString());
    }

    private boolean c(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bf0e5fef", new Object[]{this, bmzVar})).booleanValue();
        }
        Object b = bmzVar.b("extraParams");
        if (b instanceof Object[]) {
            Object[] objArr = (Object[]) b;
            if (objArr.length > 1) {
                return "onActionDown".equals(objArr[1]);
            }
        }
        return false;
    }

    private List<IDMComponent> a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("95ad395b", new Object[]{this, new Boolean(z)});
        }
        List<IDMComponent> c = bei.c(this.g);
        int size = c != null ? c.size() : 0;
        if (size <= 0) {
            if (z) {
                return null;
            }
            com.alibaba.android.icart.core.widget.d.a(this.e, com.alibaba.ability.localization.b.a(R.string.taobao_app_1028_1_21669));
            bex.c(this.f25791a, "Page_ShoppingCart_Settlement_NoCheck", new String[0]);
            return null;
        }
        int l = bem.l(this.b);
        if (size > l) {
            if (z) {
                return null;
            }
            com.alibaba.android.icart.core.widget.d.a(this.e, this.e.getString(R.string.ack_charge_max_tips, Integer.valueOf(l)));
            UmbrellaTracker.traceProcessEnd("clickSubmitError", "submit", "1.0");
            bex.c(this.f25791a, "Page_ShoppingCart_Settlement_OverLimit", new String[0]);
            bed.a("settlementOverMax", "结算数量超限", true, 1.0f);
            return null;
        } else if (!bev.a(this.b, c)) {
            return c;
        } else {
            if (z) {
                return null;
            }
            com.alibaba.android.icart.core.groupcharge.b b = bev.b(this.b, c);
            bmz a2 = this.f25791a.F().a();
            a2.a("cartGroupSubmit");
            a2.a(this.h);
            a2.c("");
            a2.a(c);
            a2.a(com.alibaba.android.icart.core.groupcharge.b.TAG, b);
            this.f25791a.F().a(a2);
            return null;
        }
    }
}
