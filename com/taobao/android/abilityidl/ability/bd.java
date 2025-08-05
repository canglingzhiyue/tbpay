package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface bd extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1847533680);
        }

        public static void a(bd bdVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6b66cb1", new Object[]{bdVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(bdVar, result);
        }
    }

    void a(AccsConnectCommonResult accsConnectCommonResult);

    void a(AccsConnectFailResult accsConnectFailResult);

    void a(AccsListenerKeyResult accsListenerKeyResult);

    void b(AccsConnectCommonResult accsConnectCommonResult);
}
