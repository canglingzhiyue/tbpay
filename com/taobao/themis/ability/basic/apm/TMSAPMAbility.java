package com.taobao.themis.ability.basic.apm;

import mtopsdk.common.util.StringUtils;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.fulltrace.NWFullTracePlugin;
import com.taobao.android.abilityidl.ability.APMProcedureResult;
import com.taobao.android.abilityidl.ability.AbsAPMAbility;
import com.taobao.android.abilityidl.ability.az;
import com.taobao.android.abilityidl.ability.b;
import com.taobao.android.abilityidl.ability.ba;
import com.taobao.android.abilityidl.ability.c;
import com.taobao.monitor.procedure.g;
import com.taobao.themis.kernel.extension.page.d;
import com.taobao.themis.kernel.extension.page.z;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.a;
import com.taobao.themis.utils.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.als;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, d2 = {"Lcom/taobao/themis/ability/basic/apm/TMSAPMAbility;", "Lcom/taobao/android/abilityidl/ability/AbsAPMAbility;", "()V", "addPageProperty", "", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "Lcom/taobao/android/abilityidl/ability/APMPagePropertyParams;", "callback", "Lcom/taobao/android/abilityidl/ability/IAPMResultEvents;", "addPageStage", "Lcom/taobao/android/abilityidl/ability/APMPageStageParams;", "getCurrentProcedure", "Lcom/alibaba/ability/result/Result;", "Lcom/taobao/android/abilityidl/ability/APMProcedureResult;", "Lcom/alibaba/ability/result/ErrorResult;", "requestSubCurrentProcedure", "Lcom/taobao/android/abilityidl/ability/IAPMProcedureGetterEvent;", "themis_ability_basic_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class TMSAPMAbility extends AbsAPMAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1827008569);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public void addPageProperty(als context, b params, ba callback) {
        g b;
        z zVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa755b", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8797a;
        q.b(str, "params.key");
        if (!(str.length() == 0)) {
            String str2 = params.b;
            q.b(str2, "params.value");
            if (!(str2.length() == 0)) {
                if (a.b(context) == null) {
                    callback.a(a$a.f(null));
                    return;
                }
                ITMSPage a2 = a.a(context);
                if (a2 == null) {
                    callback.a(a$a.d(null));
                    return;
                }
                if (StringUtils.equals(params.f8797a, "renderStrategy") && (zVar = (z) a2.a(z.class)) != null) {
                    String str3 = params.b;
                    q.b(str3, "params.value");
                    zVar.a(str3);
                }
                d dVar = (d) a2.a(d.class);
                if (dVar != null && (b = dVar.b()) != null) {
                    b.a(params.f8797a, params.b);
                }
                callback.a(true);
                return;
            }
        }
        callback.a(false);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public com.alibaba.ability.result.g<APMProcedureResult, ErrorResult> getCurrentProcedure(als context) {
        d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.ability.result.g) ipChange.ipc$dispatch("a0bcf44b", new Object[]{this, context});
        }
        q.d(context, "context");
        if (a.b(context) == null) {
            return new com.alibaba.ability.result.g<>(null, a$a.f(null));
        }
        ITMSPage a2 = a.a(context);
        g b = (a2 == null || (dVar = (d) a2.a(d.class)) == null) ? null : dVar.b();
        if (b != null) {
            d dVar2 = (d) a2.a(d.class);
            if (dVar2 != null) {
                dVar2.a();
            }
            JSONObject jSONObject = JSON.parseObject(com.taobao.monitor.adapter.test.a.a(b)).getJSONObject("value");
            if (jSONObject != null) {
                APMProcedureResult aPMProcedureResult = new APMProcedureResult();
                if (jSONObject.getJSONObject(NWFullTracePlugin.FullTraceJSParam.STAGES) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(NWFullTracePlugin.FullTraceJSParam.STAGES);
                    q.b(jSONObject2, "apmValue.getJSONObject(\"stages\")");
                    aPMProcedureResult.stages = jSONObject2.getInnerMap();
                }
                if (jSONObject.getJSONObject("properties") != null) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject("properties");
                    q.b(jSONObject3, "apmValue.getJSONObject(\"properties\")");
                    aPMProcedureResult.properties = jSONObject3.getInnerMap();
                }
                return new com.alibaba.ability.result.g<>(aPMProcedureResult);
            }
        }
        return new com.alibaba.ability.result.g<>(null, a$a.d(null));
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public void requestSubCurrentProcedure(als context, az callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7903e9f6", new Object[]{this, context, callback});
            return;
        }
        q.d(context, "context");
        q.d(callback, "callback");
        ITMSPage a2 = a.a(context);
        if (a2 == null) {
            callback.a(a$a.d(null));
            return;
        }
        com.taobao.themis.web.runtime.a aVar = (com.taobao.themis.web.runtime.a) a2.a(com.taobao.themis.web.runtime.a.class);
        if (aVar == null) {
            callback.a(a$a.g(null));
            return;
        }
        APMProcedureResult aPMProcedureResult = new APMProcedureResult();
        aPMProcedureResult.stages = aVar.e();
        aPMProcedureResult.properties = aVar.f();
        t tVar = t.INSTANCE;
        callback.a(aPMProcedureResult);
    }

    @Override // com.taobao.android.abilityidl.ability.AbsAPMAbility
    public void addPageStage(als context, c params, ba callback) {
        d dVar;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f46c91", new Object[]{this, context, params, callback});
            return;
        }
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        String str = params.f8798a;
        q.b(str, "params.key");
        if (str.length() == 0) {
            z = true;
        }
        if (z) {
            callback.a(a$a.b(null));
        } else if (a.b(context) == null) {
            callback.a(a$a.f(null));
        } else {
            ITMSPage a2 = a.a(context);
            g b = (a2 == null || (dVar = (d) a2.a(d.class)) == null) ? null : dVar.b();
            if (b == null) {
                callback.a(a$a.g(null));
                return;
            }
            b.a(params.f8798a, f.a((long) params.b));
            callback.a(true);
        }
    }
}
