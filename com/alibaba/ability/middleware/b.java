package com.alibaba.ability.middleware;

import android.taobao.windvane.config.j;
import android.taobao.windvane.jsbridge.m;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.a$a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.alo;
import tb.als;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JL\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bj\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/alibaba/ability/middleware/H5PermissionMiddleware;", "Lcom/alibaba/ability/middleware/IAbilityMiddleware;", "()V", "invoke", "Lcom/alibaba/ability/result/ExecuteResult;", MUSMonitor.MODULE_DIM_ABILITY, "", "api", "context", "Lcom/alibaba/ability/env/IAbilityContext;", "params", "", "", "Lcom/alibaba/ability/AbilityData;", "callback", "Lcom/alibaba/ability/callback/IOnCallbackListener;", "next", "Lcom/alibaba/ability/middleware/IAbilityInvoker;", "open_ability_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class b implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.ability.middleware.d
    public ExecuteResult invoke(String ability, String api, als context, Map<String, ? extends Object> params, alo callback, c next) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a1d6a6a6", new Object[]{this, ability, api, context, params, callback, next});
        }
        q.d(ability, "ability");
        q.d(api, "api");
        q.d(context, "context");
        q.d(params, "params");
        q.d(callback, "callback");
        q.d(next, "next");
        if (!j.commonConfig.cs) {
            return next.a(ability, api, context, params, callback);
        }
        Object c = context.c("url");
        if (!(c instanceof String)) {
            return a$a.Companion.c("url is not String");
        }
        if (m.a().a((String) c, ability, api, null)) {
            return next.a(ability, api, context, params, callback);
        }
        a$a.a aVar = a$a.Companion;
        return aVar.c("calling " + ability + '.' + api + " is not allowed in url " + c);
    }
}
