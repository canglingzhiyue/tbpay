package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface cq extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-447046828);
        }

        public static void a(cq cqVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67588905", new Object[]{cqVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(cqVar, result);
        }
    }

    void a(SystemNotificationStatusResult systemNotificationStatusResult);
}
