package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ck extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1456187908);
        }

        public static void a(ck ckVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5ce10cb", new Object[]{ckVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(ckVar, result);
        }
    }

    void a(PopCenterCloseSuccessResult popCenterCloseSuccessResult);
}
