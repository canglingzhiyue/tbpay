package com.taobao.dxng.kmp_api_exporter;

import com.alibaba.ability.impl.orange.OrangeAbility;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.dp;
import com.taobao.dxng.kmp_api_exporter.j;
import kotlin.Metadata;
import tb.alq;
import tb.kge;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"get", "", "Lcom/taobao/dxng/kmp_api_exporter/Orange$Companion;", "params", "Lcom/taobao/dxng/kmp_api_exporter/OrangeGetParams;", "kmp_api_exporter_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1684926192);
    }

    public static final String a(j.a aVar, k params) {
        Object a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            a2 = ipChange.ipc$dispatch("b56b375a", new Object[]{aVar, params});
        } else {
            kotlin.jvm.internal.q.d(aVar, "<this>");
            kotlin.jvm.internal.q.d(params, "params");
            dp dpVar = new dp();
            dpVar.b = params.b();
            dpVar.f8821a = params.a();
            com.alibaba.ability.result.g<String, ErrorResult> gVar = new OrangeAbility().get(new alq(), dpVar);
            kotlin.jvm.internal.q.b(gVar, "get(...)");
            if (gVar.a() == null) {
                return "";
            }
            a2 = gVar.a();
            kotlin.jvm.internal.q.a(a2);
        }
        return (String) a2;
    }
}
