package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cn extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1398095258);
        }

        public static void a(cn cnVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e934ce8", new Object[]{cnVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(cnVar, result);
        }
    }

    void a(ScreenSetBrightnessParams screenSetBrightnessParams);
}
