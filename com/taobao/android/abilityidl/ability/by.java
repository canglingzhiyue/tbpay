package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface by extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1051068451);
        }

        public static void a(by byVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e41b117c", new Object[]{byVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(byVar, result);
        }
    }

    void a(LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams);

    void b(LifeCyclePageLifeCycleEventParams lifeCyclePageLifeCycleEventParams);
}
