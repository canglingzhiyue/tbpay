package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ca extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(289931645);
        }

        public static void a(ca caVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3891f315", new Object[]{caVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(caVar, result);
        }
    }

    void a(LocationData locationData);
}
