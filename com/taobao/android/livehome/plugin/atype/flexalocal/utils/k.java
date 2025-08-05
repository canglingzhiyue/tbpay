package com.taobao.android.livehome.plugin.atype.flexalocal.utils;

import android.net.Uri;
import anet.channel.util.HttpConstant;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.utils.aw;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.kge;
import tb.sqt;

/* loaded from: classes6.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_ENTRY_LIVE_SOURCE = "entryLiveSource";
    public static final String ARG_ENTRY_SPM = "entrySpm";
    public static final String ARG_SPM_CNT = "spm-cnt";
    public static final String ARG_SPM_URL = "spm-url";
    public static final String CLICK_CHANNEL = "home_channel_clck";
    public static final String CLICK_CHANNEL_BOX = "home_channelbox_clck";
    public static final String CLICK_PERSON_SPREAD = "person_spread";
    public static final String CLICK_TAB_REFRESH = "tab_refresh";
    public static final String CLICK_TAB_RETURN = "tab_return";
    public static final String DYNAMIC_BINDDATAX = "dynamic_binddataV3";
    public static final String DYNAMIC_CREATEVIEWX = "dynamic_createviewV3";
    public static final String DYNAMIC_DOWNLOADX = "dynamic_downloadV3";
    public static final String HOME_MODULE = "taoliveFeedList";
    public static final String MODULE_TAOLIVE_DINAMICX = "taoliveDinamicX";
    public static final String MONITOR_BUINESS_ARG = "time=%d;source=java";
    public static final String MONITOR_MOUDLE = "taolive";
    public static final String PAGE_DEPTH_CHANNEL = "Page_TaobaoLive_landingpage";
    public static final String PAGE_FOLLOW = "Page_TaobaoLive_follow";
    public static final String PAGE_SELECTED = "Page_TaobaoLive_jingxuan";
    public static final String PAGE_SINGLELIVE = "Page_Home_zhibotab";
    public static final String PAGE_SUB_CHANNEL = "Page_TaobaoLive_channel";
    public static final String PAGE_TAOLIVE = "Page_TaobaoLive";
    public static final String SHOW_CHANNEL_BOX = "home_channelbox_show";
    public static final String SHOW_PERSON_SPREAD = "guard_show";
    public static final String SHOW_SEARCH_BOX = "searchbox_show";
    public static final String SPM_DEPTH_CHANNEL = "a2141.taolive_landingpage";
    public static final String SPM_FOLLOW = "a2141.taolive_follow";
    public static final String SPM_SELECTED = "a2141.8001240";
    public static final String SPM_SINGLELIVE = "a21gtk.b99812389";
    public static final String SPM_SUB_CHANNEL = "a2141.taolive_channel";
    public static final String TAOLIVE_SPM_CNT_STR = "spm-cnt=a2141.8001240";

    static {
        kge.a(1049474193);
    }

    public static void a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        map2.put("sessionId", com.taobao.android.live.plugin.proxy.livehome.e.d());
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, "", "0", map2).build());
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(str, "Button-" + str2);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("sessionId", com.taobao.android.live.plugin.proxy.livehome.e.d());
        uTControlHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
    }

    public static void c(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{str, str2, map});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(map);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }

    public static void a(String str, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f2acf0c", new Object[]{str, sqtVar});
        } else {
            a(str, sqtVar, (Map<String, String>) null);
        }
    }

    public static void a(String str, sqt sqtVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52592f9", new Object[]{str, sqtVar, map});
        } else if (sqtVar == null || sqtVar.B == null || sqtVar.B.tabUT == null) {
        } else {
            UTHitBuilders.UTControlHitBuilder uTControlHitBuilder = new UTHitBuilders.UTControlHitBuilder(aw.STAIN_TRACK_PAGE, "Button-lpm_channel_monitor");
            Map<String, String> b = b(sqtVar.B.tabUT.getString("spm"), sqtVar);
            if (b != null && !b.isEmpty()) {
                if (map != null) {
                    b.putAll(map);
                }
                b.put("componentSession", sqtVar.A);
                b.put("action", str);
                b.put("entryLiveSource", sqtVar.e);
                b.put("entrySpm", sqtVar.f);
                b.put("time", System.currentTimeMillis() + "");
                JSONArray k = sqtVar.k();
                if (k == null) {
                    k = new JSONArray();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("action", (Object) str);
                if (sqtVar.B != null && !"jingxuan".equals(sqtVar.B.channelType)) {
                    jSONObject.put("tabType", (Object) sqtVar.B.channelType);
                } else if (sqtVar.C != null) {
                    jSONObject.put("tabType", (Object) sqtVar.C.channelType);
                }
                k.add(jSONObject);
                b.put("roomEvents", Uri.encode(k.toJSONString()));
                b.put("networkQoS", a());
                uTControlHitBuilder.setProperties(b);
            }
            UTAnalytics.getInstance().getDefaultTracker().send(uTControlHitBuilder.build());
        }
    }

    private static Map<String, String> b(String str, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1f305ec2", new Object[]{str, sqtVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        if (sqtVar != null) {
            hashMap.put("entryLiveSource", sqtVar.e);
            hashMap.put("entrySpm", sqtVar.f);
        }
        return hashMap;
    }

    public static void a(String str, String str2, MtopResponse mtopResponse, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab36ae1b", new Object[]{str, str2, mtopResponse, sqtVar});
        } else if (mtopResponse == null || sqtVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", (Object) mtopResponse.getApi());
            jSONObject2.put("apiVersion", (Object) mtopResponse.getV());
            if (mtopResponse.getHeaderFields() != null && mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2) != null && mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).size() > 0) {
                jSONObject2.put("traceID", (Object) mtopResponse.getHeaderFields().get(HttpConstant.EAGLE_EYE_ID_2).get(0));
            }
            jSONObject.put("traceInfo", (Object) jSONObject2);
            jSONObject.put("networkQoS", (Object) a());
            sqtVar.b(jSONObject);
        }
    }

    public static void a(String str, String str2, String str3, String str4, sqt sqtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c9ff96a", new Object[]{str, str2, str3, str4, sqtVar});
        } else if (sqtVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str);
            jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
            jSONObject.put(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, (Object) str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apiName", (Object) str3);
            jSONObject2.put("apiVersion", (Object) str4);
            jSONObject.put("traceInfo", (Object) jSONObject2);
            jSONObject.put("networkQoS", (Object) a());
            sqtVar.b(jSONObject);
        }
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        return globalNetworkQuality != 0 ? globalNetworkQuality != 1 ? globalNetworkQuality != 2 ? globalNetworkQuality != 3 ? "normal" : "excellent" : "NORMAL" : "poor" : "unknow";
    }
}
