package tb;

import android.app.Activity;
import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.ba;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.good.a;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemActionQueryResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.MtopTbliveSeckillLimitCheckResponse;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.i;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.j;
import com.taobao.android.live.plugin.atype.flexalocal.good.track.b;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.goodlist.e;
import com.taobao.taolive.sdk.goodlist.k;
import com.taobao.taolive.sdk.goodlist.o;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.utils.ad;
import com.taobao.taolive.sdk.utils.l;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class hhk extends iot {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_GOODS_SECKILL_ITEM_ADD = 2067261922142202874L;

    static {
        kge.a(297290490);
    }

    public static /* synthetic */ Object ipc$super(hhk hhkVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hhk hhkVar, c cVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3700e7c7", new Object[]{hhkVar, cVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
        } else {
            hhkVar.b(cVar, context, jSONObject, liveItem, jSONObject2, str, str2, z);
        }
    }

    public static /* synthetic */ void a(hhk hhkVar, c cVar, Object[] objArr, JSONObject jSONObject, Context context, LiveItem liveItem, JSONObject jSONObject2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf9ad14", new Object[]{hhkVar, cVar, objArr, jSONObject, context, liveItem, jSONObject2, new Boolean(z)});
        } else {
            hhkVar.a(cVar, objArr, jSONObject, context, liveItem, jSONObject2, z);
        }
    }

    public static /* synthetic */ void b(hhk hhkVar, c cVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba8f048", new Object[]{hhkVar, cVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
        } else {
            hhkVar.a(cVar, context, jSONObject, liveItem, jSONObject2, str, str2, z);
        }
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

    @Override // tb.iot
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cc53e1f", new Object[]{this, dXEvent, objArr, dXRuntimeContext, cVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[1];
            String str = (String) objArr[0];
            Context m = dXRuntimeContext.m();
            LiveItem liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class);
            if (liveItem == null || liveItem.extendVal == null || liveItem.extendVal.secKillInfo == null || hiq.a(m, liveItem)) {
                return;
            }
            JSONObject b = pqj.b(liveItem.extendVal.secKillInfo);
            if ("follow".equals(str)) {
                a(m, liveItem, b, (objArr.length <= 2 || !(objArr[2] instanceof String)) ? "" : (String) objArr[2], cVar);
            } else if (tfu.GOTO_DETAIL.equals(str)) {
                if (a(cVar, liveItem) && objArr.length > 2 && (objArr[2] instanceof String) && "showcase".equals(objArr[2])) {
                    his.c("GoodsSeckillItemClick", "dispatchPopCardClickEvent");
                } else {
                    a(cVar, objArr, jSONObject, m, liveItem, b, false);
                }
            } else if ("followAndGotoDetail".equals(str)) {
                a(cVar, objArr, jSONObject, m, liveItem, b);
            } else if ("update".equals(str)) {
                a(dXRuntimeContext, liveItem);
            } else if (!tfu.ADD_CART.equals(str)) {
            } else {
                String str2 = "newcart";
                if (objArr.length > 3 && (objArr[2] instanceof String)) {
                    str2 = (String) objArr[2];
                }
                new czz().a(cVar, liveItem, str2, (objArr.length <= 4 || !(objArr[3] instanceof String)) ? "ADDCART" : (String) objArr[3], jSONObject.getString("item_position"));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(final c cVar, Object[] objArr, final JSONObject jSONObject, final Context context, final LiveItem liveItem, final JSONObject jSONObject2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc608cd9", new Object[]{this, cVar, objArr, jSONObject, context, liveItem, jSONObject2, new Boolean(z)});
            return;
        }
        String str = "";
        final String str2 = (objArr.length <= 3 || !(objArr[2] instanceof String)) ? str : (String) objArr[2];
        final String str3 = (objArr.length <= 3 || !(objArr[3] instanceof String)) ? str : (String) objArr[3];
        if (qna.b(cVar)) {
            if (jSONObject2 != null) {
                str = jSONObject2.getString("activityId");
            }
            new j(new d() { // from class: tb.hhk.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (((MtopTbliveSeckillLimitCheckResponse) netBaseOutDo).mo1437getData().result) {
                        hhk.a(hhk.this, cVar, context, jSONObject, liveItem, jSONObject2, str2, str3, z);
                    } else {
                        hix.a(context, dae.MSG_TOAST_DEFAULT);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        hix.a(context, dae.MSG_TOAST_DEFAULT);
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
            }).a(liveItem.extendVal.anchorId, liveItem.liveId, String.valueOf(liveItem.itemId), str);
            return;
        }
        b(cVar, context, jSONObject, liveItem, jSONObject2, str2, str3, z);
    }

    private void a(final c cVar, final Object[] objArr, final JSONObject jSONObject, final Context context, final LiveItem liveItem, final JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60ea515b", new Object[]{this, cVar, objArr, jSONObject, context, liveItem, jSONObject2});
            return;
        }
        boolean a2 = a.a().i().a(cVar == null ? null : cVar.C(), qna.e(cVar));
        his.a("SeckillOpt", "follow :" + a2);
        if (com.taobao.taolive.sdk.goodlist.d.f()) {
            if (!jSONObject2.containsKey("threshold") || (jSONObject3 = jSONObject2.getJSONObject("threshold")) == null || !jSONObject3.containsKey("isFollowThreshold") || !StringUtils.equals(jSONObject3.getString("isFollowThreshold"), "true")) {
                z = false;
            } else {
                his.a("SeckillOpt", "isFollowThreshold true");
            }
            if (a.a().b(cVar) || !z) {
                a(cVar, objArr, jSONObject, context, liveItem, jSONObject2, false);
                return;
            }
            a.a().a(cVar, new pmv() { // from class: tb.hhk.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pmv
                public void a(pmz pmzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    } else if (!(pmzVar instanceof pmy)) {
                    } else {
                        pmy pmyVar = (pmy) pmzVar;
                        hix.a(context, pmyVar.f32766a);
                        hhk.a(hhk.this, cVar, objArr, jSONObject, context, liveItem, jSONObject2, true);
                        his.a("SeckillOpt", "follow success:" + pmyVar.f32766a);
                    }
                }

                @Override // tb.pmv
                public void a(String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    } else {
                        hix.a(context, str2);
                    }
                }
            }, "goods_seckill_" + jSONObject2.getString("activityType"));
            return;
        }
        a(cVar, objArr, jSONObject, context, liveItem, jSONObject2, false);
    }

    private void a(DXRuntimeContext dXRuntimeContext, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cceb434", new Object[]{this, dXRuntimeContext, liveItem});
            return;
        }
        JSONObject parseJsonObject = liveItem.parseJsonObject();
        ba b = dXRuntimeContext.b();
        hhs.a().a(dXRuntimeContext.s(), parseJsonObject, b instanceof iou ? (iou) b : null);
    }

    private void a(c cVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a996eaa2", new Object[]{this, cVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
        } else if (jSONObject2 != null && jSONObject2.containsKey(aw.PARAM_VRPASS) && jSONObject2.getBoolean(aw.PARAM_VRPASS).booleanValue()) {
            a(cVar, context, jSONObject, liveItem, str, str2);
        } else if (jSONObject2 == null) {
            hix.a(context, dae.MSG_TOAST_DEFAULT);
        } else if (z) {
            a(cVar, context, jSONObject, liveItem, str, str2);
        } else {
            hix.a(context, jSONObject2.getString("denyMsg"));
        }
    }

    private void b(final c cVar, final Context context, final JSONObject jSONObject, final LiveItem liveItem, JSONObject jSONObject2, final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dec0423", new Object[]{this, cVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z)});
            return;
        }
        JSONObject jSONObject3 = jSONObject2 != null ? jSONObject2.getJSONObject("threshold") : null;
        if (jSONObject3 != null && jSONObject3.containsKey(aw.PARAM_VRPASS) && jSONObject3.getBoolean(aw.PARAM_VRPASS).booleanValue()) {
            a(cVar, context, jSONObject, liveItem, str, str2);
        } else {
            new i(new d() { // from class: tb.hhk.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    ItemActionQueryData mo1437getData = ((ItemActionQueryResponse) netBaseOutDo).mo1437getData();
                    liveItem.extendVal.business = mo1437getData.business;
                    liveItem.extendVal.secKillInfo = mo1437getData.secKillInfo;
                    JSONObject b = pqj.b(mo1437getData.secKillInfo);
                    hhk.b(hhk.this, cVar, context, jSONObject, liveItem, b != null ? b.getJSONObject("threshold") : null, str, str2, z);
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        hix.a(context, dae.MSG_TOAST_DEFAULT);
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

    private void a(c cVar, Context context, JSONObject jSONObject, LiveItem liveItem, String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4098e6", new Object[]{this, cVar, context, jSONObject, liveItem, str, str2});
            return;
        }
        String g = hiq.g(liveItem);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("scene", g);
        hashMap.put("itemBizType", "secKill");
        hashMap.put("from", "goods_list".equals(str) ? spy.BIZ_GOODS_LIST : "showcase");
        hashMap.put("area", str2);
        hashMap.put("secKillInfo", liveItem.extendVal != null ? liveItem.extendVal.secKillInfo : "");
        String str7 = "2";
        hashMap.put("laiyuan", str7);
        hashMap.put("item_position", jSONObject.getString("item_position"));
        if (liveItem.extendVal == null || !"secKill".equals(liveItem.extendVal.itemBizType)) {
            str7 = "1";
        }
        hashMap.put("bubbleType", str7);
        liveItem.cpsClickPos = hiq.a(liveItem, StringUtils.equals(str2, "btn"), "");
        if (a.a().i() != null) {
            str3 = "item_position";
            str4 = "";
            str5 = "area";
            str6 = "from";
            a.a().i().a(cVar == null ? null : cVar.C(), (Activity) context, liveItem, "detail", hashMap);
        } else {
            str3 = "item_position";
            str4 = "";
            str5 = "area";
            str6 = "from";
        }
        if (a.a().j() != null) {
            JSONObject b = pqj.b(liveItem.extendVal != null ? liveItem.extendVal.secKillInfo : str4);
            if (b != null && b.containsKey("status")) {
                int intValue = b.getIntValue("status");
                hashMap.put("type", intValue == 2 ? "sellout" : intValue == 1 ? ag.CLICK_GOODS_BUY : "close");
            }
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, liveItem.liveId);
            hashMap.put("itemBizType", liveItem.extendVal != null ? liveItem.extendVal.itemBizType : str4);
            hashMap.put(str6, "goods_list".equals(str) ? spy.BIZ_GOODS_LIST : "showcase");
            hashMap.put(str5, str2);
            a.a().j().a("flashsale", hashMap);
        }
        if ("goods_list".equals(str)) {
            hiq.a(cVar, liveItem);
            com.taobao.android.live.plugin.atype.flexalocal.good.track.a.a(cVar, liveItem, jSONObject.getString(str3));
            return;
        }
        b.a(cVar, liveItem, (Map<String, String>) null);
    }

    private void a(final Context context, final LiveItem liveItem, JSONObject jSONObject, String str, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3f23c6", new Object[]{this, context, liveItem, jSONObject, str, cVar});
            return;
        }
        if (liveItem.personalityData == null) {
            liveItem.personalityData = new JSONObject();
        }
        if (liveItem.personalityData.getString("goodsSubscribeStatus") == null) {
            liveItem.personalityData.put("goodsSubscribeStatus", (Object) "102");
        }
        long j = 0;
        long longValue = jSONObject != null ? jSONObject.getLongValue("startTime") : 0L;
        if (jSONObject != null) {
            j = jSONObject.getLongValue("endTime");
        }
        if (a.a().j() != null && !StringUtils.isEmpty(str)) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("action", "103".equals(liveItem.personalityData.getString("goodsSubscribeStatus")) ? "cancel" : "reserve");
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put("itemBizType", liveItem.extendVal != null ? liveItem.extendVal.itemBizType : "");
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, liveItem.liveId);
            hashMap.put("from", "goods_list".equals(str) ? spy.BIZ_GOODS_LIST : "showcase");
            hashMap.put("secKillInfo", jSONObject.toJSONString());
            a.a().j().a("secKillreserve", hashMap);
        }
        String string = liveItem.personalityData.getString("goodsSubscribeStatus");
        char c = 65535;
        if (string.hashCode() == 48628 && string.equals("103")) {
            c = 0;
        }
        com.taobao.alilive.aliliveframework.frame.a aVar = null;
        if (c == 0) {
            e i = a.a().i();
            if (cVar != null) {
                aVar = cVar.C();
            }
            i.a(aVar, context, "您淘宝直播预约的宝贝马上开抢！", longValue, j, new k() { // from class: tb.hhk.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.goodlist.k
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        new com.taobao.android.live.plugin.atype.flexalocal.good.business.a(new com.taobao.taolive.sdk.business.d() { // from class: tb.hhk.4.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                            public void onSuccess(int i2, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("fb090915", new Object[]{this, new Integer(i2), netResponse, netBaseOutDo, obj});
                                    return;
                                }
                                hix.a(context, "取消预约成功");
                                liveItem.personalityData.put("goodsSubscribeStatus", (Object) "102");
                                a.a().i().a(cVar == null ? null : cVar.C(), "com.taobao.taolive.room.goodlist.timepoint.asked.inner", liveItem);
                                ddw.a().a("com.taobao.taolive.room.goodlist.timepoint.asked.inner", liveItem, c.a(cVar));
                            }

                            @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                            public void onError(int i2, NetResponse netResponse, Object obj) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i2), netResponse, obj});
                                } else {
                                    hix.a(context, "取消预约失败，再试一次");
                                }
                            }
                        }).a(l.b(liveItem.liveId), liveItem.itemId, "bblb.miaosha.2021.1212");
                    }
                }

                @Override // com.taobao.taolive.sdk.goodlist.k
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        hix.a(context, "请授权日历权限！");
                    }
                }
            });
            return;
        }
        String str2 = "https://h5.m.taobao.com/taolive/video.html?id=" + liveItem.liveId + "&livesource=miaosha_subscribe";
        e i2 = a.a().i();
        if (cVar != null) {
            aVar = cVar.C();
        }
        i2.a(aVar, context, "您淘宝直播预约的宝贝马上开抢！", str2, longValue, j, 1L, new k() { // from class: tb.hhk.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.goodlist.k
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    new com.taobao.android.live.plugin.atype.flexalocal.good.business.k(new com.taobao.taolive.sdk.business.d() { // from class: tb.hhk.5.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                        public void onSuccess(int i3, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("fb090915", new Object[]{this, new Integer(i3), netResponse, netBaseOutDo, obj});
                                return;
                            }
                            if (netResponse != null && netResponse.getDataJsonObject() != null) {
                                try {
                                    if (netResponse.getDataJsonObject().getBoolean("result")) {
                                        hix.a(context, "预约成功，注意查收手机日历通知！");
                                        liveItem.personalityData.put("goodsSubscribeStatus", (Object) "103");
                                        a.a().i().a(cVar == null ? null : cVar.C(), "com.taobao.taolive.room.goodlist.timepoint.asked.inner", liveItem);
                                        ddw.a().a("com.taobao.taolive.room.goodlist.timepoint.asked.inner", liveItem, c.a(cVar));
                                        o.a(context);
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th.printStackTrace();
                                }
                            }
                            hix.a(context, "活动太火爆了，再试一次");
                        }

                        @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                        public void onError(int i3, NetResponse netResponse, Object obj) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i3), netResponse, obj});
                            } else {
                                hix.a(context, "活动太火爆了，再试一次");
                            }
                        }
                    }).a(l.b(liveItem.liveId), liveItem.itemId, "bblb.miaosha.2021.1212");
                }
            }

            @Override // com.taobao.taolive.sdk.goodlist.k
            public void b() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                } else {
                    hix.a(context, "请授权日历权限！");
                }
            }
        });
    }

    private boolean a(c cVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4626b36e", new Object[]{this, cVar, liveItem})).booleanValue();
        }
        if (!ad.a(cVar.C(), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) || !hir.ab()) {
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
