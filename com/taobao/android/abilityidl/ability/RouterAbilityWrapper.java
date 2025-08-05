package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class RouterAbilityWrapper extends AbsAbilityWrapper<AbsRouterAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1197246164);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouterAbilityWrapper(AbsRouterAbility impl) {
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
            case -1561908306:
                if (api.equals("popToRoot")) {
                    getAbilityImpl().popToRoot(context, new ify(callback));
                    break;
                }
                break;
            case -749616679:
                if (api.equals("resetToPage")) {
                    try {
                        getAbilityImpl().resetToPage(context, new dx(params), new ify(callback));
                        break;
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case -395052928:
                if (api.equals("popPage")) {
                    getAbilityImpl().popPage(context, new ify(callback));
                    break;
                }
                break;
            case 430051171:
                if (api.equals("replacePage")) {
                    try {
                        getAbilityImpl().replacePage(context, new dx(params), new ify(callback));
                        break;
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case 860367211:
                if (api.equals("getPageProps")) {
                    com.alibaba.ability.result.g<Map<String, Object>, ErrorResult> pageProps = getAbilityImpl().getPageProps(context);
                    ErrorResult b = pageProps.b();
                    if (b != null) {
                        return b;
                    }
                    return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", pageProps.a()))), null, 2, null);
                }
                break;
            case 1092796681:
                if (api.equals("closeApp")) {
                    getAbilityImpl().closeApp(context, new ify(callback));
                    break;
                }
                break;
            case 1775855817:
                if (api.equals(com.taobao.tmgcashier.constant.a.BRIDGE_ACTION_PUSHPAGE)) {
                    try {
                        getAbilityImpl().pushPage(context, new dx(params), new ify(callback));
                        break;
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
        }
        return null;
    }
}
