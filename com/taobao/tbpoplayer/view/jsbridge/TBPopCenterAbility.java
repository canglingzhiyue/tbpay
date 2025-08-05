package com.taobao.tbpoplayer.view.jsbridge;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.mulitenv.EnvironmentSwitcher;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.track.UserResultTrack;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsPopCenterAbility;
import com.taobao.android.abilityidl.ability.PopCenterCheckSuccessResult;
import com.taobao.android.abilityidl.ability.PopCenterCloseSuccessResult;
import com.taobao.android.abilityidl.ability.PopCenterTriggerSuccessResult;
import com.taobao.android.abilityidl.ability.cj;
import com.taobao.android.abilityidl.ability.ck;
import com.taobao.android.abilityidl.ability.cl;
import com.taobao.android.abilityidl.ability.dt;
import com.taobao.android.abilityidl.ability.du;
import com.taobao.android.abilityidl.ability.dv;
import com.taobao.android.abilityidl.ability.dw;
import com.taobao.android.external.UCPManager;
import com.taobao.tbpoplayer.util.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.alq;
import tb.alr;
import tb.als;
import tb.alu;
import tb.caa;
import tb.cab;
import tb.cac;
import tb.cag;
import tb.fki;
import tb.gml;
import tb.kge;
import tb.qoa;

/* loaded from: classes9.dex */
public class TBPopCenterAbility extends AbsPopCenterAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f22272a;
    private dw b;
    private String c;
    private long d;
    private long e;
    private boolean g;
    private boolean j;
    private boolean k;
    private boolean l;
    private String m;
    private JSONObject f = new JSONObject();
    private AtomicBoolean h = new AtomicBoolean(false);
    private AtomicBoolean i = new AtomicBoolean(false);

    static {
        kge.a(798796115);
    }

    public static /* synthetic */ Object ipc$super(TBPopCenterAbility tBPopCenterAbility, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$OnqokS4Gr8KwVLmcbYV_MjtRRiQ(TBPopCenterAbility tBPopCenterAbility, BaseConfigItem baseConfigItem, cl clVar) {
        tBPopCenterAbility.a(baseConfigItem, clVar);
    }

    /* renamed from: lambda$UXm_Rt3bSXNiO79-XUS5Jeg5nb4 */
    public static /* synthetic */ void m1467lambda$UXm_Rt3bSXNiO79XUS5Jeg5nb4(TBPopCenterAbility tBPopCenterAbility, boolean z, String str, JSONObject jSONObject, cl clVar, BaseConfigItem baseConfigItem) {
        tBPopCenterAbility.a(z, str, jSONObject, clVar, baseConfigItem);
    }

    public static /* synthetic */ void lambda$XPVitXVN7FoKWKMG1zrHQ6Bvxgg(TBPopCenterAbility tBPopCenterAbility, cl clVar) {
        tBPopCenterAbility.a(clVar);
    }

    /* renamed from: lambda$ai-gWv6oy47BUuwcFY2hIOoqS_g */
    public static /* synthetic */ void m1468lambda$aigWv6oy47BUuwcFY2hIOoqS_g(du duVar, cj cjVar) {
        a(duVar, cjVar);
    }

    public static /* synthetic */ void lambda$cgpuUPRPFdtSZwb6akUIROGbhMo(TBPopCenterAbility tBPopCenterAbility, cl clVar, BaseConfigItem baseConfigItem, boolean z, String str, JSONObject jSONObject) {
        tBPopCenterAbility.a(clVar, baseConfigItem, z, str, jSONObject);
    }

    public static /* synthetic */ void lambda$dwCgY2EYTANJ0SFJH91feYBobOw(TBPopCenterAbility tBPopCenterAbility, dv dvVar, gml gmlVar) {
        tBPopCenterAbility.a(dvVar, gmlVar);
    }

    /* renamed from: lambda$t0HlO-O0Jx2QF4NZPnJbFcov9Y8 */
    public static /* synthetic */ void m1469lambda$t0HlOO0Jx2QF4NZPnJbFcov9Y8(TBPopCenterAbility tBPopCenterAbility, ck ckVar) {
        tBPopCenterAbility.a(ckVar);
    }

    /* renamed from: lambda$urPemne_pO6kc14BdJEJ-eFeCmY */
    public static /* synthetic */ void m1470lambda$urPemne_pO6kc14BdJEJeFeCmY(TBPopCenterAbility tBPopCenterAbility, dt dtVar, gml gmlVar) {
        tBPopCenterAbility.a(dtVar, gmlVar);
    }

    public static /* synthetic */ String a(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("48062d3c", new Object[]{tBPopCenterAbility}) : tBPopCenterAbility.f22272a;
    }

    public static /* synthetic */ void a(TBPopCenterAbility tBPopCenterAbility, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5af8030", new Object[]{tBPopCenterAbility, str, new Boolean(z), str2});
        } else {
            tBPopCenterAbility.a(str, z, str2);
        }
    }

    public static /* synthetic */ void b(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("905e2c65", new Object[]{tBPopCenterAbility});
        } else {
            tBPopCenterAbility.c();
        }
    }

    public static /* synthetic */ void c(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ad3cce6", new Object[]{tBPopCenterAbility});
        } else {
            tBPopCenterAbility.b();
        }
    }

    public static /* synthetic */ void d(TBPopCenterAbility tBPopCenterAbility) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5496d67", new Object[]{tBPopCenterAbility});
        } else {
            tBPopCenterAbility.d();
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void setProperties(als alsVar, final dv dvVar, final gml gmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23764771", new Object[]{this, alsVar, dvVar, gmlVar});
        } else {
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$dwCgY2EYTANJ0SFJH91feYBobOw
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.lambda$dwCgY2EYTANJ0SFJH91feYBobOw(TBPopCenterAbility.this, dvVar, gmlVar);
                }
            });
        }
    }

    public /* synthetic */ void a(dv dvVar, gml gmlVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("991869d5", new Object[]{this, dvVar, gmlVar});
            return;
        }
        try {
            if (dvVar == null) {
                gmlVar.a(com.alibaba.ability.result.a$a.b("setPropertiesParamsNull"));
            } else if (TextUtils.isEmpty(dvVar.f8827a)) {
                gmlVar.a(com.alibaba.ability.result.a$a.b("setPropertiesParamsCodeNull"));
            } else {
                this.f22272a = dvVar.f8827a;
                this.b = dvVar.c;
                this.c = !TextUtils.isEmpty(dvVar.d) ? dvVar.d : "";
                if (this.b == null) {
                    z = false;
                }
                this.g = z;
                this.m = UUID.randomUUID().toString().replace("-", "");
                this.f = new JSONObject();
                this.f.put("code", (Object) this.f22272a);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.setProperties.error", th);
            if (gmlVar == null) {
                return;
            }
            gmlVar.a(com.alibaba.ability.result.a$a.b("setPropertiesParamsCatchError"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void checkShouldPop(als alsVar, final du duVar, final cj cjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab455f7", new Object[]{this, alsVar, duVar, cjVar});
        } else {
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$ai-gWv6oy47BUuwcFY2hIOoqS_g
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.m1468lambda$aigWv6oy47BUuwcFY2hIOoqS_g(du.this, cjVar);
                }
            });
        }
    }

    public static /* synthetic */ void a(du duVar, cj cjVar) {
        IpChange ipChange = $ipChange;
        int i = 2;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5598771a", new Object[]{duVar, cjVar});
            return;
        }
        try {
            List<String> list = duVar.f8826a;
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TBPopHubAbility.checkShouldPop.codes=" + list);
            HashMap hashMap = new HashMap();
            int c = com.taobao.tbpoplayer.info.a.a().c();
            List<String> r = com.taobao.tbpoplayer.info.a.a().r();
            List<String> z = com.taobao.tbpoplayer.info.a.a().z();
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    if (c == i2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("checkResult", (Object) true);
                        jSONObject.put("reason", (Object) "PASS_BY_TRIGGER_MODE");
                        hashMap.put(str, jSONObject);
                    } else if (c == i) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("checkResult", (Object) false);
                        jSONObject2.put("reason", (Object) "FILTER_BY_TRIGGER_MODE");
                        hashMap.put(str, jSONObject2);
                    } else if (r != null && r.contains(str)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("checkResult", (Object) true);
                        jSONObject3.put("reason", (Object) "PASS_BY_WHITE_LIST");
                        hashMap.put(str, jSONObject3);
                    } else if (z != null && z.contains(str)) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("checkResult", (Object) false);
                        jSONObject4.put("reason", (Object) "FILTER_BY_BLACK_LIST");
                        hashMap.put(str, jSONObject4);
                    } else {
                        JSONObject jSONObject5 = new JSONObject();
                        UCPManager.a(str, jSONObject5);
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("checkResult", jSONObject5.get("checkResult"));
                        jSONObject6.put("reason", jSONObject5.get("reason"));
                        hashMap.put(str, jSONObject6);
                        i = 2;
                        i2 = 1;
                    }
                }
            }
            PopCenterCheckSuccessResult popCenterCheckSuccessResult = new PopCenterCheckSuccessResult();
            popCenterCheckSuccessResult.codesCheckResult = hashMap;
            cjVar.a(popCenterCheckSuccessResult);
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TBPopHubAbility.checkShouldPop.result=" + JSON.toJSONString(hashMap));
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.checkShouldPop.error", th);
            if (cjVar == null) {
                return;
            }
            cjVar.a(com.alibaba.ability.result.a$a.b("checkShouldPopCatchError"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void triggerPop(als alsVar, final cl clVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f6ea14", new Object[]{this, alsVar, clVar});
        } else {
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$XPVitXVN7FoKWKMG1zrHQ6Bvxgg
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.lambda$XPVitXVN7FoKWKMG1zrHQ6Bvxgg(TBPopCenterAbility.this, clVar);
                }
            });
        }
    }

    public /* synthetic */ void a(final cl clVar) {
        long w;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6b534", new Object[]{this, clVar});
        } else if (this.j) {
            clVar.a(com.alibaba.ability.result.a$a.b("alreadyTriggered"));
        } else {
            this.j = true;
            if (TextUtils.isEmpty(this.f22272a)) {
                clVar.a(com.alibaba.ability.result.a$a.b("triggerParamsCodeNull"));
                return;
            }
            this.d = SystemClock.elapsedRealtime();
            a("triggerStart", (Map<String, String>) null);
            Pair<BaseConfigItem, String> a2 = a();
            if (!TextUtils.isEmpty((CharSequence) a2.second)) {
                a("triggerFail", (String) a2.second);
                clVar.a(com.alibaba.ability.result.a$a.b((String) a2.second));
                return;
            }
            final BaseConfigItem baseConfigItem = (BaseConfigItem) a2.first;
            try {
                String a3 = e.a();
                if ("high".equals(a3)) {
                    w = com.taobao.tbpoplayer.info.a.a().G();
                } else if ("middle".equals(a3)) {
                    w = com.taobao.tbpoplayer.info.a.a().B();
                } else {
                    w = com.taobao.tbpoplayer.info.a.a().w();
                }
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$OnqokS4Gr8KwVLmcbYV_MjtRRiQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        TBPopCenterAbility.lambda$OnqokS4Gr8KwVLmcbYV_MjtRRiQ(TBPopCenterAbility.this, baseConfigItem, clVar);
                    }
                }, w);
                com.alibaba.poplayer.utils.c.c("triggerEvent", this.f22272a, "TBPopHubAbility.trigger.");
                int c = com.taobao.tbpoplayer.info.a.a().c();
                if (c == 1) {
                    if (clVar == null || !this.i.compareAndSet(false, true)) {
                        return;
                    }
                    PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
                    popCenterTriggerSuccessResult.code = this.f22272a;
                    popCenterTriggerSuccessResult.shouldPop = true;
                    popCenterTriggerSuccessResult.restrictCode = "PASS_BY_TRIGGER_MODE";
                    a(baseConfigItem);
                    clVar.a(popCenterTriggerSuccessResult);
                } else if (c == 2) {
                    if (clVar == null || !this.i.compareAndSet(false, true)) {
                        return;
                    }
                    PopCenterTriggerSuccessResult popCenterTriggerSuccessResult2 = new PopCenterTriggerSuccessResult();
                    popCenterTriggerSuccessResult2.code = this.f22272a;
                    popCenterTriggerSuccessResult2.shouldPop = false;
                    popCenterTriggerSuccessResult2.restrictCode = "FILTER_BY_TRIGGER_MODE";
                    clVar.a(popCenterTriggerSuccessResult2);
                } else {
                    List<String> r = com.taobao.tbpoplayer.info.a.a().r();
                    if (r != null && r.contains(this.f22272a)) {
                        if (clVar == null || !this.i.compareAndSet(false, true)) {
                            return;
                        }
                        PopCenterTriggerSuccessResult popCenterTriggerSuccessResult3 = new PopCenterTriggerSuccessResult();
                        popCenterTriggerSuccessResult3.code = this.f22272a;
                        popCenterTriggerSuccessResult3.shouldPop = true;
                        popCenterTriggerSuccessResult3.restrictCode = "PASS_BY_WHITE_LIST";
                        a(baseConfigItem);
                        clVar.a(popCenterTriggerSuccessResult3);
                        return;
                    }
                    List<String> z = com.taobao.tbpoplayer.info.a.a().z();
                    if (z != null && z.contains(this.f22272a)) {
                        if (clVar == null || !this.i.compareAndSet(false, true)) {
                            return;
                        }
                        PopCenterTriggerSuccessResult popCenterTriggerSuccessResult4 = new PopCenterTriggerSuccessResult();
                        popCenterTriggerSuccessResult4.code = this.f22272a;
                        popCenterTriggerSuccessResult4.shouldPop = false;
                        popCenterTriggerSuccessResult4.restrictCode = "FILTER_BY_BLACK_LIST";
                        clVar.a(popCenterTriggerSuccessResult4);
                        return;
                    }
                    UCPManager.a(this.f22272a, new UCPManager.b() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$cgpuUPRPFdtSZwb6akUIROGbhMo
                        @Override // com.taobao.android.external.UCPManager.b
                        public final void callback(boolean z2, String str, JSONObject jSONObject) {
                            TBPopCenterAbility.lambda$cgpuUPRPFdtSZwb6akUIROGbhMo(TBPopCenterAbility.this, clVar, baseConfigItem, z2, str, jSONObject);
                        }
                    });
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("TBPopHubAbility.triggerPop.error", th);
                if (clVar == null || !this.i.compareAndSet(false, true)) {
                    return;
                }
                PopCenterTriggerSuccessResult popCenterTriggerSuccessResult5 = new PopCenterTriggerSuccessResult();
                popCenterTriggerSuccessResult5.code = this.f22272a;
                popCenterTriggerSuccessResult5.shouldPop = true;
                popCenterTriggerSuccessResult5.restrictCode = "NATIVE_ERROR_DEFAULT_PASS";
                clVar.a(popCenterTriggerSuccessResult5);
            }
        }
    }

    public /* synthetic */ void a(BaseConfigItem baseConfigItem, cl clVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a81703ba", new Object[]{this, baseConfigItem, clVar});
        } else if (this.h.get() || !this.i.compareAndSet(false, true)) {
        } else {
            a("triggerOutOfTime", new HashMap());
            PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
            popCenterTriggerSuccessResult.shouldPop = true;
            popCenterTriggerSuccessResult.code = this.f22272a;
            popCenterTriggerSuccessResult.restrictCode = "COST_OUT_OF_TIME";
            a(baseConfigItem);
            clVar.a(popCenterTriggerSuccessResult);
        }
    }

    public /* synthetic */ void a(final cl clVar, final BaseConfigItem baseConfigItem, final boolean z, final String str, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5b1f34", new Object[]{this, clVar, baseConfigItem, new Boolean(z), str, jSONObject});
        } else {
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$UXm_Rt3bSXNiO79-XUS5Jeg5nb4
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.m1467lambda$UXm_Rt3bSXNiO79XUS5Jeg5nb4(TBPopCenterAbility.this, z, str, jSONObject, clVar, baseConfigItem);
                }
            });
        }
    }

    public /* synthetic */ void a(boolean z, String str, JSONObject jSONObject, cl clVar, BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57027dd0", new Object[]{this, new Boolean(z), str, jSONObject, clVar, baseConfigItem});
            return;
        }
        try {
            String str2 = this.f22272a;
            com.alibaba.poplayer.utils.c.c("triggerEvent", str2, "TBPopHubAbility.checkDisplayWithCode.checkResult=" + z + ".reason=" + str);
            PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
            popCenterTriggerSuccessResult.code = this.f22272a;
            popCenterTriggerSuccessResult.shouldPop = z;
            popCenterTriggerSuccessResult.restrictCode = str;
            this.f = jSONObject;
            if (!z) {
                a(clVar, popCenterTriggerSuccessResult);
            } else if (!this.g) {
                a(clVar, popCenterTriggerSuccessResult);
            } else {
                a(baseConfigItem);
                a(clVar, popCenterTriggerSuccessResult);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.trigger.checkDisplayWithCode.error", th);
            a(clVar, "NATIVE_ERROR_AFTER_CHECK_DEFAULT_PASS");
        }
    }

    private void a(final BaseConfigItem baseConfigItem) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d997a26e", new Object[]{this, baseConfigItem});
        } else if (!this.g || baseConfigItem == null) {
            String str = this.f22272a;
            StringBuilder sb = new StringBuilder();
            sb.append("TBPopHubAbility.triggerPopLayer.notValid.mTemplateRender=");
            sb.append(this.g);
            sb.append(".configItemNotNull=");
            if (baseConfigItem == null) {
                z = false;
            }
            sb.append(z);
            com.alibaba.poplayer.utils.c.c("triggerEvent", str, sb.toString());
        } else {
            com.alibaba.poplayer.trigger.f.a().a(baseConfigItem, this.c, this.f22272a, this.f, new fki() { // from class: com.taobao.tbpoplayer.view.jsbridge.TBPopCenterAbility.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    TBPopCenterAbility.this = this;
                }

                @Override // tb.fki
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    String a2 = TBPopCenterAbility.a(TBPopCenterAbility.this);
                    com.alibaba.poplayer.utils.c.c("triggerEvent", a2, "TBPopHubAbility.trigger.onAction" + str3);
                    if (!str3.equals(UserResultTrack.USER_RESULT_CLICK_ACTION) && !str3.equals("Click")) {
                        return;
                    }
                    TBPopCenterAbility.b(TBPopCenterAbility.this);
                    if (!baseConfigItem.actionCallBack) {
                        return;
                    }
                    TBPopCenterAbility.a(TBPopCenterAbility.this, "click", true, "");
                }

                @Override // tb.cai
                public void a(String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str2});
                        return;
                    }
                    String a2 = TBPopCenterAbility.a(TBPopCenterAbility.this);
                    com.alibaba.poplayer.utils.c.c("triggerEvent", a2, "TBPopHubAbility.trigger.onStartProcessFailed" + str2);
                    if (!baseConfigItem.actionCallBack) {
                        return;
                    }
                    TBPopCenterAbility.a(TBPopCenterAbility.this, "display", false, str2);
                }

                @Override // tb.cai
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        com.alibaba.poplayer.utils.c.c("triggerEvent", TBPopCenterAbility.a(TBPopCenterAbility.this), "TBPopHubAbility.trigger.onViewCreated.");
                    }
                }

                @Override // tb.cai
                public void a(String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("929ad046", new Object[]{this, str2, str3, str4});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.c("triggerEvent", TBPopCenterAbility.a(TBPopCenterAbility.this), "TBPopHubAbility.trigger.onDisplayed.");
                    TBPopCenterAbility.c(TBPopCenterAbility.this);
                    if (!baseConfigItem.actionCallBack) {
                        return;
                    }
                    TBPopCenterAbility.a(TBPopCenterAbility.this, "display", true, "");
                }

                @Override // tb.cai
                public void a(String str2, boolean z2, boolean z3, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e47be646", new Object[]{this, str2, new Boolean(z2), new Boolean(z3), str3, str4});
                        return;
                    }
                    com.alibaba.poplayer.utils.c.c("triggerEvent", TBPopCenterAbility.a(TBPopCenterAbility.this), "TBPopHubAbility.trigger.onClosed.");
                    if (z3) {
                        TBPopCenterAbility.d(TBPopCenterAbility.this);
                        if (!baseConfigItem.actionCallBack) {
                            return;
                        }
                        TBPopCenterAbility.a(TBPopCenterAbility.this, "close", true, str3);
                    } else if (!baseConfigItem.actionCallBack) {
                    } else {
                        TBPopCenterAbility.a(TBPopCenterAbility.this, "display", false, str3);
                    }
                }
            });
        }
    }

    private void a(cl clVar, PopCenterTriggerSuccessResult popCenterTriggerSuccessResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("599483f9", new Object[]{this, clVar, popCenterTriggerSuccessResult});
            return;
        }
        this.h.set(true);
        a(this.d, true);
        if (popCenterTriggerSuccessResult.shouldPop) {
            this.e = SystemClock.elapsedRealtime();
            a("fatiguePass", (Map<String, String>) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("reason", popCenterTriggerSuccessResult.restrictCode);
            a("fatigueRestrict", hashMap);
        }
        if (clVar == null || !this.i.compareAndSet(false, true)) {
            return;
        }
        clVar.a(popCenterTriggerSuccessResult);
    }

    private void a(cl clVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c479fe", new Object[]{this, clVar, str});
            return;
        }
        this.h.set(true);
        a(this.d, false);
        a("triggerFail", str);
        if (clVar == null || !this.i.compareAndSet(false, true)) {
            return;
        }
        PopCenterTriggerSuccessResult popCenterTriggerSuccessResult = new PopCenterTriggerSuccessResult();
        popCenterTriggerSuccessResult.code = this.f22272a;
        popCenterTriggerSuccessResult.shouldPop = true;
        popCenterTriggerSuccessResult.restrictCode = str;
        clVar.a(popCenterTriggerSuccessResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void closePop(als alsVar, final ck ckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf2b575", new Object[]{this, alsVar, ckVar});
        } else {
            f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$t0HlO-O0Jx2QF4NZPnJbFcov9Y8
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.m1469lambda$t0HlOO0Jx2QF4NZPnJbFcov9Y8(TBPopCenterAbility.this, ckVar);
                }
            });
        }
    }

    public /* synthetic */ void a(ck ckVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc640d5", new Object[]{this, ckVar});
            return;
        }
        try {
            if (!this.g) {
                ckVar.a(new ErrorResult("notTemplateRender"));
            } else if (this.l) {
                ckVar.a(new ErrorResult("alreadyClosed"));
            } else if (TextUtils.isEmpty(this.f22272a)) {
                ckVar.a(new ErrorResult("codeIsEmpty"));
            } else {
                com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TBPopHubAbility.close.");
                PopLayer.getReference().removeRequest(cag.i().a(this.f22272a));
                PopCenterCloseSuccessResult popCenterCloseSuccessResult = new PopCenterCloseSuccessResult();
                popCenterCloseSuccessResult.code = this.f22272a;
                ckVar.a(popCenterCloseSuccessResult);
                this.l = true;
                a("close", (Map<String, String>) null);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.close.error", th);
            ckVar.a(new ErrorResult("closePopCatchError"));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsPopCenterAbility
    public void recordPopAction(als alsVar, final dt dtVar, final gml gmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12d2a054", new Object[]{this, alsVar, dtVar, gmlVar});
        } else {
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.view.jsbridge.-$$Lambda$TBPopCenterAbility$urPemne_pO6kc14BdJEJ-eFeCmY
                @Override // java.lang.Runnable
                public final void run() {
                    TBPopCenterAbility.m1470lambda$urPemne_pO6kc14BdJEJeFeCmY(TBPopCenterAbility.this, dtVar, gmlVar);
                }
            });
        }
    }

    public /* synthetic */ void a(dt dtVar, gml gmlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89b51f17", new Object[]{this, dtVar, gmlVar});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.c("triggerEvent", "", "TBPopHubAbility.recordPopAction.action=" + dtVar.f8825a);
            if (this.g) {
                gmlVar.a(new ErrorResult("TemplateRender"));
            } else if (TextUtils.isEmpty(this.f22272a)) {
                gmlVar.a(new ErrorResult("codeIsEmpty"));
            } else if (this.l) {
                gmlVar.a(new ErrorResult("alreadyClosed"));
            } else if ("display".equals(dtVar.f8825a)) {
                if (this.k) {
                    gmlVar.a(new ErrorResult("alreadyDisplayed"));
                    return;
                }
                this.k = true;
                a("selfRenderPerf", this.e);
                a("recordDisplay", (Map<String, String>) null);
                caa.a("Expose", this.f22272a, this.f);
                cab.a(e.c(this.f22272a), false);
            } else if ("click".equals(dtVar.f8825a)) {
                a("recordClick", (Map<String, String>) null);
                caa.a("Click", this.f22272a, this.f);
                cab.b(e.c(this.f22272a), false);
                qoa.a(this.f22272a);
            } else if (!"close".equals(dtVar.f8825a)) {
            } else {
                this.l = true;
                a("recordClose", (Map<String, String>) null);
                caa.a("Cancel", this.f22272a, this.f);
                cab.c(e.c(this.f22272a), false);
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.recordDisplay.error", th);
        }
    }

    private Pair<BaseConfigItem, String> a() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("dd4f14b2", new Object[]{this});
        }
        if (!this.g) {
            return new Pair<>(null, "");
        }
        if (TextUtils.isEmpty(this.b.f8828a)) {
            return new Pair<>(null, "configTypeIsEmpty");
        }
        if (TextUtils.isEmpty(this.b.b)) {
            return new Pair<>(null, "configLayerTypeIsEmpty");
        }
        try {
            BaseConfigItem baseConfigItem = new BaseConfigItem();
            baseConfigItem.indexID = this.f22272a;
            baseConfigItem.uuid = this.f22272a;
            baseConfigItem.type = this.b.f8828a;
            baseConfigItem.layerType = a(this.b.b);
            baseConfigItem.embed = this.b.g != null ? this.b.g.booleanValue() : false;
            baseConfigItem.actionCallBack = this.b.h != null ? this.b.h.booleanValue() : false;
            baseConfigItem.style = (this.b.i == null || this.b.i.isEmpty()) ? "" : JSON.toJSONString(this.b.i);
            JSONObject jSONObject = new JSONObject();
            if (!"weex2".equals(this.b.f8828a) && !"webview".equals(this.b.f8828a)) {
                if ("native".equals(this.b.f8828a)) {
                    int a2 = EnvironmentSwitcher.a();
                    if (a2 != 0) {
                        z = false;
                    }
                    String str = this.f22272a;
                    com.alibaba.poplayer.utils.c.c("triggerEvent", str, "transConfig.currentEnvIndex=" + a2);
                    if (z) {
                        if (!TextUtils.isEmpty(this.b.d)) {
                            jSONObject.put("cdnId", (Object) this.b.d);
                        } else {
                            return new Pair<>(null, "configCdnIdIsEmpty");
                        }
                    } else if (!TextUtils.isEmpty(this.b.e)) {
                        jSONObject.put("pageId", (Object) this.b.e);
                    } else if (!TextUtils.isEmpty(this.b.d)) {
                        jSONObject.put("cdnId", (Object) this.b.d);
                    } else {
                        return new Pair<>(null, "configCdnIdAndPageIdIsEmpty");
                    }
                }
                baseConfigItem.params = jSONObject.toJSONString();
                com.alibaba.poplayer.utils.c.c("triggerEvent", this.f22272a, "transConfig.done");
                return new Pair<>(baseConfigItem, "");
            }
            if (TextUtils.isEmpty(this.b.f)) {
                return new Pair<>(null, "configUrlIsEmpty");
            }
            jSONObject.put("url", (Object) this.b.f);
            baseConfigItem.params = jSONObject.toJSONString();
            com.alibaba.poplayer.utils.c.c("triggerEvent", this.f22272a, "transConfig.done");
            return new Pair<>(baseConfigItem, "");
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("transConfigCatchError", th);
            return new Pair<>(null, "transConfigCatchError");
        }
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : "0".equals(str) ? "" : "10".equals(str) ? "resident10" : "20".equals(str) ? "resident20" : "30".equals(str) ? "resident30" : "40".equals(str) ? "custom40" : "50".equals(str) ? "custom50" : "";
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.g) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onDisplay : not templateRender.code=" + this.f22272a, new Object[0]);
        } else if (this.k) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onDisplay : already displayed.code=" + this.f22272a, new Object[0]);
        } else {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onDisplay.code=" + this.f22272a, new Object[0]);
            this.k = true;
            a("templateRenderPerf", this.e);
            a("displayEvent", (Map<String, String>) null);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.g) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onClickAction : not templateRender.code=" + this.f22272a, new Object[0]);
        } else if (this.l) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onClickAction : already closed.code=" + this.f22272a, new Object[0]);
        } else {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onClickAction.code=" + this.f22272a, new Object[0]);
            a("clickEvent", (Map<String, String>) null);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.g) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onCloseAction : not templateRender.code=" + this.f22272a, new Object[0]);
        } else if (this.l) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onCloseAction : already closed.code=" + this.f22272a, new Object[0]);
        } else {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.onCloseAction.code=" + this.f22272a, new Object[0]);
            a("closeEvent", (Map<String, String>) null);
        }
    }

    private void a(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        try {
            alu aluVar = new alu(new alr("PopHub", "poplayer").a((Context) PopLayer.getReference().internalGetCurrentActivity()));
            alq alqVar = new alq();
            Map<String, ? extends Object> jSONObject = new JSONObject();
            jSONObject.put("bizId", (Object) "PopHub");
            jSONObject.put("eventName", (Object) str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", (Object) this.f22272a);
            jSONObject2.put("success", (Object) Boolean.valueOf(z));
            jSONObject2.put("errorCode", (Object) str2);
            jSONObject.put("detail", (Object) jSONObject2);
            aluVar.b("broadcast", "dispatchEvent", alqVar, jSONObject, $$Lambda$TBPopCenterAbility$gShyE6cDGi1dhdYkbBV1_OgJk1c.INSTANCE);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("TBPopHubAbility.broadcast.error", th);
        }
    }

    public static /* synthetic */ void a(ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34013fd1", new Object[]{executeResult});
        } else {
            com.alibaba.poplayer.utils.c.a("Broadcast.dispatchEvent", new Object[0]);
        }
    }

    private void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("success", String.valueOf(z));
        cac.a().a(19999, "PopHub", "triggerPerf", this.f22272a, String.valueOf(SystemClock.elapsedRealtime() - j), hashMap);
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else {
            cac.a().a(19999, "PopHub", str, this.f22272a, String.valueOf(SystemClock.elapsedRealtime() - j), new HashMap());
        }
    }

    private void a(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = map;
        map2.put("render", this.g ? "template" : LinkageUtils.PolicyType.SELF);
        cac.a().a(19999, "PopHub", str, this.f22272a, this.m, map2);
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", str2);
        cac.a().a(19999, "PopHub", str, this.f22272a, this.m, hashMap);
    }
}
