package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cm extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1542521077);
        }

        public static void a(cm cmVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ba6e389", new Object[]{cmVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(cmVar, result);
        }
    }

    void a(ScanCodeSuccessResult scanCodeSuccessResult);
}
