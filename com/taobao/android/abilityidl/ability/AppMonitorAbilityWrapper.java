package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.AbsAbilityWrapper;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import java.util.Map;
import tb.aln;
import tb.als;
import tb.ify;
import tb.kge;

/* loaded from: classes4.dex */
public final class AppMonitorAbilityWrapper extends AbsAbilityWrapper<AbsAppMonitorAbility> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1577450276);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMonitorAbilityWrapper(AbsAppMonitorAbility impl) {
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
        int hashCode = api.hashCode();
        if (hashCode == -724355825) {
            if (!api.equals("alarmFail")) {
                return null;
            }
            try {
                getAbilityImpl().alarmFail(context, new ey(params), new ify(callback));
                return null;
            } catch (Throwable th) {
                return a$a.Companion.b(th.getMessage());
            }
        } else if (hashCode != 957830652) {
            if (hashCode != 2145800306 || !api.equals("alarmSuccess")) {
                return null;
            }
            try {
                getAbilityImpl().alarmSuccess(context, new ez(params), new ify(callback));
                return null;
            } catch (Throwable th2) {
                return a$a.Companion.b(th2.getMessage());
            }
        } else if (!api.equals(IWXUserTrackAdapter.COUNTER)) {
            return null;
        } else {
            try {
                getAbilityImpl().counter(context, new ex(params), new ify(callback));
                return null;
            } catch (Throwable th3) {
                return a$a.Companion.b(th3.getMessage());
            }
        }
    }
}
