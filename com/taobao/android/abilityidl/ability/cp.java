package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cp extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-607547282);
        }

        public static void a(cp cpVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a46c1fa6", new Object[]{cpVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(cpVar, result);
        }
    }

    void a(String str);

    void b(String str);

    void c(String str);
}
