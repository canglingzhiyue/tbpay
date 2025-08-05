package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ge extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2035171028);
        }

        public static void a(ge geVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aec6a295", new Object[]{geVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(geVar, result);
        }
    }

    void a(FootprintResult footprintResult);
}
