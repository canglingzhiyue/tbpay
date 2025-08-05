package com.taobao.dxng.kmp_api_exporter;

import com.alibaba.ability.impl.abtest.ABTestAbility;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.a;
import com.taobao.dxng.kmp_api_exporter.c;
import kotlin.Metadata;
import tb.alq;
import tb.kge;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getVariation", "", "Lcom/taobao/dxng/kmp_api_exporter/ABTest$Companion;", "params", "Lcom/taobao/dxng/kmp_api_exporter/ABTestGetVariationParams;", "kmp_api_exporter_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1487944491);
    }

    public static final String a(c.a aVar, d params) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e843e78c", new Object[]{aVar, params});
        }
        kotlin.jvm.internal.q.d(aVar, "<this>");
        kotlin.jvm.internal.q.d(params, "params");
        a aVar2 = new a();
        aVar2.f8771a = params.a();
        aVar2.b = params.b();
        aVar2.c = params.c();
        com.alibaba.ability.result.g<String, ErrorResult> variation = new ABTestAbility().getVariation(new alq(), aVar2);
        kotlin.jvm.internal.q.b(variation, "getVariation(...)");
        String a2 = variation.a();
        return a2 == null ? "" : a2;
    }
}
