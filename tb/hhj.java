package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.k;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.q;
import com.taobao.android.live.plugin.atype.flexalocal.good.track.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.d;
import com.taobao.taolive.sdk.goodlist.o;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hhj extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_GOODS_EXPLOSION_ITEM_CLICK_EVENT = 253104938849917020L;

    static {
        kge.a(666235926);
    }

    public static /* synthetic */ Object ipc$super(hhj hhjVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // tb.iot
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, final c cVar) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
            return;
        }
        try {
            final Context m = dXRuntimeContext.m();
            String str = (String) objArr[0];
            final LiveItem liveItem = (LiveItem) pqj.a(((JSONObject) objArr[1]).toJSONString(), LiveItem.class);
            String g = hiq.g(liveItem);
            a a2 = n.a();
            String G = a2 == null ? null : a2.G();
            switch (str.hashCode()) {
                case -1149096095:
                    if (str.equals(tfu.ADD_CART)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -916322262:
                    if (str.equals("hotItemSubscribe")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -738239289:
                    if (str.equals("explosionGoodsClick")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -482995928:
                    if (str.equals("closeCard")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 249802644:
                    if (str.equals(tfu.GOTO_DETAIL)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 518825989:
                    if (str.equals("askForTimeShift")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 632969974:
                    if (str.equals("showCaseUpdate")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 753037975:
                    if (str.equals("showGoodsList")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str2 = "2";
            switch (c) {
                case 0:
                    if (a(a2, cVar, liveItem)) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.putAll(hashMap);
                    if (!hashMap.containsKey("channel")) {
                        hashMap2.put("channel", "goods");
                    }
                    hashMap2.put("itemlistType", "dx");
                    hashMap.put("laiyuan", str2);
                    if (liveItem.extendVal == null || !"secKill".equals(liveItem.extendVal.itemBizType)) {
                        str2 = "1";
                    }
                    hashMap.put("bubbleType", str2);
                    HashMap hashMap3 = new HashMap();
                    if (dXRuntimeContext.c() != null) {
                        hashMap3.put("explaincard_cardtype", StringUtils.equals("taolive_goods_small_card", dXRuntimeContext.c().f11925a) ? "small" : com.taobao.android.weex_framework.util.a.ATOM_EXT_big);
                    }
                    liveItem.cpsClickPos = hiq.a(liveItem, false, (String) null);
                    b.a(cVar, liveItem, hashMap3);
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), (Activity) m, liveItem, ag.CLICK_SHOW_CASE, hashMap);
                    }
                    hiq.l(liveItem);
                    return;
                case 1:
                    if (a(a2, cVar, liveItem)) {
                        return;
                    }
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("scene", g);
                    hashMap4.put("laiyuan", str2);
                    if (liveItem.extendVal == null || !"secKill".equals(liveItem.extendVal.itemBizType)) {
                        str2 = "1";
                    }
                    hashMap4.put("bubbleType", str2);
                    liveItem.clickSource = ag.CLICK_SHOW_CASE;
                    liveItem.cpsClickPos = hiq.a(liveItem, true, objArr.length > 3 ? (String) objArr[3] : "");
                    com.taobao.android.live.plugin.atype.flexalocal.good.track.a.a(cVar, liveItem, false, false, "");
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().f(cVar) && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), (Activity) m, liveItem, "detail", hashMap4);
                        return;
                    }
                    if (liveItem != null && liveItem.extendVal != null && com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i() != null) {
                        if (hiq.a(liveItem)) {
                            if (objArr.length > 3) {
                                hashMap4.put("bottomMode", (String) objArr[3]);
                            }
                            his.a("Handler_explosion", "handleEvent | addCart, bottomMode=" + ((String) hashMap4.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), (Activity) m, 10000, liveItem, hashMap4);
                        } else if (hiq.b(liveItem) && hiw.h()) {
                            if (objArr.length > 3) {
                                hashMap4.put("bottomMode", (String) objArr[3]);
                            }
                            his.a("Handler_explosion", "handleEvent liveShop good | addCart, bottomMode=" + ((String) hashMap4.get("bottomMode")) + "    liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), m, 10000, liveItem, hashMap4);
                        } else {
                            his.a("Handler_explosion", "handleEvent | goToDetail, liveId=" + liveItem.liveId + "   itemId=" + liveItem.itemId);
                            com.taobao.android.live.plugin.atype.flexalocal.good.a.a().i().a(cVar == null ? null : cVar.C(), (Activity) m, liveItem, "detail", hashMap4);
                        }
                    }
                    hiq.l(liveItem);
                    return;
                case 2:
                    new k(new d() { // from class: tb.hhj.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                                return;
                            }
                            if (netResponse != null && netResponse.getDataJsonObject() != null) {
                                try {
                                    if (netResponse.getDataJsonObject().getBoolean("result")) {
                                        hix.a(m, com.taobao.android.live.plugin.atype.flexalocal.good.a.a().d);
                                        if (liveItem.personalityData != null) {
                                            liveItem.personalityData.put("goodsSubscribeStatus", (Object) "103");
                                        }
                                        ddw.a().a("com.taobao.taolive.room.goodlist.timepoint.asked.inner", liveItem, c.a(cVar));
                                        o.a(m);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                            hix.a(m, com.taobao.android.live.plugin.atype.flexalocal.good.a.a().e);
                        }

                        @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                        public void onError(int i, NetResponse netResponse, Object obj) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                            } else {
                                hix.a(m, com.taobao.android.live.plugin.atype.flexalocal.good.a.a().e);
                            }
                        }
                    }).a(l.b(liveItem.liveId), liveItem.itemId, l.b(com.taobao.android.live.plugin.atype.flexalocal.good.a.a().d(cVar)));
                    HashMap<String, String> hashMap5 = new HashMap<>();
                    hashMap5.put("item_id", String.valueOf(liveItem.itemId));
                    hashMap5.put("scene", g);
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() == null) {
                        return;
                    }
                    com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("kaijiangtixing", hashMap5);
                    return;
                case 3:
                    b.a(cVar, liveItem, l.a(objArr[2].toString()));
                    hjs.a(cVar, liveItem.itemId);
                    return;
                case 4:
                    ddw.a().a("com.taobao.taolive.goods.showcase.close", null, G);
                    if (com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j() != null) {
                        HashMap<String, String> hashMap6 = new HashMap<>();
                        if (objArr.length >= 3 && (objArr[2] instanceof String)) {
                            hashMap6.put("closeSource", (String) objArr[2]);
                        }
                        com.taobao.android.live.plugin.atype.flexalocal.good.a.a().j().a("CloseRightCardClick", hashMap6);
                    }
                    his.a("Handler_explosion", "closeCard");
                    return;
                case 5:
                    ddw.a().a("com.taobao.taolive.goods.showcase.update", liveItem, G);
                    return;
                case 6:
                    if (a(a2, cVar, liveItem) || !hkk.ab()) {
                        return;
                    }
                    q.a(liveItem.itemId);
                    return;
                case 7:
                    if (!hkk.au() || objArr.length < 3 || !(objArr[2] instanceof String)) {
                        return;
                    }
                    String str3 = (String) objArr[2];
                    tpm.a(cVar, liveItem, str3);
                    tpm.b(cVar, liveItem, str3);
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }

    private boolean a(a aVar, c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e41f663", new Object[]{this, aVar, cVar, liveItem})).booleanValue();
        }
        if (!ad.a(aVar, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) || !hir.ab()) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        if (liveItem != null) {
            jSONObject.put("itemId", (Object) Long.valueOf(liveItem.itemId));
        }
        ddw.a().a("com.taobao.taolive.goods.pop.card.click", jSONObject, c.a(cVar));
        return true;
    }
}
