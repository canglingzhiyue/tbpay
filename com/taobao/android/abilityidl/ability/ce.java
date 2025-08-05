package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ce extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1939379979);
        }

        public static void a(ce ceVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44439891", new Object[]{ceVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(ceVar, result);
        }
    }

    void a();

    void a(NavigatorFailureResult navigatorFailureResult);
}
