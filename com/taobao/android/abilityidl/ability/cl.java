package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cl extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1683229572);
        }

        public static void a(cl clVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98ba7a2a", new Object[]{clVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(clVar, result);
        }
    }

    void a(PopCenterTriggerSuccessResult popCenterTriggerSuccessResult);
}
