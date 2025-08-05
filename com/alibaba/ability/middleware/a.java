package com.alibaba.ability.middleware;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.anx;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¨\u0006\n"}, d2 = {"Lcom/alibaba/ability/middleware/AbilityMiddlewareHub;", "Lcom/alibaba/ability/middleware/IMiddlewareHub;", "()V", "get", "", "Lcom/alibaba/ability/middleware/IAbilityMiddleware;", "Lcom/alibaba/ability/middleware/MiddlewareList;", "abilityName", "", "namespace", "open_ability_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class a implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.ability.middleware.e
    public List<d> a(String abilityName, String namespace) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8c4a1d4b", new Object[]{this, abilityName, namespace});
        }
        q.d(abilityName, "abilityName");
        q.d(namespace, "namespace");
        return (!q.a((Object) namespace, (Object) MspGlobalDefine.TINY_APP) || !n.a("mtop", abilityName, true)) ? q.a((Object) namespace, (Object) "muise") ? p.b((d) new anx(), new f()) : q.a((Object) "windvane", (Object) namespace) ? p.b(new f(), new b()) : p.a(new f()) : p.b(new com.alibaba.triver.pha_engine.megabridge.middleware.a(), new f());
    }
}
