package com.taobao.taolive.room.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.kge;
import tb.pbt;
import tb.pdt;
import tb.php;
import tb.pmd;
import tb.pmt;
import tb.pol;
import tb.pqi;
import tb.pqj;
import tb.pqq;

/* loaded from: classes8.dex */
public class ah extends ag {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1156145156);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        a(str, "from=" + str2);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
        } else {
            a(str, (String) null, strArr);
        }
    }

    public static void a(String str, String str2, String... strArr) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("434e6e23", new Object[]{str, str2, strArr});
            return;
        }
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        if (s == null || s.broadCaster == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str3 = s.liveId;
        String str4 = s.broadCaster.accountId;
        if (s.isOfficialType() && php.a().a(str)) {
            str3 = s.officialLiveInfo.officialLiveId;
            str4 = s.officialLiveInfo.accountId;
        }
        arrayList.add("feed_id=" + str3);
        arrayList.add("account_id=" + str4);
        arrayList.add("deviceLevel=" + String.valueOf(com.taobao.taolive.room.service.c.M()));
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.aw)) {
            arrayList.add("pkid=" + com.taobao.taolive.room.service.c.aw);
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            arrayList.add("spm-url=" + com.taobao.taolive.room.service.c.y());
        }
        if (aa.bg() && !TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            arrayList.add("spm=" + com.taobao.taolive.room.service.c.y());
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add("trackInfo=" + str2);
        } else if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
            arrayList.add("trackInfo=" + com.taobao.taolive.room.service.c.B());
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.A())) {
            arrayList.add("liveoprt_id=" + com.taobao.taolive.room.service.c.A());
        }
        if (com.taobao.taolive.room.service.c.E() != null) {
            arrayList.add("clickurl=" + com.taobao.taolive.room.service.c.E().clickid);
            arrayList.add("interactiveurl=" + com.taobao.taolive.room.service.c.E().interactiveid);
            arrayList.add("clickInfo=" + com.taobao.taolive.room.service.c.E().clickInfo);
        }
        com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) n.b(n.a());
        if (eVar != null && !TextUtils.isEmpty(eVar.n)) {
            arrayList.add("spm-cnt=" + eVar.n);
        } else if (aa.c() && (com.taobao.taolive.room.service.c.g() || com.taobao.taolive.room.service.c.f())) {
            arrayList.add("spm-cnt=a2141.23201685");
        } else if (e()) {
            arrayList.add("spm-cnt=" + f());
        } else {
            arrayList.add("spm-cnt=a2141.8001249.1.1");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("is_fans=");
        String str5 = "1";
        sb.append(s.broadCaster.follow ? str5 : "0");
        arrayList.add(sb.toString());
        arrayList.add("watchid=" + com.taobao.taolive.room.service.c.e());
        arrayList.add("pvid=" + com.taobao.taolive.room.service.c.f21681a);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("isAD=");
        sb2.append((com.taobao.taolive.room.service.c.G() || s.isAD) ? 1 : 0);
        arrayList.add(sb2.toString());
        arrayList.add("entryUtparam=" + com.taobao.taolive.room.service.c.J);
        arrayList.add("entryPvid=" + com.taobao.taolive.room.service.c.K);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("isAdTransParams=");
        if (com.taobao.taolive.room.service.c.F() == null) {
            i = 0;
        }
        sb3.append(i);
        arrayList.add(sb3.toString());
        arrayList.add("entryLiveSource=" + com.taobao.taolive.room.service.c.v);
        arrayList.add("entryjiangjie_id=" + com.taobao.taolive.room.service.c.w);
        arrayList.add("timeMovingUtParams=" + com.taobao.taolive.room.service.c.x);
        arrayList.add("entryScmPre=" + com.taobao.taolive.room.service.c.r);
        arrayList.add("entrySpmPre=" + com.taobao.taolive.room.service.c.s);
        arrayList.add("entryUtparamPre=" + com.taobao.taolive.room.service.c.t);
        arrayList.add("entryLiveSourcePre=" + com.taobao.taolive.room.service.c.u);
        arrayList.add("entryQuery=" + com.taobao.taolive.room.service.c.y);
        arrayList.add("entrySpm=" + com.taobao.taolive.room.service.c.z);
        arrayList.add("entryScm=" + com.taobao.taolive.room.service.c.B);
        arrayList.add("entryFeedId=" + com.taobao.taolive.room.service.c.L);
        arrayList.add("entryContentId=" + com.taobao.taolive.room.service.c.M);
        arrayList.add("entryAccountId=" + com.taobao.taolive.room.service.c.N);
        arrayList.add("entryLiveScm=" + com.taobao.taolive.room.service.c.O);
        arrayList.add("switchIndex=" + com.taobao.taolive.room.service.c.E);
        arrayList.add("isUp=" + com.taobao.taolive.room.service.c.F);
        arrayList.add("entryTraceId=" + com.taobao.taolive.room.service.c.C);
        arrayList.add("entryLiveId=" + com.taobao.taolive.room.service.c.D);
        arrayList.add("product_type=" + com.taobao.taolive.movehighlight.utils.d.b);
        arrayList.add("liveAdParams=" + Uri.encode(com.taobao.taolive.room.service.c.Q));
        if (!TextUtils.isEmpty(com.taobao.taolive.room.ui.fanslevel.a.a().d())) {
            arrayList.add(ag.ARG_FANS_LEVEL + com.taobao.taolive.room.ui.fanslevel.a.a().d());
        }
        arrayList.add("feedtype=" + s.type);
        arrayList.add("livestatus=" + s.status);
        arrayList.add("roomStatus=" + s.roomStatus);
        arrayList.add("landscape=" + s.landScape);
        arrayList.add("accounttype=" + com.taobao.taolive.sdk.controller.k.a(s.broadCaster.type));
        arrayList.add("roomType=" + s.roomType);
        arrayList.add("livesource=" + com.taobao.taolive.room.service.c.k());
        arrayList.add("entrySource=" + com.taobao.taolive.room.service.c.l());
        int i2 = s.roomType;
        if (com.taobao.taolive.room.service.c.a(s)) {
            i2 = 13;
        }
        arrayList.add("roomtype2=" + i2);
        arrayList.add("timeShiftForEnter=" + com.taobao.taolive.room.service.c.p() + "");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("jiangjie_ID=");
        sb4.append(com.taobao.taolive.room.service.c.c());
        arrayList.add(sb4.toString());
        arrayList.add("oneproduct_jiangjie=" + com.taobao.taolive.room.service.c.a());
        arrayList.add("oneproduct_mounting=" + com.taobao.taolive.room.service.c.d());
        arrayList.add("timeShiftItemId=" + com.taobao.taolive.room.service.c.j());
        arrayList.add("queryKey=" + com.taobao.taolive.room.service.c.au);
        arrayList.add("clickid=" + com.taobao.taolive.room.service.c.av);
        arrayList.add("room_type=live");
        arrayList.add("singleLiveTabSessionId=" + com.taobao.taolive.room.service.c.U);
        if (!TextUtils.isEmpty(s.tvChannelId)) {
            arrayList.add("officialchannel_id=" + s.tvChannelId);
        }
        if (strArr != null && strArr.length > 0) {
            for (String str6 : strArr) {
                arrayList.add(str6);
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("login=");
        if (pmd.a().q() == null || !pmd.a().q().c()) {
            str5 = "0";
        }
        sb5.append(str5);
        arrayList.add(sb5.toString());
        if (aa.a() && !TextUtils.isEmpty(com.taobao.taolive.room.service.c.z())) {
            arrayList.add("utparam-url=" + com.taobao.taolive.room.service.c.z());
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append("content_type=");
        sb6.append(com.taobao.taolive.sdk.goodlist.d.a(s.itemTransferInfo) ? "reward" : "normal");
        arrayList.add(sb6.toString());
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().a("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (pmd.a().e() == null) {
        } else {
            if (map != null) {
                map.put("livesource", com.taobao.taolive.room.service.c.k());
                map.put("entrySource", com.taobao.taolive.room.service.c.l());
                map.put("timeShiftForEnter", com.taobao.taolive.room.service.c.p() + "");
                map.put("jiangjie_ID", com.taobao.taolive.room.service.c.c());
                map.put("oneproduct_jiangjie", com.taobao.taolive.room.service.c.a());
                map.put("oneproduct_mounting", com.taobao.taolive.room.service.c.d());
                map.put("timeShiftItemId", com.taobao.taolive.room.service.c.j());
                map.put("queryKey", com.taobao.taolive.room.service.c.au);
                map.put("clickid", com.taobao.taolive.room.service.c.av);
                StringBuilder sb = new StringBuilder();
                sb.append(com.taobao.taolive.room.service.c.F() != null ? 1 : 0);
                sb.append("");
                map.put("isAdTransParams", sb.toString());
                map.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
                map.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
                map.put("timeMovingUtParams", com.taobao.taolive.room.service.c.x);
                map.put(pdt.entryQuery, com.taobao.taolive.room.service.c.y);
                map.put("entryScmPre", com.taobao.taolive.room.service.c.r);
                map.put("entrySpmPre", com.taobao.taolive.room.service.c.s);
                map.put("entryUtparamPre", com.taobao.taolive.room.service.c.t);
                map.put("entrySpm", com.taobao.taolive.room.service.c.z);
                map.put(pqq.KEY_ENTRY_SCM, com.taobao.taolive.room.service.c.B);
                map.put("entryFeedId", com.taobao.taolive.room.service.c.L);
                map.put("entryContentId", com.taobao.taolive.room.service.c.M);
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, com.taobao.taolive.room.service.c.N);
                map.put("entryLiveScm", com.taobao.taolive.room.service.c.O);
                map.put("switchIndex", com.taobao.taolive.room.service.c.E + "");
                map.put("isUp", com.taobao.taolive.room.service.c.F + "");
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, com.taobao.taolive.room.service.c.C);
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, com.taobao.taolive.room.service.c.D);
                map.put("entryUtparam", com.taobao.taolive.room.service.c.J);
                map.put("entryPvid", com.taobao.taolive.room.service.c.K);
                map.put("watchid", com.taobao.taolive.room.service.c.e());
                map.put(aw.PARAM_PVID, com.taobao.taolive.room.service.c.f21681a);
                map.put("product_type", com.taobao.taolive.movehighlight.utils.d.b);
                map.put("singleLiveTabSessionId", com.taobao.taolive.room.service.c.U);
                VideoInfo s = com.taobao.taolive.room.service.c.s();
                if (s != null) {
                    StringBuilder sb2 = new StringBuilder();
                    if (!com.taobao.taolive.room.service.c.G() && !s.isAD) {
                        i = 0;
                    }
                    sb2.append(i);
                    sb2.append("");
                    map.put("isAD", sb2.toString());
                    map.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(s.itemTransferInfo) ? "reward" : "normal");
                    map.put("roomType", String.valueOf(s.roomType));
                    map.put("newRoomType", String.valueOf(s.newRoomType));
                    map.put("roomStatus", s.roomStatus);
                    String str2 = s.liveId;
                    String str3 = s.broadCaster.accountId;
                    if (s.isOfficialType() && php.a().a(str)) {
                        str2 = s.officialLiveInfo.officialLiveId;
                        str3 = s.officialLiveInfo.accountId;
                    }
                    if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
                        map.put("spm-url", com.taobao.taolive.room.service.c.y());
                    }
                    map.put("feed_id", str2);
                    map.put("account_id", str3);
                    if (!TextUtils.isEmpty(s.tvChannelId)) {
                        map.put(ag.KEY_OFFICIAL_CHANNEL_ID, s.tvChannelId);
                    }
                }
                map.put("spm-cnt", d());
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void a(String str, long j, String str2, boolean z, String str3, HashMap<String, String> hashMap) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c0c671", new Object[]{str, new Long(j), str2, new Boolean(z), str3, hashMap});
            return;
        }
        String str20 = "";
        if (hashMap != null) {
            String str21 = hashMap.containsKey("class_number") ? hashMap.get("class_number") : "0";
            String str22 = hashMap.containsKey("class_total") ? hashMap.get("class_total") : "0";
            str6 = hashMap.containsKey("scene") ? hashMap.get("scene") : str20;
            str7 = hashMap.containsKey("itemBizType") ? hashMap.get("itemBizType") : str20;
            str8 = hashMap.containsKey("bubbleType") ? hashMap.get("bubbleType") : str20;
            str9 = hashMap.containsKey("item_index") ? hashMap.get("item_index") : str20;
            str11 = hashMap.containsKey("class_number") ? hashMap.get("class_number") : str20;
            str5 = hashMap.containsKey("class_total") ? hashMap.get("class_total") : str20;
            if (hashMap.containsKey("channel")) {
                str10 = hashMap.get("channel");
                str4 = "0";
            } else {
                str4 = "0";
                str10 = str20;
            }
            String str23 = hashMap.containsKey("isYanxuan") ? hashMap.get("isYanxuan") : str20;
            String str24 = hashMap.containsKey("isDownShelf") ? hashMap.get("isDownShelf") : str20;
            String str25 = hashMap.containsKey("pre") ? hashMap.get("pre") : str20;
            String str26 = hashMap.containsKey("preset") ? hashMap.get("preset") : str20;
            String str27 = hashMap.containsKey("highlight_coupon_type") ? hashMap.get("highlight_coupon_type") : str20;
            String str28 = hashMap.containsKey("highlight_coupon_id") ? hashMap.get("highlight_coupon_id") : str20;
            if (hashMap.containsKey("highlight_strategy_code")) {
                str20 = hashMap.get("highlight_strategy_code");
            }
            str17 = str20;
            str18 = str21;
            str19 = str22;
            str20 = str23;
            str12 = str24;
            str13 = str25;
            str14 = str26;
            str15 = str27;
            str16 = str28;
        } else {
            str4 = "0";
            str5 = str20;
            str6 = str5;
            str7 = str6;
            str8 = str7;
            str9 = str8;
            str10 = str9;
            str11 = str10;
            str12 = str11;
            str13 = str12;
            str14 = str13;
            str15 = str14;
            str16 = str15;
            str17 = str16;
            str18 = str4;
            str19 = str18;
        }
        String[] strArr = new String[20];
        String str29 = str6;
        StringBuilder sb = new StringBuilder();
        String str30 = str20;
        sb.append(ag.ARG_ITEM_ID);
        sb.append(j);
        strArr[0] = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ag.ARG_IS_GROUP);
        sb2.append(z ? "1" : str4);
        strArr[1] = sb2.toString();
        strArr[2] = "clickSource=" + str2;
        strArr[3] = "class_number=" + str18;
        strArr[4] = "class_total=" + str19;
        strArr[5] = "tradeParams=" + str3;
        strArr[6] = "itemBizType=" + str7;
        strArr[7] = "bubbleType=" + str8;
        strArr[8] = "item_index=" + str9;
        strArr[9] = "class_number=" + str11;
        strArr[10] = "class_total=" + str5;
        strArr[11] = ag.ARG_CHANNEL + str10;
        strArr[12] = "isYanxuan=" + str30;
        strArr[13] = "scene=" + str29;
        strArr[14] = "isDownShelf=" + str12;
        strArr[15] = "pre=" + str13;
        strArr[16] = "preset=" + str14;
        strArr[17] = "coupon_type=" + str15;
        strArr[18] = "coupon_id=" + str16;
        strArr[19] = "strategyCode=" + str17;
        a(str, strArr);
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{str, hashMap});
        } else {
            a(str, (String) null, hashMap);
        }
    }

    public static void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{str, str2, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        if (s == null || s.broadCaster == null) {
            return;
        }
        String str3 = s.liveId;
        String str4 = s.broadCaster.accountId;
        hashMap.put("liveAdParams", Uri.encode(com.taobao.taolive.room.service.c.Q));
        hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(s.broadCaster.type) + "");
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            hashMap.put("spm-url", com.taobao.taolive.room.service.c.y());
        }
        hashMap.put("feed_id", str3);
        hashMap.put("account_id", str4);
        hashMap.put("roomType", String.valueOf(s.roomType));
        hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.service.c.M()));
        hashMap.put("accountType", com.taobao.taolive.sdk.controller.k.a(s.broadCaster.type) + "");
        int i2 = s.roomType;
        if (com.taobao.taolive.room.service.c.a(s)) {
            i2 = 13;
        }
        hashMap.put(ag.KEY_ROOMTYPE2, i2 + "");
        hashMap.put("entryScmPre", com.taobao.taolive.room.service.c.r);
        hashMap.put("entrySpmPre", com.taobao.taolive.room.service.c.s);
        hashMap.put("entryUtparamPre", com.taobao.taolive.room.service.c.t);
        hashMap.put("entrySpm", com.taobao.taolive.room.service.c.z);
        hashMap.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
        hashMap.put("entryLiveSourcePre", com.taobao.taolive.room.service.c.u);
        hashMap.put("entryUtparam", com.taobao.taolive.room.service.c.J);
        hashMap.put("entryPvid", com.taobao.taolive.room.service.c.K);
        hashMap.put("timeShiftForEnter", com.taobao.taolive.room.service.c.p() + "");
        hashMap.put("jiangjie_ID", com.taobao.taolive.room.service.c.c());
        hashMap.put("oneproduct_jiangjie", com.taobao.taolive.room.service.c.a());
        hashMap.put("oneproduct_mounting", com.taobao.taolive.room.service.c.d());
        hashMap.put("timeShiftItemId", com.taobao.taolive.room.service.c.j());
        hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
        hashMap.put("login", (pmd.a().q() == null || !pmd.a().q().c()) ? "0" : "1");
        hashMap.put("livesource", com.taobao.taolive.room.service.c.k());
        hashMap.put("entrySource", com.taobao.taolive.room.service.c.l());
        hashMap.put("switchIndex", String.valueOf(com.taobao.taolive.room.service.c.E));
        hashMap.put("isUp", String.valueOf(com.taobao.taolive.room.service.c.F));
        hashMap.put("queryKey", com.taobao.taolive.room.service.c.au);
        hashMap.put("clickid", com.taobao.taolive.room.service.c.av);
        hashMap.put("watchid", com.taobao.taolive.room.service.c.e());
        hashMap.put(aw.PARAM_PVID, com.taobao.taolive.room.service.c.f21681a);
        StringBuilder sb = new StringBuilder();
        if (!com.taobao.taolive.room.service.c.G() && !s.isAD) {
            i = 0;
        }
        sb.append(i);
        sb.append("");
        hashMap.put("isAD", sb.toString());
        hashMap.put("product_type", com.taobao.taolive.movehighlight.utils.d.b);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("trackInfo", str2);
        } else if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
            hashMap.put("trackInfo", com.taobao.taolive.room.service.c.B());
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.A())) {
            hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, com.taobao.taolive.room.service.c.A());
        }
        if (aa.bf() && !TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            hashMap.put("spm", com.taobao.taolive.room.service.c.y());
        }
        com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
        if (a2 instanceof com.taobao.taolive.room.controller2.g) {
            hashMap.put("liveToken", a2.j());
        }
        com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) n.b(n.a());
        if (eVar != null && !TextUtils.isEmpty(eVar.n)) {
            hashMap.put("spm-cnt", eVar.n);
        } else if (aa.c() && (com.taobao.taolive.room.service.c.g() || com.taobao.taolive.room.service.c.f())) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else if (e()) {
            hashMap.put("spm-cnt", f());
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        hashMap.put("timestampT", System.currentTimeMillis() + "");
        if (!TextUtils.isEmpty(s.tvChannelId)) {
            hashMap.put(ag.KEY_OFFICIAL_CHANNEL_ID, s.tvChannelId);
        }
        hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(s.itemTransferInfo) ? "reward" : "normal");
        hashMap.put("singleLiveTabSessionId", com.taobao.taolive.room.service.c.U);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().b("Page_TaobaoLiveWatch", str, hashMap);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74322583", new Object[]{aVar, obj, str});
        } else if (!com.taobao.taolive.room.service.c.x()) {
        } else {
            if (com.taobao.taolive.room.controller2.j.f()) {
                str = ag.PAGE_HOME_LIVETAB;
            }
            av.a(aVar, null, obj, str);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564375c5", new Object[]{aVar, eVar, obj});
        } else if (!com.taobao.taolive.room.service.c.x()) {
        } else {
            av.a(aVar, eVar, obj);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59cb18c6", new Object[]{aVar, eVar, obj});
        } else if (!com.taobao.taolive.room.service.c.x()) {
        } else {
            if (aa.aV() && pmd.a().e() != null && (obj instanceof Activity)) {
                pbt.a().f32558a.a("liveRoom", "Page_TaobaoLiveWatch", av.a(aVar, eVar, (Activity) obj));
            }
            av.c(aVar, eVar, obj);
        }
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
        } else if (!com.taobao.taolive.room.service.c.x()) {
        } else {
            com.taobao.taolive.sdk.core.a.a(n.a(), obj, map);
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d52bbc7", new Object[]{aVar, eVar, obj});
        } else if (!com.taobao.taolive.room.service.c.x()) {
        } else {
            av.b(aVar, eVar, obj);
        }
    }

    public static void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b9de07", new Object[]{obj});
        } else if (!com.taobao.taolive.room.service.c.x() || pmd.a().e() == null) {
        } else {
            pmd.a().e().d(obj);
        }
    }

    public static Map<String, String> b(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dadcaa04", new Object[]{obj, str});
        }
        if (!com.taobao.taolive.room.service.c.x()) {
            return new HashMap();
        }
        return a(obj, str, (String) null, (String) null, (String) null, true);
    }

    public static Map<String, String> a(Object obj, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fe803e1d", new Object[]{obj, str, str2, str3, str4, new Boolean(z)});
        }
        if (!com.taobao.taolive.room.service.c.x()) {
            return new HashMap();
        }
        return a(obj, str, str2, str3, str4, z, true);
    }

    public static Map<String, String> a(Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e9321", new Object[]{obj, str, str2, str3, str4, new Boolean(z), new Boolean(z2)});
        }
        if (!com.taobao.taolive.room.service.c.x()) {
            return new HashMap();
        }
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        HashMap hashMap = new HashMap();
        if (s != null) {
            if (s.broadCaster != null) {
                String str7 = s.broadCaster.accountId;
                if (s.isOfficialType()) {
                    str7 = s.officialLiveInfo.accountId;
                    str6 = s.broadCaster.accountId;
                } else {
                    str6 = "";
                }
                hashMap.put("account_id", str7);
                hashMap.put("former_anchorid", str6);
                hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(s.broadCaster.type) + "");
            } else {
                a("broadCasterNull", (String) null);
            }
            String str8 = s.liveId;
            if (s.isOfficialType()) {
                str8 = s.officialLiveInfo.officialLiveId;
                str5 = s.liveId;
            } else {
                str5 = "";
            }
            hashMap.put("former_liveid", str5);
            String str9 = "0";
            hashMap.put("login", pmd.a().q().c() ? "1" : str9);
            hashMap.put("feed_id", str8);
            if (!TextUtils.isEmpty(s.gameId)) {
                hashMap.put("game_id", s.gameId);
            }
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
            hashMap.put("feedtype", s.type + "");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("scm", str);
                Log.e("trackPageSCM", str);
            }
            if (com.taobao.taolive.room.service.c.E() != null) {
                hashMap.put("clickurl", com.taobao.taolive.room.service.c.E().clickid);
                hashMap.put("interactiveurl", com.taobao.taolive.room.service.c.E().interactiveid);
                hashMap.put("clickInfo", JSON.toJSONString(com.taobao.taolive.room.service.c.E().clickInfo));
            }
            hashMap.put("scm-live", com.taobao.taolive.room.service.c.G);
            hashMap.put("spm-live", com.taobao.taolive.room.service.c.H);
            hashMap.put("watchid", com.taobao.taolive.room.service.c.e());
            hashMap.put(aw.PARAM_PVID, com.taobao.taolive.room.service.c.f21681a);
            StringBuilder sb = new StringBuilder();
            sb.append((com.taobao.taolive.room.service.c.G() || s.isAD) ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            hashMap.put("entryUtparam", com.taobao.taolive.room.service.c.J);
            hashMap.put("entryPvid", com.taobao.taolive.room.service.c.K);
            hashMap.put("isAdTransParams", String.valueOf(com.taobao.taolive.room.service.c.F() != null ? 1 : 0));
            hashMap.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
            hashMap.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
            hashMap.put("timeMovingUtParams", com.taobao.taolive.room.service.c.x);
            hashMap.put(pdt.entryQuery, com.taobao.taolive.room.service.c.y);
            hashMap.put("entryScmPre", com.taobao.taolive.room.service.c.r);
            hashMap.put("entrySpmPre", com.taobao.taolive.room.service.c.s);
            hashMap.put("entryUtparamPre", com.taobao.taolive.room.service.c.t);
            hashMap.put("entryLiveSourcePre", com.taobao.taolive.room.service.c.u);
            hashMap.put(pqq.KEY_ENTRY_SCM, com.taobao.taolive.room.service.c.B);
            hashMap.put("entryFeedId", com.taobao.taolive.room.service.c.L);
            hashMap.put("entryContentId", com.taobao.taolive.room.service.c.M);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, com.taobao.taolive.room.service.c.N);
            hashMap.put("entryLiveScm", com.taobao.taolive.room.service.c.O);
            hashMap.put("switchIndex", com.taobao.taolive.room.service.c.E + "");
            hashMap.put("isUp", com.taobao.taolive.room.service.c.F + "");
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, com.taobao.taolive.room.service.c.C);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, com.taobao.taolive.room.service.c.D);
            hashMap.put("singleLiveTabSessionId", com.taobao.taolive.room.service.c.U);
            if (s.landScape) {
                str9 = "1";
            }
            hashMap.put("landscape", str9);
            hashMap.put("skipbk", "1");
            hashMap.put("roomType", String.valueOf(s.roomType));
            hashMap.put("newRoomType", String.valueOf(s.newRoomType));
            hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.service.c.M()));
            hashMap.put("timeShiftForEnter", com.taobao.taolive.room.service.c.p() + "");
            hashMap.put("jiangjie_ID", com.taobao.taolive.room.service.c.c());
            hashMap.put("kandianItemId", com.taobao.taolive.movehighlight.utils.d.c);
            hashMap.put("oneproduct_jiangjie", com.taobao.taolive.room.service.c.a());
            hashMap.put("oneproduct_mounting", com.taobao.taolive.room.service.c.d());
            hashMap.put("product_type", com.taobao.taolive.movehighlight.utils.d.b);
            hashMap.put("timeShiftItemId", com.taobao.taolive.room.service.c.j());
            hashMap.put("queryKey", com.taobao.taolive.room.service.c.au);
            if (com.taobao.taolive.sdk.utils.o.L()) {
                com.taobao.alilive.aliliveframework.frame.a a2 = n.a();
                if (a2 instanceof com.taobao.taolive.room.controller2.g) {
                    hashMap.put("liveToken", a2.j());
                    com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) a2;
                    if (gVar.w() != null && gVar.w().initParams != null && gVar.w().initParams.get(aw.PARAM_TCP_OUTER_PARAM) != null) {
                        hashMap.put(aw.PARAM_TCP_OUTER_PARAM, gVar.w().initParams.get(aw.PARAM_TCP_OUTER_PARAM));
                    }
                }
            }
            hashMap.put("liveAdParams", Uri.encode(com.taobao.taolive.room.service.c.Q));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("clickid", str2);
            }
            if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
                hashMap.put("trackInfo", com.taobao.taolive.room.service.c.B());
            }
            if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.A())) {
                hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, com.taobao.taolive.room.service.c.A());
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, str3);
            }
            hashMap.put("timemoving_type", com.taobao.taolive.movehighlight.utils.d.d ? "content" : "item");
            int i = s.roomType;
            if (com.taobao.taolive.room.service.c.a(s)) {
                i = 13;
            }
            hashMap.put(ag.KEY_ROOMTYPE2, i + "");
            if (com.taobao.taolive.sdk.playcontrol.c.e(null) != null && com.taobao.taolive.sdk.playcontrol.c.e(null).y() != null) {
                hashMap.put("play_token", com.taobao.taolive.sdk.playcontrol.c.e(null).y());
            }
            if (!TextUtils.isEmpty(s.tvChannelId)) {
                hashMap.put(ag.KEY_OFFICIAL_CHANNEL_ID, s.tvChannelId);
            }
            hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(s.itemTransferInfo) ? "reward" : "normal");
            if (z2) {
                pqi.a().a("liveRoomShow", JSON.toJSONString(hashMap), 1.0d);
            }
        }
        hashMap.put("session_id", m.a());
        com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) n.b(n.a());
        if (eVar != null && !TextUtils.isEmpty(eVar.n)) {
            hashMap.put("spm-cnt", eVar.n);
        } else if (aa.c() && (com.taobao.taolive.room.service.c.g() || com.taobao.taolive.room.service.c.f())) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else if (e()) {
            hashMap.put("spm-cnt", f());
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            hashMap.put("spm-url", com.taobao.taolive.room.service.c.y());
        }
        if (aa.bD()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("content", (Object) com.taobao.taolive.room.service.c.P);
            jSONObject.put("spm", (Object) com.taobao.taolive.room.service.c.y());
            jSONObject.put("livesource", (Object) com.taobao.taolive.room.service.c.k());
            jSONObject.put("entrySource", (Object) com.taobao.taolive.room.service.c.l());
            hashMap.put("extendJson", jSONObject.toJSONString());
        }
        hashMap.put("entrySpm", com.taobao.taolive.room.service.c.z);
        hashMap.put("livesource", com.taobao.taolive.room.service.c.k());
        hashMap.put("entrySource", com.taobao.taolive.room.service.c.l());
        if (z) {
            com.taobao.taolive.sdk.core.a.a(n.a(), obj, hashMap);
        }
        return hashMap;
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!com.taobao.taolive.room.service.c.x() || !aa.au()) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("scm-pre", com.taobao.taolive.room.service.c.G);
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().b((Map<String, String>) hashMap);
        }
    }

    public static void b() {
        VideoInfo s;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!com.taobao.taolive.room.service.c.x() || (s = com.taobao.taolive.room.service.c.s()) == null || s.broadCaster == null) {
        } else {
            HashMap hashMap = new HashMap();
            String str = s.liveId;
            String str2 = s.broadCaster.accountId;
            hashMap.put("feed_id", str);
            hashMap.put("account_id", str2);
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
            hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(s.broadCaster.type) + "");
            hashMap.put("scm-live", com.taobao.taolive.room.service.c.G);
            hashMap.put("spm-live", com.taobao.taolive.room.service.c.H);
            if (aa.au()) {
                hashMap.put("x_object_type", com.taobao.taolive.room.service.c.I);
            }
            hashMap.put("feedtype", s.type + "");
            hashMap.put("landscape", s.landScape ? "1" : "0");
            hashMap.put("roomType", String.valueOf(s.roomType));
            StringBuilder sb = new StringBuilder();
            sb.append((com.taobao.taolive.room.service.c.G() || s.isAD) ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (com.taobao.taolive.room.service.c.F() != null) {
                i = 1;
            }
            sb2.append(i);
            sb2.append("");
            hashMap.put("isAdTransParams", sb2.toString());
            hashMap.put("entryScmPre", com.taobao.taolive.room.service.c.r);
            hashMap.put("entrySpmPre", com.taobao.taolive.room.service.c.s);
            hashMap.put("entryUtparamPre", com.taobao.taolive.room.service.c.t);
            hashMap.put("entryLiveSourcePre", com.taobao.taolive.room.service.c.u);
            hashMap.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
            hashMap.put("entryUtparam", com.taobao.taolive.room.service.c.J);
            hashMap.put("entryPvid", com.taobao.taolive.room.service.c.K);
            hashMap.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
            hashMap.put("timeMovingUtParams", com.taobao.taolive.room.service.c.x);
            hashMap.put(pdt.entryQuery, com.taobao.taolive.room.service.c.y);
            hashMap.put("entrySpm", com.taobao.taolive.room.service.c.z);
            hashMap.put(pqq.KEY_ENTRY_SCM, com.taobao.taolive.room.service.c.B);
            hashMap.put("entryFeedId", com.taobao.taolive.room.service.c.L);
            hashMap.put("entryContentId", com.taobao.taolive.room.service.c.M);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, com.taobao.taolive.room.service.c.N);
            hashMap.put("entryLiveScm", com.taobao.taolive.room.service.c.O);
            hashMap.put("switchIndex", com.taobao.taolive.room.service.c.E + "");
            hashMap.put("isUp", com.taobao.taolive.room.service.c.F + "");
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, com.taobao.taolive.room.service.c.C);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, com.taobao.taolive.room.service.c.D);
            hashMap.put("livesource", com.taobao.taolive.room.service.c.k());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str);
            hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.service.c.M()));
            if (aa.g()) {
                hashMap.put("clickid", com.taobao.taolive.room.service.c.av);
            }
            if (aa.aU() && !TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
                hashMap.put("trackInfo", com.taobao.taolive.room.service.c.B());
            }
            if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.A())) {
                hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, com.taobao.taolive.room.service.c.A());
            }
            hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(s.itemTransferInfo) ? "reward" : "normal");
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a((Map<String, String>) hashMap);
        }
    }

    public static void a(String str) {
        VideoInfo s;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else if (!com.taobao.taolive.room.service.c.x() || (s = com.taobao.taolive.room.service.c.s()) == null || s.broadCaster == null) {
        } else {
            HashMap hashMap = new HashMap();
            String str2 = s.liveId;
            String str3 = s.broadCaster.accountId;
            hashMap.put("x_object_type", com.taobao.taolive.room.service.c.I);
            hashMap.put("feed_id", str2);
            hashMap.put("account_id", str3);
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
            hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(s.broadCaster.type) + "");
            hashMap.put("scm-live", com.taobao.taolive.room.service.c.G);
            hashMap.put("spm-live", com.taobao.taolive.room.service.c.H);
            hashMap.put("feedtype", s.type + "");
            hashMap.put("landscape", s.landScape ? "1" : "0");
            hashMap.put("roomType", String.valueOf(s.roomType));
            StringBuilder sb = new StringBuilder();
            sb.append((com.taobao.taolive.room.service.c.G() || s.isAD) ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (com.taobao.taolive.room.service.c.F() != null) {
                i = 1;
            }
            sb2.append(i);
            sb2.append("");
            hashMap.put("isAdTransParams", sb2.toString());
            hashMap.put("entryScmPre", com.taobao.taolive.room.service.c.r);
            hashMap.put("entrySpmPre", com.taobao.taolive.room.service.c.s);
            hashMap.put("entryUtparamPre", com.taobao.taolive.room.service.c.t);
            hashMap.put("entryLiveSourcePre", com.taobao.taolive.room.service.c.u);
            hashMap.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
            hashMap.put("entryUtparam", com.taobao.taolive.room.service.c.J);
            hashMap.put("entryPvid", com.taobao.taolive.room.service.c.K);
            hashMap.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
            hashMap.put("timeMovingUtParams", com.taobao.taolive.room.service.c.x);
            hashMap.put(pdt.entryQuery, com.taobao.taolive.room.service.c.y);
            hashMap.put("entrySpm", com.taobao.taolive.room.service.c.z);
            hashMap.put(pqq.KEY_ENTRY_SCM, com.taobao.taolive.room.service.c.B);
            hashMap.put("entryFeedId", com.taobao.taolive.room.service.c.L);
            hashMap.put("entryContentId", com.taobao.taolive.room.service.c.M);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, com.taobao.taolive.room.service.c.N);
            hashMap.put("entryLiveScm", com.taobao.taolive.room.service.c.O);
            hashMap.put("switchIndex", com.taobao.taolive.room.service.c.E + "");
            hashMap.put("isUp", com.taobao.taolive.room.service.c.F + "");
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, com.taobao.taolive.room.service.c.C);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, com.taobao.taolive.room.service.c.D);
            hashMap.put("livesource", com.taobao.taolive.room.service.c.k());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str2);
            hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.service.c.M()));
            if (aa.aU()) {
                hashMap.put("trackInfo", str);
            }
            hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(s.itemTransferInfo) ? "reward" : "normal");
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a((Map<String, String>) hashMap);
        }
    }

    public static void c(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df13c1eb", new Object[]{str, strArr});
        } else {
            a(str, "", "", strArr);
        }
    }

    public static void a(String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50031319", new Object[]{str, str2, str3, strArr});
            return;
        }
        List<String> a2 = a(strArr);
        if (TextUtils.isEmpty(str3)) {
            str3 = c();
        }
        cgl.s().a("taobaolive", str, str2, str3, (String[]) a2.toArray(new String[0]));
    }

    public static void a(Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4826b51", new Object[]{obj, str, strArr});
            return;
        }
        List<String> a2 = a(strArr);
        if (TextUtils.isEmpty(str)) {
            str = c();
        }
        cgl.s().b("taobaolive", str, obj, (String[]) a2.toArray(new String[0]));
    }

    public static void b(Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa8636b0", new Object[]{obj, str, strArr});
            return;
        }
        List<String> a2 = a(strArr);
        if (TextUtils.isEmpty(str)) {
            str = c();
        }
        cgl.s().a("taobaolive", str, obj, (String[]) a2.toArray(new String[0]));
    }

    public static void d(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e678f70a", new Object[]{str, strArr});
            return;
        }
        List<String> a2 = a(strArr);
        if (TextUtils.isEmpty(str)) {
            str = c();
        }
        cgl.s().a("taobaolive", str, (String[]) a2.toArray(new String[0]));
    }

    public static void e(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edde2c29", new Object[]{str, strArr});
        } else {
            cgl.s().a("taobaolive", str, com.taobao.taolive.room.service.c.B(), (String[]) a(strArr).toArray(new String[0]));
        }
    }

    public static List<String> a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a10d1db0", new Object[]{strArr});
        }
        ArrayList arrayList = new ArrayList();
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        arrayList.add("feedId=" + c());
        arrayList.add("liveSource=" + com.taobao.taolive.room.service.c.k());
        arrayList.add("entrySource=" + com.taobao.taolive.room.service.c.l());
        arrayList.add("timestamp=" + System.currentTimeMillis());
        arrayList.add("timeShiftEntry=" + com.taobao.taolive.room.service.c.p());
        arrayList.add("jiangjie_ID=" + com.taobao.taolive.room.service.c.c());
        arrayList.add("oneproduct_jiangjie=" + com.taobao.taolive.room.service.c.a());
        arrayList.add("oneproduct_mounting=" + com.taobao.taolive.room.service.c.d());
        if (s != null) {
            String str = s.broadCaster != null ? s.broadCaster.accountId : "";
            arrayList.add("accountId=" + str);
            arrayList.add("roomStatus=" + s.roomStatus);
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
            arrayList.add("trackInfo=" + com.taobao.taolive.room.service.c.B());
        }
        arrayList.add("serverParams=" + com.taobao.taolive.room.service.c.n());
        arrayList.add("fansLevel=" + com.taobao.taolive.room.ui.fanslevel.a.a().d());
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        if (s == null) {
            return null;
        }
        return s.liveId;
    }

    public static void a(Context context, String str, Map<String, String> map) {
        Uri data;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a974c1b", new Object[]{context, str, map});
            return;
        }
        Intent intent = ((Activity) context).getIntent();
        if (intent != null && (data = intent.getData()) != null) {
            String queryParameter = data.getQueryParameter("utLogMap");
            String queryParameter2 = data.getQueryParameter(aw.PARAM_UT_PARAMS);
            String str2 = "";
            String string = (TextUtils.isEmpty(queryParameter2) || (b = pqj.b(queryParameter2)) == null) ? str2 : b.getString(aw.PARAMS_LIVE_TRACKINFO);
            String queryParameter3 = data.getQueryParameter("clickid");
            if (map != null) {
                str2 = map.get("follow_location");
            }
            a("AccountFollow", "utLogMap=" + queryParameter, "x_live_trackInfo=" + string, "clickid=" + queryParameter3, "follow_location=" + str2);
        }
        c("follow", "followAccount=" + str);
    }

    public static pmt a(pmt pmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmt) ipChange.ipc$dispatch("12a456ce", new Object[]{pmtVar});
        }
        if (pmtVar == null) {
            pmtVar = new pmt();
        }
        pmtVar.d = com.taobao.taolive.room.service.c.y();
        pmtVar.e = com.taobao.taolive.room.service.c.av;
        pmtVar.f = com.taobao.taolive.room.service.c.k();
        pmtVar.g = String.valueOf(com.taobao.taolive.room.service.c.G() ? 1 : 0);
        pmtVar.h = com.taobao.taolive.room.service.c.v;
        pmtVar.i = com.taobao.taolive.room.service.c.z;
        pmtVar.k = com.taobao.taolive.room.service.c.e();
        pmtVar.l = com.taobao.taolive.room.service.c.f21681a;
        pmtVar.m = com.alilive.adapter.business.b.ORIGIN_PAGE_LIVE_WATCH;
        pmtVar.n = "a2141.8001249.1.1";
        pmtVar.o = pmd.a().u().b();
        return pmtVar;
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) n.b(n.a());
        if (eVar != null && !TextUtils.isEmpty(eVar.n)) {
            return eVar.n;
        }
        return (!aa.c() || (!com.taobao.taolive.room.service.c.g() && !com.taobao.taolive.room.service.c.f())) ? e() ? f() : "a2141.8001249.1.1" : "a2141.23201685";
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : com.taobao.taolive.room.controller2.j.f();
    }

    public static String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[0]) : com.taobao.taolive.room.controller2.j.e();
    }

    public static void b(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3967d960", new Object[]{str, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (pmd.a().e() == null) {
            return;
        }
        pol e = pmd.a().e();
        e.b(ag.PAGE_HOME_LIVETAB, "Page_Home_Livetab_" + str, hashMap);
    }

    public static void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ec9e51", new Object[]{str, map});
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a(ag.PAGE_HOME_LIVETAB, str, map);
        }
    }
}
