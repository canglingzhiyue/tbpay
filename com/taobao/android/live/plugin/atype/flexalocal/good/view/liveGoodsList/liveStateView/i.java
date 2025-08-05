package com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.e;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import java.util.Iterator;
import tb.hiq;
import tb.his;
import tb.hiu;
import tb.kge;

/* loaded from: classes6.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c f13868a;
    private ItemCategory b;

    static {
        kge.a(1345864266);
    }

    public i(ItemCategory itemCategory) {
        this.b = itemCategory;
    }

    public void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("902c638f", new Object[]{this, cVar});
        } else {
            this.f13868a = cVar;
        }
    }

    public boolean a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe92d385", new Object[]{this, cVar, jSONObject, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (jSONObject == null) {
            his.b("RenderStateChecker", "checkState | liveItemJson null:");
            return false;
        }
        long a2 = hiq.a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("itemExtData");
        b(jSONObject, z, z2);
        boolean c = c(jSONObject2);
        boolean b = b(jSONObject2);
        if (jSONObject2 == null) {
            JSONObject jSONObject3 = new JSONObject();
            a(cVar, jSONObject3);
            jSONObject.put("itemExtData", (Object) jSONObject3);
        } else {
            a(cVar, jSONObject2);
        }
        boolean a3 = a(jSONObject, a2);
        b(jSONObject, a2);
        return c || b || a3;
    }

    private void a(com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198c541", new Object[]{this, cVar, jSONObject});
        } else {
            jSONObject.put("isFollowed", (Object) String.valueOf(com.taobao.android.live.plugin.atype.flexalocal.good.a.a().b(cVar)));
        }
    }

    private boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63b9982b", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("timingUpShelfStatus");
        if (!TextUtils.isEmpty(string) && TextUtils.equals("0", string)) {
            long longValue = jSONObject.getLongValue("timingStarts");
            long a2 = hiq.a();
            if (longValue > 0 && a2 > longValue) {
                jSONObject.remove("timingUpShelfStatus");
                return true;
            }
        }
        return false;
    }

    private boolean c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c50c34ca", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        String string = jSONObject.getString("preSaleStatus");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        if (TextUtils.equals("0", string) || TextUtils.equals("1", string)) {
            long longValue = jSONObject.getLongValue("depositBegin");
            long longValue2 = jSONObject.getLongValue("depositEnd");
            long a2 = hiq.a();
            if (longValue > 0 && longValue2 > 0 && a2 > 0) {
                if (a2 >= longValue2) {
                    jSONObject.put("preSaleStatus", "2");
                    return true;
                } else if (a2 >= longValue && !TextUtils.equals("1", string)) {
                    jSONObject.put("preSaleStatus", "1");
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(JSONObject jSONObject, long j) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a78ec40", new Object[]{this, jSONObject, new Long(j)})).booleanValue();
        }
        if (jSONObject == null) {
            return false;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("native_itemBenefits");
        if (jSONArray != null && !jSONArray.isEmpty()) {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                if (!a.b((JSONObject) it.next(), j)) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    private void b(JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1379e37d", new Object[]{this, jSONObject, new Long(j)});
            return;
        }
        int g = com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.a.g();
        if (jSONObject == null || 3 == g || (jSONObject2 = jSONObject.getJSONObject("itemExtData")) == null) {
            return;
        }
        JSONObject jSONObject4 = jSONObject2.getJSONObject("giftActivityInfo");
        if (jSONObject4 != null && !jSONObject4.isEmpty() && (g == 2 || g == 1)) {
            JSONObject jSONObject5 = jSONObject4.getJSONObject("shopFreeSendGiftPart_taobaolive");
            if (jSONObject5 == null) {
                return;
            }
            if (!a.b(jSONObject5, j)) {
                jSONObject4.remove("shopFreeSendGiftPart_taobaolive");
                if (jSONObject4.isEmpty()) {
                    jSONObject2.remove("giftActivityInfo");
                }
            }
        }
        JSONObject jSONObject6 = jSONObject2.getJSONObject("nextGiftActivityInfo");
        if (jSONObject6 == null || jSONObject6.isEmpty() || g != 1 || (jSONObject3 = jSONObject6.getJSONObject("shopFreeSendGiftPart_taobaolive")) == null || jSONObject3.isEmpty() || !a.b(jSONObject3, j)) {
            return;
        }
        jSONObject2.put("giftActivityInfo", (Object) jSONObject6);
        jSONObject2.remove("nextGiftActivityInfo");
    }

    private void b(JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bca84e7", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("nativeConfigInfos");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("nativeConfigInfos", (Object) jSONObject2);
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar = this.f13868a;
        String str = "1";
        if (cVar != null && cVar.i()) {
            jSONObject2.put("isFirstRec", (Object) (z ? str : "0"));
        }
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar2 = this.f13868a;
        if (cVar2 != null && cVar2.a()) {
            jSONObject2.put("disableExplainFunction", "true");
        }
        jSONObject2.put("goodsDisplayStyle", (Object) (z2 ? "card" : "lists"));
        if (!hiu.a(jSONObject, false)) {
            str = "0";
        }
        jSONObject2.put("isSeckill", (Object) str);
        a(jSONObject, jSONObject2);
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        if (jSONObject2 != null) {
            jSONObject2.remove("expansionRedPacket");
        }
        ItemCategory itemCategory = this.b;
        if (itemCategory == null || !itemCategory.isDefaultTab() || (cVar = this.f13868a) == null || cVar.k() || this.f13868a.t() == null || !"1".equals(this.f13868a.t().roomStatus)) {
            return;
        }
        String string = jSONObject.getString("itemId");
        if (TextUtils.isEmpty(string) || this.f13868a.x() == null || this.f13868a.x().g().isEmpty()) {
            return;
        }
        for (e.b bVar : this.f13868a.x().g()) {
            if (bVar != null && TextUtils.equals(string, bVar.c)) {
                jSONObject2.put("expansionRedPacket", (Object) bVar.b);
                return;
            }
        }
    }
}
