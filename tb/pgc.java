package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.f;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillBusinessThresholdGetResponse;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillBusinessThresholdGetResponseData;
import com.taobao.taolive.movehighlight.bussiness.detail.MtopTbliveSeckillLimitCheckResponse;
import com.taobao.taolive.movehighlight.bussiness.detail.b;
import com.taobao.taolive.movehighlight.bussiness.detail.c;
import com.taobao.taolive.movehighlight.utils.m;
import com.taobao.taolive.movehighlight.utils.o;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.adapter.network.d;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.l;
import com.taobao.taolive.sdk.utils.q;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class pgc extends sig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_TBLIVE_TIMEMOVE_SECKILL_ITEM_ADD = -3790645740344653746L;

    static {
        kge.a(-1236784731);
    }

    public static /* synthetic */ Object ipc$super(pgc pgcVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(pgc pgcVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("907818c6", new Object[]{pgcVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), aVar});
        } else {
            pgcVar.b(context, jSONObject, liveItem, jSONObject2, str, str2, z, aVar);
        }
    }

    public static /* synthetic */ void a(pgc pgcVar, Object[] objArr, JSONObject jSONObject, Context context, LiveItem liveItem, JSONObject jSONObject2, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebba2ec9", new Object[]{pgcVar, objArr, jSONObject, context, liveItem, jSONObject2, new Boolean(z), aVar});
        } else {
            pgcVar.a(objArr, jSONObject, context, liveItem, jSONObject2, z, aVar);
        }
    }

    public static /* synthetic */ void b(pgc pgcVar, Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db2a1a5", new Object[]{pgcVar, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), aVar});
        } else {
            pgcVar.a(context, jSONObject, liveItem, jSONObject2, str, str2, z, aVar);
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

    @Override // tb.sig
    public void a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("624b20cd", new Object[]{this, dXEvent, objArr, dXRuntimeContext, aVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) objArr[1];
            String str = (String) objArr[0];
            Context m = dXRuntimeContext.m();
            LiveItem liveItem = (LiveItem) pqj.a(jSONObject.toJSONString(), LiveItem.class);
            if (liveItem == null || liveItem.extendVal == null || liveItem.extendVal.secKillInfo == null || a(m, liveItem)) {
                return;
            }
            JSONObject b = pqj.b(liveItem.extendVal.secKillInfo);
            if ("follow".equals(str)) {
                a(m, liveItem, b, (objArr.length <= 2 || !(objArr[2] instanceof String)) ? "" : (String) objArr[2], dXRuntimeContext, aVar);
            } else if (tfu.GOTO_DETAIL.equals(str)) {
                a(objArr, jSONObject, m, liveItem, b, false, aVar);
            } else if ("followAndGotoDetail".equals(str)) {
                a(objArr, jSONObject, m, liveItem, b, aVar);
            } else if (!"update".equals(str)) {
            } else {
                pfb a2 = pfb.a(aVar);
                if (a2.e() == null || a2.e().b() == null) {
                    return;
                }
                a2.e().b().a(String.valueOf(liveItem.itemId), dXRuntimeContext);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(Object[] objArr, final JSONObject jSONObject, final Context context, final LiveItem liveItem, final JSONObject jSONObject2, final boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26248e25", new Object[]{this, objArr, jSONObject, context, liveItem, jSONObject2, new Boolean(z), aVar});
            return;
        }
        String str = "";
        final String str2 = (objArr.length <= 3 || !(objArr[2] instanceof String)) ? str : (String) objArr[2];
        final String str3 = (objArr.length <= 3 || !(objArr[3] instanceof String)) ? str : (String) objArr[3];
        VideoInfo u = poy.u(aVar);
        if (u != null && u.secSkillNeedLimit) {
            if (jSONObject2 != null) {
                str = jSONObject2.getString("activityId");
            }
            new c(new d() { // from class: tb.pgc.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    } else if (((MtopTbliveSeckillLimitCheckResponse) netBaseOutDo).mo1437getData().result) {
                        pgc.a(pgc.this, context, jSONObject, liveItem, jSONObject2, str2, str3, z, aVar);
                    } else {
                        m.a(context, dae.MSG_TOAST_DEFAULT);
                    }
                }

                @Override // com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        m.a(context, dae.MSG_TOAST_DEFAULT);
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
        b(context, jSONObject, liveItem, jSONObject2, str2, str3, z, aVar);
    }

    private void a(final Object[] objArr, final JSONObject jSONObject, final Context context, final LiveItem liveItem, final JSONObject jSONObject2, final a aVar) {
        String str;
        boolean a2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("336a3291", new Object[]{this, objArr, jSONObject, context, liveItem, jSONObject2, aVar});
            return;
        }
        boolean z2 = com.taobao.taolive.movehighlight.utils.c.z();
        if (z2) {
            VideoInfo u = poy.u(aVar);
            str = (u == null || u.broadCaster == null) ? null : u.broadCaster.accountId;
        } else {
            f.m().getCurrentAnchorId();
            str = null;
        }
        if (z2) {
            pmt pmtVar = new pmt();
            pmtVar.f32764a = str;
            a2 = pmd.a().B().a(pmtVar);
        } else {
            a2 = f.m().getActionAdapter().a((a) null, str);
        }
        q.a("SeckillOpt", "follow :" + a2);
        if (com.taobao.taolive.sdk.goodlist.d.f()) {
            if (!jSONObject2.containsKey("threshold") || (jSONObject3 = jSONObject2.getJSONObject("threshold")) == null || !jSONObject3.containsKey("isFollowThreshold") || !TextUtils.equals(jSONObject3.getString("isFollowThreshold"), "true")) {
                z = false;
            } else {
                q.a("SeckillOpt", "isFollowThreshold true");
            }
            if (!z2) {
                a2 = f.m().getFollowState();
            }
            if (a2 || !z) {
                a(objArr, jSONObject, context, liveItem, jSONObject2, false, aVar);
                return;
            }
            pmv pmvVar = new pmv() { // from class: tb.pgc.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.pmv
                public void a(pmz pmzVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f9ec2b9b", new Object[]{this, pmzVar});
                    } else if (!(pmzVar instanceof pmy)) {
                    } else {
                        pmy pmyVar = (pmy) pmzVar;
                        m.a(context, pmyVar.f32766a);
                        pgc.a(pgc.this, objArr, jSONObject, context, liveItem, jSONObject2, true, aVar);
                        q.a("SeckillOpt", "follow success:" + pmyVar.f32766a);
                    }
                }

                @Override // tb.pmv
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    } else {
                        m.a(context, str3);
                    }
                }
            };
            String str2 = "goods_seckill_" + jSONObject2.getString("activityType");
            if (z2) {
                pmt pmtVar2 = new pmt();
                pmtVar2.f32764a = str;
                pmtVar2.p = str2;
                pmd.a().B().a(pmtVar2, pmvVar);
                return;
            }
            f.m().follow(pmvVar, str2);
            return;
        }
        a(objArr, jSONObject, context, liveItem, jSONObject2, false, aVar);
    }

    private void a(Context context, JSONObject jSONObject, LiveItem liveItem, JSONObject jSONObject2, String str, String str2, boolean z, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea4dcea", new Object[]{this, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), aVar});
        } else if (jSONObject2 != null && jSONObject2.containsKey(aw.PARAM_VRPASS) && jSONObject2.getBoolean(aw.PARAM_VRPASS).booleanValue()) {
            a(context, jSONObject, liveItem, str, str2, aVar);
        } else if (jSONObject2 == null) {
            m.a(context, dae.MSG_TOAST_DEFAULT);
        } else if (z) {
            a(context, jSONObject, liveItem, str, str2, aVar);
        } else {
            m.a(context, jSONObject2.getString("denyMsg"));
        }
    }

    private void b(final Context context, final JSONObject jSONObject, final LiveItem liveItem, JSONObject jSONObject2, final String str, final String str2, final boolean z, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f09b4c9", new Object[]{this, context, jSONObject, liveItem, jSONObject2, str, str2, new Boolean(z), aVar});
            return;
        }
        if (jSONObject2 != null) {
            jSONObject2.getJSONObject("threshold");
        }
        new b(new d() { // from class: tb.pgc.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                    return;
                }
                MtopTbliveSeckillBusinessThresholdGetResponseData mo1437getData = ((MtopTbliveSeckillBusinessThresholdGetResponse) netBaseOutDo).mo1437getData();
                liveItem.extendVal.business = mo1437getData.business;
                liveItem.extendVal.secKillInfo = mo1437getData.secKillInfo;
                JSONObject b = pqj.b(mo1437getData.secKillInfo);
                pgc.b(pgc.this, context, jSONObject, liveItem, b != null ? b.getJSONObject("threshold") : null, str, str2, z, aVar);
            }

            @Override // com.taobao.taolive.sdk.adapter.network.d
            public void onError(int i, NetResponse netResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                } else {
                    m.a(context, dae.MSG_TOAST_DEFAULT);
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
        }).a(liveItem.extendVal.anchorId, liveItem.liveId, liveItem.itemId, liveItem.extendVal.secKillRecordId);
    }

    private void a(Context context, JSONObject jSONObject, LiveItem liveItem, String str, String str2, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c14a9ee6", new Object[]{this, context, jSONObject, liveItem, str, str2, aVar});
            return;
        }
        String a2 = com.taobao.taolive.sdk.goodlist.c.a(liveItem);
        HashMap hashMap = new HashMap();
        hashMap.put("scene", a2);
        hashMap.put("itemBizType", "secKill");
        hashMap.put("from", "goods_list".equals(str) ? spy.BIZ_GOODS_LIST : "showcase");
        hashMap.put("area", str2);
        hashMap.put("secKillInfo", liveItem.extendVal != null ? liveItem.extendVal.secKillInfo : "");
        String str3 = "2";
        hashMap.put("laiyuan", str3);
        hashMap.put("highlight_card_clickPos", "timemove_cart");
        hashMap.put("item_position", jSONObject.getString("item_position"));
        if (liveItem.extendVal == null || !"secKill".equals(liveItem.extendVal.itemBizType)) {
            str3 = (liveItem.extendVal == null || !"groupItem".equals(liveItem.extendVal.itemBizType)) ? "1" : "3";
        }
        hashMap.put("bubbleType", str3);
        if (f.m().getActionAdapter() != null) {
            f.m().getActionAdapter().a((a) null, (Activity) context, liveItem, "detail", hashMap);
        }
        o.a(aVar, "timeshiftlayer-todetail", ag.ARG_ITEM_ID + liveItem.itemId, "timemove_item_type=2", "coupon_type=0", "coupon_id=");
    }

    private void a(final Context context, final LiveItem liveItem, JSONObject jSONObject, String str, final DXRuntimeContext dXRuntimeContext, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a71b4b35", new Object[]{this, context, liveItem, jSONObject, str, dXRuntimeContext, aVar});
            return;
        }
        if (liveItem.personalityData == null) {
            liveItem.personalityData = new JSONObject();
        }
        if (!liveItem.personalityData.containsKey("goodsSubscribeStatus")) {
            liveItem.personalityData.put("goodsSubscribeStatus", (Object) "102");
        }
        String string = liveItem.personalityData.getString("goodsSubscribeStatus");
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "103".equals(string) ? "cancel" : "reserve");
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put("itemBizType", liveItem.extendVal != null ? liveItem.extendVal.itemBizType : "");
            hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_LIVE_ID, liveItem.liveId);
            hashMap.put("from", "goods_list".equals(str) ? spy.BIZ_GOODS_LIST : "showcase");
            hashMap.put("secKillInfo", jSONObject.toJSONString());
            o.a(aVar, "secKillreserve", (Map<String, String>) hashMap);
        }
        char c = 65535;
        if (string.hashCode() == 48628 && string.equals("103")) {
            c = 0;
        }
        if (c == 0) {
            new com.taobao.taolive.movehighlight.bussiness.detail.a(new com.taobao.taolive.sdk.business.d() { // from class: tb.pgc.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                        return;
                    }
                    m.a(context, "取消预约成功");
                    liveItem.personalityData.put("goodsSubscribeStatus", (Object) "102");
                    pfb a2 = pfb.a(aVar);
                    if (a2.e() == null || a2.e().b() == null) {
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("goodsSubscribeStatus", "102");
                    a2.e().b().a(String.valueOf(liveItem.itemId), hashMap2, dXRuntimeContext);
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        m.a(context, "取消预约失败，再试一次");
                    }
                }
            }).a(l.b(liveItem.liveId), liveItem.itemId, "bblb.miaosha.2021.1212");
        } else {
            new com.taobao.taolive.movehighlight.bussiness.detail.d(new com.taobao.taolive.sdk.business.d() { // from class: tb.pgc.5
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
                                m.a(context, "预约成功！");
                                liveItem.personalityData.put("goodsSubscribeStatus", (Object) "103");
                                pfb a2 = pfb.a(aVar);
                                if (a2.e() != null && a2.e().b() != null) {
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("goodsSubscribeStatus", "103");
                                    a2.e().b().a(String.valueOf(liveItem.itemId), hashMap2, dXRuntimeContext);
                                }
                                com.taobao.taolive.sdk.goodlist.o.a(context);
                                return;
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    m.a(context, "活动太火爆了，再试一次");
                }

                @Override // com.taobao.taolive.sdk.business.d, com.taobao.taolive.sdk.adapter.network.d
                public void onError(int i, NetResponse netResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                    } else {
                        m.a(context, "活动太火爆了，再试一次");
                    }
                }
            }).a(l.b(liveItem.liveId), liveItem.itemId, "bblb.miaosha.2021.1212");
        }
    }

    public static boolean a(Context context, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f10ee7f", new Object[]{context, liveItem})).booleanValue();
        }
        if (liveItem == null || liveItem.liveItemStatusData == null) {
            return false;
        }
        boolean booleanValue = liveItem.liveItemStatusData.getBooleanValue("isGray");
        if (booleanValue) {
            m.a(context, "商品已下架，看看其它商品吧");
        }
        return booleanValue;
    }
}
