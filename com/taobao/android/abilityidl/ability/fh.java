package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface fh extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1569334638);
        }

        public static void a(fh fhVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ceb1c31", new Object[]{fhVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(fhVar, result);
        }
    }

    void a(UTResult uTResult);
}
