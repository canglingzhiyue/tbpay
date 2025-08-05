package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bb extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2079961693);
        }

        public static void a(bb bbVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60dd99f3", new Object[]{bbVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bbVar, result);
        }
    }

    void a(AccelerometerShakeRet accelerometerShakeRet);
}
