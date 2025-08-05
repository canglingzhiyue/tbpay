package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface ci extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1443489475);
        }

        public static void a(ci ciVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ff53e0d", new Object[]{ciVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(ciVar, result);
        }
    }

    void a(PermissionRequestPermissionEvent permissionRequestPermissionEvent);
}
