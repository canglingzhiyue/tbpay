package com.taobao.android.abilityidl.ability;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gml;
import tb.kge;

/* loaded from: classes4.dex */
public interface gc extends gml {

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1564047775);
        }

        public static void a(gc gcVar, ErrorResult result) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28edcfd7", new Object[]{gcVar, result});
                return;
            }
            kotlin.jvm.internal.q.d(result, "result");
            gml.a.a(gcVar, result);
        }
    }

    void a(ClientPrerenderPrerenderAttachDetail clientPrerenderPrerenderAttachDetail);
}
