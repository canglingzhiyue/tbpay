package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface be extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1388078000);
        }

        public static void a(be beVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9a2d610", new Object[]{beVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(beVar, result);
        }
    }

    void a(AlertConfirmInfo alertConfirmInfo);

    void b(AlertConfirmInfo alertConfirmInfo);

    void c(AlertConfirmInfo alertConfirmInfo);
}
