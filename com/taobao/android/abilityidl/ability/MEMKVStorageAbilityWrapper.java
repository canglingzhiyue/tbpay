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
public final class MEMKVStorageAbilityWrapper extends AbsAbilityWrapper<AbsMEMKVStorageAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-434165954);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MEMKVStorageAbilityWrapper(AbsMEMKVStorageAbility impl) {
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
            case -1141913181:
                if (api.equals("getItemTTL")) {
                    try {
                        com.alibaba.ability.result.g<Long, ErrorResult> itemTTL = getAbilityImpl().getItemTTL(context, new dc(params));
                        ErrorResult b = itemTTL.b();
                        if (b != null) {
                            return b;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", itemTTL.a()))), null, 2, null);
                    } catch (Throwable th) {
                        return a$a.Companion.b(th.getMessage());
                    }
                }
                break;
            case -75439223:
                if (api.equals("getItem")) {
                    try {
                        com.alibaba.ability.result.g<String, ErrorResult> item = getAbilityImpl().getItem(context, new dc(params));
                        ErrorResult b2 = item.b();
                        if (b2 != null) {
                            return b2;
                        }
                        return new FinishResult(new JSONObject(kotlin.collections.ai.b(kotlin.j.a("result", item.a()))), null, 2, null);
                    } catch (Throwable th2) {
                        return a$a.Companion.b(th2.getMessage());
                    }
                }
                break;
            case 794892055:
                if (api.equals("setItemTTL")) {
                    try {
                        getAbilityImpl().setItemTTL(context, new de(params), new ify(callback));
                        break;
                    } catch (Throwable th3) {
                        return a$a.Companion.b(th3.getMessage());
                    }
                }
                break;
            case 1098253751:
                if (api.equals("removeItem")) {
                    try {
                        getAbilityImpl().removeItem(context, new dc(params), new ify(callback));
                        break;
                    } catch (Throwable th4) {
                        return a$a.Companion.b(th4.getMessage());
                    }
                }
                break;
            case 1984670357:
                if (api.equals("setItem")) {
                    try {
                        getAbilityImpl().setItem(context, new dd(params), new ify(callback));
                        break;
                    } catch (Throwable th5) {
                        return a$a.Companion.b(th5.getMessage());
                    }
                }
                break;
        }
        return null;
    }
}
