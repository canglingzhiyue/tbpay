package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class AppAbilityWrapper extends AbsAbilityWrapper<AbsAppAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1099708752);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAbilityWrapper(AbsAppAbility impl) {
        super(impl);
        kotlin.jvm.internal.q.d(impl, "impl");
    }

    @Override // com.alibaba.ability.b
    public ExecuteResult execute(String api, als context, Map<String, ? extends Object> params, aln callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a38490db", new Object[]{this, api, context, params, callback});
        }
        kotlin.jvm.internal.q.d(api, "api");
        kotlin.jvm.internal.q.d(context, "context");
        kotlin.jvm.internal.q.d(params, "params");
        kotlin.jvm.internal.q.d(callback, "callback");
        switch (api.hashCode()) {
            case -1852006340:
                if (api.equals("suspend")) {
                    getAbilityImpl().suspend(context, new ify(callback));
                    break;
                }
                break;
            case -1249363529:
                if (api.equals("getEnv")) {
                    com.alibaba.ability.result.g<String, ErrorResult> env = getAbilityImpl().getEnv(context);
                    ErrorResult b = env.b();
                    if (b != null) {
                        return b;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", env.a()))), null, 2, null);
                }
                break;
            case -139237875:
                if (api.equals("isForeground")) {
                    com.alibaba.ability.result.g<Boolean, ErrorResult> isForeground = getAbilityImpl().isForeground(context);
                    ErrorResult b2 = isForeground.b();
                    if (b2 != null) {
                        return b2;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", isForeground.a()))), null, 2, null);
                }
                break;
            case -75444956:
                if (api.equals("getInfo")) {
                    com.alibaba.ability.result.g<AppGetInfoResult, ErrorResult> info = getAbilityImpl().getInfo(context);
                    ErrorResult b3 = info.b();
                    if (b3 != null) {
                        return b3;
                    }
                    Object json = JSONObject.toJSON(info.a());
                    if (!(json instanceof JSONObject)) {
                        json = null;
                    }
                    return new FinishResult((JSONObject) json, null, 2, null);
                }
                break;
            case -75143183:
                if (api.equals("getTTID")) {
                    com.alibaba.ability.result.g<String, ErrorResult> ttid = getAbilityImpl().getTTID(context);
                    ErrorResult b4 = ttid.b();
                    if (b4 != null) {
                        return b4;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", ttid.a()))), null, 2, null);
                }
                break;
            case 15857401:
                if (api.equals("getBottomBarHeight")) {
                    com.alibaba.ability.result.g<Double, ErrorResult> bottomBarHeight = getAbilityImpl().getBottomBarHeight(context);
                    ErrorResult b5 = bottomBarHeight.b();
                    if (b5 != null) {
                        return b5;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", bottomBarHeight.a()))), null, 2, null);
                }
                break;
            case 1388468386:
                if (api.equals("getVersion")) {
                    com.alibaba.ability.result.g<String, ErrorResult> version = getAbilityImpl().getVersion(context);
                    ErrorResult b6 = version.b();
                    if (b6 != null) {
                        return b6;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", version.a()))), null, 2, null);
                }
                break;
            case 1491337133:
                if (api.equals("getNavBarHeight")) {
                    com.alibaba.ability.result.g<Double, ErrorResult> navBarHeight = getAbilityImpl().getNavBarHeight(context);
                    ErrorResult b7 = navBarHeight.b();
                    if (b7 != null) {
                        return b7;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", navBarHeight.a()))), null, 2, null);
                }
                break;
            case 1966447562:
                if (api.equals("getUTDID")) {
                    com.alibaba.ability.result.g<String, ErrorResult> utdid = getAbilityImpl().getUTDID(context);
                    ErrorResult b8 = utdid.b();
                    if (b8 != null) {
                        return b8;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", utdid.a()))), null, 2, null);
                }
                break;
        }
        return null;
    }
}
