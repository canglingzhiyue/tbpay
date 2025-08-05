package com.taobao.taolive.room.ui.goods.adapter;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.nav.Nav;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.movehighlight.utils.i;
import com.taobao.taolive.room.mediaplatform.h;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.utils.aa;
import com.taobao.taolive.room.utils.ai;
import com.taobao.taolive.room.utils.aq;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.room.utils.n;
import com.taobao.taolive.room.utils.s;
import com.taobao.taolive.sdk.goodlist.k;
import com.taobao.taolive.sdk.goodlist.q;
import com.taobao.taolive.sdk.goodlist.r;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.permisson.a;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;
import java.util.Map;
import tb.bkm;
import tb.cgl;
import tb.ddw;
import tb.kge;
import tb.pfb;
import tb.pfk;
import tb.pmd;
import tb.pmt;
import tb.poy;
import tb.poz;
import tb.pqj;
import tb.spy;
import tb.xkw;

/* loaded from: classes8.dex */
public class d implements com.taobao.taolive.sdk.goodlist.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1270664519);
        kge.a(956277563);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, Activity activity, LiveItem liveItem, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d03aa4f1", new Object[]{this, aVar, activity, liveItem, str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
            if (!map.containsKey("channel")) {
                hashMap.put("channel", "goods");
            }
        }
        hashMap.put("itemlistType", aa.G() ? "dx" : "weex");
        if (liveItem != null && liveItem.extendVal != null) {
            hashMap.put("isYanxuan", liveItem.extendVal.isYanxuan);
        }
        if (liveItem != null && liveItem.liveItemStatusData != null && liveItem.liveItemStatusData.containsKey("isDownShelf")) {
            hashMap.put("isDownShelf", liveItem.liveItemStatusData.getString("isDownShelf"));
        }
        com.taobao.taolive.sdk.goodlist.c.a(hashMap, liveItem);
        if (TextUtils.isEmpty(str)) {
            str = "detail";
        }
        com.taobao.taolive.room.utils.c.b(activity, liveItem, str, hashMap);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, Context context, int i, LiveItem liveItem, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56e463b2", new Object[]{this, aVar, context, new Integer(i), liveItem, map});
            return;
        }
        HashMap hashMap = new HashMap();
        if (map != null && map.containsKey("channel")) {
            hashMap.put("channel", map.get("channel"));
        } else {
            hashMap.put("channel", "goods");
        }
        if (map != null && map.containsKey("bottomMode")) {
            hashMap.put("sourceType", q.a(map.get("bottomMode")));
        }
        if (map.containsKey("scene")) {
            hashMap.put("scene", map.get("scene"));
        }
        hashMap.put("itemlistType", aa.G() ? "dx" : "weex");
        if (map.containsKey("isYanxuan")) {
            hashMap.put("isYanxuan", map.get("isYanxuan"));
        }
        com.taobao.taolive.sdk.goodlist.c.a(hashMap, liveItem);
        com.taobao.taolive.room.utils.c.a((Activity) context, i, liveItem, hashMap);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, r rVar, Context context, LiveItem liveItem, String str, String str2) {
        boolean z;
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5191177a", new Object[]{this, aVar, rVar, context, liveItem, str, str2});
        } else if (liveItem == null || TextUtils.isEmpty(str2)) {
        } else {
            com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) n.b(n.a());
            String str3 = "goodstimemove";
            if (eVar != null) {
                if (TextUtils.isEmpty(eVar.q)) {
                    eVar.q = i.a(poz.p(n.b(n.a())));
                }
                if (com.taobao.taolive.movehighlight.utils.c.w() && !TextUtils.isEmpty(eVar.q)) {
                    str3 = "goodstimemove." + eVar.q;
                }
                z = eVar.r();
            } else {
                z = false;
            }
            String str4 = null;
            if (aVar != null) {
                aTaoLiveOpenEntity = aVar.o();
                map = aVar.g();
            } else {
                aTaoLiveOpenEntity = null;
                map = null;
            }
            if (aa.cv() && aTaoLiveOpenEntity != null && ((TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.toString().equals(aTaoLiveOpenEntity.bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_HomeTab.toString().equals(aTaoLiveOpenEntity.bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(aTaoLiveOpenEntity.bizCode)) && !RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(com.taobao.taolive.movehighlight.utils.d.b))) {
                String valueOf = String.valueOf(liveItem.itemId);
                String str5 = liveItem.liveId;
                if (map == null) {
                    return;
                }
                String str6 = map.get("spm");
                if (TextUtils.isEmpty(liveItem.liveId) || TextUtils.isEmpty(valueOf)) {
                    return;
                }
                StringBuilder sb = new StringBuilder("https://h5.m.taobao.com/taolive/video.html?forceRefresh=true&productType=timemove&sjsdItemId=");
                sb.append(valueOf);
                sb.append("&id=");
                sb.append(str5);
                if (ai.d(aVar) != null) {
                    sb.append("&spm=");
                    sb.append(ai.d(aVar));
                }
                if (map.get("livesource") != null) {
                    sb.append("&livesourcePre=");
                    sb.append(map.get("livesource"));
                }
                if (str6 != null) {
                    sb.append("&spmPre=");
                    sb.append(str6);
                }
                if (map.get("scm") != null) {
                    sb.append("&scmPre=");
                    sb.append(map.get("scm"));
                }
                if (map.get(aw.PARAM_UT_PARAMS) != null) {
                    sb.append("&utparamPre=");
                    sb.append(Uri.encode(map.get(aw.PARAM_UT_PARAMS)));
                }
                sb.append("&livesource=");
                sb.append(str3);
                sb.append("&isLiveMute=");
                sb.append(z);
                Nav.from(context).toUri(sb.toString());
            } else if (aa.cg() && aTaoLiveOpenEntity != null && TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(aTaoLiveOpenEntity.bizCode) && liveItem.itemId > 0) {
                String valueOf2 = String.valueOf(liveItem.itemId);
                String str7 = liveItem.liveId;
                if (!(aTaoLiveOpenEntity.params instanceof JSONObject)) {
                    return;
                }
                String string = ((JSONObject) aTaoLiveOpenEntity.params).getString("seller_id");
                String string2 = ((JSONObject) aTaoLiveOpenEntity.params).getString("shop_id");
                String string3 = ((JSONObject) aTaoLiveOpenEntity.params).getString("shop_spm");
                if (TextUtils.isEmpty(liveItem.liveId) || TextUtils.isEmpty(valueOf2) || TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                    return;
                }
                s.a(context, "https://m.taobao.com/app/shop-conainer/contentlistpage.html?seller_id=" + string + "&shop_id=" + string2 + "&first_media_id=" + valueOf2 + "&first_media_scene=6671&source=shop&bizScene=livePointTab3&liveId=" + str7 + "&spm=" + string3 + "&livesource=liveshop.shoptab3_live");
            } else {
                com.taobao.taolive.movehighlight.utils.f.a().a(System.currentTimeMillis());
                if (com.taobao.taolive.sdk.playcontrol.c.i(n.a()) == VideoStatus.VIDEO_TIMESHIFT_STATUS) {
                    com.taobao.taolive.movehighlight.utils.f.a().a(com.taobao.taolive.movehighlight.utils.f.d);
                } else {
                    com.taobao.taolive.movehighlight.utils.f.a().a(com.taobao.taolive.movehighlight.utils.f.c);
                }
                if (liveItem.personalityData != null) {
                    str4 = liveItem.personalityData.getString("spfPlayVideo");
                }
                if (!"2".equals(str2)) {
                    if (!RecModel.MEDIA_TYPE_TIMEMOVE.equalsIgnoreCase(com.taobao.taolive.movehighlight.utils.d.b) || "itemAggregation".equalsIgnoreCase(com.taobao.taolive.sdk.goodlist.c.a(liveItem)) || "search".equalsIgnoreCase(com.taobao.taolive.sdk.goodlist.c.a(liveItem))) {
                        z2 = false;
                    }
                    if (com.taobao.taolive.sdk.goodlist.c.a(str2, z2)) {
                        com.taobao.android.live.plugin.proxy.f.m().setListCacheData(rVar, liveItem.liveId, Long.toString(liveItem.itemId));
                    }
                }
                if (com.taobao.taolive.movehighlight.utils.c.b(poy.ac(n.a()))) {
                    com.taobao.taolive.room.mediaplatform.a.a(context, liveItem.liveId, Uri.encode(com.taobao.taolive.movehighlight.utils.d.a(liveItem)), str3, str, str4);
                } else if ("2".equals(str2)) {
                    if (poy.A(n.a())) {
                        a(liveItem, context, str3);
                    } else {
                        com.taobao.taolive.movehighlight.utils.d.a(liveItem.liveId, String.valueOf(liveItem.itemId), str4, str3);
                    }
                } else if (poy.A(n.a())) {
                    a(liveItem, context, str3);
                } else {
                    com.taobao.taolive.room.mediaplatform.a.a(context, liveItem.liveId, Uri.encode(com.taobao.taolive.movehighlight.utils.d.a(liveItem)), str3, str, str4);
                }
            }
        }
    }

    private void a(LiveItem liveItem, Context context, String str) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac91172f", new Object[]{this, liveItem, context, str});
        } else if (liveItem.extendVal == null || (timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) pqj.a(liveItem.extendVal.timeMovingPlayInfo, LiveItem.TimeMovingPlayInfo.class)) == null) {
        } else {
            com.taobao.taolive.movehighlight.utils.d.a(pfk.a(liveItem, timeMovingPlayInfo, (String) null), context, n.a());
            ddw.a().a("com.taobao.taolive.room.hide_goods_list", null, n.c());
            HashMap hashMap = new HashMap();
            hashMap.put("timeMovingId", timeMovingPlayInfo.timeMovingId);
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put("timeShiftSoure", "goodsList");
            com.taobao.taolive.movehighlight.utils.f.a().a(true);
            if (pfb.a(n.a()).e() == null) {
                return;
            }
            pfb.a(n.a()).e().a(hashMap, false, null);
            poz.L(str, n.b(n.a()));
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a553b401", new Object[]{this, aVar, jSONObject, new Boolean(z)});
            return;
        }
        b();
        ddw.a().a("com.taobao.taolive.room.hide_goods_list", null, n.c());
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("clientInteracts", jSONObject);
            aq.a(n.a(), "@ali/alivemodx-live-rights-panel", hashMap);
            return;
        }
        aq.a(n.a(), "TBLiveWeex.Event.RightsPanelShow", "");
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            ddw.a().a("com.taobao.taolive.room.hide_goods_list", null, n.c());
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, Context context, String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19d0d631", new Object[]{this, aVar, context, str, str2, jSONObject});
            return;
        }
        b();
        ddw.a().a("com.taobao.taolive.room.hide_goods_list", null, n.c());
        HashMap hashMap = new HashMap();
        hashMap.put("dxAction", str);
        hashMap.put(bkm.PARSER_KEY_DX_DATA, jSONObject);
        hashMap.put("fromSource", spy.BIZ_GOODS_LIST);
        aq.a(n.a(), str2, hashMap);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, Context context, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76748d0", new Object[]{this, aVar, context, str, map});
            return;
        }
        b();
        aq.a(n.a(), str, map);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c28ccb8", new Object[]{this, aVar, liveItem});
            return;
        }
        b();
        ddw.a().a("com.taobao.taolive.goods.open.shop_vip", liveItem, n.c());
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, pmt pmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("188cb556", new Object[]{this, aVar, pmtVar});
        } else {
            ai.a(n.a(), pmtVar);
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public boolean a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc30e1eb", new Object[]{this, aVar, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        pmt pmtVar = new pmt();
        pmtVar.f32764a = str;
        return pmd.a().B().a(pmtVar);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public boolean b(a aVar, LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7caa949b", new Object[]{this, aVar, liveItem})).booleanValue();
        }
        if (liveItem == null) {
            return false;
        }
        return u.a(liveItem);
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(a aVar, Context context, String str, String str2, long j, long j2, long j3, final k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f77445c", new Object[]{this, aVar, context, str, str2, new Long(j), new Long(j2), new Long(j3), kVar});
        } else {
            cgl.t().a(context, str, str2, j, j2, j3, new a.InterfaceC0910a() { // from class: com.taobao.taolive.room.ui.goods.adapter.d.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    k kVar2 = kVar;
                    if (kVar2 == null) {
                        return;
                    }
                    kVar2.a();
                }

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    k kVar2 = kVar;
                    if (kVar2 == null) {
                        return;
                    }
                    kVar2.b();
                }
            });
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, long j, long j2, final k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf25e4c", new Object[]{this, aVar, context, str, new Long(j), new Long(j2), kVar});
        } else {
            cgl.t().a(context, str, j, j2, new a.InterfaceC0910a() { // from class: com.taobao.taolive.room.ui.goods.adapter.d.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    k kVar2 = kVar;
                    if (kVar2 == null) {
                        return;
                    }
                    kVar2.a();
                }

                @Override // com.taobao.taolive.sdk.permisson.a.InterfaceC0910a
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                        return;
                    }
                    k kVar2 = kVar;
                    if (kVar2 == null) {
                        return;
                    }
                    kVar2.b();
                }
            });
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1cc603", new Object[]{this, aVar, str, obj});
        } else {
            ddw.a().a(str, obj, n.c());
        }
    }

    @Override // com.taobao.taolive.sdk.goodlist.e
    public void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, Map<String, String> map, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15e8b2e", new Object[]{this, aVar, context, map, str, str2});
            return;
        }
        b();
        if (TextUtils.isEmpty(str) || map == null || h.a("true", str)) {
            return;
        }
        map.put("bizData", str2);
        aq.a(n.a(), poz.b(context, n.b(n.a())), str, map);
        aq.a("MyActionAdapter_addContainer");
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            ddw.a().a(xkw.EVENT_CLEAR_SCREEN_NEW, false, n.c());
        }
    }
}
