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
import com.taobao.android.task.Coordinator;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponseData;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.ibt;
import tb.ibu;
import tb.ibv;
import tb.ibw;
import tb.kge;
import tb.pbt;
import tb.pdt;
import tb.php;
import tb.pkm;
import tb.pmd;
import tb.pmt;
import tb.pol;
import tb.poy;
import tb.ppa;
import tb.ppb;
import tb.ppf;
import tb.ppg;
import tb.ppl;
import tb.pqi;
import tb.pqj;
import tb.pqq;

/* loaded from: classes8.dex */
public class ai extends ag {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1377673980);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79dfff1", new Object[]{aVar, str, str2});
            return;
        }
        a(aVar, str, "from=" + str2);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb133d8", new Object[]{aVar, str, strArr});
        } else {
            a(aVar, str, (String) null, strArr);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String... strArr) {
        LiveDetailMessinfoResponseData.AlimamaInfo b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd95b58e", new Object[]{aVar, str, str2, strArr});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(str, str2, strArr);
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.a(str, str2, strArr);
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            if (gVar.y() == null) {
                ah.a(str, str2, strArr);
                ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo getGlobalContext = null " + aVar);
                return;
            }
            com.taobao.taolive.sdk.controller.e y = gVar.y();
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.a(str, str2, strArr);
                return;
            }
            ppl d = D.d();
            ppf b2 = D.b();
            D.a();
            ppg c = D.c();
            VideoInfo f = b2.f();
            if (f == null || f.broadCaster == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            String str3 = f.liveId;
            String str4 = f.broadCaster.accountId;
            if (f.isOfficialType() && php.a().a(str)) {
                str3 = f.officialLiveInfo.officialLiveId;
                str4 = f.officialLiveInfo.accountId;
            }
            arrayList.add("feed_id=" + str3);
            arrayList.add("account_id=" + str4);
            arrayList.add("deviceLevel=" + poy.I(aVar));
            ibt a2 = aJ_.a();
            ibu b3 = aJ_.b();
            ibv c2 = aJ_.c();
            if (!TextUtils.isEmpty(b2.c())) {
                arrayList.add("pkid=" + b2.c());
            }
            if (!TextUtils.isEmpty(a2.b())) {
                arrayList.add("spm-url=" + a2.b());
            }
            if (aa.bg() && !TextUtils.isEmpty(a2.b())) {
                arrayList.add("spm=" + a2.b());
            }
            if (!TextUtils.isEmpty(str2)) {
                arrayList.add("trackInfo=" + str2);
            } else if (!TextUtils.isEmpty(a2.c())) {
                arrayList.add("trackInfo=" + a2.c());
            }
            if (!TextUtils.isEmpty(a2.h())) {
                arrayList.add("liveoprt_id=" + a2.h());
            }
            if (b3.b() != null) {
                arrayList.add("clickurl=" + b.clickid);
                arrayList.add("interactiveurl=" + b.interactiveid);
                arrayList.add("clickInfo=" + b.clickInfo);
            }
            if (!TextUtils.isEmpty(y.n)) {
                arrayList.add("spm-cnt=" + y.n);
            } else if (aa.c() && (a2.R() || a2.Q())) {
                arrayList.add("spm-cnt=a2141.23201685");
            } else if (a()) {
                arrayList.add("spm-cnt=" + b());
            } else {
                arrayList.add("spm-cnt=a2141.8001249.1.1");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("is_fans=");
            String str5 = "1";
            sb.append(f.broadCaster.follow ? str5 : "0");
            arrayList.add(sb.toString());
            arrayList.add("watchid=" + c.b());
            arrayList.add("pvid=" + a2.e());
            arrayList.add("isAD=" + (b2.h() ? 1 : 0));
            arrayList.add("entryUtparam=" + a2.A());
            arrayList.add("entryPvid=" + a2.B());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isAdTransParams=");
            sb2.append(b3.c() != null ? 1 : 0);
            arrayList.add(sb2.toString());
            arrayList.add("entryLiveSource=" + a2.p());
            arrayList.add("entryjiangjie_id=" + c2.a());
            arrayList.add("timeMovingUtParams=" + poy.c(aVar));
            arrayList.add("entryScmPre=" + a2.l());
            arrayList.add("entrySpmPre=" + a2.m());
            arrayList.add("entryUtparamPre=" + a2.n());
            arrayList.add("entryLiveSourcePre=" + a2.o());
            arrayList.add("entryQuery=" + a2.q());
            arrayList.add("entrySpm=" + a2.r());
            arrayList.add("entryScm=" + a2.t());
            arrayList.add("entryFeedId=" + a2.C());
            arrayList.add("entryContentId=" + a2.D());
            arrayList.add("entryAccountId=" + a2.E());
            arrayList.add("entryLiveScm=" + a2.F());
            arrayList.add("switchIndex=" + b3.f());
            arrayList.add("isUp=" + a2.w());
            arrayList.add("entryTraceId=" + a2.u());
            arrayList.add("entryLiveId=" + a2.v());
            arrayList.add("product_type=" + com.taobao.taolive.movehighlight.utils.d.b);
            if (m.p()) {
                arrayList.add("session_id=" + m.a());
            }
            arrayList.add("liveAdParams=" + Uri.encode(a2.H()));
            if (!TextUtils.isEmpty(com.taobao.taolive.room.ui.fanslevel.a.a().d())) {
                arrayList.add(ag.ARG_FANS_LEVEL + com.taobao.taolive.room.ui.fanslevel.a.a().d());
            }
            arrayList.add("feedtype=" + f.type);
            arrayList.add("livestatus=" + f.status);
            arrayList.add("roomStatus=" + f.roomStatus);
            arrayList.add("landscape=" + f.landScape);
            arrayList.add("accounttype=" + com.taobao.taolive.sdk.controller.k.a(f.broadCaster.type));
            arrayList.add("roomType=" + f.roomType);
            arrayList.add("livesource=" + a2.N());
            arrayList.add("entrySource=" + a2.O());
            int i = f.roomType;
            if (b2.b(f)) {
                i = 13;
            }
            arrayList.add("roomtype2=" + i);
            arrayList.add("timeShiftForEnter=" + d.b() + "");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("jiangjie_ID=");
            sb3.append(d.c());
            arrayList.add(sb3.toString());
            arrayList.add("oneproduct_jiangjie=" + d.d());
            arrayList.add("oneproduct_mounting=" + d.e());
            arrayList.add("timeShiftItemId=" + d.f());
            arrayList.add("liveToken=" + aVar.j());
            arrayList.add("queryKey=" + a2.J());
            arrayList.add("clickid=" + b3.d());
            arrayList.add("room_type=live");
            arrayList.add("singleLiveTabSessionId=" + a2.S());
            if (!TextUtils.isEmpty(f.tvChannelId)) {
                arrayList.add("officialchannel_id=" + f.tvChannelId);
            }
            if (strArr != null && strArr.length > 0) {
                for (String str6 : strArr) {
                    arrayList.add(str6);
                }
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("login=");
            if (pmd.a().q() == null || !pmd.a().q().c()) {
                str5 = "0";
            }
            sb4.append(str5);
            arrayList.add(sb4.toString());
            if (aa.a() && !TextUtils.isEmpty(a2.d())) {
                arrayList.add("utparam-url=" + a2.d());
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("content_type=");
            sb5.append(com.taobao.taolive.sdk.goodlist.d.a(f.itemTransferInfo) ? "reward" : "normal");
            arrayList.add(sb5.toString());
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c20ebe", new Object[]{aVar, str, map});
        } else {
            a(aVar, "Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2967db74", new Object[]{aVar, str, str2, map});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(str2, map);
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.a(str2, map);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (D == null || aJ_ == null) {
                ah.a(str2, map);
                return;
            }
            ibt a2 = aJ_.a();
            ibu b = aJ_.b();
            ibv c = aJ_.c();
            ppf b2 = D.b();
            ppl d = D.d();
            D.a();
            ppg c2 = D.c();
            if (pmd.a().e() == null) {
                return;
            }
            if (map != null) {
                map.put("livesource", a2.N());
                map.put("entrySource", a2.O());
                map.put("timeShiftForEnter", d.b() + "");
                map.put("jiangjie_ID", d.c());
                map.put("oneproduct_jiangjie", d.d());
                map.put("oneproduct_mounting", d.e());
                map.put("timeShiftItemId", d.f());
                map.put("queryKey", a2.J());
                map.put("clickid", b.d());
                map.put("isAD", (b2.h() ? 1 : 0) + "");
                StringBuilder sb = new StringBuilder();
                if (b.c() == null) {
                    i = 0;
                }
                sb.append(i);
                sb.append("");
                map.put("isAdTransParams", sb.toString());
                map.put("entryLiveSource", a2.p());
                map.put("entryjiangjie_id", c.a());
                map.put("timeMovingUtParams", poy.c(aVar));
                map.put(pdt.entryQuery, a2.q());
                map.put("entryScmPre", a2.l());
                map.put("entrySpmPre", a2.m());
                map.put("entryUtparamPre", a2.n());
                map.put("entrySpm", a2.r());
                map.put(pqq.KEY_ENTRY_SCM, a2.t());
                map.put("entryFeedId", a2.C());
                map.put("entryContentId", a2.D());
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, a2.E());
                map.put("entryLiveScm", a2.F());
                map.put("switchIndex", b.f() + "");
                map.put("isUp", a2.w() + "");
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, a2.u());
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, a2.v());
                map.put("entryUtparam", a2.A());
                map.put("entryPvid", a2.B());
                map.put("watchid", c2.b());
                map.put(aw.PARAM_PVID, a2.e());
                map.put("product_type", com.taobao.taolive.movehighlight.utils.d.b);
                map.put("singleLiveTabSessionId", a2.S());
                map.put("liveToken", aVar.j());
                if (m.p()) {
                    map.put("session_id", m.a());
                }
                VideoInfo f = b2.f();
                if (f != null) {
                    map.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(f.itemTransferInfo) ? "reward" : "normal");
                    map.put("roomType", String.valueOf(f.roomType));
                    map.put("newRoomType", String.valueOf(f.newRoomType));
                    map.put("roomStatus", f.roomStatus);
                    String str3 = f.liveId;
                    String str4 = f.broadCaster.accountId;
                    if (f.isOfficialType() && php.a().a(str2)) {
                        str3 = f.officialLiveInfo.officialLiveId;
                        str4 = f.officialLiveInfo.accountId;
                    }
                    if (!TextUtils.isEmpty(a2.b())) {
                        map.put("spm-url", a2.b());
                    }
                    map.put("feed_id", str3);
                    map.put("account_id", str4);
                    if (!TextUtils.isEmpty(f.tvChannelId)) {
                        map.put(ag.KEY_OFFICIAL_CHANNEL_ID, f.tvChannelId);
                    }
                }
                map.put("spm-cnt", d(aVar));
                if (aVar.o() != null && aVar.o().taoliveOpenContext != null && aVar.o().taoliveOpenContext.f != null) {
                    map.put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE, (String) aVar.o().taoliveOpenContext.f.get(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE));
                }
            }
            pmd.a().e().a(str, str2, map);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, long j, String str2, boolean z, String str3, HashMap<String, String> hashMap) {
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
            ipChange.ipc$dispatch("598d2a5c", new Object[]{aVar, str, new Long(j), str2, new Boolean(z), str3, hashMap});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(str, j, str2, z, str3, hashMap);
        } else {
            String str20 = "";
            if (hashMap != null) {
                String str21 = hashMap.containsKey("class_number") ? hashMap.get("class_number") : "0";
                String str22 = hashMap.containsKey("class_total") ? hashMap.get("class_total") : "0";
                String str23 = hashMap.containsKey("scene") ? hashMap.get("scene") : str20;
                str9 = hashMap.containsKey("itemBizType") ? hashMap.get("itemBizType") : str20;
                str10 = hashMap.containsKey("bubbleType") ? hashMap.get("bubbleType") : str20;
                str11 = hashMap.containsKey("item_index") ? hashMap.get("item_index") : str20;
                str6 = hashMap.containsKey("class_number") ? hashMap.get("class_number") : str20;
                if (hashMap.containsKey("class_total")) {
                    str7 = hashMap.get("class_total");
                    str4 = "0";
                } else {
                    str4 = "0";
                    str7 = str20;
                }
                String str24 = hashMap.containsKey("channel") ? hashMap.get("channel") : str20;
                String str25 = hashMap.containsKey("isYanxuan") ? hashMap.get("isYanxuan") : str20;
                String str26 = hashMap.containsKey("isDownShelf") ? hashMap.get("isDownShelf") : str20;
                String str27 = hashMap.containsKey("pre") ? hashMap.get("pre") : str20;
                String str28 = hashMap.containsKey("preset") ? hashMap.get("preset") : str20;
                String str29 = hashMap.containsKey("highlight_coupon_type") ? hashMap.get("highlight_coupon_type") : str20;
                String str30 = hashMap.containsKey("highlight_coupon_id") ? hashMap.get("highlight_coupon_id") : str20;
                if (hashMap.containsKey("highlight_strategy_code")) {
                    str20 = hashMap.get("highlight_strategy_code");
                }
                str17 = str20;
                str5 = str23;
                str18 = str21;
                str19 = str22;
                str20 = str24;
                str8 = str25;
                str12 = str26;
                str13 = str27;
                str14 = str28;
                str15 = str29;
                str16 = str30;
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
            String str31 = str5;
            StringBuilder sb = new StringBuilder();
            String str32 = str8;
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
            strArr[6] = "itemBizType=" + str9;
            strArr[7] = "bubbleType=" + str10;
            strArr[8] = "item_index=" + str11;
            strArr[9] = "class_number=" + str6;
            strArr[10] = "class_total=" + str7;
            strArr[11] = ag.ARG_CHANNEL + str20;
            strArr[12] = "isYanxuan=" + str32;
            strArr[13] = "scene=" + str31;
            strArr[14] = "isDownShelf=" + str12;
            strArr[15] = "pre=" + str13;
            strArr[16] = "preset=" + str14;
            strArr[17] = "coupon_type=" + str15;
            strArr[18] = "coupon_id=" + str16;
            strArr[19] = "strategyCode=" + str17;
            a(aVar, str, strArr);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f06a806c", new Object[]{aVar, str, hashMap});
        } else {
            a(aVar, str, (String) null, hashMap);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f4f0222", new Object[]{aVar, str, str2, hashMap});
        } else {
            a(aVar, "Page_TaobaoLiveWatch", str, str2, hashMap);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f96c258", new Object[]{aVar, str, str2, str3, hashMap});
        } else if (!b(aVar, str, str2, str3, hashMap) || pmd.a().e() == null) {
        } else {
            pmd.a().e().b(str, str2, hashMap);
        }
    }

    private static boolean b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2946071d", new Object[]{aVar, str, str2, str3, hashMap})).booleanValue();
        }
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(str2, str3, hashMap);
            return false;
        }
        HashMap<String, String> hashMap2 = hashMap == null ? new HashMap<>() : hashMap;
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.a(str2, str3, hashMap2);
            ab.b("TrackUtilsNew", "trackShow frameContext not TBFrameContext " + aVar);
            return false;
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        if (gVar.y() == null) {
            ah.a(str2, str3, hashMap2);
            ab.b("TrackUtilsNew", "trackShow getGlobalContext = null ");
            return false;
        }
        com.taobao.taolive.sdk.controller.e y = gVar.y();
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            ah.a(str2, str3, hashMap2);
            return false;
        }
        ppl d = D.d();
        ppf b = D.b();
        ppg c = D.c();
        ibt a2 = aJ_.a();
        ibu b2 = aJ_.b();
        VideoInfo f = b.f();
        if (f != null && f.broadCaster != null) {
            String str4 = f.liveId;
            String str5 = f.broadCaster.accountId;
            hashMap2.put("liveAdParams", Uri.encode(a2.H()));
            hashMap2.put("accounttype", com.taobao.taolive.sdk.controller.k.a(f.broadCaster.type) + "");
            if (!TextUtils.isEmpty(a2.b())) {
                hashMap2.put("spm-url", a2.b());
            }
            hashMap2.put("feed_id", str4);
            hashMap2.put("account_id", str5);
            hashMap2.put("roomType", String.valueOf(f.roomType));
            hashMap2.put("deviceLevel", String.valueOf(poy.I(aVar)));
            hashMap2.put("accountType", com.taobao.taolive.sdk.controller.k.a(f.broadCaster.type) + "");
            int i = f.roomType;
            if (b.b(f)) {
                i = 13;
            }
            hashMap2.put(ag.KEY_ROOMTYPE2, i + "");
            hashMap2.put("entryScmPre", a2.l());
            hashMap2.put("entrySpmPre", a2.m());
            hashMap2.put("entryUtparamPre", a2.n());
            hashMap2.put("entryLiveSource", a2.p());
            hashMap2.put("entrySpm", a2.r());
            hashMap2.put("entryLiveSourcePre", a2.o());
            hashMap2.put("entryUtparam", a2.A());
            hashMap2.put("entryPvid", a2.B());
            hashMap2.put("timeShiftForEnter", d.b() + "");
            hashMap2.put("jiangjie_ID", d.c());
            hashMap2.put("oneproduct_jiangjie", d.d());
            hashMap2.put("oneproduct_mounting", d.e());
            hashMap2.put("timeShiftItemId", d.f());
            hashMap2.put(ag.KEY_LIVE_STATUS, String.valueOf(f.status));
            String str6 = "1";
            hashMap2.put("login", (pmd.a().q() == null || !pmd.a().q().c()) ? "0" : str6);
            hashMap2.put("livesource", a2.N());
            hashMap2.put("entrySource", a2.O());
            hashMap2.put("switchIndex", String.valueOf(b2.f()));
            hashMap2.put("isUp", String.valueOf(a2.w()));
            hashMap2.put("queryKey", a2.J());
            hashMap2.put("clickid", b2.d());
            hashMap2.put("watchid", c.b());
            hashMap2.put(aw.PARAM_PVID, a2.e());
            if (!b.h()) {
                str6 = "0";
            }
            hashMap2.put("isAD", str6);
            hashMap2.put("product_type", com.taobao.taolive.movehighlight.utils.d.b);
            if (!TextUtils.isEmpty(str3)) {
                hashMap2.put("trackInfo", str3);
            } else if (!TextUtils.isEmpty(a2.c())) {
                hashMap2.put("trackInfo", a2.c());
            }
            if (!TextUtils.isEmpty(a2.h())) {
                hashMap2.put(aw.PARAM_TRACK_LIVEOPRT_ID, a2.h());
            }
            if (aa.bf() && !TextUtils.isEmpty(a2.b())) {
                hashMap2.put("spm", a2.b());
            }
            if (!TextUtils.isEmpty(y.n)) {
                hashMap2.put("spm-cnt", y.n);
            } else if (aa.c() && (a2.R() || a2.Q())) {
                hashMap2.put("spm-cnt", "a2141.23201685");
            } else if (a()) {
                hashMap2.put("spm-cnt", b());
            } else {
                hashMap2.put("spm-cnt", "a2141.8001249.1.1");
            }
            if (m.p()) {
                hashMap2.put("session_id", m.a());
            }
            hashMap2.put("timestampT", System.currentTimeMillis() + "");
            if (!TextUtils.isEmpty(f.tvChannelId)) {
                hashMap2.put(ag.KEY_OFFICIAL_CHANNEL_ID, f.tvChannelId);
            }
            hashMap2.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(f.itemTransferInfo) ? "reward" : "normal");
            hashMap2.put("singleLiveTabSessionId", a2.S());
            hashMap2.put("liveToken", aVar.j());
            if (aVar.o() != null && aVar.o().taoliveOpenContext != null && aVar.o().taoliveOpenContext.f != null) {
                hashMap2.put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE, (String) aVar.o().taoliveOpenContext.f.get(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE));
            }
        }
        return true;
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, final String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d6a523", new Object[]{aVar, str, str2, hashMap});
            return;
        }
        final HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        if (!b(aVar, "Page_TaobaoLiveWatch", str, str2, hashMap2)) {
            return;
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.taolive.room.utils.ai.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else if (pmd.a().e() == null) {
                } else {
                    pmd.a().e().b("Page_TaobaoLiveWatch", str, hashMap2);
                }
            }
        });
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74322583", new Object[]{aVar, obj, str});
            return;
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(aVar, e, str);
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.a(aVar, e, str);
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.a(aVar, e, str);
            } else if (!aJ_.b().i()) {
            } else {
                if (com.taobao.taolive.room.controller2.j.f()) {
                    str = ag.PAGE_HOME_LIVETAB;
                }
                av.a(aVar, null, e, str);
            }
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eafa7f9", new Object[]{aVar, obj});
            return;
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(aVar, (com.taobao.taolive.sdk.controller.e) null, e);
        } else {
            av.a(aVar, (com.taobao.taolive.sdk.controller.e) null, e);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1da458", new Object[]{aVar, obj});
            return;
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.b(aVar, (com.taobao.taolive.sdk.controller.e) null, e);
            return;
        }
        if ((aVar instanceof com.taobao.taolive.room.controller2.g) && pmd.a().e() != null && (e instanceof Activity)) {
            pbt.a().f32558a.a("liveRoom", "Page_TaobaoLiveWatch", (Map<String, String>) aVar.k);
        }
        av.c(aVar, null, e);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4460226c", new Object[]{aVar, obj, map});
            return;
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(e, map);
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.a(e, map);
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.a(e, map);
            } else if (!aJ_.b().i()) {
            } else {
                com.taobao.taolive.sdk.core.a.a(aVar, e, map);
            }
        }
    }

    public static String a(com.taobao.taolive.sdk.controller.e eVar, Activity activity) {
        Map<String, String> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b60d27d0", new Object[]{eVar, activity});
        }
        if (activity != null && pmd.a().e() != null && (a2 = av.a((com.taobao.alilive.aliliveframework.frame.a) null, eVar, activity)) != null && a2.containsKey(ag.KEY_UTPARAM_URL)) {
            return a2.get(ag.KEY_UTPARAM_URL);
        }
        return null;
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a78ba0b7", new Object[]{aVar, obj});
            return;
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.c(aVar, null, e);
        } else {
            av.b(aVar, null, e);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb15ad07", new Object[]{aVar, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("time", String.valueOf(j));
        hashMap.put("newLiveSwitch", String.valueOf(com.taobao.taolive.sdk.utils.u.g()));
        a(aVar, "UpDownPlay", (Map<String, String>) hashMap);
    }

    public static Map<String, String> b(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("149396d7", new Object[]{aVar, obj, str});
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            return ah.b(e, str);
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.b(e, str);
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.b(e, str);
        }
        if (!aJ_.b().i()) {
            return ah.b(e, str);
        }
        return a(aVar, e, str, (String) null, (String) null, (String) null, true);
    }

    public static Map<String, String> a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("da5060d2", new Object[]{aVar});
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.a((Object) null, "", "", "", "", true);
        }
        return a(aVar, (Object) null, "", "", "", "", true);
    }

    public static Map<String, String> a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("196d34c8", new Object[]{aVar, obj, str, str2, str3, str4, new Boolean(z)});
        }
        Object e = e(aVar, obj);
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.a(e, str, str2, str3, str4, z);
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.a(e, str, str2, str3, str4, z);
        }
        if (!aJ_.b().i()) {
            return ah.a(e, str, str2, str3, str4, z);
        }
        return a(aVar, e, str, str2, str3, str4, z, true);
    }

    public static Map<String, String> a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        String str6;
        com.taobao.alilive.aliliveframework.frame.a aVar2;
        String str7;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("42f071d6", new Object[]{aVar, obj, str, str2, str3, str4, new Boolean(z), new Boolean(z2)});
        }
        Object e = e(aVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            return ah.a(e, str, str2, str3, str4, z, z2);
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.a(e, str, str2, str3, str4, z, z2);
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.a(e, str, str2, str3, str4, z, z2);
        }
        ibu b = aJ_.b();
        ibv c = aJ_.c();
        ibt a2 = aJ_.a();
        ppf b2 = D.b();
        ppl d = D.d();
        ppg c2 = D.c();
        if (!b.i()) {
            return ah.a(e, str, str2, str3, str4, z, z2);
        }
        VideoInfo f = b2.f();
        HashMap hashMap = new HashMap();
        if (f != null) {
            if (f.broadCaster != null) {
                String str8 = f.broadCaster.accountId;
                if (f.isOfficialType()) {
                    String str9 = f.officialLiveInfo.accountId;
                    str7 = f.broadCaster.accountId;
                    str8 = str9;
                } else {
                    str7 = "";
                }
                hashMap.put("account_id", str8);
                hashMap.put("former_anchorid", str7);
                hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(f.broadCaster.type) + "");
            } else {
                a(aVar, "broadCasterNull", (String) null);
            }
            String str10 = f.liveId;
            if (f.isOfficialType()) {
                str10 = f.officialLiveInfo.officialLiveId;
                str6 = f.liveId;
            } else {
                str6 = "";
            }
            hashMap.put("former_liveid", str6);
            hashMap.put("login", pmd.a().q().c() ? "1" : "0");
            hashMap.put("feed_id", str10);
            if (!TextUtils.isEmpty(f.gameId)) {
                hashMap.put("game_id", f.gameId);
            }
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(f.status));
            hashMap.put("feedtype", f.type + "");
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("scm", str);
                Log.e("trackPageSCM", str);
            }
            LiveDetailMessinfoResponseData.AlimamaInfo b3 = b.b();
            if (b3 != null) {
                hashMap.put("clickurl", b3.clickid);
                hashMap.put("interactiveurl", b3.interactiveid);
                hashMap.put("clickInfo", JSON.toJSONString(b3.clickInfo));
            }
            hashMap.put("scm-live", a2.x());
            hashMap.put("spm-live", a2.y());
            hashMap.put("watchid", c2.b());
            hashMap.put(aw.PARAM_PVID, a2.e());
            hashMap.put("isAD", (b2.h() ? 1 : 0) + "");
            hashMap.put("entryUtparam", a2.A());
            hashMap.put("entryPvid", a2.B());
            hashMap.put("isAdTransParams", String.valueOf(b.c() != null ? 1 : 0));
            hashMap.put("entryjiangjie_id", c.a());
            hashMap.put("timeMovingUtParams", poy.c(aVar));
            hashMap.put(pdt.entryQuery, a2.q());
            hashMap.put("entryScmPre", a2.l());
            hashMap.put("entrySpmPre", a2.m());
            hashMap.put("entryUtparamPre", a2.n());
            hashMap.put(pqq.KEY_ENTRY_SCM, a2.t());
            hashMap.put("entryFeedId", a2.C());
            hashMap.put("entryContentId", a2.D());
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, a2.E());
            hashMap.put("entryLiveScm", a2.F());
            hashMap.put("switchIndex", String.valueOf(b.f()));
            hashMap.put("isUp", String.valueOf(a2.w()));
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, a2.u());
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, a2.v());
            hashMap.put("singleLiveTabSessionId", a2.S());
            if (!as.a()) {
                hashMap.put("entryLiveSource", a2.p());
                hashMap.put("entryLiveSourcePre", a2.o());
            }
            hashMap.put("landscape", f.landScape ? "1" : "0");
            hashMap.put("skipbk", "1");
            hashMap.put("roomType", String.valueOf(f.roomType));
            hashMap.put("newRoomType", String.valueOf(f.newRoomType));
            hashMap.put("deviceLevel", String.valueOf(poy.I(aVar)));
            hashMap.put("timeShiftForEnter", d.b() + "");
            hashMap.put("kandianItemId", com.taobao.taolive.movehighlight.utils.d.c);
            hashMap.put("product_type", com.taobao.taolive.movehighlight.utils.d.b);
            hashMap.put("timeShiftItemId", d.f());
            hashMap.put("jiangjie_ID", d.c());
            hashMap.put("oneproduct_jiangjie", d.d());
            hashMap.put("oneproduct_mounting", d.e());
            hashMap.put("timeShiftItemId", d.f());
            hashMap.put("queryKey", a2.J());
            if (com.taobao.taolive.sdk.utils.o.L()) {
                hashMap.put("liveToken", aVar.j());
                if (gVar.w() != null && gVar.w().initParams != null && gVar.w().initParams.get(aw.PARAM_TCP_OUTER_PARAM) != null) {
                    hashMap.put(aw.PARAM_TCP_OUTER_PARAM, gVar.w().initParams.get(aw.PARAM_TCP_OUTER_PARAM));
                }
            }
            hashMap.put("liveAdParams", Uri.encode(a2.H()));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("clickid", str2);
            }
            if (!TextUtils.isEmpty(a2.c())) {
                hashMap.put("trackInfo", a2.c());
            }
            if (!TextUtils.isEmpty(a2.h())) {
                hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, a2.h());
            }
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(aw.PARAM_SEARCH_KEYWORD_POS, str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                aVar2 = null;
                hashMap.put(aw.PARAM_SEARCH_KEYWORD_RN, str3);
            } else {
                aVar2 = null;
            }
            hashMap.put("timemoving_type", com.taobao.taolive.movehighlight.utils.d.d ? "content" : "item");
            int i = f.roomType;
            if (b2.b(f)) {
                i = 13;
            }
            hashMap.put(ag.KEY_ROOMTYPE2, i + "");
            if (com.taobao.taolive.sdk.playcontrol.c.e(aVar2) != null && com.taobao.taolive.sdk.playcontrol.c.e(aVar2).y() != null) {
                hashMap.put("play_token", com.taobao.taolive.sdk.playcontrol.c.e(aVar2).y());
            }
            if (!TextUtils.isEmpty(f.tvChannelId)) {
                hashMap.put(ag.KEY_OFFICIAL_CHANNEL_ID, f.tvChannelId);
            }
            hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(f.itemTransferInfo) ? "reward" : "normal");
            str5 = "content";
            if (z2) {
                pqi.a().a("liveRoomShow", JSON.toJSONString(hashMap), 1.0d);
            }
        } else {
            str5 = "content";
        }
        if (m.p()) {
            hashMap.put("session_id", m.a());
        }
        if (gVar.y() != null && !TextUtils.isEmpty(gVar.y().n)) {
            hashMap.put("spm-cnt", gVar.y().n);
        } else if (aa.c() && (a2.R() || a2.Q())) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else if (a()) {
            hashMap.put("spm-cnt", b());
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        if (!TextUtils.isEmpty(a2.b())) {
            hashMap.put("spm-url", a2.b());
        }
        if (aa.bD()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str5, (Object) a2.G());
            jSONObject.put("spm", (Object) a2.b());
            jSONObject.put("livesource", (Object) a2.N());
            jSONObject.put("entrySource", (Object) a2.O());
            hashMap.put("extendJson", jSONObject.toJSONString());
        }
        hashMap.put("entrySpm", a2.r());
        hashMap.put("livesource", a2.N());
        hashMap.put("entrySource", a2.O());
        if (gVar.y() != null) {
            Map B = gVar.y().B();
            ab.c("TrackUtilsNew", "getCustomPageExtParams，customPageExtParams：" + B);
            if (com.taobao.taolive.sdk.utils.o.O() && !at.a(B)) {
                hashMap.putAll(B);
            }
        }
        if (as.a() && a2 != null) {
            hashMap.put("entryLiveSource", a2.p());
            hashMap.put("entryLiveSourcePre", a2.o());
        }
        if (z) {
            com.taobao.taolive.sdk.core.a.a(aVar, e, hashMap);
        }
        if (aVar.o() != null && aVar.o().taoliveOpenContext != null && aVar.o().taoliveOpenContext.f != null) {
            hashMap.put(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE, (String) aVar.o().taoliveOpenContext.f.get(com.taobao.android.livehome.plugin.atype.flexalocal.utils.d.LIVE_HOME_PAGE_TYPE));
        }
        return hashMap;
    }

    public static Map<String, String> d(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("1af010cb", new Object[]{aVar, obj}) : av.d(aVar, null, e(aVar, obj));
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c31b7c", new Object[]{aVar});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a();
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.a();
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.a();
                return;
            }
            ibu b = aJ_.b();
            ibt a2 = aJ_.a();
            if (!b.i()) {
                ah.a();
            } else if (!aa.au()) {
                ah.a();
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put("scm-pre", a2.x());
                if (pmd.a().e() == null) {
                    return;
                }
                pmd.a().e().b((Map<String, String>) hashMap);
            }
        }
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a981fe", new Object[]{eVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (aa.cn()) {
            hashMap.put("spm-url", d(c(eVar)));
        }
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().b((Map<String, String>) hashMap);
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6cc19b", new Object[]{aVar});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.b();
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ah.b();
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.b();
                return;
            }
            ibu b = aJ_.b();
            ibt a2 = aJ_.a();
            ibv c = aJ_.c();
            ppf b2 = D.b();
            if (!b.i()) {
                ah.b();
            } else if (!aa.au()) {
                ah.b();
            } else {
                VideoInfo f = b2.f();
                if (f == null || f.broadCaster == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                String str = f.liveId;
                String str2 = f.broadCaster.accountId;
                hashMap.put("feed_id", str);
                hashMap.put("account_id", str2);
                hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(f.status));
                hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(f.broadCaster.type) + "");
                hashMap.put("scm-live", a2.x());
                hashMap.put("spm-live", a2.y());
                if (aa.au()) {
                    hashMap.put("x_object_type", poy.X(aVar));
                }
                hashMap.put("feedtype", f.type + "");
                hashMap.put("landscape", f.landScape ? "1" : "0");
                hashMap.put("roomType", String.valueOf(f.roomType));
                hashMap.put("isAD", (b2.h() ? 1 : 0) + "");
                StringBuilder sb = new StringBuilder();
                if (b.c() != null) {
                    i = 1;
                }
                sb.append(i);
                sb.append("");
                hashMap.put("isAdTransParams", sb.toString());
                hashMap.put("entryScmPre", a2.l());
                hashMap.put("entrySpmPre", a2.m());
                hashMap.put("entryUtparamPre", a2.n());
                hashMap.put("entryLiveSourcePre", a2.o());
                hashMap.put("entryLiveSource", a2.p());
                hashMap.put("entryUtparam", a2.A());
                hashMap.put("entryPvid", a2.B());
                hashMap.put("entryjiangjie_id", c.a());
                hashMap.put("timeMovingUtParams", poy.c(aVar));
                hashMap.put(pdt.entryQuery, a2.q());
                hashMap.put("entrySpm", a2.r());
                hashMap.put(pqq.KEY_ENTRY_SCM, a2.t());
                hashMap.put("entryFeedId", a2.C());
                hashMap.put("entryContentId", a2.D());
                hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, a2.E());
                hashMap.put("entryLiveScm", a2.F());
                hashMap.put("switchIndex", String.valueOf(b.f()));
                hashMap.put("isUp", String.valueOf(a2.w()));
                hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, a2.u());
                hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, a2.v());
                hashMap.put("livesource", a2.N());
                hashMap.put("common_live_page", "live");
                hashMap.put("content_id", str);
                hashMap.put("deviceLevel", String.valueOf(poy.I(aVar)));
                if (aa.g()) {
                    hashMap.put("clickid", b.d());
                }
                if (aa.aU() && !TextUtils.isEmpty(a2.c())) {
                    hashMap.put("trackInfo", a2.c());
                }
                if (!TextUtils.isEmpty(a2.h())) {
                    hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, a2.h());
                }
                hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(f.itemTransferInfo) ? "reward" : "normal");
                if (pmd.a().e() == null) {
                    return;
                }
                pmd.a().e().a((Map<String, String>) hashMap);
            }
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc30e1e7", new Object[]{aVar, str});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(str);
        } else if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            ah.a(str);
        } else {
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.a(str);
                return;
            }
            ibu b = aJ_.b();
            ibt a2 = aJ_.a();
            ibv c = aJ_.c();
            ppf b2 = D.b();
            if (!b.i()) {
                ah.a(str);
                return;
            }
            VideoInfo f = b2.f();
            if (f == null || f.broadCaster == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            String str2 = f.liveId;
            String str3 = f.broadCaster.accountId;
            hashMap.put("x_object_type", poy.X(aVar));
            hashMap.put("feed_id", str2);
            hashMap.put("account_id", str3);
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(f.status));
            hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(f.broadCaster.type) + "");
            hashMap.put("scm-live", a2.x());
            hashMap.put("spm-live", a2.y());
            hashMap.put("feedtype", f.type + "");
            hashMap.put("landscape", f.landScape ? "1" : "0");
            hashMap.put("roomType", String.valueOf(f.roomType));
            hashMap.put("isAD", (b2.h() ? 1 : 0) + "");
            StringBuilder sb = new StringBuilder();
            if (b.c() == null) {
                i = 0;
            }
            sb.append(i);
            sb.append("");
            hashMap.put("isAdTransParams", sb.toString());
            hashMap.put("entryScmPre", a2.l());
            hashMap.put("entrySpmPre", a2.m());
            hashMap.put("entryUtparamPre", a2.n());
            hashMap.put("entryLiveSourcePre", a2.o());
            hashMap.put("entryLiveSource", a2.p());
            hashMap.put("entryUtparam", a2.A());
            hashMap.put("entryPvid", a2.B());
            hashMap.put("entryjiangjie_id", c.a());
            hashMap.put("timeMovingUtParams", poy.c(aVar));
            hashMap.put(pdt.entryQuery, a2.q());
            hashMap.put("entrySpm", a2.r());
            hashMap.put(pqq.KEY_ENTRY_SCM, a2.t());
            hashMap.put("entryFeedId", a2.C());
            hashMap.put("entryContentId", a2.D());
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_ACCOUNT_ID, a2.E());
            hashMap.put("entryLiveScm", a2.F());
            hashMap.put("switchIndex", String.valueOf(b.f()));
            hashMap.put("isUp", String.valueOf(a2.w()));
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, a2.u());
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, a2.v());
            hashMap.put("livesource", a2.N());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str2);
            hashMap.put("deviceLevel", String.valueOf(poy.I(aVar)));
            if (aa.aU()) {
                hashMap.put("trackInfo", str);
            }
            hashMap.put("content_type", com.taobao.taolive.sdk.goodlist.d.a(f.itemTransferInfo) ? "reward" : "normal");
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a((Map<String, String>) hashMap);
        }
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306d27d7", new Object[]{eVar, str, strArr});
        } else {
            a(c(eVar), str, "", "", strArr);
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd384519", new Object[]{aVar, str, strArr});
        } else {
            a(aVar, str, "", "", strArr);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addd75c4", new Object[]{aVar, str, str2, str3, strArr});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(str, str2, str3, strArr);
        } else {
            List<String> a2 = a(aVar, strArr);
            if (TextUtils.isEmpty(str3)) {
                str3 = e(aVar);
            }
            cgl.s().a("taobaolive", str, str2, str3, (String[]) a2.toArray(new String[0]));
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ec9b2bc", new Object[]{aVar, obj, str, strArr});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(obj, str, strArr);
        } else {
            List<String> a2 = a(aVar, strArr);
            if (TextUtils.isEmpty(str)) {
                str = e(aVar);
            }
            cgl.s().b("taobaolive", str, obj, (String[]) a2.toArray(new String[0]));
        }
    }

    public static void b(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("325155bd", new Object[]{aVar, obj, str, strArr});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.b(obj, str, strArr);
        } else {
            List<String> a2 = a(aVar, strArr);
            if (TextUtils.isEmpty(str)) {
                str = e(aVar);
            }
            cgl.s().a("taobaolive", str, obj, (String[]) a2.toArray(new String[0]));
        }
    }

    public static void c(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bbf565a", new Object[]{aVar, str, strArr});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.d(str, strArr);
        } else {
            List<String> a2 = a(aVar, strArr);
            if (TextUtils.isEmpty(str)) {
                str = e(aVar);
            }
            cgl.s().a("taobaolive", str, (String[]) a2.toArray(new String[0]));
        }
    }

    public static void d(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da46679b", new Object[]{aVar, str, strArr});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.e(str, strArr);
        } else {
            List<String> a2 = a(aVar, strArr);
            if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
                ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
                ah.e(str, strArr);
                return;
            }
            com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
            ibw aJ_ = gVar.y().aJ_();
            ppa D = gVar.D();
            if (aJ_ == null || D == null) {
                ah.e(str, strArr);
            } else {
                cgl.s().a("taobaolive", str, aJ_.a().c(), (String[]) a2.toArray(new String[0]));
            }
        }
    }

    public static void a(int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c673040", new Object[]{new Integer(i), str, map});
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a("Page_TaobaoLiveWatch", i, str, "", "0", map);
        }
    }

    public static void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{str, map});
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a("Page_TaobaoLiveWatch", str, map);
        }
    }

    private static List<String> a(com.taobao.alilive.aliliveframework.frame.a aVar, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fbe7a965", new Object[]{aVar, strArr});
        }
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            return ah.a(strArr);
        }
        ArrayList arrayList = new ArrayList();
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.a(strArr);
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.a(strArr);
        }
        ibt a2 = aJ_.a();
        ppf b = D.b();
        ppl d = D.d();
        VideoInfo f = b.f();
        arrayList.add("feedId=" + e(aVar));
        arrayList.add("liveSource=" + a2.N());
        arrayList.add("entrySource=" + a2.O());
        arrayList.add("timestamp=" + System.currentTimeMillis());
        arrayList.add("timeShiftEntry=" + poy.B(aVar));
        arrayList.add("jiangjie_ID=" + d.c());
        arrayList.add("oneproduct_jiangjie=" + d.d());
        arrayList.add("oneproduct_mounting=" + d.e());
        if (f != null) {
            String str = f.broadCaster != null ? f.broadCaster.accountId : "";
            arrayList.add("accountId=" + str);
            arrayList.add("roomStatus=" + f.roomStatus);
        }
        if (!TextUtils.isEmpty(a2.c())) {
            arrayList.add("trackInfo=" + a2.c());
        }
        arrayList.add("serverParams=" + a2.a());
        arrayList.add("fansLevel=" + com.taobao.taolive.room.ui.fanslevel.a.a().d());
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    private static String e(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9e33e7", new Object[]{aVar});
        }
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            return ah.c();
        }
        new ArrayList();
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.c();
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.c();
        }
        VideoInfo f = D.b().f();
        if (f == null) {
            return null;
        }
        return f.liveId;
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34750615", new Object[]{aVar, context, str});
        } else {
            a(aVar, context, str, (Map<String, String>) null);
        }
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, Context context, String str, Map<String, String> map) {
        Uri data;
        JSONObject b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76748d0", new Object[]{aVar, context, str, map});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(context, str, map);
        } else {
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
                a(aVar, "AccountFollow", "utLogMap=" + queryParameter, "x_live_trackInfo=" + string, "clickid=" + queryParameter3, "follow_location=" + str2);
            }
            b(aVar, "follow", "followAccount=" + str);
        }
    }

    public static pmt a(com.taobao.alilive.aliliveframework.frame.a aVar, pmt pmtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pmt) ipChange.ipc$dispatch("1fdfa539", new Object[]{aVar, pmtVar});
        }
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            return ah.a(pmtVar);
        }
        if (pmtVar == null) {
            pmtVar = new pmt();
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "trackBtnWithExtrasTrackInfo frameContext not TBFrameContext " + aVar);
            return ah.a(pmtVar);
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.a(pmtVar);
        }
        ibt a2 = aJ_.a();
        ibu b = aJ_.b();
        ppg c = D.c();
        ppf b2 = D.b();
        pmtVar.d = a2.b();
        pmtVar.e = b.d();
        pmtVar.f = a2.N();
        pmtVar.g = String.valueOf(b2.h() ? 1 : 0);
        pmtVar.h = a2.p();
        pmtVar.i = a2.r();
        pmtVar.k = c.b();
        pmtVar.l = a2.e();
        pmtVar.m = com.alilive.adapter.business.b.ORIGIN_PAGE_LIVE_WATCH;
        pmtVar.n = "a2141.8001249.1.1";
        pmtVar.o = pmd.a().u().b();
        return pmtVar;
    }

    public static String d(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eedcb826", new Object[]{aVar});
        }
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            return ah.d();
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            ab.b("TrackUtilsNew", "getLiveSpmCnt frameContext not TBFrameContext " + aVar);
            return ah.d();
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) aVar;
        if (gVar.y() == null) {
            ab.b("TrackUtilsNew", "getLiveSpmCnt getGlobalContext = null " + aVar);
            return ah.d();
        }
        com.taobao.taolive.sdk.controller.e y = gVar.y();
        ibw aJ_ = gVar.y().aJ_();
        ppa D = gVar.D();
        if (aJ_ == null || D == null) {
            return ah.d();
        }
        ibt a2 = aJ_.a();
        if (a2 == null) {
            return ah.d();
        }
        if (!TextUtils.isEmpty(y.n)) {
            return y.n;
        }
        return (!aa.c() || (!a2.R() && !a2.Q())) ? a() ? b() : "a2141.8001249.1.1" : "a2141.23201685";
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : com.taobao.taolive.room.controller2.j.f();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : com.taobao.taolive.room.controller2.j.e();
    }

    public static void a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3202a441", new Object[]{str, hashMap});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.b(str, hashMap);
        } else {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            if (pmd.a().e() == null) {
                return;
            }
            pol e = pmd.a().e();
            e.b(ag.PAGE_HOME_LIVETAB, "Page_Home_Livetab_" + str, hashMap);
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.c(str, map);
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a(ag.PAGE_HOME_LIVETAB, str, map);
        }
    }

    public static void b(com.taobao.taolive.sdk.controller.e eVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37960a18", new Object[]{eVar, str, strArr});
        } else {
            a(c(eVar), str, (String) null, strArr);
        }
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26a41012", new Object[]{eVar, str, str2});
        } else {
            a(c(eVar), str, str2);
        }
    }

    public static void b(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c0eb71d", new Object[]{eVar});
        } else {
            c(c(eVar));
        }
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbfc2e5a", new Object[]{eVar, obj});
            return;
        }
        Object d = d(eVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.b((com.taobao.alilive.aliliveframework.frame.a) null, eVar, d);
            return;
        }
        if (aa.aV() && pmd.a().e() != null && (d instanceof Activity)) {
            pbt.a().f32558a.a("liveRoom", "Page_TaobaoLiveWatch", av.a((com.taobao.alilive.aliliveframework.frame.a) null, eVar, (Activity) d));
        }
        av.c(null, eVar, d);
    }

    public static void b(com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1fff9b9", new Object[]{eVar, obj});
            return;
        }
        Object d = d(eVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a((com.taobao.alilive.aliliveframework.frame.a) null, eVar, d);
        } else {
            av.a((com.taobao.alilive.aliliveframework.frame.a) null, eVar, d);
        }
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b33835a4", new Object[]{eVar, obj, str});
            return;
        }
        Object d = d(eVar, obj);
        if (com.taobao.taolive.room.controller2.j.f()) {
            str = ag.PAGE_HOME_LIVETAB;
        }
        av.a(null, eVar, d, str);
    }

    public static void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{obj});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.d(obj);
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().d(obj);
        }
    }

    public static void c(com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d803c518", new Object[]{eVar, obj});
            return;
        }
        Object d = d(eVar, obj);
        if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.c(null, eVar, d);
        } else {
            av.b(null, eVar, d);
        }
    }

    public static void a(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe578c1", new Object[]{obj, map});
        } else if (!com.taobao.taolive.sdk.utils.o.B()) {
            ah.a(obj, map);
        } else {
            com.taobao.taolive.sdk.core.a.a(n.a(), obj, map);
        }
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85dda3d", new Object[]{eVar, str, map});
        } else {
            a(c(eVar), str, map);
        }
    }

    public static Map<String, String> a(com.taobao.taolive.sdk.controller.e eVar, Object obj, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d91d9947", new Object[]{eVar, obj, str, str2, str3, str4, new Boolean(z)}) : a(c(eVar), obj, str, str2, str3, str4, z);
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4644fb", new Object[]{eVar, obj, str, strArr});
        } else {
            b(c(eVar), obj, str, strArr);
        }
    }

    public static void c(com.taobao.taolive.sdk.controller.e eVar, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ebeec59", new Object[]{eVar, str, strArr});
        } else {
            c(c(eVar), str, strArr);
        }
    }

    public static void b(com.taobao.taolive.sdk.controller.e eVar, Object obj, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befd78fc", new Object[]{eVar, obj, str, strArr});
        } else {
            a(c(eVar), obj, str, strArr);
        }
    }

    public static Map<String, String> a(com.taobao.taolive.sdk.controller.e eVar, Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("794c9d37", new Object[]{eVar, obj, str, str2, str3, str4, new Boolean(z), new Boolean(z2)}) : a(c(eVar), d(eVar, obj), str, str2, str3, str4, z, z2);
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("197d6848", new Object[]{eVar, str});
        } else {
            a(c(eVar), str);
        }
    }

    public static com.taobao.alilive.aliliveframework.frame.a c(com.taobao.taolive.sdk.controller.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.alilive.aliliveframework.frame.a) ipChange.ipc$dispatch("8a5c08f1", new Object[]{eVar});
        }
        com.taobao.taolive.room.controller2.g gVar = (com.taobao.taolive.room.controller2.g) n.a();
        if (gVar != null) {
            return gVar;
        }
        com.taobao.taolive.room.controller2.g gVar2 = new com.taobao.taolive.room.controller2.g();
        gVar2.a(eVar);
        gVar2.a((ppa) new ppb());
        return gVar2;
    }

    public static Object e(com.taobao.alilive.aliliveframework.frame.a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("77c0f65d", new Object[]{aVar, obj});
        }
        if (aVar == null) {
            aVar = n.a();
        }
        if (!(aVar instanceof com.taobao.taolive.room.controller2.g)) {
            return obj;
        }
        if (aa.cp()) {
            com.taobao.taolive.sdk.controller.e y = ((com.taobao.taolive.room.controller2.g) aVar).y();
            return (y == null || !y.g()) ? obj : y.i != null ? y.i : y;
        }
        com.taobao.taolive.sdk.controller.e y2 = ((com.taobao.taolive.room.controller2.g) aVar).y();
        return (y2 == null || !y2.g()) ? obj : y2;
    }

    public static Object d(com.taobao.taolive.sdk.controller.e eVar, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("d651a39b", new Object[]{eVar, obj}) : eVar == null ? obj : aa.cp() ? eVar.g() ? eVar.i != null ? eVar.i : eVar : obj : eVar.g() ? eVar : obj;
    }

    public static void a(com.taobao.taolive.sdk.controller.e eVar, pkm pkmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93b335c", new Object[]{eVar, pkmVar});
            return;
        }
        com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t H = pmd.a().H();
        if (eVar == null || H == null) {
            return;
        }
        for (Map.Entry<String, String> entry : H.a().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (pkmVar != null) {
                pkmVar.a(key, value);
            } else if (eVar.E() != null) {
                eVar.E().put(key, value);
            }
        }
    }
}
