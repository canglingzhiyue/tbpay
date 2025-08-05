package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface az extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(20701227);
        }

        public static void a(az azVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c66b85a", new Object[]{azVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(azVar, result);
        }
    }

    void a(APMProcedureResult aPMProcedureResult);
}
