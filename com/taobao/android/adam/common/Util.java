package com.taobao.android.adam.common;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.orange.OrangeConfig;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.bny;
import tb.dkx;
import tb.dle;
import tb.dlh;
import tb.dll;
import tb.hsz;
import tb.kge;

/* loaded from: classes4.dex */
public class Util {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VIEW_ENGINE = "ViewEngine";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface LoadingType {
        public static final String API_HIDE = "hideLoading";
        public static final String API_SHOW = "showLoading";
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface TaoSettingType {
        public static final String AUTO_PLAY_VIDEO = "autoPlayVideo";
        public static final String TAO_PASS_WORD_CUT_OPEN = "taoPassWordCutOpen";
    }

    static {
        kge.a(204120089);
    }

    public static JSONObject a(String str, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("8dd80343", new Object[]{str, dXRuntimeContext});
        }
        if (!StringUtils.isEmpty(str) && dXRuntimeContext != null && dXRuntimeContext.a() != null) {
            return a(str, a(dXRuntimeContext));
        }
        return null;
    }

    public static JSONObject a(String str, com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7c4f91c8", new Object[]{str, bVar});
        }
        if (bVar == null) {
            return null;
        }
        IDMComponent b = bVar.b(str);
        if (b != null) {
            return b.getContainerInfo();
        }
        JSONObject b2 = b(str, bVar);
        com.taobao.android.ultron.common.model.a c = c(b2 == null ? null : b2.getString("type"), bVar);
        if (c == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) c.f15730a);
        jSONObject.put("name", (Object) c.c);
        jSONObject.put("version", (Object) c.e);
        jSONObject.put("url", (Object) c.d);
        jSONObject.put("md5", (Object) c.f);
        return jSONObject;
    }

    public static JSONObject b(String str, com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("437edde7", new Object[]{str, bVar});
        }
        if (!StringUtils.isEmpty(str) && bVar != null && bVar.o() != null) {
            return bVar.o().getJSONObject(str);
        }
        return null;
    }

    public static com.taobao.android.ultron.common.model.a c(String str, com.taobao.android.ultron.datamodel.imp.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.common.model.a) ipChange.ipc$dispatch("21288f60", new Object[]{str, bVar});
        }
        if (!StringUtils.isEmpty(str) && bVar != null && bVar.d() != null && !bVar.d().isEmpty()) {
            for (com.taobao.android.ultron.common.model.a aVar : bVar.d()) {
                if (aVar.f15730a != null && aVar.f15730a.contains(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1 == 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
        return r0.b().a(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r6, java.lang.String r7) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.adam.common.Util.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r3] = r7
            java.lang.String r6 = "61b6362e"
            java.lang.Object r6 = r0.ipc$dispatch(r6, r1)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L1c:
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r1 = "mytaobao"
            com.taobao.global.setting.c r0 = com.taobao.global.setting.c.a(r0, r1)
            if (r0 == 0) goto L63
            r1 = -1
            int r4 = r7.hashCode()     // Catch: java.lang.Throwable -> L63
            r5 = 1314173112(0x4e54b0b8, float:8.9208781E8)
            if (r4 == r5) goto L43
            r5 = 2053839983(0x7a6b1c6f, float:3.0519162E35)
            if (r4 == r5) goto L38
            goto L4c
        L38:
            java.lang.String r4 = "taoPassWordCutOpen"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.Throwable -> L63
            if (r7 == 0) goto L4c
            r1 = 0
            goto L4c
        L43:
            java.lang.String r4 = "autoPlayVideo"
            boolean r7 = r7.equals(r4)     // Catch: java.lang.Throwable -> L63
            if (r7 == 0) goto L4c
            r1 = 1
        L4c:
            if (r1 == 0) goto L5a
            if (r1 == r3) goto L51
            goto L63
        L51:
            tb.ksz r7 = r0.b()     // Catch: java.lang.Throwable -> L63
            boolean r6 = r7.a(r6)     // Catch: java.lang.Throwable -> L63
            return r6
        L5a:
            tb.ksz r6 = r0.b()     // Catch: java.lang.Throwable -> L63
            boolean r6 = r6.c(r3)     // Catch: java.lang.Throwable -> L63
            return r6
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.adam.common.Util.a(android.content.Context, java.lang.String):boolean");
    }

    public static com.taobao.android.ultron.datamodel.imp.b a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.ultron.datamodel.imp.b) ipChange.ipc$dispatch("96a15f23", new Object[]{dXRuntimeContext});
        }
        bny b = b(dXRuntimeContext);
        if (b == null) {
            return null;
        }
        return b.d().a();
    }

    public static bny b(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bny) ipChange.ipc$dispatch("fcac399f", new Object[]{dXRuntimeContext});
        }
        Object a2 = dXRuntimeContext == null ? null : dXRuntimeContext.a();
        if (a2 instanceof Map) {
            Object obj = ((Map) a2).get("ViewEngine");
            if (obj instanceof bny) {
                return (bny) obj;
            }
        }
        return null;
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f32d068", new Object[]{jSONObject, jSONObject2});
        } else if (jSONObject == null || jSONObject2 == null) {
        } else {
            hsz.a(jSONObject, jSONObject2);
        }
    }

    public static void a(Context context, DinamicXEngine dinamicXEngine, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed37c91b", new Object[]{context, dinamicXEngine, str});
        } else if (context == null) {
        } else {
            dlh dlhVar = new dlh(str, new JSONObject());
            dle dleVar = new dle();
            dleVar.a(context);
            dinamicXEngine.l().a(dlhVar, dleVar, new dll() { // from class: com.taobao.android.adam.common.Util.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dll
                public void callback(String str2, dkx dkxVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str2, dkxVar});
                    }
                }
            });
        }
    }

    public static void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{str, map});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Adam", 2201, "Page_Adam_" + str, null, null, map).build());
    }

    public static HashMap<String, String> a(String str, String str2, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("c5122810", new Object[]{str, str2, dXRuntimeContext});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("from", str);
        hashMap.put("eventName", str2);
        String str3 = "";
        hashMap.put("bizCode", dXRuntimeContext == null ? str3 : dXRuntimeContext.A());
        if (dXRuntimeContext != null && dXRuntimeContext.c() != null) {
            str3 = dXRuntimeContext.c().f11925a;
        }
        hashMap.put("template", str3);
        return hashMap;
    }

    public static void a(Object obj, JSONObject jSONObject) {
        Object[] objArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5963812c", new Object[]{obj, jSONObject});
        } else if (jSONObject != null && obj != null && obj.getClass().isArray()) {
            for (Object obj2 : (Object[]) obj) {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.startsWith("ultronGlobalComponentKey:") && str.length() > 25) {
                        jSONObject.put("componentKeys", (Object) str.substring(25).split(","));
                    } else if (str.startsWith("ultronShowloading:") && str.length() > 18) {
                        jSONObject.put("showLoading", (Object) str.substring(18));
                    } else if (str.startsWith("ultronRendertype:") && str.length() > 17) {
                        jSONObject.put("renderType", (Object) str.substring(17));
                    } else if (str.startsWith("readCurTemplate:") && str.length() > 16) {
                        jSONObject.put("readCurTemplate", (Object) str.substring(16));
                    }
                }
            }
        }
    }

    public static JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("709f7788", new Object[0]);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("showLoading", (Object) "false");
        jSONObject.put("renderType", (Object) "downloadFirst");
        jSONObject.put("readCurTemplate", (Object) "true");
        return jSONObject;
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("adam_android", "downloadOptimize", "false"));
    }
}
