package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ch extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(47496780);
        }

        public static void a(ch chVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d08d4ae", new Object[]{chVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(chVar, result);
        }
    }

    void a(PermissionResult permissionResult);
}
