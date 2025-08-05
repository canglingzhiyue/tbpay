package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ba extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1342483281);
        }

        public static void a(ba baVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9df13094", new Object[]{baVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(baVar, result);
        }
    }

    void a(boolean z);
}
