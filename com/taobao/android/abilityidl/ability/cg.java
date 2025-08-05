package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cg extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1101825715);
        }

        public static void a(cg cgVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca1c6b4f", new Object[]{cgVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(cgVar, result);
        }
    }

    void a(PermissionResult permissionResult);
}
