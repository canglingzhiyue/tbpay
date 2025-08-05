package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface fg extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1101201864);
        }

        public static void a(fg fgVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99feb2d2", new Object[]{fgVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(fgVar, result);
        }
    }

    void a(ExecutorBatchExecuteResult executorBatchExecuteResult);
}
