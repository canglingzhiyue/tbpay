package com.alibaba.android.ultron.vfw.weex2.highPerformance.management;

import android.content.Context;
import android.taobao.windvane.export.prerender.e;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridDestroyPolicy;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.p;
import java.util.HashMap;
import java.util.List;
import kotlin.t;
import tb.abm;
import tb.adg;
import tb.adh;
import tb.iro;
import tb.jqg;
import tb.jqh;
import tb.jqi;
import tb.kge;
import tb.rul;

/* loaded from: classes2.dex */
public class c implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private abm b;

    /* renamed from: a  reason: collision with root package name */
    private adg f2772a = new adg();
    private HashMap<String, JSONObject> c = new HashMap<>();
    private HashMap<String, JSONObject> d = new HashMap<>();
    private HashMap<String, JSONObject> e = new HashMap<>();

    static {
        kge.a(-1889098667);
        kge.a(718836347);
        kge.a(1900527407);
        if (jqh.a()) {
            jqh.b(new Runnable() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    adh.a();
                    jqg.b("UltronTradeHybridPreRenderManager", "延迟执行UltronTradeHybridHelper.registerWeexModule");
                }
            }, jqi.a("newUltron_container", "registerWeexModuleDelayMills", 0L));
        } else {
            adh.a();
        }
    }

    public c(abm abmVar) {
        this.b = abmVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0094, code lost:
        if (r13.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage.ON_RENDER_START) != false) goto L11;
     */
    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.management.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(java.lang.String r13, java.lang.String r14, com.alibaba.fastjson.JSONObject r15) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.c.a(java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{this, str, str2})).booleanValue() : iro.b(str, str2);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstance", "preRenderUrl is empty");
        } else {
            abm abmVar = this.b;
            if (abmVar == null) {
                UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstance", "mConfig is null");
                return;
            }
            com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a c = abmVar.c(str);
            if (c == null) {
                UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstance", "model is null");
            } else {
                this.f2772a.a(context, c);
            }
        }
    }

    public void a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18de974", new Object[]{this, context, str, str2});
            return;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "mConfig is null");
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
        if (b == null || b.b == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar : b.b) {
            if (aVar != null) {
                if (!b(str, aVar.f2786a)) {
                    jqg.b("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", String.format("%s-%s switcher is off", str, aVar.f2786a));
                } else if (!TextUtils.equals(aVar.d, str2)) {
                    UnifyLog.a("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", "no match stage");
                } else {
                    a(context, aVar.b);
                }
            }
        }
    }

    public void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{this, context, str, str2, str3});
            return;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", String.format("%s_%s: mConfig is null", str2, str));
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str2);
        if (b == null || b.b == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", String.format("%s_%s: sceneModel or sceneModel.preRenderModels is null", str2, str));
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar : b.b) {
            if (aVar != null) {
                if (!b(str2, aVar.f2786a)) {
                    jqg.b("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", String.format("%s-%s switcher is off", str2, aVar.f2786a));
                } else if (!TextUtils.equals(aVar.d, str3)) {
                    UnifyLog.a("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", String.format("no match stage: %s", aVar.d));
                } else if (!TextUtils.equals(aVar.f2786a, str)) {
                    UnifyLog.a("UltronTradeHybridPreRenderManager.generatePreRenderInstanceByScene", String.format("no match bizName: %s", aVar.f2786a));
                } else {
                    a(context, aVar.b);
                }
            }
        }
    }

    public Object a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("17307540", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.getPreRenderInstance", "preRenderUrl is empty");
            return null;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.getPreRenderInstance", "mConfig is null");
            return null;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a c = abmVar.c(str);
        if (c == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.getPreRenderInstance", "model is null");
            return null;
        }
        return this.f2772a.a(c);
    }

    public Object e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("73a838bc", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.getBackgroundPreRenderInstance", "preRenderUrl is empty");
            return null;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.getBackgroundPreRenderInstance", "mConfig is null");
            return null;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a c = abmVar.c(str);
        if (c == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.getBackgroundPreRenderInstance", "model is null");
            return null;
        }
        return this.f2772a.c(c);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstance", "preRenderUrl is empty");
        } else {
            abm abmVar = this.b;
            if (abmVar == null) {
                UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstance", "mConfig is null");
                return;
            }
            com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a c = abmVar.c(str);
            if (c == null) {
                UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstance", "model is null");
            } else {
                this.f2772a.b(c);
            }
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByScene", "mConfig is null");
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
        if (b == null || b.b == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByScene", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar : b.b) {
            if (aVar != null) {
                if (!b(str, aVar.f2786a)) {
                    jqg.b("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByScene", String.format("%s-%s switcher is off", str, aVar.f2786a));
                } else {
                    b(aVar.b);
                }
            }
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            a((String) null, str);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByPolicy", String.format("%s: mConfig is null", str2));
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str2);
        if (b == null || b.b == null) {
            UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByPolicy", String.format("%s: sceneModel or sceneModel.preRenderModels is null", str2));
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar : b.b) {
            if (aVar != null) {
                if (!b(str2, aVar.f2786a)) {
                    jqg.b("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByPolicy", String.format("%s-%s switcher is off", str2, aVar.f2786a));
                } else if (!TextUtils.equals(aVar.f, "none")) {
                    if (TextUtils.equals(aVar.f, "destroy")) {
                        b(aVar.b);
                    } else if (!TextUtils.equals(aVar.f, UltronTradeHybridDestroyPolicy.DESTROY_ON_LOW_MEMORY)) {
                        if (TextUtils.equals(aVar.f, UltronTradeHybridDestroyPolicy.DESTROY_ON_STAGE)) {
                            if (aVar.g != null && TextUtils.equals(str, aVar.g)) {
                                b(aVar.b);
                            }
                        } else {
                            UnifyLog.d("UltronTradeHybridPreRenderManager.destroyPreRenderInstanceByPolicy", "destroyPolicy invalid");
                        }
                    }
                }
            }
        }
    }

    public void a(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5963812c", new Object[]{this, obj, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.containsKey("context")) {
                jSONObject.remove("context");
            }
            a(this.c, obj, jSONObject);
        }
    }

    public void b(Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a99d40b", new Object[]{this, obj, jSONObject});
        } else if (jSONObject == null) {
        } else {
            if (jSONObject.containsKey("context")) {
                jSONObject.remove("context");
            }
            a(this.d, obj, jSONObject);
        }
    }

    private void a(HashMap<String, JSONObject> hashMap, Object obj, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddb8b469", new Object[]{this, hashMap, obj, jSONObject});
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                hashMap.put(str, jSONObject);
                return;
            }
        }
        if (!(obj instanceof p)) {
            return;
        }
        p pVar = (p) obj;
        Object tag = pVar.getTag("bizId");
        if (tag instanceof String) {
            String str2 = (String) tag;
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put(str2, jSONObject);
                return;
            }
        }
        hashMap.put(String.valueOf(pVar.getInstanceId()), jSONObject);
    }

    public JSONObject a(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("22418c45", new Object[]{this, pVar}) : a(this.c, pVar);
    }

    public JSONObject b(p pVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3cb28564", new Object[]{this, pVar}) : a(this.d, pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.fastjson.JSONObject a(java.util.HashMap<java.lang.String, com.alibaba.fastjson.JSONObject> r4, com.taobao.android.weex_framework.p r5) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.android.ultron.vfw.weex2.highPerformance.management.c.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L1b
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            r2 = 1
            r1[r2] = r4
            r4 = 2
            r1[r4] = r5
            java.lang.String r4 = "e694a42"
            java.lang.Object r4 = r0.ipc$dispatch(r4, r1)
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4
            return r4
        L1b:
            java.lang.String r0 = "bizId"
            java.lang.Object r0 = r5.getTag(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L2e
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L2e
            goto L36
        L2e:
            int r5 = r5.getInstanceId()
            java.lang.String r0 = java.lang.String.valueOf(r5)
        L36:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L4a
            boolean r5 = r4.containsKey(r0)
            if (r5 != 0) goto L43
            goto L4a
        L43:
            java.lang.Object r4 = r4.remove(r0)
            com.alibaba.fastjson.JSONObject r4 = (com.alibaba.fastjson.JSONObject) r4
            return r4
        L4a:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.c.a(java.util.HashMap, com.taobao.android.weex_framework.p):com.alibaba.fastjson.JSONObject");
    }

    public void b(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d304613", new Object[]{this, str, str2, jSONObject});
            return;
        }
        abm abmVar = this.b;
        if (abmVar == null) {
            jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "mConfig is null");
            return;
        }
        com.alibaba.android.ultron.vfw.weex2.highPerformance.model.e b = abmVar.b(str);
        if (b == null || b.b == null) {
            jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "sceneModel or sceneModel.preRenderModels is null");
            return;
        }
        for (com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar : b.b) {
            if (aVar != null) {
                if (!b(str, aVar.f2786a)) {
                    jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", String.format("%s-%s switcher is off", str, aVar.f2786a));
                } else if (!TextUtils.equals(aVar.d, str2)) {
                    jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "no match stage");
                } else {
                    a(aVar, jSONObject);
                }
            }
        }
    }

    public void a(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76871473", new Object[]{this, aVar, jSONObject});
            return;
        }
        try {
            String str = aVar.j;
            List<String> list = aVar.k;
            String str2 = "default";
            if (jSONObject != null) {
                if (!TextUtils.isEmpty(jSONObject.getString("themisPreRenderUrl"))) {
                    str = jSONObject.getString("themisPreRenderUrl");
                }
                if (!TextUtils.isEmpty(jSONObject.getString("themisQueryIgnores"))) {
                    list = JSONObject.parseArray(jSONObject.getString("themisQueryIgnores"), String.class);
                }
                if (!TextUtils.isEmpty(jSONObject.getString("themisBizName"))) {
                    str2 = jSONObject.getString("themisBizName");
                }
            }
            if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
                if (jSONObject != null) {
                    this.e.put(str2, jSONObject);
                } else {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("themisPreRenderUrl", (Object) str);
                    jSONObject2.put("themisQueryIgnores", (Object) list);
                    this.e.put(str2, jSONObject2);
                }
                android.taobao.windvane.export.prerender.d.INSTANCE.a(new e.a().a(str).a(2).a(list).a(), new rul<Boolean, t>() { // from class: com.alibaba.android.ultron.vfw.weex2.highPerformance.management.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.t, java.lang.Object] */
                    @Override // tb.rul
                    /* renamed from: invoke */
                    public /* synthetic */ t mo2421invoke(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("c9923577", new Object[]{this, bool}) : a(bool);
                    }

                    public t a(Boolean bool) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return (t) ipChange2.ipc$dispatch("f78e669a", new Object[]{this, bool});
                        }
                        jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "preRender result: " + bool);
                        return null;
                    }
                });
                return;
            }
            jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "tmsPreRenderUrl or tmsQueryIgnoreList is invalid");
        } catch (Throwable th) {
            jqg.a("UltronTradeHybridPreRenderManager", "preRenderTMSInstance:", "onError:" + th.toString());
        }
    }

    public JSONObject f(String str) {
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("427d5997", new Object[]{this, str});
        }
        if (str.isEmpty() || (hashMap = this.e) == null || hashMap.isEmpty() || !this.e.containsKey(str)) {
            return null;
        }
        return this.e.get(str);
    }
}
