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
import tb.kge;
import tb.pdt;
import tb.pmd;
import tb.pqq;

/* loaded from: classes8.dex */
public class n {
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
    public static final String CLICK_ACCOUNT_FOLLOW = "AccountFollow";
    public static final String CLICK_CARD = "Card";
    public static final String CLICK_GOODS_DETAIL = "detail";
    public static final String CLICK_GOODS_LIST = "Goodslist";
    public static final String CLICK_LIKE = "Like";
    public static final String CLICK_SHARE_LIVE = "ShareLive";
    public static final String KEY_ACCOUNT_TYPE = "accountType";
    public static final String KEY_FEED_ID = "feedId";
    public static final String KEY_FEED_ID2 = "feed_id";
    public static final String KEY_LIVE_SOURCE = "livesource";
    public static final String KEY_SPM = "spm";
    public static final String PAGE_TAOLIVE_WATCH = "Page_TaobaoLiveWatch";
    public static final String SOURCE_SWITCH_REPLAY = "switchReplay";
    public static final String SOURCE_SWITCH_ROOM = "switchRoom";
    public static final String SPM_TAOLIVE_FANDOM = "a21tn.888888";
    public static final String SPM_TAOLIVE_WATCH = "a2141.8001249.1.1";
    public static final String SPM_TAOLIVE_WATCH_4_SHOP = "a2141.23201685";

    static {
        kge.a(-2093666940);
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
        arrayList.add("feed_id=" + str3);
        arrayList.add("account_id=" + str4);
        arrayList.add("deviceLevel=" + String.valueOf(com.taobao.taolive.room.service.c.M()));
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.aw)) {
            arrayList.add("pkid=" + com.taobao.taolive.room.service.c.aw);
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            arrayList.add("spm-url=" + com.taobao.taolive.room.service.c.y());
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
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
        StringBuilder sb = new StringBuilder();
        sb.append("timemoving_type=");
        sb.append(d.d ? "content" : "item");
        arrayList.add(sb.toString());
        if (com.taobao.taolive.room.service.c.E() != null) {
            arrayList.add("clickurl=" + com.taobao.taolive.room.service.c.E().clickid);
            arrayList.add("interactiveurl=" + com.taobao.taolive.room.service.c.E().interactiveid);
            arrayList.add("clickInfo=" + com.taobao.taolive.room.service.c.E().clickInfo);
        }
        if (u.ai() && (com.taobao.taolive.room.service.c.g() || com.taobao.taolive.room.service.c.f())) {
            arrayList.add("spm-cnt=a2141.23201685");
        } else {
            arrayList.add("spm-cnt=a2141.8001249.1.1");
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("is_fans=");
        String str5 = "1";
        sb2.append(s.broadCaster.follow ? str5 : "0");
        arrayList.add(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("isAD=");
        sb3.append(com.taobao.taolive.room.service.c.E() != null ? 1 : 0);
        arrayList.add(sb3.toString());
        arrayList.add("entryUtparam=" + com.taobao.taolive.room.service.c.J);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("isAdTransParams=");
        if (com.taobao.taolive.room.service.c.F() == null) {
            i = 0;
        }
        sb4.append(i);
        arrayList.add(sb4.toString());
        arrayList.add("entryLiveSource=" + com.taobao.taolive.room.service.c.v);
        arrayList.add("entryjiangjie_id=" + com.taobao.taolive.room.service.c.w);
        arrayList.add("timeMovingUtParams=" + com.taobao.taolive.room.service.c.x);
        arrayList.add("entryQuery=" + com.taobao.taolive.room.service.c.y);
        arrayList.add("entrySpm=" + com.taobao.taolive.room.service.c.z);
        arrayList.add("entryScm=" + com.taobao.taolive.room.service.c.B);
        arrayList.add("switchIndex=" + com.taobao.taolive.room.service.c.E);
        arrayList.add("isUp=" + com.taobao.taolive.room.service.c.F);
        arrayList.add("entryTraceId=" + com.taobao.taolive.room.service.c.C);
        arrayList.add("entryLiveId=" + com.taobao.taolive.room.service.c.D);
        arrayList.add("liveAdParams=" + Uri.encode(com.taobao.taolive.room.service.c.Q));
        arrayList.add("feedtype=" + s.type);
        arrayList.add("livestatus=" + s.status);
        arrayList.add("landscape=" + s.landScape);
        arrayList.add("accounttype=" + com.taobao.taolive.room.service.c.s(s.broadCaster.type));
        arrayList.add("roomType=" + s.roomType);
        arrayList.add("livesource=" + com.taobao.taolive.room.service.c.k());
        arrayList.add("entrySource=" + com.taobao.taolive.room.service.c.l());
        int i2 = s.roomType;
        if (com.taobao.taolive.room.service.c.a(s)) {
            i2 = 13;
        }
        arrayList.add("roomtype2=" + i2);
        arrayList.add("timeShiftForEnter=" + com.taobao.taolive.room.service.c.p() + "");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("jiangjie_ID=");
        sb5.append(com.taobao.taolive.room.service.c.c());
        arrayList.add(sb5.toString());
        arrayList.add("oneproduct_jiangjie=" + com.taobao.taolive.room.service.c.a());
        arrayList.add("oneproduct_mounting=" + com.taobao.taolive.room.service.c.d());
        arrayList.add("timeShiftItemId=" + com.taobao.taolive.room.service.c.j());
        arrayList.add("product_type=timemove");
        arrayList.add("queryKey=" + com.taobao.taolive.room.service.c.au);
        arrayList.add("clickid=" + com.taobao.taolive.room.service.c.av);
        arrayList.add("room_type=live");
        if (!TextUtils.isEmpty(s.tvChannelId)) {
            arrayList.add("officialchannel_id=" + s.tvChannelId);
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
        if (u.aj() && !TextUtils.isEmpty(com.taobao.taolive.room.service.c.z())) {
            arrayList.add("utparam-url=" + com.taobao.taolive.room.service.c.z());
        }
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
                sb.append(com.taobao.taolive.room.service.c.E() != null ? 1 : 0);
                sb.append("");
                map.put("isAD", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                if (com.taobao.taolive.room.service.c.F() == null) {
                    i = 0;
                }
                sb2.append(i);
                sb2.append("");
                map.put("isAdTransParams", sb2.toString());
                map.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
                map.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
                map.put("timeMovingUtParams", com.taobao.taolive.room.service.c.x);
                map.put(pdt.entryQuery, com.taobao.taolive.room.service.c.y);
                map.put("entrySpm", com.taobao.taolive.room.service.c.z);
                map.put(pqq.KEY_ENTRY_SCM, com.taobao.taolive.room.service.c.B);
                map.put("switchIndex", com.taobao.taolive.room.service.c.E + "");
                map.put("isUp", com.taobao.taolive.room.service.c.F + "");
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, com.taobao.taolive.room.service.c.C);
                map.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, com.taobao.taolive.room.service.c.D);
                map.put("entryUtparam", com.taobao.taolive.room.service.c.J);
                map.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
                map.put("timemoving_type", d.d ? "content" : "item");
                VideoInfo s = com.taobao.taolive.room.service.c.s();
                if (s != null) {
                    map.put("roomType", String.valueOf(s.roomType));
                    map.put("newRoomType", String.valueOf(s.newRoomType));
                    map.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
                    String str2 = s.liveId;
                    String str3 = s.broadCaster.accountId;
                    if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
                        map.put("spm-url", com.taobao.taolive.room.service.c.y());
                    }
                    map.put("feed_id", str2);
                    map.put("account_id", str3);
                    if (!TextUtils.isEmpty(s.tvChannelId)) {
                        map.put(ag.KEY_OFFICIAL_CHANNEL_ID, s.tvChannelId);
                    }
                }
            }
            pmd.a().e().a("Page_TaobaoLiveWatch", str, map);
        }
    }

    public static void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
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
        hashMap.put("accounttype", com.taobao.taolive.room.service.c.s(s.broadCaster.type) + "");
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            hashMap.put("spm-url", com.taobao.taolive.room.service.c.y());
        }
        hashMap.put("feed_id", str3);
        hashMap.put("account_id", str4);
        hashMap.put("roomType", String.valueOf(s.roomType));
        hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.service.c.M()));
        hashMap.put("accountType", com.taobao.taolive.room.service.c.s(s.broadCaster.type) + "");
        int i = s.roomType;
        if (com.taobao.taolive.room.service.c.a(s)) {
            i = 13;
        }
        hashMap.put(ag.KEY_ROOMTYPE2, i + "");
        hashMap.put("entryUtparam", com.taobao.taolive.room.service.c.J);
        hashMap.put("timeShiftForEnter", com.taobao.taolive.room.service.c.p() + "");
        hashMap.put("jiangjie_ID", com.taobao.taolive.room.service.c.c());
        hashMap.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
        hashMap.put("oneproduct_jiangjie", com.taobao.taolive.room.service.c.a());
        hashMap.put("oneproduct_mounting", com.taobao.taolive.room.service.c.d());
        hashMap.put("timeShiftItemId", com.taobao.taolive.room.service.c.j());
        hashMap.put("entrySpm", com.taobao.taolive.room.service.c.z);
        hashMap.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
        hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
        hashMap.put("timemoving_type", d.d ? "content" : "item");
        hashMap.put("login", (pmd.a().q() == null || !pmd.a().q().c()) ? "0" : "1");
        hashMap.put("livesource", com.taobao.taolive.room.service.c.k());
        hashMap.put("entrySource", com.taobao.taolive.room.service.c.l());
        hashMap.put("switchIndex", String.valueOf(com.taobao.taolive.room.service.c.E));
        hashMap.put("isUp", String.valueOf(com.taobao.taolive.room.service.c.F));
        hashMap.put("queryKey", com.taobao.taolive.room.service.c.au);
        hashMap.put("clickid", com.taobao.taolive.room.service.c.av);
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("trackInfo", str2);
        } else if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
            hashMap.put("trackInfo", com.taobao.taolive.room.service.c.B());
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.A())) {
            hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, com.taobao.taolive.room.service.c.A());
        }
        if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.y())) {
            hashMap.put("spm", com.taobao.taolive.room.service.c.y());
        }
        if (u.ai() && (com.taobao.taolive.room.service.c.g() || com.taobao.taolive.room.service.c.f())) {
            hashMap.put("spm-cnt", "a2141.23201685");
        } else {
            hashMap.put("spm-cnt", "a2141.8001249.1.1");
        }
        hashMap.put("timestampT", System.currentTimeMillis() + "");
        if (!TextUtils.isEmpty(s.tvChannelId)) {
            hashMap.put(ag.KEY_OFFICIAL_CHANNEL_ID, s.tvChannelId);
        }
        hashMap.put("product_type", RecModel.MEDIA_TYPE_TIMEMOVE);
        if (pmd.a().e() == null) {
            return;
        }
        pmd.a().e().b("Page_TaobaoLiveWatch", str, hashMap);
    }

    public static void a() {
        VideoInfo s;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else if (!com.taobao.taolive.room.service.c.x() || (s = com.taobao.taolive.room.service.c.s()) == null || s.broadCaster == null) {
        } else {
            HashMap hashMap = new HashMap();
            String str = s.liveId;
            String str2 = s.broadCaster.accountId;
            hashMap.put("feed_id", str);
            hashMap.put("account_id", str2);
            hashMap.put(ag.KEY_LIVE_STATUS, String.valueOf(s.status));
            hashMap.put("accounttype", com.taobao.taolive.room.service.c.s(s.broadCaster.type) + "");
            hashMap.put("scm-live", com.taobao.taolive.room.service.c.G);
            hashMap.put("spm-live", com.taobao.taolive.room.service.c.H);
            if (u.ak()) {
                hashMap.put("x_object_type", com.taobao.taolive.room.service.c.I);
            }
            hashMap.put("feedtype", s.type + "");
            hashMap.put("landscape", s.landScape ? "1" : "0");
            hashMap.put("roomType", String.valueOf(s.roomType));
            StringBuilder sb = new StringBuilder();
            sb.append(com.taobao.taolive.room.service.c.E() != null ? 1 : 0);
            sb.append("");
            hashMap.put("isAD", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            if (com.taobao.taolive.room.service.c.F() != null) {
                i = 1;
            }
            sb2.append(i);
            sb2.append("");
            hashMap.put("isAdTransParams", sb2.toString());
            hashMap.put("entryLiveSource", com.taobao.taolive.room.service.c.v);
            hashMap.put("entryjiangjie_id", com.taobao.taolive.room.service.c.w);
            hashMap.put("timeMovingUtParams", com.taobao.taolive.room.service.c.x);
            hashMap.put("timemoving_type", d.d ? "content" : "item");
            hashMap.put(pdt.entryQuery, com.taobao.taolive.room.service.c.y);
            hashMap.put("entrySpm", com.taobao.taolive.room.service.c.z);
            hashMap.put(pqq.KEY_ENTRY_SCM, com.taobao.taolive.room.service.c.B);
            hashMap.put("entryUtparam", com.taobao.taolive.room.service.c.J);
            hashMap.put("entryPvid", com.taobao.taolive.room.service.c.K);
            hashMap.put("switchIndex", com.taobao.taolive.room.service.c.E + "");
            hashMap.put("isUp", com.taobao.taolive.room.service.c.F + "");
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_TRACE_ID, com.taobao.taolive.room.service.c.C);
            hashMap.put(TBLiveRecEngineV2.PARAM_ENTRY_LIVE_ID, com.taobao.taolive.room.service.c.D);
            hashMap.put("livesource", com.taobao.taolive.room.service.c.k());
            hashMap.put("common_live_page", "live");
            hashMap.put("content_id", str);
            hashMap.put("deviceLevel", String.valueOf(com.taobao.taolive.room.service.c.M()));
            if (u.am()) {
                hashMap.put("clickid", com.taobao.taolive.room.service.c.av);
            }
            if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.B())) {
                hashMap.put("trackInfo", com.taobao.taolive.room.service.c.B());
            }
            if (!TextUtils.isEmpty(com.taobao.taolive.room.service.c.A())) {
                hashMap.put(aw.PARAM_TRACK_LIVEOPRT_ID, com.taobao.taolive.room.service.c.A());
            }
            if (pmd.a().e() == null) {
                return;
            }
            pmd.a().e().a((Map<String, String>) hashMap);
        }
    }

    public static List<String> a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a10d1db0", new Object[]{strArr});
        }
        ArrayList arrayList = new ArrayList();
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        arrayList.add("feedId=" + b());
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
        if (strArr != null && strArr.length > 0) {
            arrayList.addAll(Arrays.asList(strArr));
        }
        return arrayList;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        VideoInfo s = com.taobao.taolive.room.service.c.s();
        if (s == null) {
            return null;
        }
        return s.liveId;
    }
}
