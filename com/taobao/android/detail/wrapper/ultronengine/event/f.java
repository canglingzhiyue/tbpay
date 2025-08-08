package com.taobao.android.detail.wrapper.ultronengine.event;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SKU_QUANTITY = "quantity";
    public static final String SUBSCRIBER_ID = "update_sku_quantity";

    static {
        kge.a(-253839559);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public f() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.MultiPieceDiscountUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("MultiPieceDiscountUltronSubscriber", "onHandleEvent");
        if (eVar == null || !b(eVar, f(eVar))) {
            return;
        }
        d(eVar);
    }

    private com.taobao.android.detail.wrapper.newsku.a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.detail.wrapper.newsku.a) ipChange.ipc$dispatch("b1c7c143", new Object[]{this});
        }
        if (!(this.d instanceof DetailActivity)) {
            return null;
        }
        return ((DetailActivity) this.d).v;
    }

    private void d(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03fdde0", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.wrapper.newsku.a e = e();
        if (e == null) {
            com.taobao.android.detail.core.utils.i.a("MultiPieceDiscountUltronSubscriber", "acquirePreFetchSKUCore is null");
            return;
        }
        JSONObject e2 = e(eVar);
        if (e2 == null) {
            com.taobao.android.detail.core.utils.i.a("MultiPieceDiscountUltronSubscriber", "UltronEvent Params is null");
            return;
        }
        String string = e2.getString("quantity");
        if (StringUtils.isEmpty(string)) {
            return;
        }
        e.e(string);
    }

    private JSONObject e(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6f905a9f", new Object[]{this, eVar});
        }
        DMEvent dMEvent = (DMEvent) eVar.i();
        if (dMEvent != null) {
            return dMEvent.getFields();
        }
        return null;
    }

    private JSONObject f(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8891ac3e", new Object[]{this, eVar});
        }
        JSONObject e = e(eVar);
        if (e == null) {
            com.taobao.android.detail.core.utils.i.a("MultiPieceDiscountUltronSubscriber", "adjustStateParams is null");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = e.getJSONArray("dataMergeParams");
        if (jSONArray != null) {
            jSONObject.put("dataMergeParams", (Object) jSONArray);
        }
        JSONObject jSONObject2 = e.getJSONObject("extraData");
        if (jSONObject2 != null) {
            jSONObject.put("payload", (Object) jSONObject2);
        }
        return jSONObject;
    }

    private boolean b(com.alibaba.android.ultron.event.base.e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc17d492", new Object[]{this, eVar, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) eVar.h();
        if (dVar == null) {
            com.taobao.android.detail.core.utils.i.a("MultiPieceDiscountUltronSubscriber", "ultronInstance is null");
            return false;
        }
        com.alibaba.android.ultron.event.base.f d = dVar.d();
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("adjustState");
        a2.a(new DMEvent("adjustState", jSONObject, null));
        d.a(a2);
        return true;
    }
}
