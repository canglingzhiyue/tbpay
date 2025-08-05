package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface es extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(818718583);
        }

        public static void a(es esVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2272e0c5", new Object[]{esVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(esVar, result);
        }
    }

    void a(NextRPCFinishResult nextRPCFinishResult);

    void a(NextRPCReceiveDataResult nextRPCReceiveDataResult);

    void a(NextRPCRequest nextRPCRequest);

    void b(NextRPCReceiveDataResult nextRPCReceiveDataResult);

    void c(NextRPCReceiveDataResult nextRPCReceiveDataResult);
}
