package com.taobao.taolive.movehighlight.utils;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.room.utils.ag;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.cgl;
import tb.kge;
import tb.pdt;
import tb.pfa;
import tb.pmd;
import tb.poy;
import tb.ppa;
import tb.pqq;

/* loaded from: classes8.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_ACCOUNT_ID = "account_id=";
    public static final String ARG_ACCOUNT_TYPE = "accounttype=";
    public static final String ARG_DEVICE_LEVEL = "deviceLevel=";
    public static final String ARG_DURATION = "duration=";
    public static final String ARG_FEED_ID = "feed_id=";
    public static final String ARG_FEED_TYPE = "feedtype=";
    public static final String ARG_FROM = "from=";
    public static final String ARG_IS_FANS = "is_fans=";
    public static final String ARG_IS_LANDSCAPE = "landscape=";
    public static final String ARG_LIVE_ENTRY_SOURCE = "entrySource=";
    public static final String ARG_LIVE_SOURCE = "livesource=";
    public static final String ARG_LIVE_STATUS = "livestatus=";
    public static final String ARG_ROOMTYPE = "roomType=";
    public static final String ARG_ROOMTYPE2 = "roomtype2=";
    public static final String ARG_ROOM_TYPE = "room_type=";
    public static final String ARG_SPM = "spm=";
    public static final String ARG_SPM_CNT = "spm-cnt";
    public static final String ARG_SPM_URL = "spm-url";
    public static final String ARG_TRACKINFO = "trackInfo=";
    public static final String CALC_LEAVE = "TaoLiveLeave";
    public static final String CLICK_GOODS_LIST = "Goodslist";
    public static final String KEY_ACCOUNT_TYPE = "accountType";
    public static final String KEY_FEED_ID = "feedId";
    public static final String KEY_FEED_ID2 = "feed_id";
    public static final String KEY_LIVE_SOURCE = "livesource";
    public static final String KEY_SPM = "spm";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";
    public static final String SOURCE_SWITCH_ROOM = "switchRoom";
    public static final String SPM_TAOLIVE_FANDOM = "a21tn.888888";
    public static final String SPM_TAOLIVE_WATCH = "a2141.8001249.1.1";
    public static final String SPM_TAOLIVE_WATCH_4_SHOP = "a2141.23201685";

    static {
        kge.a(-916658820);
    }

    public static String c(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("131b3c65", new Object[]{aVar});
        }
        com.taobao.taolive.sdk.core.g b = com.taobao.taolive.room.utils.n.b(aVar);
        if (b instanceof com.taobao.taolive.sdk.controller.e) {
            com.taobao.taolive.sdk.controller.e eVar = (com.taobao.taolive.sdk.controller.e) b;
            if (!TextUtils.isEmpty(eVar.n)) {
                return eVar.n;
            }
        }
        return (!u.ai() || aVar == null || (!poy.af(aVar) && !poy.ag(aVar))) ? (pfa.a(aVar).b() == null || !pfa.a(aVar).b().b()) ? "a2141.8001249.1.1" : pfa.a(aVar).b().c() : "a2141.23201685";
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
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd95b58e", new Object[]{aVar, str, str2, strArr});
            return;
        }
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            if (eVar.D() != null) {
                ppa D = eVar.D();
                VideoInfo aA = D.aA();
                if (aA == null || aA.broadCaster == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                String str3 = aA.liveId;
                String str4 = aA.broadCaster.accountId;
                arrayList.add("feed_id=" + str3);
                arrayList.add("account_id=" + str4);
                arrayList.add("deviceLevel=" + com.taobao.taolive.room.utils.k.a());
                if (!TextUtils.isEmpty(D.aw())) {
                    arrayList.add("pkid=" + D.aw());
                }
                if (!TextUtils.isEmpty(D.e())) {
                    arrayList.add("spm-url=" + D.e());
                }
                if (!TextUtils.isEmpty(D.e())) {
                    arrayList.add("spm=" + D.e());
                }
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add("trackInfo=" + str2);
                } else if (!TextUtils.isEmpty(D.f())) {
                    arrayList.add("trackInfo=" + D.f());
                }
                if (!TextUtils.isEmpty(D.j())) {
                    arrayList.add("liveoprt_id=" + D.j());
                }
                StringBuilder sb = new StringBuilder();
                sb.append("timemoving_type=");
                sb.append(d.d ? "content" : "item");
                arrayList.add(sb.toString());
                if (D.ak() != null) {
                    arrayList.add("clickurl=" + D.ak().clickid);
                    arrayList.add("interactiveurl=" + D.ak().interactiveid);
                    arrayList.add("clickInfo=" + D.ak().clickInfo);
                }
                arrayList.add("spm-cnt=" + c(aVar));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("is_fans=");
                String str5 = "1";
                sb2.append(aA.broadCaster.follow ? str5 : "0");
                arrayList.add(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append("isAD=");
                sb3.append(D.ak() != null ? 1 : 0);
                arrayList.add(sb3.toString());
                arrayList.add("entryUtparam=" + D.z());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("isAdTransParams=");
                if (D.al() == null) {
                    i = 0;
                }
                sb4.append(i);
                arrayList.add(sb4.toString());
                arrayList.add("entryLiveSource=" + D.p());
                arrayList.add("entryjiangjie_id=" + D.ah());
                arrayList.add("entryQuery=" + D.q());
                arrayList.add("entrySpm=" + D.r());
                arrayList.add("entryScm=" + D.t());
                arrayList.add("switchIndex=" + D.O());
                arrayList.add("isUp=" + D.w());
                arrayList.add("entryTraceId=" + D.u());
                arrayList.add("entryLiveId=" + D.v());
                arrayList.add("liveAdParams=" + Uri.encode(D.B()));
                arrayList.add("feedtype=" + aA.type);
                arrayList.add("livestatus=" + aA.status);
                arrayList.add("landscape=" + aA.landScape);
                arrayList.add("accounttype=" + com.taobao.taolive.sdk.controller.k.a(aA.broadCaster.type));
                arrayList.add("roomType=" + aA.roomType);
                arrayList.add("livesource=" + D.H());
                arrayList.add("entrySource=" + D.I());
                int i2 = aA.roomType;
                if (D.b(aA)) {
                    i2 = 13;
                }
                arrayList.add("roomtype2=" + i2);
                arrayList.add("timeShiftForEnter=" + D.aH() + "");
                StringBuilder sb5 = new StringBuilder();
                sb5.append("jiangjie_ID=");
                sb5.append(D.aI());
                arrayList.add(sb5.toString());
                arrayList.add("oneproduct_jiangjie=" + D.aJ());
                arrayList.add("oneproduct_mounting=" + D.aK());
                arrayList.add("timeShiftItemId=" + D.aL());
                arrayList.add("product_type=timemove");
                arrayList.add("queryKey=" + D.D());
                arrayList.add("clickid=" + D.aj());
                arrayList.add("room_type=live");
                if (!TextUtils.isEmpty(aA.tvChannelId)) {
                    arrayList.add("officialchannel_id=" + aA.tvChannelId);
                }
                if (strArr != null && strArr.length > 0) {
                    for (String str6 : strArr) {
                        arrayList.add(str6);
                    }
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("login=");
                if (pmd.a().q() == null || !pmd.a().q().c()) {
                    str5 = "0";
                }
                sb6.append(str5);
                arrayList.add(sb6.toString());
                if (u.aj() && !TextUtils.isEmpty(D.g())) {
                    arrayList.add("utparam-url=" + D.g());
                }
                if (pmd.a().e() == null) {
                    return;
                }
                pmd.a().e().a("Page_TaobaoLiveWatch", str, (String[]) arrayList.toArray(new String[0]));
                return;
            }
        }
        n.a(str, str2, strArr);
        if (!c.y()) {
            return;
        }
        a(aVar, 19999, "highlight_trackUtilsNew_error", (Map<String, String>) null);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54c20ebe", new Object[]{aVar, str, map});
            return;
        }
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            if (eVar.D() != null) {
                ppa D = eVar.D();
                if (pmd.a().e() == null) {
                    return;
                }
                if (map != null) {
                    map.put("livesource", D.H());
                    map.put("entrySource", D.I());
                    map.put("timeShiftForEnter", D.aH() + "");
                    map.put("jiangjie_ID", D.aI());
                    map.put("oneproduct_jiangjie", D.aJ());
                    map.put("oneproduct_mounting", D.aK());
                    map.put("timeShiftItemId", D.aL());
                    map.put("queryKey", D.D());
                    map.put("clickid", D.aj());
                    StringBuilder sb = new StringBuilder();
                    sb.append(D.ak() != null ? 1 : 0);
                    sb.append("");
                    map.put("isAD", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    if (D.al() == null) {
                        i = 0;
                    }
                    sb2.append(i);
                    sb2.append("");
                    map.put("isAdTransParams", sb2.toString());
                    map.put("entryLiveSource", D.p());
                    map.put("entryjiangjie_id", D.ah());
                    map.put(pdt.entryQuery, D.q());
                    map.put("entrySpm", D.r());
                    map.put(pqq.KEY_ENTRY_SCM, D.t());
                    map.put("switchIndex", D.O() + "");
                    map.put("isUp", D.w() + "");
                    map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, D.u());
                    map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, D.v());
                    map.put("entryUtparam", D.z());
                    map.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
                    map.put("timemoving_type", d.d ? "content" : "item");
                    VideoInfo aA = D.aA();
                    if (aA != null) {
                        map.put("roomType", String.valueOf(aA.roomType));
                        map.put("newRoomType", String.valueOf(aA.newRoomType));
                        map.put(ag.KEY_LIVE_STATUS, String.valueOf(aA.status));
                        String str2 = aA.liveId;
                        String str3 = aA.broadCaster.accountId;
                        if (!TextUtils.isEmpty(D.e())) {
                            map.put("spm-url", D.e());
                        }
                        map.put("feed_id", str2);
                        map.put("account_id", str3);
                        if (!TextUtils.isEmpty(aA.tvChannelId)) {
                            map.put(ag.KEY_OFFICIAL_CHANNEL_ID, aA.tvChannelId);
                        }
                    }
                }
                pmd.a().e().a("Page_TaobaoLiveWatch", str, map);
                return;
            }
        }
        n.a(str, map);
        if (!c.y()) {
            return;
        }
        a(aVar, 19999, "highlight_trackUtilsNew_error", (Map<String, String>) null);
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
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            if (eVar.D() != null) {
                ppa D = eVar.D();
                VideoInfo aA = D.aA();
                if (aA == null || aA.broadCaster == null) {
                    return;
                }
                String str3 = aA.liveId;
                String str4 = aA.broadCaster.accountId;
                hashMap.put("liveAdParams", Uri.encode(D.B()));
                hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(aA.broadCaster.type) + "");
                if (!TextUtils.isEmpty(D.e())) {
                    hashMap.put("spm-url", D.e());
                }
                hashMap.put("feed_id", str3);
                hashMap.put("account_id", str4);
                hashMap.put("roomType", String.valueOf(aA.roomType));
                hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.utils.k.a()));
                hashMap.put("accountType", com.taobao.taolive.sdk.controller.k.a(aA.broadCaster.type) + "");
                int i = aA.roomType;
                if (D.b(aA)) {
                    i = 13;
                }
                hashMap.put(ag.KEY_ROOMTYPE2, i + "");
                hashMap.put("entryUtparam", D.z());
                hashMap.put("timeShiftForEnter", D.aH() + "");
                hashMap.put("jiangjie_ID", D.aI());
                hashMap.put("entryjiangjie_id", D.ah());
                hashMap.put("oneproduct_jiangjie", D.aJ());
                hashMap.put("oneproduct_mounting", D.aK());
                hashMap.put("timeShiftItemId", D.aL());
                hashMap.put("entrySpm", D.r());
                hashMap.put("entryLiveSource", D.p());
                hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(aA.status));
                hashMap.put("timemoving_type", d.d ? "content" : "item");
                hashMap.put("login", (pmd.a().q() == null || !pmd.a().q().c()) ? "0" : "1");
                hashMap.put("livesource", D.H());
                hashMap.put("entrySource", D.I());
                hashMap.put("switchIndex", String.valueOf(D.O()));
                hashMap.put("isUp", String.valueOf(D.w()));
                hashMap.put("queryKey", D.D());
                hashMap.put("clickid", D.aj());
                if (!TextUtils.isEmpty(str2)) {
                    hashMap.put("trackInfo", str2);
                } else if (!TextUtils.isEmpty(D.f())) {
                    hashMap.put("trackInfo", D.f());
                }
                if (!TextUtils.isEmpty(D.j())) {
                    hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, D.j());
                }
                if (!TextUtils.isEmpty(D.e())) {
                    hashMap.put("spm", D.e());
                }
                hashMap.put("spm-cnt", c(aVar));
                hashMap.put("timestampT", System.currentTimeMillis() + "");
                if (!TextUtils.isEmpty(aA.tvChannelId)) {
                    hashMap.put(ag.KEY_OFFICIAL_CHANNEL_ID, aA.tvChannelId);
                }
                hashMap.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
                if (pmd.a().e() == null) {
                    return;
                }
                pmd.a().e().b("Page_TaobaoLiveWatch", str, hashMap);
                return;
            }
        }
        n.a(str, str2, hashMap);
        if (!c.y()) {
            return;
        }
        a(aVar, 19999, "highlight_trackUtilsNew_error", (Map<String, String>) null);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        VideoInfo aA;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{aVar});
            return;
        }
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            if (eVar.D() != null) {
                ppa D = eVar.D();
                if (!D.R() || (aA = D.aA()) == null || aA.broadCaster == null) {
                    return;
                }
                HashMap hashMap = new HashMap();
                String str = aA.liveId;
                String str2 = aA.broadCaster.accountId;
                hashMap.put("feed_id", str);
                hashMap.put("account_id", str2);
                hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(aA.status));
                hashMap.put("accounttype", com.taobao.taolive.sdk.controller.k.a(aA.broadCaster.type) + "");
                hashMap.put("scm-live", D.x());
                if (u.ak()) {
                    hashMap.put("x_object_type", D.y());
                }
                hashMap.put("feedtype", aA.type + "");
                hashMap.put("landscape", aA.landScape ? "1" : "0");
                hashMap.put("roomType", String.valueOf(aA.roomType));
                StringBuilder sb = new StringBuilder();
                sb.append(D.ak() != null ? 1 : 0);
                sb.append("");
                hashMap.put("isAD", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                if (D.al() != null) {
                    i = 1;
                }
                sb2.append(i);
                sb2.append("");
                hashMap.put("isAdTransParams", sb2.toString());
                hashMap.put("entryLiveSource", D.p());
                hashMap.put("entryjiangjie_id", D.ah());
                hashMap.put("timemoving_type", d.d ? "content" : "item");
                hashMap.put(pdt.entryQuery, D.q());
                hashMap.put("entrySpm", D.r());
                hashMap.put(pqq.KEY_ENTRY_SCM, D.t());
                hashMap.put("entryUtparam", D.z());
                hashMap.put("entryPvid", D.A());
                hashMap.put("switchIndex", D.O() + "");
                hashMap.put("isUp", D.w() + "");
                hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, D.u());
                hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, D.v());
                hashMap.put("livesource", D.H());
                hashMap.put("common_live_page", "live");
                hashMap.put("content_id", str);
                hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.utils.k.a()));
                if (u.am()) {
                    hashMap.put("clickid", D.aj());
                }
                if (!TextUtils.isEmpty(D.f())) {
                    hashMap.put("trackInfo", D.f());
                }
                if (!TextUtils.isEmpty(D.j())) {
                    hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, D.j());
                }
                if (pmd.a().e() == null) {
                    return;
                }
                pmd.a().e().a((Map<String, String>) hashMap);
                return;
            }
        }
        n.a();
        if (!c.y()) {
            return;
        }
        a(aVar, 19999, "highlight_trackUtilsNew_error", (Map<String, String>) null);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("addd75c4", new Object[]{aVar, str, str2, str3, strArr});
            return;
        }
        List<String> a2 = a(aVar, strArr);
        if (TextUtils.isEmpty(str3)) {
            str3 = b(aVar);
        }
        cgl.s().a("taobaolive", str, str2, str3, (String[]) a2.toArray(new String[0]));
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar, int i, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c741bbf5", new Object[]{aVar, new Integer(i), str, map});
        } else if (pmd.a().e() == null) {
        } else {
            pmd.a().e().a("Page_TaobaoLiveWatch", i, str, "", "0", map);
        }
    }

    private static List<String> a(com.taobao.alilive.aliliveframework.frame.a aVar, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fbe7a965", new Object[]{aVar, strArr});
        }
        ArrayList arrayList = new ArrayList();
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            if (eVar.D() != null) {
                ppa D = eVar.D();
                VideoInfo aA = D.aA();
                arrayList.add("feedId=" + b(aVar));
                arrayList.add("liveSource=" + D.H());
                arrayList.add("entrySource=" + D.I());
                arrayList.add("timestamp=" + System.currentTimeMillis());
                arrayList.add("timeShiftEntry=" + D.aH());
                arrayList.add("jiangjie_ID=" + D.aI());
                arrayList.add("oneproduct_jiangjie=" + D.aJ());
                arrayList.add("oneproduct_mounting=" + D.aK());
                if (aA != null) {
                    String str = aA.broadCaster != null ? aA.broadCaster.accountId : "";
                    arrayList.add("accountId=" + str);
                    arrayList.add("roomStatus=" + aA.roomStatus);
                }
                if (!TextUtils.isEmpty(D.f())) {
                    arrayList.add("trackInfo=" + D.f());
                }
                arrayList.add("serverParams=" + D.i());
                if (strArr != null && strArr.length > 0) {
                    arrayList.addAll(Arrays.asList(strArr));
                }
                return arrayList;
            }
        }
        if (c.y()) {
            a(aVar, 19999, "highlight_trackUtilsNew_error", (Map<String, String>) null);
        }
        return n.a(strArr);
    }

    private static String b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3759c0a4", new Object[]{aVar});
        }
        if (aVar instanceof com.taobao.taolive.sdk.core.e) {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            if (eVar.D() != null) {
                VideoInfo aA = eVar.D().aA();
                if (aA == null) {
                    return null;
                }
                return aA.liveId;
            }
        }
        return n.b();
    }
}
