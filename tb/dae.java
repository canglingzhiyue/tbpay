package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MtopTbliveSeckillLimitCheckResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.i;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.j;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.common.LiveItem;

/* loaded from: classes5.dex */
public class dae {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MSG_TOAST_DEFAULT = "挤爆了，稍后重试哦!";

    static {
        kge.a(-673196845);
    }

    public static /* synthetic */ void b(c cVar, LiveItem liveItem, JSONObject jSONObject, pox poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7309fdc", new Object[]{cVar, liveItem, jSONObject, poxVar});
        } else {
            c(cVar, liveItem, jSONObject, poxVar);
        }
    }

    public static void a(final c cVar, final LiveItem liveItem, final JSONObject jSONObject, final pox<String> poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989ce43d", new Object[]{cVar, liveItem, jSONObject, poxVar});
        } else if (cVar == null || liveItem == null || poxVar == null) {
            his.b("SeckillLimitChecker", "checkLimit | params empty.");
        } else if (jSONObject == null) {
            his.b("SeckillLimitChecker", "checkLimit | secKillInfo empty.");
        } else if (qna.b(cVar)) {
            new j(new d() { // from class: tb.dae.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (((MtopTbliveSeckillLimitCheckResponse) netBaseOutDo).mo1437getData().result) {
                        dae.b(c.this, liveItem, jSONObject, poxVar);
                    } else {
                        poxVar.onError("2", dae.MSG_TOAST_DEFAULT);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        poxVar.onError("1", dae.MSG_TOAST_DEFAULT);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            }).a(liveItem.extendVal.anchorId, liveItem.liveId, String.valueOf(liveItem.itemId), jSONObject.getString("activityId"));
        } else {
            c(cVar, liveItem, jSONObject, poxVar);
        }
    }

    private static void c(c cVar, final LiveItem liveItem, JSONObject jSONObject, final pox<String> poxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15c45b7b", new Object[]{cVar, liveItem, jSONObject, poxVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject != null ? jSONObject.getJSONObject("threshold") : null;
        if (jSONObject2 != null && jSONObject2.containsKey(aw.PARAM_VRPASS) && jSONObject2.getBoolean(aw.PARAM_VRPASS).booleanValue()) {
            poxVar.onResult("success");
        } else {
            new i(new d() { // from class: tb.dae.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    ItemActionQueryData mo1437getData = ((ItemActionQueryResponse) netBaseOutDo).mo1437getData();
                    LiveItem.this.extendVal.business = mo1437getData.business;
                    LiveItem.this.extendVal.secKillInfo = mo1437getData.secKillInfo;
                    JSONObject b = pqj.b(mo1437getData.secKillInfo);
                    JSONObject jSONObject3 = b != null ? b.getJSONObject("threshold") : null;
                    if (jSONObject3 != null && jSONObject3.containsKey(aw.PARAM_VRPASS) && jSONObject3.getBoolean(aw.PARAM_VRPASS).booleanValue()) {
                        poxVar.onResult("success");
                    } else if (jSONObject3 != null) {
                        poxVar.onError("thresh_hold", jSONObject3.getString("denyMsg"));
                    } else {
                        poxVar.onError("thresh_hold", dae.MSG_TOAST_DEFAULT);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        poxVar.onError("3", dae.MSG_TOAST_DEFAULT);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSystemError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        onError(i, netResponse, obj);
                    }
                }
            }).a(cVar, liveItem);
        }
    }
}
