package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bu extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1327806912);
        }

        public static void a(bu buVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8696c00", new Object[]{buVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(buVar, result);
        }
    }

    void a(FileUnzipResult fileUnzipResult);
}
