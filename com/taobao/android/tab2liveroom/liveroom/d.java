package com.taobao.android.tab2liveroom.liveroom;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.t;
import com.taobao.tao.flexbox.layoutmanager.core.w;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f15292a;

    static {
        kge.a(42474913);
        f15292a = new String[]{"mtop.tblive.recommend.video.simple.query", "mtop.tblive.live.recommend.home", "mtop.tblive.recommend.updown.lives", "mtop.tblive.live.detail.query"};
    }

    public static void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4afae26", new Object[]{aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", "recommendHomeDataEmpty");
        w.a("liveBlackScreen", JSON.toJSONString(hashMap));
        aVar.h().a(t.MODULE_LIVE, "liveBlackScreen", "recommendHomeDataEmpty", hashMap);
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4394827", new Object[]{aVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("reason", "updownLivesDataEmpty");
        w.a("liveUnscrollable", JSON.toJSONString(hashMap));
        aVar.h().a(t.MODULE_LIVE, "liveUnscrollable", "updownLivesDataEmpty", hashMap);
    }

    public static void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{str, new Boolean(z)});
        } else if (!Arrays.asList(f15292a).contains(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) "TNode");
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19999);
            jSONObject.put("arg1", (Object) str);
            String str2 = "success";
            jSONObject.put("arg2", (Object) (z ? str2 : "fail"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("api", (Object) str);
            if (!z) {
                str2 = "fail";
            }
            jSONObject2.put("status", (Object) str2);
            jSONObject.put("args", (Object) jSONObject2);
            TrackerModule.commit(new g.c(null, jSONObject, null), false);
        }
    }

    public static void a(a aVar, Object obj) {
        NetResponse netResponse;
        org.json.JSONObject dataJsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eea082", new Object[]{aVar, obj});
        } else if (!(obj instanceof NetResponse) || (dataJsonObject = (netResponse = (NetResponse) obj).getDataJsonObject()) == null) {
        } else {
            String api = netResponse.getApi();
            a(api, true);
            if (api.equals("mtop.tblive.live.recommend.home")) {
                if (!dataJsonObject.has("liveUrlList") || dataJsonObject.isNull("liveUrlList")) {
                    a(aVar);
                    return;
                }
                try {
                    Object obj2 = dataJsonObject.get("liveUrlList");
                    if (!(obj2 instanceof JSONArray) || ((JSONArray) obj2).length() != 0) {
                        return;
                    }
                    a(aVar);
                } catch (JSONException unused) {
                    a(aVar);
                }
            } else if (!api.equals("mtop.tblive.recommend.updown.lives")) {
            } else {
                if (!dataJsonObject.has("model") || dataJsonObject.isNull("model")) {
                    b(aVar);
                    return;
                }
                try {
                    Object obj3 = dataJsonObject.get("model");
                    if (!(obj3 instanceof JSONArray) || ((JSONArray) obj3).length() != 0) {
                        return;
                    }
                    b(aVar);
                } catch (JSONException unused2) {
                    b(aVar);
                }
            }
        }
    }

    public static void b(a aVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb01c43", new Object[]{aVar, obj});
        } else if (!(obj instanceof NetResponse)) {
        } else {
            String api = ((NetResponse) obj).getApi();
            a(api, false);
            if (api.equals("mtop.tblive.live.recommend.home")) {
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "recommendHomeRequestError");
                w.a("liveBlackScreen", hashMap.toString());
                aVar.h().a(t.MODULE_LIVE, "liveBlackScreen", "recommendHomeRequestError", hashMap);
            } else if (!api.equals("mtop.tblive.recommend.updown.lives")) {
            } else {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("reason", "updownLivesRequestError");
                w.a("liveUnscrollable", hashMap2.toString());
                aVar.h().a(t.MODULE_LIVE, "liveUnscrollable", "updownLivesRequestError", hashMap2);
            }
        }
    }

    public static void a(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f6fda70", new Object[]{aVar, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("liveid", str);
        }
        hashMap.put("reason", "playerError");
        w.a("liveBlackScreen", JSON.toJSONString(hashMap));
        aVar.h().a(t.MODULE_LIVE, "liveBlackScreen", "playerError", hashMap);
    }
}
