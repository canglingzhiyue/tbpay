package com.taobao.android.fluid.framework.data.remote;

import android.net.Uri;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.avplayer.h;
import com.taobao.search.musie.livevideo.video.MusLiveVideo;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.container.i;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.flexbox.layoutmanager.core.ac;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.oeb;
import tb.ogv;
import tb.sps;
import tb.spz;

/* loaded from: classes5.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f12537a;
    private static Boolean b;

    static {
        kge.a(-979846509);
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        if (f12537a == null) {
            if (i.g() && i.a(ab.a(), "request_new_videoinfo", false)) {
                z = true;
            }
            f12537a = Boolean.valueOf(z);
        }
        return f12537a.booleanValue();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        if (b == null) {
            if (i.g() && i.a(ab.a(), "request_new_iteminfo", false)) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static void a(String str, String str2, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        boolean c;
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d52e819e", new Object[]{str, str2, new Boolean(z), iRemoteBaseListener});
            return;
        }
        if (!StringUtils.isEmpty(str2)) {
            c = d();
        } else {
            c = c();
        }
        if (c) {
            str3 = "mtop.taobao.content.detail.video.info.encrypt";
            str4 = "1.0";
        } else {
            str3 = "mtop.taobao.content.detail.video.info";
            str4 = "2.0";
        }
        a(str3, str4, str, str2, z, iRemoteBaseListener);
    }

    public static void a(String str, String str2, String str3, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4524d368", new Object[]{str, str2, str3, new Boolean(z), iRemoteBaseListener});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", (Object) h.VIDEOCONFIG_API_NAME);
        jSONObject.put("v", (Object) "3.0");
        jSONObject.put(MspGlobalDefine.SESSION, (Object) 1);
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("videoId", str);
        } else {
            hashMap.put("videoId", "0");
        }
        hashMap.put(MusLiveVideo.ATTR_PLAY_SCENES, str2);
        hashMap.put("from", str3);
        jSONObject.put("data", (Object) hashMap);
        if (z) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("prefetch", true);
            jSONObject.put("options", (Object) hashMap2);
        }
        MtopModule.requestWithParser(new g.c(null, jSONObject, null), iRemoteBaseListener, null);
    }

    private static void a(String str, String str2, String str3, String str4, boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fa06b2", new Object[]{str, str2, str3, str4, new Boolean(z), iRemoteBaseListener});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api", (Object) str);
        jSONObject.put("v", (Object) str2);
        jSONObject.put(MspGlobalDefine.SESSION, (Object) 1);
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str3)) {
            hashMap.put("videoId", str3);
        } else {
            hashMap.put("videoId", "0");
        }
        hashMap.put("type", "guangguang_pick");
        hashMap.put("source", "guangguang_pick");
        HashMap hashMap2 = new HashMap(1);
        hashMap2.put(c.KEY_ENABLE_SERVER_ABR, "true");
        if (!StringUtils.isEmpty(str4)) {
            hashMap2.put("itemId", str4);
        }
        hashMap.put(a.KEY_EXTEND_PARAMETERS, JSON.toJSONString(hashMap2));
        jSONObject.put("data", (Object) hashMap);
        if (z) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("prefetch", true);
            jSONObject.put("options", (Object) hashMap3);
        }
        g.c cVar = new g.c(null, jSONObject, null);
        if (!z && iRemoteBaseListener != null && i.a(ab.a(), "async_request_callback", false)) {
            cVar.i = ac.a().c().c();
        }
        MtopModule.requestWithParser(cVar, iRemoteBaseListener, null);
    }

    public static void a(JSONObject jSONObject, String str, boolean z, boolean z2, int i, Map map, boolean z3, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a4c4796", new Object[]{jSONObject, str, new Boolean(z), new Boolean(z2), new Integer(i), map, new Boolean(z3), iRemoteBaseListener});
        } else {
            MtopModule.requestWithParserInner(new g.c(null, a(jSONObject, str, z, z2, i, map, z3), null), iRemoteBaseListener, null, null, new b());
        }
    }

    public static JSONObject a(JSONObject jSONObject, String str, boolean z, boolean z2, int i, Map map, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5c6bed00", new Object[]{jSONObject, str, new Boolean(z), new Boolean(z2), new Integer(i), map, new Boolean(z3)});
        }
        return com.taobao.android.fluid.framework.data.remote.newmodel.a.a(z2, z, i, str, new sps(Uri.parse(a(ogv.a(jSONObject) ? null : jSONObject.toJSONString()))), map, jSONObject, z3).a();
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        spz.c("VideoInfoRequest_PickPreloadController", "PickPreloadController,构建tab3请求链接");
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("https://market.m.taobao.com/app/tb-source-app/video-fullpage/pages/index2?");
            sb.append("id=88888888&type=guangguang_pick&source=guangguang_pick&detailParameters={\"switchMode\":\"default\"}");
            sb.append("&extParams=");
            if (StringUtils.isEmpty(str)) {
                str = "";
            }
            sb.append(URLEncoder.encode(str, "utf-8"));
        } catch (Throwable th) {
            th.printStackTrace();
            spz.a("VideoInfoRequest_PickPreloadController", "", th);
        }
        return sb.toString();
    }

    public static void a(boolean z, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276c028a", new Object[]{new Boolean(z), iRemoteBaseListener});
            return;
        }
        String a2 = oeb.a("ShortVideo.globalH5InteractMtopConfig", (String) null);
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        JSONObject parseObject = JSON.parseObject(a2);
        String string = parseObject.getString("api");
        String string2 = parseObject.getString("v");
        if (string2 == null) {
            string2 = "1.0";
        }
        JSONObject jSONObject = parseObject.getJSONObject("data");
        JSONObject jSONObject2 = parseObject.getJSONObject("headers");
        int intValue = parseObject.getIntValue(MspGlobalDefine.SESSION);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject3 = new JSONObject();
        if (StringUtils.isEmpty(string)) {
            return;
        }
        jSONObject3.put("api", (Object) string);
        jSONObject3.put("v", (Object) string2);
        if (intValue > 0) {
            jSONObject3.put(MspGlobalDefine.SESSION, (Object) 1);
        }
        jSONObject3.put("data", (Object) jSONObject);
        if (jSONObject2 != null) {
            jSONObject3.put("headers", (Object) jSONObject2);
        }
        if (z) {
            HashMap hashMap = new HashMap();
            hashMap.put("prefetch", true);
            hashMap.put("prefetchTimeout", 20000);
            jSONObject3.put("options", (Object) hashMap);
        }
        MtopModule.requestWithParser(new g.c(null, jSONObject3, null), iRemoteBaseListener, null);
    }
}
