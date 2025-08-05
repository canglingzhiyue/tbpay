package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bv extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1699878562);
        }

        public static void a(bv bvVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b55d55f", new Object[]{bvVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bvVar, result);
        }
    }

    void a(GeneralSettingOnChangeData generalSettingOnChangeData);
}
