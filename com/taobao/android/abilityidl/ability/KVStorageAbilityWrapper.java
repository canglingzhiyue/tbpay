package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.FinishResult;
import com.alibaba.ability.result.a$a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.kge;

/* loaded from: classes4.dex */
public final class KVStorageAbilityWrapper extends AbsAbilityWrapper<AbsKVStorageAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1888894751);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KVStorageAbilityWrapper(AbsKVStorageAbility impl) {
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
            case -75439223:
                if (api.equals("getItem")) {
                    try {
                        com.alibaba.ability.result.g<String, ErrorResult> item = getAbilityImpl().getItem(context, new cy(params));
                        ErrorResult b = item.b();
                        if (b != null) {
                            return b;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", item.a()))), null, 2, null);
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case -39356271:
                if (api.equals(com.taobao.android.tbabilitykit.k.API_GET_CURRENT_INFO)) {
                    try {
                        com.alibaba.ability.result.g<KVStorageCurrentInfo, ErrorResult> currentInfo = getAbilityImpl().getCurrentInfo(context, new cx(params));
                        ErrorResult b2 = currentInfo.b();
                        if (b2 != null) {
                            return b2;
                        }
                        Object json = JSONObject.toJSON(currentInfo.a());
                        if (!(json instanceof JSONObject)) {
                            json = null;
                        }
                        return new FinishResult((JSONObject) json, null, 2, null);
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case 94746189:
                if (api.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_clear)) {
                    try {
                        ErrorResult b3 = getAbilityImpl().clear(context, new cx(params)).b();
                        if (b3 != null) {
                            return b3;
                        }
                        return new FinishResult(null, null, 3, null);
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
            case 124428031:
                if (api.equals("getAllKeys")) {
                    try {
                        com.alibaba.ability.result.g<List<String>, ErrorResult> allKeys = getAbilityImpl().getAllKeys(context, new cx(params));
                        ErrorResult b4 = allKeys.b();
                        if (b4 != null) {
                            return b4;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", allKeys.a()))), null, 2, null);
                    } catch (Throwable th4) {
                        return a$a.Companion.b(th4.getMessage());
                    }
                }
                break;
            case 1004200602:
                if (api.equals("getCurrentInfoAndKeys")) {
                    try {
                        com.alibaba.ability.result.g<KVStorageCurrentInfoAndKeys, ErrorResult> currentInfoAndKeys = getAbilityImpl().getCurrentInfoAndKeys(context, new cx(params));
                        ErrorResult b5 = currentInfoAndKeys.b();
                        if (b5 != null) {
                            return b5;
                        }
                        Object json2 = JSONObject.toJSON(currentInfoAndKeys.a());
                        if (!(json2 instanceof JSONObject)) {
                            json2 = null;
                        }
                        return new FinishResult((JSONObject) json2, null, 2, null);
                    } catch (Throwable th5) {
                        return a$a.Companion.b(th5.getMessage());
                    }
                }
                break;
            case 1098253751:
                if (api.equals("removeItem")) {
                    try {
                        ErrorResult b6 = getAbilityImpl().removeItem(context, new cy(params)).b();
                        if (b6 != null) {
                            return b6;
                        }
                        return new FinishResult(null, null, 3, null);
                    } catch (Throwable th6) {
                        return a$a.Companion.b(th6.getMessage());
                    }
                }
                break;
            case 1984670357:
                if (api.equals("setItem")) {
                    try {
                        ErrorResult b7 = getAbilityImpl().setItem(context, new cz(params)).b();
                        if (b7 != null) {
                            return b7;
                        }
                        return new FinishResult(null, null, 3, null);
                    } catch (Throwable th7) {
                        return a$a.Companion.b(th7.getMessage());
                    }
                }
                break;
        }
        return null;
    }
}
