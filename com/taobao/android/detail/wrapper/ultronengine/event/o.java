package com.taobao.android.detail.wrapper.ultronengine.event;

import android.app.Activity;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.datasdk.event.params.SkuBottomBarStyleDTO;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import tb.emu;
import tb.fgr;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class o extends com.alibaba.android.ultron.event.q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String SUBSCRIBER_ID = "openSKU";

    static {
        kge.a(-1325013912);
    }

    public o() {
        emu.a("com.taobao.android.detail.wrapper.ultronengine.event.OpenSkuUltronSubscriber");
    }

    @Override // com.alibaba.android.ultron.event.q
    public void a(com.alibaba.android.ultron.event.base.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d93503", new Object[]{this, eVar});
            return;
        }
        com.taobao.android.detail.core.utils.i.c("OpenSkuUltronSubscriber", "onHandleEvent");
        OpenSkuEvent openSkuEvent = new OpenSkuEvent(SkuBottomBarStyleDTO.ADD_CART_AND_BUY);
        Activity c = fpz.c(eVar.a());
        if (c instanceof DetailCoreActivity) {
            try {
                new com.taobao.android.detail.wrapper.ext.event.subscriber.sku.d((DetailCoreActivity) c).a(openSkuEvent);
                return;
            } catch (Throwable th) {
                com.taobao.android.detail.core.utils.i.a("OpenSkuUltronSubscriber", "打开sku异常", th);
                return;
            }
        }
        com.taobao.android.detail.core.utils.i.a("OpenSkuUltronSubscriber", "activity:" + c);
    }

    public static void a(com.alibaba.android.ultron.vfw.instance.b bVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fa1bd9", new Object[]{bVar, str});
        } else if (bVar == null || StringUtils.isEmpty(str)) {
        } else {
            boolean a2 = fgr.a("enableSkuBarVoCheck", true);
            com.taobao.android.detail.core.utils.i.a("OpenSkuUltronSubscriber", "2.0 updateSkuText enableSkuBarVoCheck:" + a2);
            if (a2) {
                if (!(bVar instanceof com.alibaba.android.ultron.vfw.instance.d)) {
                    return;
                }
                com.alibaba.android.ultron.vfw.instance.d dVar = (com.alibaba.android.ultron.vfw.instance.d) bVar;
                if (dVar.s() == null || dVar.s().d() == null || dVar.s().d().c == null || dVar.s().d().c.getJSONObject("componentsVO") == null || dVar.s().d().c.getJSONObject("componentsVO").getJSONObject("skuBarVO") == null) {
                    return;
                }
            }
            com.alibaba.android.ultron.event.base.f d = bVar.d();
            com.alibaba.android.ultron.event.base.e a3 = d.a();
            a3.a("adjustState");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("subType", (Object) "");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skuText", (Object) str);
            jSONObject.put("payload", (Object) jSONObject2);
            JSONObject jSONObject3 = new JSONObject(2);
            jSONObject3.put("sourcePath", (Object) "skuText");
            jSONObject3.put("targetPath", (Object) "skuBarVO.skuText");
            JSONArray jSONArray = new JSONArray(1);
            jSONArray.add(jSONObject3);
            jSONObject.put("dataMergeParams", (Object) jSONArray);
            a3.a(new DMEvent("adjustState", jSONObject, null));
            d.a(a3);
        }
    }
}
