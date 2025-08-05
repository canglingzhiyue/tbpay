package com.taobao.themis.pub_kit.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.infoflow.protocol.subservice.base.IJsBridgeService;
import java.util.Map;
import tb.kge;
import tb.lcu;
import tb.lkn;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* loaded from: classes9.dex */
    public interface a {
        void onResult(boolean z);
    }

    /* loaded from: classes9.dex */
    public interface b {
        void onResult(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes9.dex */
    public interface c {
        void a(JSONObject jSONObject);

        void a(String str);
    }

    /* loaded from: classes9.dex */
    public interface d {
        void onResult(boolean z);
    }

    static {
        kge.a(-1453465899);
    }

    public static void a(final Context context, String str, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1083b842", new Object[]{context, str, aVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("guideReplaceMiniAppId", (Object) str);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("miniAppBizParam", (Object) jSONObject.toJSONString());
        jSONObject2.put("business", (Object) "miniApp");
        a("miniApp.request", jSONObject2, new c() { // from class: com.taobao.themis.pub_kit.utils.g.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.pub_kit.utils.g.c
            public void a(JSONObject jSONObject3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject3});
                    return;
                }
                if (com.taobao.themis.utils.f.a(context)) {
                    Log.e("TBHomeUtils", "miniApp.request: " + jSONObject3.toJSONString());
                }
                if (aVar == null) {
                    return;
                }
                if (jSONObject3.containsKey("homePagePopDatas") && jSONObject3.getJSONArray("homePagePopDatas") != null && jSONObject3.getJSONArray("homePagePopDatas").size() > 0) {
                    aVar.onResult(true);
                } else {
                    aVar.onResult(false);
                }
            }

            @Override // com.taobao.themis.pub_kit.utils.g.c
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                if (com.taobao.themis.utils.f.a(context)) {
                    Log.e("TBHomeUtils", "miniApp.request error: " + str2);
                }
                a aVar2 = aVar;
                if (aVar2 == null) {
                    return;
                }
                aVar2.onResult(false);
            }
        });
    }

    public static void a(final Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80fb0e9", new Object[]{context, dVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("business", (Object) "miniApp");
        a("miniApp.getConfig", jSONObject, new c() { // from class: com.taobao.themis.pub_kit.utils.g.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.pub_kit.utils.g.c
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                if (com.taobao.themis.utils.f.a(context)) {
                    Log.e("TBHomeUtils", "miniApp.getConfig: " + jSONObject2.toJSONString());
                }
                if (dVar == null) {
                    return;
                }
                if (jSONObject2 != null && jSONObject2.containsKey("isNewMiniAppReplace")) {
                    dVar.onResult(jSONObject2.getBoolean("isNewMiniAppReplace").booleanValue());
                } else {
                    dVar.onResult(false);
                }
            }

            @Override // com.taobao.themis.pub_kit.utils.g.c
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                if (com.taobao.themis.utils.f.a(context)) {
                    Log.e("TBHomeUtils", "miniApp.getConfig error: " + str);
                }
                d dVar2 = dVar;
                if (dVar2 == null) {
                    return;
                }
                dVar2.onResult(false);
            }
        });
    }

    public static void a(final Context context, String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10842ca1", new Object[]{context, str, bVar});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sectionBizCode", (Object) "icon_and_miniapp_nomore_2019_v1");
        jSONObject.put("domain", (Object) "miniApp");
        jSONObject.put("id", (Object) str);
        a("HSharedData.findSmartContentInfo", jSONObject, new c() { // from class: com.taobao.themis.pub_kit.utils.g.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.themis.pub_kit.utils.g.c
            public void a(JSONObject jSONObject2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject2});
                    return;
                }
                if (com.taobao.themis.utils.f.a(context)) {
                    Log.e("TBHomeUtils", "HSharedData.findSmartContentInfo: " + jSONObject2.toJSONString());
                }
                if (bVar == null || jSONObject2 == null || !jSONObject2.containsKey(MtopModule.KEY_PAGE_INDEX)) {
                    return;
                }
                if (!TextUtils.equals(jSONObject2.getString(MtopModule.KEY_PAGE_INDEX), "0")) {
                    bVar.onResult(true);
                } else {
                    bVar.onResult(false);
                }
            }

            @Override // com.taobao.themis.pub_kit.utils.g.c
            public void a(String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                    return;
                }
                if (com.taobao.themis.utils.f.a(context)) {
                    Log.e("TBHomeUtils", "HSharedData.findSmartContentInfo error: " + str2);
                }
                if (bVar == null) {
                    return;
                }
                if (TextUtils.equals("-3", str2)) {
                    bVar.onResult(true);
                } else {
                    bVar.onResult(false);
                }
            }
        });
    }

    private static void a(final String str, final JSONObject jSONObject, final c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15ca8eac", new Object[]{str, jSONObject, cVar});
        } else {
            lcu.a().a().a(com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.impl.bridge.b.INFO_FLOW_WV_PLUGIN_NAME, new lkn.b() { // from class: com.taobao.themis.pub_kit.utils.g.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.lkn.b
                public String a() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("aff6e538", new Object[]{this}) : "newface_home_sub";
                }

                @Override // tb.lkn.b
                public String b() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("367c9fd7", new Object[]{this}) : str;
                }

                @Override // tb.lkn.b
                public JSONObject c() {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? (JSONObject) ipChange2.ipc$dispatch("97ef1e8a", new Object[]{this}) : jSONObject;
                }
            }, new IJsBridgeService.a.InterfaceC0670a() { // from class: com.taobao.themis.pub_kit.utils.g.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.InterfaceC0670a
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    c cVar2 = c.this;
                    if (cVar2 == null) {
                        return;
                    }
                    cVar2.a(str2);
                }

                @Override // com.taobao.infoflow.protocol.subservice.base.IJsBridgeService.a.InterfaceC0670a
                public void a(Map<String, Object> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                    } else if (map == null || c.this == null) {
                    } else {
                        Object obj = map.get("data");
                        if (obj == null) {
                            c.this.a((String) null);
                        }
                        if (obj instanceof JSONObject) {
                            c.this.a((JSONObject) obj);
                        } else {
                            c.this.a(JSON.parseObject(obj.toString()));
                        }
                    }
                }
            });
        }
    }
}
